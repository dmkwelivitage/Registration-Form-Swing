/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;

/**
 *
 * @author nooby
 */
public class StuRegFrame extends javax.swing.JFrame {

    /**
     * Creates new form StuRegFrame
     */
    public StuRegFrame() {
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

        btnStuSubmit = new javax.swing.JButton();
        btnStuClear = new javax.swing.JButton();
        btnStuBack = new javax.swing.JButton();
        tfStuName = new javax.swing.JTextField();
        tfStuAge = new javax.swing.JTextField();
        tfStuNumber = new javax.swing.JTextField();
        tfStuAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnlchkbox = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Registration");
        setSize(new java.awt.Dimension(450, 300));

        btnStuSubmit.setText("Submit");
        btnStuSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStuSubmitActionPerformed(evt);
            }
        });

        btnStuClear.setText("Clear");
        btnStuClear.setPreferredSize(new java.awt.Dimension(68, 22));
        btnStuClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStuClearActionPerformed(evt);
            }
        });

        btnStuBack.setText("Back");
        btnStuBack.setPreferredSize(new java.awt.Dimension(68, 22));
        btnStuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStuBackActionPerformed(evt);
            }
        });

        tfStuName.setForeground(java.awt.Color.gray);
        tfStuName.setText("Enter Student Name");
        tfStuName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStuNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfStuNameFocusLost(evt);
            }
        });

        tfStuAge.setForeground(java.awt.Color.gray);
        tfStuAge.setText("Enter Student Age");
        tfStuAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStuAgeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfStuAgeFocusLost(evt);
            }
        });

        tfStuNumber.setForeground(java.awt.Color.gray);
        tfStuNumber.setText("Enter Contact Number");
        tfStuNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStuNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfStuNumberFocusLost(evt);
            }
        });

        tfStuAddress.setForeground(java.awt.Color.gray);
        tfStuAddress.setText("Enter Student Address");
        tfStuAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStuAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfStuAddressFocusLost(evt);
            }
        });

        jLabel1.setText("Student Registration");

        pnlchkbox.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStuSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(btnStuClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStuBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfStuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfStuAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfStuAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfStuNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(pnlchkbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStuAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tfStuAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfStuNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlchkbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStuClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStuBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStuSubmit))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStuClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStuClearActionPerformed
        if(DefaultName != null){
            tfStuName.setForeground(Color.gray);
            tfStuName.setText(DefaultName);
        }
        if(DefaultAge != null){
            tfStuAge.setForeground(Color.gray);
            tfStuAge.setText(DefaultAge);
        }
        if(DefaultAddress != null){
            tfStuAddress.setForeground(Color.gray);
            tfStuAddress.setText(DefaultAddress);
        }
        if(DefaultNumber != null){
            tfStuNumber.setForeground(Color.gray);
            tfStuNumber.setText(DefaultNumber);
        }
    }//GEN-LAST:event_btnStuClearActionPerformed

    private void btnStuSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStuSubmitActionPerformed
        VerifyCheckBoxes(test);
        String inputName = null;
        String inputAge = null;
        String inputAddress = null;
        String inputNumber = null;
        if(!tfStuName.getText().equals(DefaultName) && !tfStuName.getText().equals("")){
            inputName = tfStuName.getText();
            tfStuName.setForeground(Color.gray);
            tfStuName.setText(DefaultName);
        }
        if(!tfStuAge.getText().equals(DefaultAge) && !tfStuAge.getText().equals("")){
            inputAge = tfStuAge.getText();
            tfStuAge.setForeground(Color.gray);
            tfStuAge.setText(DefaultAge);
        }
        if(!tfStuAddress.getText().equals(DefaultAddress) && !tfStuAddress.getText().equals("")){
            inputAddress = tfStuAddress.getText();
            tfStuAddress.setForeground(Color.gray);
            tfStuAddress.setText(DefaultAddress);
        }
        if(!tfStuNumber.getText().equals(DefaultNumber) && !tfStuNumber.getText().equals("")){
            inputNumber = tfStuNumber.getText();
            tfStuNumber.setForeground(Color.gray);
            tfStuNumber.setText(DefaultNumber);
        }
        conn = Registration.init();
        try {
            stmt = conn.createStatement();
            String insert = "Insert into Student_details(Student_Name , Student_Address, Student_Age, Student_ContactNumber) values ('"+inputName+"' , '"+inputAddress+"' , '"+inputAge+"' , '"+inputNumber+"')";
            PreparedStatement pst = conn.prepareStatement(insert);
            pst.execute();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CourseRegFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnStuSubmitActionPerformed

    private void btnStuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStuBackActionPerformed
        dispose();
        new MenuFrame().setVisible(true);
    }//GEN-LAST:event_btnStuBackActionPerformed

    private void tfStuNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStuNameFocusGained
        DefaultName = tfStuName.getText();
        if(tfStuName.getText().equals(DefaultName)){
            tfStuName.setForeground(Color.black);
            tfStuName.setText("");
        }
    }//GEN-LAST:event_tfStuNameFocusGained

    private void tfStuNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStuNameFocusLost
        if(tfStuName.getText().equals("")){
            tfStuName.setForeground(Color.gray);
            tfStuName.setText(DefaultName);
        }
    }//GEN-LAST:event_tfStuNameFocusLost

    private void tfStuAgeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStuAgeFocusGained
        DefaultAge = tfStuAge.getText();
        if(tfStuAge.getText().equals(DefaultAge)){
            tfStuAge.setForeground(Color.black);
            tfStuAge.setText("");
        }
    }//GEN-LAST:event_tfStuAgeFocusGained

    private void tfStuAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStuAgeFocusLost
        if(tfStuAge.getText().equals("")){
            tfStuAge.setForeground(Color.gray);
            tfStuAge.setText(DefaultAge);
        }
    }//GEN-LAST:event_tfStuAgeFocusLost

    private void tfStuAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStuAddressFocusGained
        DefaultAddress = tfStuAddress.getText();
        if(tfStuAddress.getText().equals(DefaultAddress)){
            tfStuAddress.setForeground(Color.black);
            tfStuAddress.setText("");
        }
    }//GEN-LAST:event_tfStuAddressFocusGained

    private void tfStuAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStuAddressFocusLost
        if(tfStuAddress.getText().equals("")){
            tfStuAddress.setForeground(Color.gray);
            tfStuAddress.setText(DefaultAddress);
        }
    }//GEN-LAST:event_tfStuAddressFocusLost

    private void tfStuNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStuNumberFocusGained
        DefaultNumber = tfStuNumber.getText();
        if(tfStuNumber.getText().equals(DefaultNumber)){
            tfStuNumber.setForeground(Color.black);
            tfStuNumber.setText("");
        }
    }//GEN-LAST:event_tfStuNumberFocusGained

    private void tfStuNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStuNumberFocusLost
        if(tfStuNumber.getText().equals("")){
            tfStuNumber.setForeground(Color.gray);
            tfStuNumber.setText(DefaultNumber);
        }
    }//GEN-LAST:event_tfStuNumberFocusLost

    public void getCourseName(){
        try{
                    Connection con = Registration.init();
                    Statement stmt2 = con.createStatement();
                    String q = "Select * from Course_details"; 
                    ResultSet rs = stmt2.executeQuery(q);
                    String data = null;
                    while(rs.next()){
                                data = rs.getString("Course_Name");
                                al.add(data);
                    }
                }
                catch(Exception e){
                    System.out.println(e);
                }
        System.out.println(al);
    }
    
    public JCheckBox createCheckboxes(){
        initComponents();
        int i;
        for(i = 0; i<al.size(); i++){
        test = new JCheckBox(al.get(i));
        test.setName(al.get(i));
        pnlchkbox.add(test);
        test.setVisible(true);
        pnlchkbox.revalidate();
        pnlchkbox.repaint();
        }
        
        return test;
    }
    
    public void VerifyCheckBoxes(JCheckBox test){
        int l;
            for(l = 0; l<al.size(); l++){
                System.out.println(pnlchkbox.getComponent(l).getName());
               if(pnlchkbox.getComponent(l).getName() == al.get(l)){
                   System.out.println("hello");
                if(test.isSelected()){
                    System.out.println("hii");
                }
            }
            }
        }
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
            java.util.logging.Logger.getLogger(StuRegFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StuRegFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StuRegFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StuRegFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StuRegFrame().setVisible(true);
            }
        });
    }
    //New Varivles Declaration
    Connection conn;
    Statement stmt;
    String DefaultName;
    String DefaultAge;
    String DefaultAddress;
    String DefaultNumber;
    ArrayList<String> al = new ArrayList<>(0);
    JCheckBox test;
    // End of Variable Declaration
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStuBack;
    private javax.swing.JButton btnStuClear;
    private javax.swing.JButton btnStuSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlchkbox;
    private javax.swing.JTextField tfStuAddress;
    private javax.swing.JTextField tfStuAge;
    private javax.swing.JTextField tfStuName;
    private javax.swing.JTextField tfStuNumber;
    // End of variables declaration//GEN-END:variables
}
