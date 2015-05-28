package Graphic;

import Logic.Global;
import Logic.User.Client;
import Logic.User.User;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ClientWindow extends javax.swing.JFrame {
    
    private final LogInWindow ancestor;
    private final Client currentUser;
    private final Global global;
    private final ImageIcon warningIcon;
    private final ImageIcon exclamationIcon;
    private final ImageIcon checkIcon;
    
    public ClientWindow(LogInWindow ancestor, Client currentUser) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(ancestor);
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/HotelIcon.png")).getImage());
        this.ancestor = ancestor;
        this.currentUser = currentUser;
        this.global = Global.getInstance();
        this.warningIcon = new ImageIcon(getClass().getResource("/Images/WarningIcon.png"));
        this.exclamationIcon = new ImageIcon(getClass().getResource("/Images/ExclamationIcon.png"));
        this.checkIcon = new ImageIcon(getClass().getResource("/Images/CheckIcon.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHotelView = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNameModify = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldLastNameModify = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxGenderModify = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmailModify = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldPasswordModify = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordFieldPasswordConfirmationModify = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCountryModify = new javax.swing.JTextField();
        jTextFieldPhoneNumberModify = new javax.swing.JTextField();
        jTextFieldPreferenceMoneyModify = new javax.swing.JTextField();
        jLabelWarningInfoEmail = new javax.swing.JLabel();
        jLabelWarningInfoPassword = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonCloseSession = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTableHotelView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableHotelView);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hotel View", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hotel Reservation", jPanel3);

        jLabel4.setText("Name:");

        jTextFieldNameModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNameModifyKeyTyped(evt);
            }
        });

        jLabel5.setText("Last Name:");

        jTextFieldLastNameModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLastNameModifyKeyTyped(evt);
            }
        });

        jLabel12.setText("Gender:");

        jComboBoxGenderModify.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel6.setText("Email:");

        jTextFieldEmailModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEmailModifyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEmailModifyKeyTyped(evt);
            }
        });

        jLabel7.setText("Password:");

        jPasswordFieldPasswordModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordModifyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordModifyKeyTyped(evt);
            }
        });

        jLabel9.setText("Password Confirmation:");

        jPasswordFieldPasswordConfirmationModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordConfirmationModifyKeyTyped(evt);
            }
        });

        jLabel1.setText("Country:");

        jLabel2.setText("Phone Number:");

        jLabel3.setText("Preference Money:");

        jTextFieldCountryModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCountryModifyKeyTyped(evt);
            }
        });

        jTextFieldPhoneNumberModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneNumberModifyKeyTyped(evt);
            }
        });

        jTextFieldPreferenceMoneyModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPreferenceMoneyModifyKeyTyped(evt);
            }
        });

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SaveIcon.png"))); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldEmailModify, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelWarningInfoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldNameModify, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldLastNameModify)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jComboBoxGenderModify, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPasswordFieldPasswordModify, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelWarningInfoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldPhoneNumberModify, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldCountryModify, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordFieldPasswordConfirmationModify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPreferenceMoneyModify, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonSave))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNameModify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldLastNameModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jComboBoxGenderModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmailModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelWarningInfoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldPasswordModify, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelWarningInfoPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldPasswordConfirmationModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCountryModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPhoneNumberModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPreferenceMoneyModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Modify Profile", jPanel2);

        jButtonCloseSession.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CloseIcon.png"))); // NOI18N
        jButtonCloseSession.setText("Close session");
        jButtonCloseSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseSessionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCloseSession))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCloseSession))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSessionActionPerformed
        new LogInWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCloseSessionActionPerformed

    private void jTextFieldNameModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameModifyKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && (scan !=
        (char)KeyEvent.VK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextFieldNameModifyKeyTyped

    private void jTextFieldLastNameModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLastNameModifyKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && (scan !=
        (char)KeyEvent.VK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextFieldLastNameModifyKeyTyped

    private void jTextFieldEmailModifyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailModifyKeyReleased
        if(!jTextFieldEmailModify.getText().contains("@"))
        manageComponentsEmailSave(false,"Invalid email");
        else{
            for(User temporalUser : global.getGeneralUserList()){
                if(temporalUser.getEmail().equals(jTextFieldEmailModify.getText())){
                    manageComponentsEmailSave(false,"Email in use");
                    return;
                }
            }
            manageComponentsEmailSave(true,"");
        }
    }//GEN-LAST:event_jTextFieldEmailModifyKeyReleased

    private void jTextFieldEmailModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailModifyKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') &&
        (scan < '0' || scan > '9') && (scan != '-' && scan != '_' && scan != '.' &&
        scan != '@'))
            evt.consume();
    }//GEN-LAST:event_jTextFieldEmailModifyKeyTyped

    private void jPasswordFieldPasswordModifyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordModifyKeyReleased
        if(jPasswordFieldPasswordModify.getPassword().length < 6)
        manageComponentsPasswordSave(false,"Password too short");
        else{
            for(char c : jPasswordFieldPasswordModify.getPassword()){
                if(c >= '0' && c <= '9'){
                    manageComponentsPasswordSave(true,"");
                    return;
                }
            }
            manageComponentsPasswordSave(false,"Required at least one number");
        }
    }//GEN-LAST:event_jPasswordFieldPasswordModifyKeyReleased

    private void jPasswordFieldPasswordModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordModifyKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') &&
        (scan < '0' || scan > '9') && (scan != '-' && scan != '_' && scan != '.')
        || (jPasswordFieldPasswordModify.getPassword().length == 20))
            evt.consume();
    }//GEN-LAST:event_jPasswordFieldPasswordModifyKeyTyped

    private void jPasswordFieldPasswordConfirmationModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordConfirmationModifyKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') &&
        (scan < '0' || scan > '9') && (scan != '-' && scan != '_' && scan != '.')
        || (jPasswordFieldPasswordConfirmationModify.getPassword().length == 20))
            evt.consume();
    }//GEN-LAST:event_jPasswordFieldPasswordConfirmationModifyKeyTyped

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if(!jTextFieldNameModify.getText().isEmpty() && !jTextFieldLastNameModify
        .getText().isEmpty() && !jTextFieldEmailModify.getText().isEmpty() && 
        !jTextFieldCountryModify.getText().isEmpty() && 
        !jTextFieldPhoneNumberModify.getText().isEmpty() && 
        !jTextFieldPreferenceMoneyModify.getText().isEmpty()){
            if(jPasswordFieldPasswordModify.getPassword().length > 0){
                if(Arrays.equals(jPasswordFieldPasswordModify.getPassword(),
                jPasswordFieldPasswordConfirmationModify.getPassword()))
                    currentUser.setPassword(jPasswordFieldPasswordModify.getPassword());
                else{
                    JOptionPane.showMessageDialog(this,"The password and password "
                    + "confirmation are different",
                    "Warning",JOptionPane.INFORMATION_MESSAGE,warningIcon); 
                    return;
                }
            }
            currentUser.setName(jTextFieldNameModify.getText());
            currentUser.setLastName(jTextFieldLastNameModify.getText());
            currentUser.setGender(jComboBoxGenderModify.getSelectedItem().toString());
            currentUser.setEmail(jTextFieldEmailModify.getText());
            currentUser.setCountry(jTextFieldCountryModify.getText());
            currentUser.setPhoneNumber(jTextFieldPhoneNumberModify.getText());
            currentUser.setPreferenceMoney(jTextFieldPreferenceMoneyModify.getText());
            JOptionPane.showMessageDialog(this,"Your new data are succesfully saved",
            "Message",JOptionPane.INFORMATION_MESSAGE,checkIcon);
            chargeClientData();
        }
        else
            JOptionPane.showMessageDialog(this,"Missing some data\nPlease enter"
            + " all information requested","Warning",JOptionPane.INFORMATION_MESSAGE,warningIcon);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        chargeClientData();
    }//GEN-LAST:event_formWindowOpened

    private void jTextFieldPreferenceMoneyModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPreferenceMoneyModifyKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z'))
            evt.consume();
    }//GEN-LAST:event_jTextFieldPreferenceMoneyModifyKeyTyped

    private void jTextFieldPhoneNumberModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberModifyKeyTyped
        char scan = evt.getKeyChar();
        if(scan < '0' && scan > '9')
            evt.consume();
    }//GEN-LAST:event_jTextFieldPhoneNumberModifyKeyTyped

    private void jTextFieldCountryModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCountryModifyKeyTyped
        char scan = evt.getKeyChar();
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && (scan !=
        (char)KeyEvent.VK_SPACE))
            evt.consume();
    }//GEN-LAST:event_jTextFieldCountryModifyKeyTyped

    private void chargeClientData(){
        jTextFieldNameModify.setText(currentUser.getName());
        jTextFieldLastNameModify.setText(currentUser.getLastName());
        if(currentUser.getGender().equals("Male"))
            jComboBoxGenderModify.setSelectedIndex(0);
        else
            jComboBoxGenderModify.setSelectedIndex(1);
        jTextFieldEmailModify.setText(currentUser.getEmail());
        jPasswordFieldPasswordModify.setText("");
        jPasswordFieldPasswordConfirmationModify.setText("");
        jTextFieldCountryModify.setText(currentUser.getCountry());
        jTextFieldPhoneNumberModify.setText(currentUser.getPhoneNumber());
        jTextFieldPreferenceMoneyModify.setText(currentUser.getPreferenceMoney());
    }
    
    private void manageComponentsPasswordSave(boolean accion, String message){
        if(accion == true){
            jButtonSave.setEnabled(true);
            jLabelWarningInfoPassword.setText("");
            jLabelWarningInfoPassword.setIcon(null); 
        }
        else{
            jButtonSave.setEnabled(false);
            jLabelWarningInfoPassword.setText(message);
            jLabelWarningInfoPassword.setIcon(exclamationIcon);
        }
    }
    
    private void manageComponentsEmailSave(boolean accion, String message){
        if(accion == true){
            jButtonSave.setEnabled(true);
            jLabelWarningInfoEmail.setText("");
            jLabelWarningInfoEmail.setIcon(null);
        }
        else{
            jButtonSave.setEnabled(false);
            jLabelWarningInfoEmail.setText(message);
            jLabelWarningInfoEmail.setIcon(exclamationIcon);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(ClientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientWindow(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseSession;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBoxGenderModify;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldPasswordConfirmationModify;
    private javax.swing.JPasswordField jPasswordFieldPasswordModify;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableHotelView;
    private javax.swing.JTextField jTextFieldCountryModify;
    private javax.swing.JTextField jTextFieldEmailModify;
    private javax.swing.JTextField jTextFieldLastNameModify;
    private javax.swing.JTextField jTextFieldNameModify;
    private javax.swing.JTextField jTextFieldPhoneNumberModify;
    private javax.swing.JTextField jTextFieldPreferenceMoneyModify;
    // End of variables declaration//GEN-END:variables
}
