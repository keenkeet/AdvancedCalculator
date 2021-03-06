/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10simplecalculator;

import javax.swing.JOptionPane;

public class CalculatorForm extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorForm
     */
    public CalculatorForm() {
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

        lblTitle = new javax.swing.JLabel();
        lblFirstNum = new javax.swing.JLabel();
        lblSecondNum = new javax.swing.JLabel();
        lblAnswer = new javax.swing.JLabel();
        txtSecondNum = new javax.swing.JTextField();
        txtFirstNum = new javax.swing.JTextField();
        txtAnswer = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Lucida Console", 3, 18)); // NOI18N
        lblTitle.setText("Welcome to Simple Calculator");

        lblFirstNum.setText("Enter First Number: ");

        lblSecondNum.setText("Enter Second Number:");

        lblAnswer.setText("Answer:");

        txtAnswer.setEditable(false);

        btnAdd.setText("ADD");
        btnAdd.setName(""); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnDivision.setText("DIVISION");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMultiply)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDivision)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSecondNum)
                            .addComponent(lblAnswer)
                            .addComponent(lblFirstNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstNum, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtSecondNum)
                            .addComponent(txtAnswer)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblTitle)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstNum)
                    .addComponent(txtFirstNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecondNum)
                    .addComponent(txtSecondNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnswer)
                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSub)
                    .addComponent(btnMultiply)
                    .addComponent(btnDivision))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int num1, num2, answer;
//        num1 = Integer.parseInt(this.txtFirstNum.getText());
//        num2 = Integer.parseInt(this.txtSecondNum.getText());
//        answer = num1+num2;
//        this.txtAnswer.setText(""+answer);
       try{
           num1 = Integer.parseInt(this.txtFirstNum.getText());
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, "Bad First Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                   return;
       }
       try{
           num2 = Integer.parseInt(this.txtSecondNum.getText());
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, "Bad First Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                   return;
       }
       answer = num1+num2;
       this.txtAnswer.setText(""+answer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
         int num1, num2, answer;
       /* num1 = Integer.parseInt(this.txtFirstNum.getText());
        num2 = Integer.parseInt(this.txtSecondNum.getText());
        answer = num1-num2;
        this.txtAnswer.setText(""+answer); */
         try{
           num1 = Integer.parseInt(this.txtFirstNum.getText());
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, "Bad First Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                   return;
       }
       finally{
             JOptionPane.showMessageDialog(this, "Do you want to continue?","Message", JOptionPane.ERROR_MESSAGE);
         }
       try{
           num2 = Integer.parseInt(this.txtSecondNum.getText());
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, "Bad First Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                   return;
       }
      answer = num1-num2;
        this.txtAnswer.setText(""+answer);
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
       int num1, num2, answer;
//        num1 = Integer.parseInt(this.txtFirstNum.getText());
//        num2 = Integer.parseInt(this.txtSecondNum.getText());
//        answer = num1*num2;
//        this.txtAnswer.setText(""+answer); 
         try{
           num1 = Integer.parseInt(this.txtFirstNum.getText());
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, "Bad First Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                   return;
       }
       try{
           num2 = Integer.parseInt(this.txtSecondNum.getText());
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, "Bad First Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                   return;
       }
       answer = num1*num2;
       this.txtAnswer.setText(""+answer);
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        int num1, num2, answer;
//        num1 = Integer.parseInt(this.txtFirstNum.getText());
//        num2 = Integer.parseInt(this.txtSecondNum.getText());
//        answer = num1/num2;
//        this.txtAnswer.setText(""+answer); 
         try{
           num1 = Integer.parseInt(this.txtFirstNum.getText());
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, "Bad First Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                   return;
       }
       try{
           num2 = Integer.parseInt(this.txtSecondNum.getText());
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, "Bad First Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                   return;
       }
       answer = num1/num2;
       this.txtAnswer.setText(""+answer);
    }//GEN-LAST:event_btnDivisionActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblFirstNum;
    private javax.swing.JLabel lblSecondNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtFirstNum;
    private javax.swing.JTextField txtSecondNum;
    // End of variables declaration//GEN-END:variables
}
