/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksy;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author watsa9604
 */
public class mainBankGUI extends javax.swing.JFrame {

    Bank bank = new Bank("customer.txt");
    Customer m;

    /**
     * Creates new form mainBankGUI
     */
    public mainBankGUI() {
        initComponents();
    }

    public mainBankGUI(Customer m) {
        this.m = bank.findCustomer(m.getName(), m.getPin());
        initComponents();
        welcomeLab.setText("Welcome: " + m.getName());
        balLab1.setText("Current Balance: $" + m.getBal());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        creditLab = new javax.swing.JLabel();
        ChangeBalLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        balLab1 = new javax.swing.JLabel();
        ChangeCreditLab = new javax.swing.JLabel();
        depositLab = new javax.swing.JLabel();
        withdrawlLab = new javax.swing.JLabel();
        deposit = new javax.swing.JTextField();
        Withdrawl = new javax.swing.JTextField();
        withdrawlButton = new javax.swing.JButton();
        conversionLab = new javax.swing.JLabel();
        conversion = new javax.swing.JTextField();
        CANLab = new javax.swing.JLabel();
        YENLab = new javax.swing.JLabel();
        EURLab = new javax.swing.JLabel();
        USDLab = new javax.swing.JLabel();
        welcomeLab = new javax.swing.JLabel();
        nameDisplayLab = new javax.swing.JLabel();
        depositButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        creditLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        creditLab.setText("Credit Available:");

        ChangeBalLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(193, 193, 38));
        jLabel1.setText("Scumbags BCR ltd.");

        balLab1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balLab1.setText("Current Balance:");

        ChangeCreditLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        depositLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        depositLab.setText("Deposit");

        withdrawlLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withdrawlLab.setText("Withdrawl");

        withdrawlButton.setText("OK");
        withdrawlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawlButtonActionPerformed(evt);
            }
        });

        conversionLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        conversionLab.setText("Conversion Rates:");

        welcomeLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeLab.setText("Welcome:");

        nameDisplayLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        depositButton1.setText("OK");
        depositButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(balLab1)
                                    .addComponent(creditLab)
                                    .addComponent(depositLab)
                                    .addComponent(withdrawlLab))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ChangeBalLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ChangeCreditLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deposit)
                                    .addComponent(Withdrawl, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(conversionLab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(conversion, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(withdrawlButton)
                            .addComponent(depositButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(CANLab, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EURLab, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(USDLab, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(YENLab, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeLab)
                        .addGap(18, 18, 18)
                        .addComponent(nameDisplayLab, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangeBalLab)
                    .addComponent(balLab1))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditLab)
                    .addComponent(ChangeCreditLab))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositLab)
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositButton1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawlLab)
                    .addComponent(Withdrawl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawlButton))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conversionLab)
                    .addComponent(conversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANLab)
                    .addComponent(EURLab)
                    .addComponent(USDLab)
                    .addComponent(YENLab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLab)
                    .addComponent(nameDisplayLab))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawlButtonActionPerformed

        Double withdraw;
        withdraw = Double.parseDouble(Withdrawl.getText());
        if (withdraw < m.getBal()) {
            m.subBal(withdraw, m.getAccNum());

            bank.saveCustomers("customer.txt");
        } else {
            Withdrawl.setText("Insufficient Balance, Please try again.");
        }
        balLab1.setText("Current Balance: $" + m.getBal());

        //Find the acc num, overwrite all with
        //bank.addCustomer(m.getName(), m.getAddress(), BALANCE, m.getCredit(), m.getPin());
        //
    }//GEN-LAST:event_withdrawlButtonActionPerformed

    private void depositButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButton1ActionPerformed

        Double BALANCE;
        BALANCE = Double.parseDouble(deposit.getText());
        m.addBal(BALANCE, m.getAccNum());
        bank.saveCustomers("customer.txt");
        balLab1.setText("Current Balance: $" + m.getBal());

    }//GEN-LAST:event_depositButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainBankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainBankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainBankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainBankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainBankGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CANLab;
    private javax.swing.JLabel ChangeBalLab;
    private javax.swing.JLabel ChangeCreditLab;
    private javax.swing.JLabel EURLab;
    private javax.swing.JLabel USDLab;
    private javax.swing.JTextField Withdrawl;
    private javax.swing.JLabel YENLab;
    private javax.swing.JLabel balLab1;
    private javax.swing.JTextField conversion;
    private javax.swing.JLabel conversionLab;
    private javax.swing.JLabel creditLab;
    private javax.swing.JTextField deposit;
    private javax.swing.JButton depositButton1;
    private javax.swing.JLabel depositLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameDisplayLab;
    private javax.swing.JLabel welcomeLab;
    private javax.swing.JButton withdrawlButton;
    private javax.swing.JLabel withdrawlLab;
    // End of variables declaration//GEN-END:variables
}
