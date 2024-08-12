package gui;

/**
 *
 * @author dilanka
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

// Builder Pattern
class Pizza {

    private final String type;
    private final String size;
    private final double basePrice;
    private final List<String> toppings;
    public static double totalPrice;

    private Pizza(Builder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.basePrice = builder.basePrice;
        this.toppings = builder.toppings;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public List<String> getAllToppings() {
        return toppings;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public void display() {
        double toppingsPrice = toppings.size() * 50;
        totalPrice = basePrice + toppingsPrice;
        System.out.println("Pizza: " + type + ", \nSize: " + size + ", \nToppings: "
                + String.join(", ", toppings) + " \nPrice of One : Rs " + totalPrice);
    }

    static class Builder {

        private String type;
        private String size;
        private double basePrice;
        private List<String> toppings = new ArrayList<>();

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setBasePrice(double basePrice) {
            this.basePrice = basePrice;
            return this;
        }

        public Builder addAllToppings(List<String> toppings) {
            this.toppings.addAll(toppings);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

// Flyweight Pattern
class IngredientFactory {

    private IngredientFactory() {}
    
    private static final HashMap<String, IngredientFactory> ingredientsPOOL = new HashMap<>();

    public static IngredientFactory createIngredient(String ingredient) {
        IngredientFactory instance = ingredientsPOOL.get(ingredient);
        if (instance == null) {
            instance = new IngredientFactory();
            instance.ingredient = ingredient;
            ingredientsPOOL.put(ingredient, instance);
        }
        return instance;
    }
    private String ingredient;

    public String getIngredient() {
        return ingredient;
    }

    public IngredientFactory setIngredient(String ingredient) {
        return IngredientFactory.createIngredient(ingredient);
    }
}

// Interpreter Pattern
interface Command {

    public void execute(Pizza pizza);
}

class DefaultPizzaCommand implements Command {

    private String topping;

    public DefaultPizzaCommand(String topping) {
        this.topping = topping;
    }

    @Override
    public void execute(Pizza pizza) {
        pizza = new Pizza.Builder()
                .setType(pizza.getType())
                .setSize(pizza.getSize())
                .setBasePrice(pizza.getBasePrice())
                .addAllToppings(pizza.getAllToppings())
                .build();
        pizza.display();
    }
}

class CustomizePizzaCommand implements Command {

    private String type;
    private String size;
    private List<String> toppings;

    public CustomizePizzaCommand(String type, String size, List<String> toppings) {
        this.type = type;
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public void execute(Pizza pizza) {
        pizza = new Pizza.Builder()
                .setType(type)
                .setSize(size)
                .setBasePrice(pizza.getBasePrice())
                .addAllToppings(toppings)
                .build();
        pizza.display();
    }
}

// Mediator Pattern
class OrderMediator {

    private final OrderManager orderManager;
    private final Customer customer;

    public OrderMediator(OrderManager orderManager, Customer customer) {
        this.orderManager = orderManager;
        this.customer = customer;
    }

    public void findOrder() {
        Shop.showNotification("Syzygy App : Finding and Forwarding the Pizza Order...");
        orderManager.orderConfirmation();
    }
}

abstract class User {

    protected OrderMediator orderMediator;

    public final void setOrderMediator(OrderMediator orderMediator) {
        this.orderMediator = orderMediator;
    }
}

class OrderManager extends User {

    public void orderConfirmation() {
        int option = JOptionPane.showConfirmDialog(null, "Order Manager : Can you confirm this Pizza Order?\n\n"
                + Shop.allOrderList, "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            Status status = new Status();
            status.setStepStates("Order Confirmed");
            OrderStep acceptingStep = new AcceptingStep();
            OrderStep cookingStep = new CookingStep();
            OrderStep packingStep = new PackingStep();
            OrderStep handoverStep = new HandoverStep();
            acceptingStep.setNextStep(cookingStep);
            cookingStep.setNextStep(packingStep);
            packingStep.setNextStep(handoverStep);
            acceptingStep.processStep(status);
        } else {
            JOptionPane.showMessageDialog(null, "OK !  Add a new Pizza Order.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

class Customer extends User {

    public void sendOrder() {
        Shop.showNotification(Shop.username + " : Sending the Pizza Order...");
        orderMediator.findOrder();
    }
}

// Chain of Responsibility Pattern
abstract class OrderStep {

    protected OrderStep nextStep;

    public void setNextStep(OrderStep nextStep) {
        this.nextStep = nextStep;
    }

    public abstract void processStep(Status status);
}

class AcceptingStep extends OrderStep {

    @Override
    public void processStep(Status status) {
        if (status.getStepStates().equals("Order Confirmed")) {
            Shop.showNotification("Your Pizza Order is accepted!");
            status.setStepStates("Order Accepted");
            this.nextStep.processStep(status);
        } else {
            JOptionPane.showMessageDialog(null, "Order Error...", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}

class CookingStep extends OrderStep {

    @Override
    public void processStep(Status status) {
        if (status.getStepStates().equals("Order Accepted")) {
            Shop.showNotification("Your Pizza is being cooked.");
            status.setStepStates("Finished cooking");
            this.nextStep.processStep(status);
        } else {
            JOptionPane.showMessageDialog(null, "Order Error...", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}

class PackingStep extends OrderStep {

    @Override
    public void processStep(Status status) {
        if (status.getStepStates().equals("Finished cooking")) {
            Shop.showNotification("Your Pizza is being packed.");
            status.setStepStates("Finished packing");
            this.nextStep.processStep(status);
        } else {
            JOptionPane.showMessageDialog(null, "Order Error...", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}

class HandoverStep extends OrderStep {

    @Override
    public void processStep(Status status) {
        if (status.getStepStates().equals("Finished packing")) {
            Shop.showNotification("Your Pizza Order is handed over to the driver for delivery.");
            JOptionPane.showMessageDialog(null, "Your Pizza Order is successful!\nGet it and Enjoy!", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Order Error...", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}

class Status {

    private String stepStates;

    public String getStepStates() {
        return stepStates;
    }

    public void setStepStates(String stepStates) {
        this.stepStates = stepStates;
    }
}
