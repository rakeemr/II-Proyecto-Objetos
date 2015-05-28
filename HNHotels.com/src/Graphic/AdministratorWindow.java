package Graphic;

import Logic.Attraction;
import Logic.Global;
import Logic.Hotel;
import Logic.Service;
import Logic.User.Administrator;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AdministratorWindow extends javax.swing.JFrame {
    private final LogInWindow ancestor;
    private final Administrator currentUser;
    private final ImageIcon warningIcon;
    private final ArrayList<String> checkInRequirementsList;
    private final ArrayList<Attraction> nearbyAttractionList;
    private final ArrayList<Service> servicesList;
    private final ArrayList<ImageIcon> photographsList;
    private final Global global;
    
    public AdministratorWindow(LogInWindow ancestor, Administrator currentUser) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(ancestor);
        this.setIconImage(new ImageIcon(getClass().getResource("/Img/HotelIcon.png")).getImage());
        this.ancestor = ancestor;
        this.currentUser = currentUser;
        this.warningIcon = new ImageIcon(getClass().getResource("/Img/WarningIcon.png"));
        this.checkInRequirementsList = new ArrayList();
        this.nearbyAttractionList = new ArrayList();
        this.servicesList = new ArrayList();
        this.photographsList = new ArrayList();
        this.global = Global.getInstance();
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCloseSession = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCountry = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxStarsNumber = new javax.swing.JComboBox();
        jComboBoxLodgingType = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxBuiltYear = new javax.swing.JComboBox();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jTextFieldHotelSize = new javax.swing.JTextField();
        jComboBoxCheckInHours = new javax.swing.JComboBox();
        jComboBoxCheckInMin = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxCheckOutMin = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxCheckOutHours = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldRequirements = new javax.swing.JTextField();
        jButtonAddRequirements = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldNearAttractions = new javax.swing.JTextField();
        jButtonAddAttractions = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButtonAddServices = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabelImage = new javax.swing.JLabel();
        jComboBoxServices = new javax.swing.JComboBox();
        jButtonCreateHotel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButtonCloseSession.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CloseIcon.png"))); // NOI18N
        jButtonCloseSession.setText("Close session");
        jButtonCloseSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseSessionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Manage hotels", jPanel2);

        jLabel1.setText("Name:");

        jLabel2.setText("Address:");

        jLabel3.setText("Country:");

        jComboBoxCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Costa Rica", "Afganistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan ", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi ", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos Islands", "Colombia", "Comoros", "Congo", "Cook Islands", "Ivory Coast", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Great Britain", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "North Korea", "South Korea", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macao", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar, Burma", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Island", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion Island", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Samoa", "San Marino", "Sao Tome and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Tibet", "Timor-Leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (Britain)", "Virgin Islands (U.S.)", "Western Sahara", "Yemen", "Zambia", "Zimbabwe" }));

        jLabel4.setText("Phone Number:");

        jLabel5.setText("Stars Number:");

        jLabel6.setText("Lodging Type:");

        jComboBoxStarsNumber.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jComboBoxLodgingType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rooms", "Cabins", "Villages" }));

        jLabel7.setText("Hotel Size:");

        jLabel8.setText("Built Year:");

        jLabel9.setText("Check-In Hour:");

        jLabel10.setText("Check-Out Hour:");

        jComboBoxCheckInHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "11", "12", "13", "14", "15", "16" }));

        jComboBoxCheckInMin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        jLabel11.setText("h");

        jLabel12.setText("min");

        jLabel13.setText("min");

        jComboBoxCheckOutMin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        jLabel14.setText("h");

        jComboBoxCheckOutHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "11", "12", "13", "14", "15", "16" }));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel15.setText("Check In Requirements:");

        jButtonAddRequirements.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddRequirements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRequirementsActionPerformed(evt);
            }
        });

        jLabel16.setText("Near Attractions:");

        jButtonAddAttractions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddAttractions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAttractionsActionPerformed(evt);
            }
        });

        jLabel17.setText("Services:");

        jButtonAddServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N

        jLabel18.setText("Photographs:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.lightGray, null));
        jScrollPane2.setViewportView(jLabelImage);

        jButtonCreateHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonCreateHotel.setText("Create");
        jButtonCreateHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateHotelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCountry, 0, 154, Short.MAX_VALUE)
                    .addComponent(jTextFieldName)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBoxCheckOutHours, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jComboBoxCheckOutMin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxStarsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldHotelSize, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxBuiltYear, javax.swing.GroupLayout.Alignment.LEADING, 0, 75, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxLodgingType, javax.swing.GroupLayout.Alignment.LEADING, 0, 127, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBoxCheckInHours, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jComboBoxCheckInMin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNearAttractions, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jTextFieldRequirements)
                            .addComponent(jComboBoxServices, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonAddRequirements, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAddAttractions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAddServices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonCreateHotel)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBoxStarsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jComboBoxLodgingType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldHotelSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jComboBoxBuiltYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jComboBoxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxCheckInHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCheckInMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBoxCheckOutHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCheckOutMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddRequirements, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jTextFieldRequirements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jTextFieldNearAttractions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAddAttractions, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jComboBoxServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAddServices, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCreateHotel)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create hotel", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCloseSession))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCloseSession))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSessionActionPerformed
        new LogInWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCloseSessionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        chargeYears();
        chargeComboBoxService();
    }//GEN-LAST:event_formWindowOpened

    private void chargeYears(){
        int year = 2015;
        while(year > 1974){
            jComboBoxBuiltYear.addItem(year);
            year--;
        }
    }
    
    private void chargeComboBoxService(){
        global.getGeneralServiceList().stream().forEach((temporalService) -> {
            jComboBoxServices.addItem("Service: " + temporalService.getName() + "-Code: "
            + temporalService.getCode());
        });        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new FileNameExtensionFilter("Solo archivos tipo imagen",
        "jpg, jpeg, png"));
        int estado = selector.showOpenDialog(this);
        if(estado == JFileChooser.APPROVE_OPTION){
            try{
                ImageIcon image = new ImageIcon(ImageIO.read(selector.getSelectedFile()));
                this.jLabelImage.setIcon(image);
                this.photographsList.add(image);
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(this, "Image not supported, please choose another one",
                "Error!", JOptionPane.INFORMATION_MESSAGE, warningIcon);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAddRequirementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRequirementsActionPerformed
        if(!jTextFieldRequirements.getText().isEmpty()){
            this.checkInRequirementsList.add(jTextFieldRequirements.getText());
            jTextFieldRequirements.setText("");
        }
    }//GEN-LAST:event_jButtonAddRequirementsActionPerformed

    private void jButtonAddAttractionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAttractionsActionPerformed
        if(!jTextFieldNearAttractions.getText().isEmpty()){
            this.nearbyAttractionList.add(new Attraction(jTextFieldNearAttractions.getText()));
            jTextFieldNearAttractions.setText("");
        }
    }//GEN-LAST:event_jButtonAddAttractionsActionPerformed

    private void jButtonCreateHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateHotelActionPerformed
        if(!jTextFieldName.getText().isEmpty() && !jTextFieldAddress.getText().isEmpty() &&
        !jTextFieldPhoneNumber.getText().isEmpty() && !jTextFieldHotelSize.getText().isEmpty()){
            if(!(checkInRequirementsList.size() > 0)){
                JOptionPane.showMessageDialog(this, "You need at least 1 Check In Requirement", 
                "Warning!",JOptionPane.INFORMATION_MESSAGE, warningIcon);
                return;
            }
            if(!(nearbyAttractionList.size() > 0)){
                JOptionPane.showMessageDialog(this, "You need at least 1 Near Attraction", 
                "Warning!",JOptionPane.INFORMATION_MESSAGE, warningIcon);
                return;
            }
            if(!(servicesList.size() > 0)){
                JOptionPane.showMessageDialog(this, "You need at least 1 Service", 
                "Warning!",JOptionPane.INFORMATION_MESSAGE, warningIcon);
                return;
            }
            global.addHotel(new Hotel(jTextFieldName.getText(),jTextFieldAddress.getText(),
            jComboBoxCountry.getSelectedItem().toString(),jTextFieldPhoneNumber.getText(),
            Integer.parseInt(jComboBoxStarsNumber.getSelectedItem().toString()),jComboBoxLodgingType.
            getSelectedItem().toString(),jTextFieldHotelSize.getText(),jComboBoxBuiltYear.
            getSelectedItem().toString(),jComboBoxCheckInHours.getSelectedItem().
            toString() + ":" + jComboBoxCheckInMin.getSelectedItem().toString(),
            jComboBoxCheckOutHours.getSelectedItem().toString() + ":" + 
            jComboBoxCheckOutMin.getSelectedItem().toString(),checkInRequirementsList,
            nearbyAttractionList,servicesList,photographsList));
            JOptionPane.showMessageDialog(this, "Data saved succesfully!", "Notification",
            JOptionPane.INFORMATION_MESSAGE, warningIcon);
        }
        else
            JOptionPane.showMessageDialog(this, "Missing Data!", "Warning!",
            JOptionPane.INFORMATION_MESSAGE, warningIcon);
    }//GEN-LAST:event_jButtonCreateHotelActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorWindow(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddAttractions;
    private javax.swing.JButton jButtonAddRequirements;
    private javax.swing.JButton jButtonAddServices;
    private javax.swing.JButton jButtonCloseSession;
    private javax.swing.JButton jButtonCreateHotel;
    private javax.swing.JComboBox jComboBoxBuiltYear;
    private javax.swing.JComboBox jComboBoxCheckInHours;
    private javax.swing.JComboBox jComboBoxCheckInMin;
    private javax.swing.JComboBox jComboBoxCheckOutHours;
    private javax.swing.JComboBox jComboBoxCheckOutMin;
    private javax.swing.JComboBox jComboBoxCountry;
    private javax.swing.JComboBox jComboBoxLodgingType;
    private javax.swing.JComboBox jComboBoxServices;
    private javax.swing.JComboBox jComboBoxStarsNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldHotelSize;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNearAttractions;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldRequirements;
    // End of variables declaration//GEN-END:variables
}
