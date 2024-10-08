/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import com.formdev.flatlaf.IntelliJTheme;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dilanka
 */
public class Shop extends javax.swing.JFrame {

    /**
     * Creates new form Shop
     */
    public Shop() {
        initComponents();
    }

    public static String username;
    public static String allOrderList;

    public void RemoveExtraTopping() {
        jCheckBox1.setEnabled(false);
        jCheckBox1.setSelected(false);
        jCheckBox2.setEnabled(false);
        jCheckBox2.setSelected(false);
        jCheckBox4.setEnabled(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setEnabled(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setEnabled(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setEnabled(false);
        jCheckBox7.setSelected(false);
    }

    public static void showNotification(String message) {
        final JOptionPane optionPane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{"Close"}, null);

        final JDialog dialog = optionPane.createDialog(null, "Notification");

        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        timer.setRepeats(false);
        timer.start();

        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sil.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 180, 200));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 0));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 500, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setText("Welcome ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 130, 40));

        jLabel8.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 45)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(248, 136, 26));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pizza Master");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 680, 80));

        jLabel9.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 46)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pizza Master");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 680, 80));

        jLabel3.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 120)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(200, 4, 5));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Syzygy");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 170));

        jLabel5.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 126)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Syzygy");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 170));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 120)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 179, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Corner");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 280, 480, 180));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 126)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Corner");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 280, 480, 180));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 120)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 179, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Food");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 410, 160));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 126)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Food");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 410, 160));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Size", "Toppings", "Quantity", "Price of One"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 120));

        jButton2.setBackground(new java.awt.Color(248, 136, 26));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Order Now");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 270, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 530, 190));

        jPanel3.setBackground(new java.awt.Color(103, 52, 43));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(248, 136, 26));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Quantity");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 190, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 204, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Chicken Pizza");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(248, 136, 26));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Size of Pizza");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, 30));

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Medium");
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 90, -1));

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Large");
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Small");
        jPanel3.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Mushrooms");
        jCheckBox1.setEnabled(false);
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 190, -1));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Extra Cheese");
        jCheckBox2.setEnabled(false);
        jPanel3.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 190, -1));

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 20, 30));

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("BBQ Sauce");
        jCheckBox4.setEnabled(false);
        jPanel3.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, -1));

        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Pepperoni");
        jCheckBox5.setEnabled(false);
        jPanel3.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 190, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(248, 136, 26));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText(" Extra Toppings");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 30));

        jButton1.setBackground(new java.awt.Color(248, 136, 26));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add to order list");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 190, 40));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 190, -1));

        jCheckBox6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Mayonnaise");
        jCheckBox6.setEnabled(false);
        jPanel3.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 190, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 204, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("with");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 204, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Cheese");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 140, 20));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 204, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Chicken");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, 20));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 204, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("and");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 30, 20));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 204, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("and");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 30, 20));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 204, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Tomato Sauce");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, 20));

        jCheckBox7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Oniens");
        jCheckBox7.setEnabled(false);
        jPanel3.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 210, 570));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Margherita Pizza");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 120, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Veggie Pizza");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 120, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Pepperoni Pizza");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 120, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(248, 136, 26));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Type of Pizza");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Chicken Pizza");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.PNG"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 120, 300));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.PNG"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 300));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.PNG"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 120, 300));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.PNG"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 120, 300));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 530, 370));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundimg.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setInheritsPopupMenu(false);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String name = jLabel26.getText();
        jLabel23.setText(name);
        jLabel28.setText("Chicken");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String name = jLabel19.getText();
        jLabel23.setText(name);
        jLabel28.setText("Vegetable");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String name = jLabel20.getText();
        jLabel23.setText(name);
        jLabel28.setText("Pepperoni");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String name = jLabel17.getText();
        jLabel23.setText(name);
        jLabel28.setText("Margherita");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox3.isSelected()) {
            jCheckBox1.setEnabled(true);
            jCheckBox2.setEnabled(true);
            jCheckBox4.setEnabled(true);
            jCheckBox5.setEnabled(true);
            jCheckBox6.setEnabled(true);
            jCheckBox7.setEnabled(true);
        } else {
            RemoveExtraTopping();
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String type = jLabel23.getText();
        String size = null;
        if (jRadioButton1.isSelected()) {
            size = jRadioButton1.getText();
        } else if (jRadioButton2.isSelected()) {
            size = jRadioButton2.getText();
        } else if (jRadioButton3.isSelected()) {
            size = jRadioButton3.getText();
        }

        String topping1 = jLabel27.getText();
        String topping2 = jLabel28.getText();
        String topping3 = jLabel31.getText();

        // Interpreter Pattern
        List<String> toppings = new ArrayList<>(Arrays.asList(topping1, topping2, topping3));
        Pizza pizza = new Pizza.Builder()
                .setType(type)
                .setSize(size)
                .setBasePrice(1050.0)
                .addAllToppings(toppings)
                .build();

        if (!jCheckBox3.isSelected()) {
            // Default Pizza
            Command defaultPizza = new DefaultPizzaCommand("");
            defaultPizza.execute(pizza);
        } else {

            JCheckBox[] checkBoxes = {jCheckBox1, jCheckBox2, jCheckBox4, jCheckBox5, jCheckBox6, jCheckBox7};

            for (JCheckBox checkBox : checkBoxes) {
                if (checkBox.isSelected()) {
                    // Flyweight Pattern
                    toppings.add(IngredientFactory.createIngredient(checkBox.getText()).getIngredient());
                }
            }
            // Customize Pizza
            Command customizePizza = new CustomizePizzaCommand(type, size, toppings);
            customizePizza.execute(pizza);
        }

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        String qty = jComboBox1.getSelectedItem().toString();

        Vector vector = new Vector();
        vector.add(type);
        vector.add(size);
        vector.add(toppings);
        vector.add(qty);
        vector.add(Pizza.totalPrice);
        dtm.addRow(vector);

        //Reset
        String name = jLabel26.getText();
        jLabel23.setText(name);
        jLabel28.setText("Chicken");
        jRadioButton1.setSelected(true);
        jCheckBox3.setSelected(false);
        RemoveExtraTopping();
        jComboBox1.setSelectedIndex(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please add your order to the Order List", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            Double fullTotal = 0.0;

            if (dtm.getRowCount() > 0) {
                StringBuilder allRowsData = new StringBuilder();

                for (int row = 0; row < dtm.getRowCount(); row++) {
                    String type = dtm.getValueAt(row, 0).toString();
                    String size = dtm.getValueAt(row, 1).toString();
                    List<String> toppings = (List<String>) dtm.getValueAt(row, 2);
                    String qty = dtm.getValueAt(row, 3).toString();
                    String totalPrice = dtm.getValueAt(row, 4).toString();

                    Double total = Double.parseDouble(totalPrice) * Double.parseDouble(qty);
                    fullTotal += total;

                    String rowData = String.format("Pizza: " + type + ", \nSize: " + size + ", \nToppings: "
                            + String.join(", ", toppings) + " \nQuantity: " + qty + ", \nTotal Price : Rs "
                            + total.toString());

                    allRowsData.append(rowData).append("\n\n");
                }

                allOrderList = allRowsData.toString() + "\nTotal Price of the Full Order : Rs " + fullTotal.toString();

            }

            username = jLabel10.getText();

            // Mediator Pattern
            OrderManager orderManager = new OrderManager();

            Customer customer = new Customer();

            OrderMediator orderMediator = new OrderMediator(orderManager, customer);

            orderManager.setOrderMediator(orderMediator);
            customer.setOrderMediator(orderMediator);

            customer.sendOrder();

            //Reset
            dtm.setRowCount(0);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int r = jTable1.getSelectedRow();
            if (r == -1) {
                JOptionPane.showMessageDialog(this, "Please select a Pizza", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to remove this Pizza Order?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.removeRow(r);

                    JOptionPane.showMessageDialog(this, "Pizza Order removed!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            InputStream is = (Shop.class.getResourceAsStream("/resources/Cobalt_2.theme.json"));
            IntelliJTheme.setup(is);

        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
