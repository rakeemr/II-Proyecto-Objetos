package Graphic;

import Logic.Global;
import Logic.User.Client;
import Logic.User.User;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClientWindow extends javax.swing.JFrame {  
    private final LogInWindow ancestor;
    private final Client currentUser;
    private final Global global;
    private final ImageIcon warningIcon;
    private final ImageIcon exclamationIcon;
    private final ImageIcon checkIcon;
    
    public ClientWindow(LogInWindow ancestor, Client currentUser) {
        initComponents();
        this.setTitle("Client view");
        this.setResizable(false);
        this.setLocationRelativeTo(ancestor);
        this.setIconImage(new ImageIcon(getClass().getResource("/Img/HotelIcon.png")).getImage());
        this.ancestor = ancestor;
        this.currentUser = currentUser;
        this.global = Global.getInstance();
        this.warningIcon = new ImageIcon(getClass().getResource("/Img/WarningIcon.png"));
        this.exclamationIcon = new ImageIcon(getClass().getResource("/Img/ExclamationIcon.png"));
        this.checkIcon = new ImageIcon(getClass().getResource("/Img/CheckIcon.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCriterion = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButtonPrice = new javax.swing.JRadioButton();
        jRadioButtonStarsNumber = new javax.swing.JRadioButton();
        jRadioButtonHostageType = new javax.swing.JRadioButton();
        jButtonSearchHotel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxSearchCriterion = new javax.swing.JComboBox();
        jLabelCriterion = new javax.swing.JLabel();
        jTextFieldCriterion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListHotelsResults = new javax.swing.JList();
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
        jTextFieldPhoneNumberModify = new javax.swing.JTextField();
        jTextFieldPreferenceMoneyModify = new javax.swing.JTextField();
        jLabelWarningInfoEmail = new javax.swing.JLabel();
        jLabelWarningInfoPassword = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jComboBoxCountriesModify = new javax.swing.JComboBox();
        jButtonCloseSession = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel16.setText("Ordered By:");

        buttonGroupCriterion.add(jRadioButtonPrice);
        jRadioButtonPrice.setText("Popularity");
        jRadioButtonPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPriceActionPerformed(evt);
            }
        });

        buttonGroupCriterion.add(jRadioButtonStarsNumber);
        jRadioButtonStarsNumber.setText("Stars Number");
        jRadioButtonStarsNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonStarsNumberActionPerformed(evt);
            }
        });

        buttonGroupCriterion.add(jRadioButtonHostageType);
        jRadioButtonHostageType.setText("Lodging Type");

        jButtonSearchHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SearchIcon.png"))); // NOI18N
        jButtonSearchHotel.setText("Search");
        jButtonSearchHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchHotelActionPerformed(evt);
            }
        });

        jLabel8.setText("Search criterion:");

        jComboBoxSearchCriterion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Country", "Address" }));
        jComboBoxSearchCriterion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchCriterionActionPerformed(evt);
            }
        });

        jLabelCriterion.setText("Name:");

        jListHotelsResults.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListHotelsResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListHotelsResultsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListHotelsResults);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonPrice)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonHostageType, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonStarsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSearchHotel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSearchCriterion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelCriterion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCriterion))
                    .addComponent(jScrollPane1))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxSearchCriterion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCriterion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCriterion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonStarsNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonHostageType)
                    .addComponent(jButtonSearchHotel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hotel Search", jPanel3);

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

        jTextFieldPhoneNumberModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPhoneNumberModifyMouseClicked(evt);
            }
        });
        jTextFieldPhoneNumberModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneNumberModifyKeyTyped(evt);
            }
        });

        jTextFieldPreferenceMoneyModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPreferenceMoneyModifyMouseClicked(evt);
            }
        });
        jTextFieldPreferenceMoneyModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPreferenceMoneyModifyKeyTyped(evt);
            }
        });

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SaveIcon.png"))); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jComboBoxCountriesModify.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unspecified", "Afganistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos Islands", "Colombia", "Comoros", "Congo", "Cook Islands", "Costa Rica", "Ivory Coast", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Great Britain", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "North Korea", "South Korea", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macao", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Burma", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Island", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion Island", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Samoa", "San Marino", "Sao Tome and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Tibet", "Timor-Leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (Britain)", "Virgin Islands (U.S.)", "Western Sahara", "Yemen", "Zambia", "Zimbabwe" }));

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
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPasswordFieldPasswordConfirmationModify, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordFieldPasswordModify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelWarningInfoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxCountriesModify, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                .addComponent(jTextFieldPhoneNumberModify, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldPreferenceMoneyModify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
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
                    .addComponent(jComboBoxCountriesModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPhoneNumberModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPreferenceMoneyModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Modify Profile", jPanel2);

        jButtonCloseSession.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CloseIcon.png"))); // NOI18N
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
        .getText().isEmpty() && !jTextFieldEmailModify.getText().isEmpty()){
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
            currentUser.setCountry(jComboBoxCountriesModify.getModel()
            .getElementAt(jComboBoxCountriesModify.getSelectedIndex()).toString());
            currentUser.setPhoneNumber((jTextFieldPhoneNumberModify.getText().length()
            > 0) ? jTextFieldPhoneNumberModify.getText() : "Unspecified");
            currentUser.setPreferenceMoney((jTextFieldPreferenceMoneyModify.getText().length()
            > 0) ? jTextFieldPreferenceMoneyModify.getText() : "Unspecified");
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
        if((scan < 'a' || scan > 'z') && (scan < 'A' || scan > 'Z') && (scan != ' ' 
        || jTextFieldPreferenceMoneyModify.getText().length() == 0))
            evt.consume();
    }//GEN-LAST:event_jTextFieldPreferenceMoneyModifyKeyTyped

    private void jTextFieldPhoneNumberModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberModifyKeyTyped
        char scan = evt.getKeyChar();
        if((scan < '0' || scan > '9') && (scan != '+' || jTextFieldPhoneNumberModify.getText().length() != 0))
            evt.consume();
    }//GEN-LAST:event_jTextFieldPhoneNumberModifyKeyTyped

    private void jTextFieldPhoneNumberModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberModifyMouseClicked
        jTextFieldPhoneNumberModify.setText("");
    }//GEN-LAST:event_jTextFieldPhoneNumberModifyMouseClicked

    private void jTextFieldPreferenceMoneyModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPreferenceMoneyModifyMouseClicked
        jTextFieldPreferenceMoneyModify.setText("");
    }//GEN-LAST:event_jTextFieldPreferenceMoneyModifyMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new LogInWindow().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jComboBoxSearchCriterionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchCriterionActionPerformed
        jLabelCriterion.setText(jComboBoxSearchCriterion.getSelectedItem().toString() + ":");
    }//GEN-LAST:event_jComboBoxSearchCriterionActionPerformed

    private void jRadioButtonStarsNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonStarsNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonStarsNumberActionPerformed

    private void jButtonSearchHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchHotelActionPerformed
        if(!jTextFieldCriterion.getText().isEmpty()){
            String order;
            if(jRadioButtonPrice.isSelected())
                order = jRadioButtonPrice.getText();
            else if(jRadioButtonStarsNumber.isSelected())
                order = jRadioButtonStarsNumber.getText();
            else if(jRadioButtonHostageType.isSelected())
                order = jRadioButtonHostageType.getText();
            else{
                JOptionPane.showMessageDialog(this,"You must select a order the "
                + "the list of hotels results.","Warning",JOptionPane.INFORMATION_MESSAGE,
                warningIcon);
                return;    
            }
            ArrayList<String> results = global.searchHotelsByCriterion(jComboBoxSearchCriterion
            .getSelectedItem().toString(),order,jTextFieldCriterion.getText());
            chargeJListResults(results);
        }
    }//GEN-LAST:event_jButtonSearchHotelActionPerformed

    private void chargeJListResults(ArrayList<String> results){
        DefaultListModel model = new DefaultListModel();
        results.stream().forEach((temporalString) -> {
            model.addElement(temporalString);
        });
        jListHotelsResults.setModel(model);
    }
    
    private void jRadioButtonPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPriceActionPerformed

    private void jListHotelsResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListHotelsResultsMouseClicked
        if(evt.getClickCount() == 2){
            new HotelViewWindow(this,global.searchHotel(jListHotelsResults.getModel()
            .getElementAt(jListHotelsResults.getSelectedIndex()).toString().split("--->")[0]),
            currentUser).setVisible(true);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jListHotelsResultsMouseClicked

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
        jComboBoxCountriesModify.setSelectedIndex(currentUser.getIndexSelectedCountry());
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
    
    private void jTextFieldNumberValidation(java.awt.event.KeyEvent evt, JTextField jTextFieldEntryDate){
        char scan = evt.getKeyChar();
        if((scan < '0' || scan > '9'))
            evt.consume();
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
    private javax.swing.ButtonGroup buttonGroupCriterion;
    private javax.swing.JButton jButtonCloseSession;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearchHotel;
    private javax.swing.JComboBox jComboBoxCountriesModify;
    private javax.swing.JComboBox jComboBoxGenderModify;
    private javax.swing.JComboBox jComboBoxSearchCriterion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCriterion;
    private javax.swing.JLabel jLabelWarningInfoEmail;
    private javax.swing.JLabel jLabelWarningInfoPassword;
    private javax.swing.JList jListHotelsResults;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldPasswordConfirmationModify;
    private javax.swing.JPasswordField jPasswordFieldPasswordModify;
    private javax.swing.JRadioButton jRadioButtonHostageType;
    private javax.swing.JRadioButton jRadioButtonPrice;
    private javax.swing.JRadioButton jRadioButtonStarsNumber;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldCriterion;
    private javax.swing.JTextField jTextFieldEmailModify;
    private javax.swing.JTextField jTextFieldLastNameModify;
    private javax.swing.JTextField jTextFieldNameModify;
    private javax.swing.JTextField jTextFieldPhoneNumberModify;
    private javax.swing.JTextField jTextFieldPreferenceMoneyModify;
    // End of variables declaration//GEN-END:variables
}
