package Graphic;

import Logic.Global;
import Logic.User.*;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LogInWindow extends javax.swing.JFrame {

    private final Global global;
    private final ImageIcon warningIcon;
    private final ImageIcon exclamationIcon;
    
    public LogInWindow() {
        initComponents();
        this.setTitle("Log in");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Img/HotelIcon.png")).getImage());
        this.global = Global.getInstance();
        this.warningIcon = new ImageIcon(getClass().getResource("/Img/WarningIcon.png"));
        this.exclamationIcon = new ImageIcon(getClass().getResource("/Img/ExclamationIcon.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonLogIn = new javax.swing.JButton();
        jButtonSignIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxGenderSignIn = new javax.swing.JComboBox();
        jTextFieldNameSignIn = new javax.swing.JTextField();
        jTextFieldLastNameSignIn = new javax.swing.JTextField();
        jTextFieldEmailSignIn = new javax.swing.JTextField();
        jPasswordFieldPasswordSignIn = new javax.swing.JPasswordField();
        jPasswordFieldPasswordConfirmation = new javax.swing.JPasswordField();
        jLabelWarningInfoEmail = new javax.swing.JLabel();
        jLabelWarningInfoPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setText("HNHoteles.com ");

        jButtonLogIn.setBackground(new java.awt.Color(51, 153, 255));
        jButtonLogIn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonLogIn.setText("Log in");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });
        jButtonLogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLogInKeyPressed(evt);
            }
        });

        jButtonSignIn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonSignIn.setText("Sign Up");
        jButtonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignInActionPerformed(evt);
            }
        });

        jLabel2.setText("Email:");

        jLabel3.setText("Password:");

        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyTyped(evt);
            }
        });

        jPasswordFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordKeyTyped(evt);
            }
        });

        jLabel4.setText("Name:");

        jLabel5.setText("Last Name:");

        jLabel6.setText("Email:");

        jLabel7.setText("Password:");

        jLabel9.setText("Password Confirmation:");

        jLabel12.setText("Gender:");

        jComboBoxGenderSignIn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jTextFieldNameSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameSignInActionPerformed(evt);
            }
        });
        jTextFieldNameSignIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNameSignInKeyTyped(evt);
            }
        });

        jTextFieldLastNameSignIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLastNameSignInKeyTyped(evt);
            }
        });

        jTextFieldEmailSignIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEmailSignInKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEmailSignInKeyTyped(evt);
            }
        });

        jPasswordFieldPasswordSignIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordSignInKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordSignInKeyTyped(evt);
            }
        });

        jPasswordFieldPasswordConfirmation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordConfirmationKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldEmailSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelWarningInfoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldNameSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldLastNameSignIn)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jComboBoxGenderSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPasswordFieldPasswordSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelWarningInfoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPasswordFieldPasswordConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSignIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogIn)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNameSignIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldLastNameSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jComboBoxGenderSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmailSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelWarningInfoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelWarningInfoPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldPasswordSignIn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordFieldPasswordConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSignIn)
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        informationValidate();
    }//GEN-LAST:event_jButtonLogInActionPerformed
    
    private void informationValidate(){
        if(!jTextFieldEmail.getText().isEmpty() && !jPasswordFieldPassword.getText().isEmpty()){
            for(User temporalUser : global.getGeneralUserList()){
		if(temporalUser.getEmail().equals(jTextFieldEmail.getText()) && 
                (temporalUser.getPassword().equals(jPasswordFieldPassword.getText()))){
                    if(temporalUser instanceof Administrator)
			new AdministratorWindow(this,(Administrator)temporalUser)
                        .setVisible(true);
                    else
                        new ClientWindow(this,(Client)temporalUser).setVisible(true);
                    this.dispose();
                    return;
		}
            }
            JOptionPane.showMessageDialog(this,"Error, invalid email or password.",
            "Warning",JOptionPane.INFORMATION_MESSAGE,warningIcon);
	}
        else
            JOptionPane.showMessageDialog(this,"Error, please enter all the requested"
             + " information.","Warning",JOptionPane.INFORMATION_MESSAGE,warningIcon);
    }
    
    private void jTextFieldNameSignInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameSignInKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && (scan != 
        (char)KeyEvent.VK_SPACE) || (scan == ' ' && jTextFieldNameSignIn.getText().length() == 0))
            evt.consume();
    }//GEN-LAST:event_jTextFieldNameSignInKeyTyped

    private void jTextFieldLastNameSignInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLastNameSignInKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && (scan != 
        (char)KeyEvent.VK_SPACE) || (scan == ' ' && jTextFieldLastNameSignIn.getText().length() == 0))
            evt.consume();
    }//GEN-LAST:event_jTextFieldLastNameSignInKeyTyped

    private void jTextFieldEmailSignInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailSignInKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && 
        (scan < '0' || scan > '9') && (scan != '-' && scan != '_' && scan != '.' &&
        scan != '@'))
            evt.consume();
    }//GEN-LAST:event_jTextFieldEmailSignInKeyTyped

    private void jPasswordFieldPasswordSignInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordSignInKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && 
        (scan < '0' || scan > '9') && (scan != '-' && scan != '_' && scan != '.')
        || (jPasswordFieldPasswordSignIn.getPassword().length == 20))
            evt.consume();
    }//GEN-LAST:event_jPasswordFieldPasswordSignInKeyTyped

    private void jPasswordFieldPasswordConfirmationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordConfirmationKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && 
        (scan < '0' || scan > '9') && (scan != '-' && scan != '_' && scan != '.')
        || (jPasswordFieldPasswordConfirmation.getPassword().length == 20))
            evt.consume();
    }//GEN-LAST:event_jPasswordFieldPasswordConfirmationKeyTyped

    private void jTextFieldEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && 
        (scan < '0' || scan > '9') && (scan != '-' && scan != '_' && scan != '.' &&
        scan != '@'))
            evt.consume();
    }//GEN-LAST:event_jTextFieldEmailKeyTyped

    private void jPasswordFieldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordKeyTyped
        char scan = evt.getKeyChar();
        if(scan == KeyEvent.VK_ENTER){
            informationValidate();
            return;
        }
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && 
        (scan < '0' || scan > '9') && (scan != '-' && scan != '_' && scan != '.')
        || (jPasswordFieldPassword.getPassword().length == 20))
            evt.consume();
    }//GEN-LAST:event_jPasswordFieldPasswordKeyTyped

    private void jButtonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignInActionPerformed
        if(!jTextFieldNameSignIn.getText().isEmpty() && !jTextFieldLastNameSignIn.getText()
        .isEmpty() && !jTextFieldEmailSignIn.getText().isEmpty() && jPasswordFieldPasswordSignIn
        .getPassword().length != 0 && jPasswordFieldPasswordConfirmation.getPassword().length != 0){
            if(Arrays.equals(jPasswordFieldPasswordSignIn.getPassword(),jPasswordFieldPasswordConfirmation
            .getPassword())){
                Client newClient = (Client)UserCreator.createUser(jTextFieldNameSignIn.getText(),
                jTextFieldLastNameSignIn.getText(),jComboBoxGenderSignIn.getSelectedItem().toString(),
                jTextFieldEmailSignIn.getText(),jPasswordFieldPasswordSignIn.getPassword(),"Client");
                global.addUser(newClient);
                new ClientWindow(this,newClient).setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(this,"Welcome to our hotel search system",
                "Welcome",JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(getClass().getResource("/Img/HotelIcon.png")));
            }
            else
               JOptionPane.showMessageDialog(this,"The password and password confirmation are different",
                "Warning",JOptionPane.INFORMATION_MESSAGE,warningIcon); 
        }
        else
            JOptionPane.showMessageDialog(this,"Missing some data\nPlease enter all information requested",
            "Warning",JOptionPane.INFORMATION_MESSAGE,warningIcon);
    }//GEN-LAST:event_jButtonSignInActionPerformed

    private void jTextFieldEmailSignInKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailSignInKeyReleased
        if(!jTextFieldEmailSignIn.getText().contains("@"))
            manageComponentsEmailSignIn(false,"Invalid email");
        else{
            for(User temporalUser : global.getGeneralUserList()){
                if(temporalUser.getEmail().equals(jTextFieldEmailSignIn.getText())){
                    manageComponentsEmailSignIn(false,"Email in use");
                    return;
                }
            }
            manageComponentsEmailSignIn(true,"");
        }
    }//GEN-LAST:event_jTextFieldEmailSignInKeyReleased

    private void jPasswordFieldPasswordSignInKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordSignInKeyReleased
        if(jPasswordFieldPasswordSignIn.getPassword().length < 6)
            manageComponentsPasswordSignIn(false,"Password too short");
        else if(jPasswordFieldPasswordSignIn.getPassword().length > 20)
            manageComponentsPasswordSignIn(false,"Password too large");
        else{
            for(char c : jPasswordFieldPasswordSignIn.getPassword()){
                if(c >= '0' && c <= '9'){
                    manageComponentsPasswordSignIn(true,"");
                    return;
                }
            }
            manageComponentsPasswordSignIn(false,"Required at least one number");
        }
    }//GEN-LAST:event_jPasswordFieldPasswordSignInKeyReleased

    private void jTextFieldNameSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameSignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameSignInActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    private void jButtonLogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLogInKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogInKeyPressed
    
    private void manageComponentsPasswordSignIn(boolean accion, String message){
        if(accion == true){
            jButtonSignIn.setEnabled(true);
            jLabelWarningInfoPassword.setText("");
            jLabelWarningInfoPassword.setIcon(null);
        }
        else{
            jButtonSignIn.setEnabled(false);
            jLabelWarningInfoPassword.setText(message);
            jLabelWarningInfoPassword.setIcon(exclamationIcon);
        }
    }
    
    private void manageComponentsEmailSignIn(boolean accion, String message){
        if(accion == true){
            jButtonSignIn.setEnabled(true);
            jLabelWarningInfoEmail.setText("");
            jLabelWarningInfoEmail.setIcon(null);
        }
        else{
            jButtonSignIn.setEnabled(false);
            jLabelWarningInfoEmail.setText(message);
            jLabelWarningInfoEmail.setIcon(exclamationIcon);
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
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonSignIn;
    private javax.swing.JComboBox jComboBoxGenderSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelWarningInfoEmail;
    private javax.swing.JLabel jLabelWarningInfoPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JPasswordField jPasswordFieldPasswordConfirmation;
    private javax.swing.JPasswordField jPasswordFieldPasswordSignIn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmailSignIn;
    private javax.swing.JTextField jTextFieldLastNameSignIn;
    private javax.swing.JTextField jTextFieldNameSignIn;
    // End of variables declaration//GEN-END:variables
}
