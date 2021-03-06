
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Oven
 */
public class Cafe extends javax.swing.JFrame {

    /**
     * Creates new form Cafe
     */
    public Cafe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnstrawberryfrappe = new javax.swing.JButton();
        jbtnamazonfrappe = new javax.swing.JButton();
        jbtnespresso = new javax.swing.JButton();
        jbtnhoneyblackcoffee = new javax.swing.JButton();
        jbtnthaimilktea = new javax.swing.JButton();
        jbtnwhitechocmacchiato = new javax.swing.JButton();
        jbtnicedlemontea = new javax.swing.JButton();
        jbtndarkchocolate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtn3 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();
        jbtnclear = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jbtnexit = new javax.swing.JButton();
        jbtnprint = new javax.swing.JButton();
        jbtnpay = new javax.swing.JButton();
        jbtnreset = new javax.swing.JButton();
        jbtnremove = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxttotal = new javax.swing.JTextField();
        jtxtsubtotal = new javax.swing.JTextField();
        jtxttip = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtdisplay = new javax.swing.JTextField();
        jtxtchange = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbpayment = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnstrawberryfrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Strawberry Frappe.jpeg"))); // NOI18N
        jbtnstrawberryfrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnstrawberryfrappeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnstrawberryfrappe, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 130, 130));

        jbtnamazonfrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Amazon Frappe.jpeg"))); // NOI18N
        jbtnamazonfrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnamazonfrappeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnamazonfrappe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 210));

        jbtnespresso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Espresso.jpeg"))); // NOI18N
        jbtnespresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnespressoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnespresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 130, 100));

        jbtnhoneyblackcoffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Honey Lime Black Coffee.jpeg"))); // NOI18N
        jbtnhoneyblackcoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnhoneyblackcoffeeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnhoneyblackcoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 130, 220));

        jbtnthaimilktea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Thai Milk Tea.jpeg"))); // NOI18N
        jbtnthaimilktea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnthaimilkteaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnthaimilktea, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -10, 150, 220));

        jbtnwhitechocmacchiato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/White Choc Macchiato.jpeg"))); // NOI18N
        jbtnwhitechocmacchiato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnwhitechocmacchiatoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnwhitechocmacchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 130, 160));

        jbtnicedlemontea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Iced Lemon Tes.jpeg"))); // NOI18N
        jbtnicedlemontea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnicedlemonteaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnicedlemontea, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 130, 220));

        jbtndarkchocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Dark Chocolate.jpeg"))); // NOI18N
        jbtndarkchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndarkchocolateActionPerformed(evt);
            }
        });
        jPanel1.add(jbtndarkchocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 150, 220));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("???140");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("???145");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 80, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("???110");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("???145");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 80, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("???105");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 80, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("???90");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 80, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("???85");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 80, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("???135");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 470));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 110));

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 110));

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, 110));

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 110));

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 100, 110));

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, 110));

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 110));

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 100, 110));

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 100, 110));

        jbtndot.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtndot.setText(".");
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });
        jPanel2.add(jbtndot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 110));

        jbtnclear.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnclear.setText("C");
        jbtnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnclearActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 100, 110));

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 100, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 320, 320, 470));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 320, 480));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1050, 300));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1050, 300));

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 190, 50));

        jbtnprint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnprint.setText("Print");
        jbtnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnprintActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 410, 50));

        jbtnpay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnpay.setText("Pay");
        jbtnpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpayActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 50));

        jbtnreset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnreset.setText("Reset");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 190, 50));

        jbtnremove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnremove.setText("Remove");
        jbtnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnremoveActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/istockphoto-1093110112-612x612.jpg"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -130, 690, 470));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 470, 280));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1050, 300));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setText("Total");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel3.setText("Cost");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));

        jtxttotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel7.add(jtxttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 150, 30));

        jtxtsubtotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel7.add(jtxtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 150, 30));

        jtxttip.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel7.add(jtxttip, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 150, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel4.setText("Tip");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 30));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 140));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1050, 300));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel5.setText("Cash");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel6.setText("Payment Method");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 230, 30));

        jtxtdisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel9.add(jtxtdisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 150, 30));

        jtxtchange.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel9.add(jtxtchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 150, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel7.setText("Change");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 30));

        jcbpayment.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jcbpayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card", "Master Card", " " }));
        jPanel9.add(jcbpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 150, 30));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 550, 140));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, 310));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Nature Cafe.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, -30, 600, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//============================Function=======================================
     public void Cost(){
         double sum = 0;
         for(int i=0;i<jTable1.getRowCount();i++){
             sum = sum + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
         }
         jtxtsubtotal.setText(Double.toString(sum));
         double ctotal1 = Double.parseDouble(jtxtsubtotal.getText());
         double ctip = (ctotal1 * 3)/100;
         String itiptotal = String.format("??? %.2f", ctip);
         jtxttip.setText(itiptotal);
         String isubtotal = String.format("??? %.2f", ctotal1);
         jtxtsubtotal.setText(isubtotal);
         String itotal = String.format("??? %.2f", ctotal1 + ctip);
         jtxttotal.setText(itotal);
     }
     //============================Function=======================================
      public void change(){
          double sum = 0;
          double tip = 3;
          double cash = Double.parseDouble(jtxtdisplay.getText());
          for(int i=0;i<jTable1.getRowCount();i++){
             sum = sum + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
         }
          double ctip = (sum * 3)/100;
          double cchange = (cash - (sum + ctip));
          
          String changegive = String.format("??? %.2f", cchange);
          jtxtchange.setText(changegive);
      }
    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String Enternumber = jtxtdisplay.getText();
        if(Enternumber == ""){
            jtxtdisplay.setText(jbtn7.getText());
        }
        else{
            Enternumber = jtxtdisplay.getText()+ jbtn7.getText();
            jtxtdisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        String Enternumber = jtxtdisplay.getText();
        if(Enternumber == ""){
            jtxtdisplay.setText(jbtn1.getText());
        }
        else{
            Enternumber = jtxtdisplay.getText()+ jbtn1.getText();
            jtxtdisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        String Enternumber = jtxtdisplay.getText();
        if(Enternumber == ""){
            jtxtdisplay.setText(jbtn2.getText());
        }
        else{
            Enternumber = jtxtdisplay.getText()+ jbtn2.getText();
            jtxtdisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String Enternumber = jtxtdisplay.getText();
        if(Enternumber == ""){
            jtxtdisplay.setText(jbtn3.getText());
        }
        else{
            Enternumber = jtxtdisplay.getText()+ jbtn3.getText();
            jtxtdisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        String Enternumber = jtxtdisplay.getText();
        if(Enternumber == ""){
            jtxtdisplay.setText(jbtn4.getText());
        }
        else{
            Enternumber = jtxtdisplay.getText()+ jbtn4.getText();
            jtxtdisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String Enternumber = jtxtdisplay.getText();
        if(Enternumber == ""){
            jtxtdisplay.setText(jbtn5.getText());
        }
        else{
            Enternumber = jtxtdisplay.getText()+ jbtn5.getText();
            jtxtdisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        String Enternumber = jtxtdisplay.getText();
        if(Enternumber == ""){
            jtxtdisplay.setText(jbtn6.getText());
        }
        else{
            Enternumber = jtxtdisplay.getText()+ jbtn6.getText();
            jtxtdisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String Enternumber = jtxtdisplay.getText();
        if(Enternumber == ""){
            jtxtdisplay.setText(jbtn8.getText());
        }
        else{
            Enternumber = jtxtdisplay.getText()+ jbtn8.getText();
            jtxtdisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        String Enternumber = jtxtdisplay.getText();
        if(Enternumber == ""){
            jtxtdisplay.setText(jbtn9.getText());
        }
        else{
            Enternumber = jtxtdisplay.getText()+ jbtn9.getText();
            jtxtdisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        String Enternumber = jtxtdisplay.getText();
        if(Enternumber == ""){
            jtxtdisplay.setText(jbtn0.getText());
        }
        else{
            Enternumber = jtxtdisplay.getText()+ jbtn0.getText();
            jtxtdisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnclearActionPerformed
        jtxtdisplay.setText("");
        jtxtchange.setText("");
    }//GEN-LAST:event_jbtnclearActionPerformed

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndotActionPerformed
        if(! jtxtdisplay.getText().contains(".")){
            jtxtdisplay.setText(jtxtdisplay.getText() + jbtndot.getText());
        }
    }//GEN-LAST:event_jbtndotActionPerformed

    private void jbtnamazonfrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnamazonfrappeActionPerformed
        double priceofitem = 110;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Thai Milk Tea","1",priceofitem});
        Cost();
    }//GEN-LAST:event_jbtnamazonfrappeActionPerformed

    private void jbtnthaimilkteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnthaimilkteaActionPerformed
        double priceofitem = 145;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Amazon Frappe","1",priceofitem});
        Cost();
    }//GEN-LAST:event_jbtnthaimilkteaActionPerformed

    private void jbtnhoneyblackcoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnhoneyblackcoffeeActionPerformed
        double priceofitem = 145;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Honey Black Coffee","1",priceofitem});
        Cost();
    }//GEN-LAST:event_jbtnhoneyblackcoffeeActionPerformed

    private void jbtnicedlemonteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnicedlemonteaActionPerformed
        double priceofitem = 105;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Iced Lemon Tea","1",priceofitem});
        Cost();
    }//GEN-LAST:event_jbtnicedlemonteaActionPerformed

    private void jbtndarkchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndarkchocolateActionPerformed
        double priceofitem = 90;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Dark Chocolate","1",priceofitem});
        Cost();
    }//GEN-LAST:event_jbtndarkchocolateActionPerformed

    private void jbtnespressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnespressoActionPerformed
        double priceofitem = 85;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Espresso","1",priceofitem});
        Cost();
    }//GEN-LAST:event_jbtnespressoActionPerformed

    private void jbtnstrawberryfrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnstrawberryfrappeActionPerformed
        double priceofitem = 135;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"Strawberry Frappe","1",priceofitem});
        Cost();
    }//GEN-LAST:event_jbtnstrawberryfrappeActionPerformed

    private void jbtnwhitechocmacchiatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnwhitechocmacchiatoActionPerformed
        double priceofitem = 140;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"White Choc Macchiato","1",priceofitem});
        Cost();
    }//GEN-LAST:event_jbtnwhitechocmacchiatoActionPerformed

    private void jbtnpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpayActionPerformed
        if(jcbpayment.getSelectedItem().equals("Cash"))
        {
            change();
            
        }
        else
        {
                jtxtchange.setText("");
                jtxtdisplay.setText("");
                }
    }//GEN-LAST:event_jbtnpayActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jtxtchange.setText("");
        jtxttip.setText("");
        jtxttotal.setText("");
        jtxtsubtotal.setText("");
        jtxtdisplay.setText("");
    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jbtnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnprintActionPerformed
        MessageFormat header = new MessageFormat("Printing in progress");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try{
            jTable1.print(JTable.PrintMode.NORMAL, header,footer);
        }
        catch(java.awt.print.PrinterException e){
            System.err.format("No Printer found", e.getMessage());
        }
    }//GEN-LAST:event_jbtnprintActionPerformed

    private void jbtnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnremoveActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         int remove = jTable1.getSelectedRow();
         if(remove>=0){
             model.removeRow(remove);
         }
         Cost();
         if(jcbpayment.getSelectedItem().equals("Cash"))
        {
            change();
            
        }
        else
        {
                jtxtchange.setText("");
                jtxtdisplay.setText("");
                }
    }//GEN-LAST:event_jbtnremoveActionPerformed
private JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"confirmto exit","Amazon",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnexitActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnamazonfrappe;
    private javax.swing.JButton jbtnclear;
    private javax.swing.JButton jbtndarkchocolate;
    private javax.swing.JButton jbtndot;
    private javax.swing.JButton jbtnespresso;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnhoneyblackcoffee;
    private javax.swing.JButton jbtnicedlemontea;
    private javax.swing.JButton jbtnpay;
    private javax.swing.JButton jbtnprint;
    private javax.swing.JButton jbtnremove;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JButton jbtnstrawberryfrappe;
    private javax.swing.JButton jbtnthaimilktea;
    private javax.swing.JButton jbtnwhitechocmacchiato;
    private javax.swing.JComboBox<String> jcbpayment;
    private javax.swing.JTextField jtxtchange;
    private javax.swing.JTextField jtxtdisplay;
    private javax.swing.JTextField jtxtsubtotal;
    private javax.swing.JTextField jtxttip;
    private javax.swing.JTextField jtxttotal;
    // End of variables declaration//GEN-END:variables
}
