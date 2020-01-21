/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class HomePage extends javax.swing.JFrame {

    public static StudentSignIn stdSignIn=new StudentSignIn();
    public static StudentSignUp stdSignUp=new StudentSignUp();
    public static LecturerSignUp lecSignUp=new LecturerSignUp();
    public static LecturerSignIn lecSignIn=new LecturerSignIn();
    public static HomePage homePage=new HomePage();
    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        jLabel1 = new javax.swing.JLabel();
        btnSTDSignUp = new javax.swing.JButton();
        btnLECSignUp = new javax.swing.JButton();
        btnSTDSignIn = new javax.swing.JButton();
        btnLECSignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Welcome To University Management System");

        btnSTDSignUp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSTDSignUp.setText("Sign Up As Student");
        btnSTDSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSTDSignUpActionPerformed(evt);
            }
        });

        btnLECSignUp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLECSignUp.setText("Sign Up As Lecturer");
        btnLECSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLECSignUpActionPerformed(evt);
            }
        });

        btnSTDSignIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSTDSignIn.setText("Sign In As Student");
        btnSTDSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSTDSignInActionPerformed(evt);
            }
        });

        btnLECSignIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLECSignIn.setText("Sign In As Lecturer");
        btnLECSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLECSignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLECSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSTDSignUp)
                    .addComponent(btnSTDSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLECSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(btnSTDSignUp)
                .addGap(18, 18, 18)
                .addComponent(btnLECSignUp)
                .addGap(18, 18, 18)
                .addComponent(btnSTDSignIn)
                .addGap(18, 18, 18)
                .addComponent(btnLECSignIn)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSTDSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSTDSignUpActionPerformed
        // TODO add your handling code here:
        
        stdSignUp.setVisible(true);
       homePage.setVisible(false);
       homePage.dispose();
            
               
      
    }//GEN-LAST:event_btnSTDSignUpActionPerformed

    private void btnLECSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLECSignUpActionPerformed
        // TODO add your handling code here:
        
        lecSignUp.setVisible(true);
        homePage.setVisible(false);
       homePage.dispose();
        
        
              
               
    }//GEN-LAST:event_btnLECSignUpActionPerformed

    private void btnSTDSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSTDSignInActionPerformed
        // TODO add your handling code here:
       
        stdSignIn.setVisible(true);
        homePage.setVisible(false);
       homePage.dispose();
        
    }//GEN-LAST:event_btnSTDSignInActionPerformed

    private void btnLECSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLECSignInActionPerformed
        // TODO add your handling code here:
        
        lecSignIn.setVisible(true);
        homePage.setVisible(false);
       homePage.dispose();
        
    }//GEN-LAST:event_btnLECSignInActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                homePage.setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLECSignIn;
    private javax.swing.JButton btnLECSignUp;
    private javax.swing.JButton btnSTDSignIn;
    private javax.swing.JButton btnSTDSignUp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
