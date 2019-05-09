/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksy;

/**
 *
 * @author watsa9604
 */
public class signUpGUI extends javax.swing.JFrame {

    
    Bank bank;
    /**
     * Creates new form signUpGUI
     */
    public signUpGUI() {
        initComponents();
        bank = new Bank("customer.txt");
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeLab = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signUpName = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        signUpAddress = new javax.swing.JTextField();
        chequeing = new javax.swing.JRadioButton();
        savings = new javax.swing.JRadioButton();
        signUpNameLab = new javax.swing.JLabel();
        addressLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signUpPass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        typeLab.setText("Type of account");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(193, 193, 38));
        jLabel2.setText("Scumbags BCR ltd.");

        signUpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpNameActionPerformed(evt);
            }
        });

        okButton.setText("Sign Up");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        signUpAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpAddressActionPerformed(evt);
            }
        });

        chequeing.setText("Chequeing");
        chequeing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeingActionPerformed(evt);
            }
        });

        savings.setText("Savings");
        savings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingsActionPerformed(evt);
            }
        });

        signUpNameLab.setText("Name");

        addressLab.setText("Address");

        jLabel1.setText("Pin");

        signUpPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressLab)
                            .addComponent(signUpNameLab)
                            .addComponent(typeLab)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signUpName, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(signUpAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chequeing)
                                .addGap(18, 18, 18)
                                .addComponent(savings))
                            .addComponent(signUpPass))
                        .addContainerGap(122, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpNameLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLab)
                    .addComponent(signUpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(signUpPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLab)
                    .addComponent(chequeing)
                    .addComponent(savings))
                .addGap(18, 18, 18)
                .addComponent(okButton)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
  
        bank.addCustomer(signUpName.getText(), signUpAddress.getText(), 0.0, -10000,  signUpPass.getText(), true);
        bank.saveCustomers("customer.txt");
        BankLoginGUI obj = new BankLoginGUI();
        obj.setVisible(true);
        
    }//GEN-LAST:event_okButtonActionPerformed

    private void signUpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpNameActionPerformed

    private void signUpAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpAddressActionPerformed

    private void chequeingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequeingActionPerformed
        
    }//GEN-LAST:event_chequeingActionPerformed

    private void signUpPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpPassActionPerformed

    private void savingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsActionPerformed
        
    }//GEN-LAST:event_savingsActionPerformed

    
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
            java.util.logging.Logger.getLogger(signUpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new signUpGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLab;
    private javax.swing.JRadioButton chequeing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton okButton;
    private javax.swing.JRadioButton savings;
    private javax.swing.JTextField signUpAddress;
    private javax.swing.JTextField signUpName;
    private javax.swing.JLabel signUpNameLab;
    private javax.swing.JTextField signUpPass;
    private javax.swing.JLabel typeLab;
    // End of variables declaration//GEN-END:variables
}
