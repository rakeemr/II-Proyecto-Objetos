package Graphic;

import Logic.Attraction;
import Logic.Global;
import Logic.Hotel;
import Logic.Service;
import Logic.User.Administrator;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AdministratorWindow extends javax.swing.JFrame {
    private final LogInWindow ancestor;
    private final Administrator currentUser;
    private final ImageIcon warningIcon;
    private final ImageIcon checkIcon;
    private final ArrayList<String> checkInRequirementsList;
    private final ArrayList<Attraction> nearbyAttractionList;
    private final ArrayList<Service> servicesList;
    private final ArrayList<ImageIcon> photographsList;
    private final Global global;
    int indexImage = 0;
    
    public AdministratorWindow(LogInWindow ancestor, Administrator currentUser) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(ancestor);
        this.setIconImage(new ImageIcon(getClass().getResource("/Img/HotelIcon.png")).getImage());
        this.ancestor = ancestor;
        this.currentUser = currentUser;
        this.warningIcon = new ImageIcon(getClass().getResource("/Img/WarningIcon.png"));
        this.checkIcon = new ImageIcon(getClass().getResource("/Img/CheckIcon.png"));
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
        jLabel19 = new javax.swing.JLabel();
        jComboBoxSelectHotel = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldName1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldAddress1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxCountry1 = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldPhoneNumber1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jComboBoxStarsNumber1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jComboBoxLodgingType1 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldHotelSize1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBoxBuiltYear1 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jComboBoxCheckInHours1 = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jComboBoxCheckOutHours1 = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jComboBoxCheckInMin1 = new javax.swing.JComboBox();
        jComboBoxCheckOutMin1 = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldRequirements1 = new javax.swing.JTextField();
        jButtonAddRequirements1 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jTextFieldNearAttractions1 = new javax.swing.JTextField();
        jButtonAddAttractions1 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jComboBoxServices1 = new javax.swing.JComboBox();
        jButtonAddServices1 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jButtonAddPhotograpy1 = new javax.swing.JButton();
        jLabelImage1 = new javax.swing.JLabel();
        jButtonPreviousImage1 = new javax.swing.JButton();
        jButtonNextImage1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonCreateHotel1 = new javax.swing.JButton();
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
        jButtonAddPhotograpy = new javax.swing.JButton();
        jComboBoxServices = new javax.swing.JComboBox();
        jButtonCreateHotel = new javax.swing.JButton();
        jButtonPreviousImage = new javax.swing.JButton();
        jButtonNextImage = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabelImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
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

        jLabel19.setText("Select the hotel:");

        jLabel20.setText("Name:");

        jTextFieldName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldName1KeyTyped(evt);
            }
        });

        jLabel21.setText("Address:");

        jTextFieldAddress1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddress1KeyTyped(evt);
            }
        });

        jLabel22.setText("Country:");

        jComboBoxCountry1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Costa Rica", "Afganistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan ", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi ", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos Islands", "Colombia", "Comoros", "Congo", "Cook Islands", "Ivory Coast", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Great Britain", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "North Korea", "South Korea", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macao", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar, Burma", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Island", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion Island", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Samoa", "San Marino", "Sao Tome and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Tibet", "Timor-Leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (Britain)", "Virgin Islands (U.S.)", "Western Sahara", "Yemen", "Zambia", "Zimbabwe" }));

        jLabel23.setText("Phone Number:");

        jTextFieldPhoneNumber1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneNumber1KeyTyped(evt);
            }
        });

        jLabel24.setText("Stars Number:");

        jComboBoxStarsNumber1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel25.setText("Lodging Type:");

        jComboBoxLodgingType1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rooms", "Cabins", "Villages" }));

        jLabel26.setText("Hotel Size:");

        jLabel27.setText("Built Year:");

        jLabel28.setText("Check-In Hour:");

        jComboBoxCheckInHours1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "11", "12", "13", "14", "15", "16" }));

        jLabel29.setText("Check-Out Hour:");

        jComboBoxCheckOutHours1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "11", "12", "13", "14", "15", "16" }));

        jLabel30.setText("h");

        jLabel31.setText("h");

        jComboBoxCheckInMin1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        jComboBoxCheckOutMin1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        jLabel32.setText("min");

        jLabel33.setText("min");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel34.setText("Check In Requirements:");

        jButtonAddRequirements1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddRequirements1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRequirements1ActionPerformed(evt);
            }
        });

        jLabel35.setText("Near Attractions:");

        jButtonAddAttractions1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddAttractions1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAttractions1ActionPerformed(evt);
            }
        });

        jLabel36.setText("Services:");

        jButtonAddServices1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddServices1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddServices1ActionPerformed(evt);
            }
        });

        jLabel37.setText("Photographs:");

        jButtonAddPhotograpy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddPhotograpy1.setText("Add");
        jButtonAddPhotograpy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPhotograpy1ActionPerformed(evt);
            }
        });

        jLabelImage1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        jButtonPreviousImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BackArrowIcon.png"))); // NOI18N
        jButtonPreviousImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousImage1ActionPerformed(evt);
            }
        });

        jButtonNextImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ForwardArrowIcon.png"))); // NOI18N
        jButtonNextImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextImage1ActionPerformed(evt);
            }
        });

        jButton2.setText("See");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonCreateHotel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonCreateHotel1.setText("Create");
        jButtonCreateHotel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateHotel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel22)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldName1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(jTextFieldAddress1))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxStarsNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxLodgingType1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldHotelSize1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxBuiltYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBoxCheckOutHours1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(jComboBoxCheckOutMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBoxCheckInHours1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(jComboBoxCheckInMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel32))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSelectHotel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldRequirements1)
                                            .addComponent(jTextFieldNearAttractions1))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonAddAttractions1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonAddRequirements1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBoxServices1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonAddServices1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAddPhotograpy1)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonPreviousImage1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNextImage1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCreateHotel1))
                            .addComponent(jLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(287, 287, 287)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(387, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBoxSelectHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(jTextFieldPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(jComboBoxStarsNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(jComboBoxLodgingType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(jTextFieldHotelSize1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(jComboBoxBuiltYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jComboBoxCheckInHours1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCheckInMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddRequirements1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34)
                                .addComponent(jTextFieldRequirements1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(jTextFieldNearAttractions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAddAttractions1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddServices1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(jComboBoxServices1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jButtonAddPhotograpy1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonPreviousImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(jButtonNextImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(jComboBoxCheckOutHours1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxCheckOutMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31)
                                .addComponent(jLabel33))
                            .addComponent(jButtonCreateHotel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
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

        jTextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNameKeyTyped(evt);
            }
        });

        jTextFieldAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddressKeyTyped(evt);
            }
        });

        jTextFieldPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneNumberKeyTyped(evt);
            }
        });

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
        jButtonAddServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddServicesActionPerformed(evt);
            }
        });

        jLabel18.setText("Photographs:");

        jButtonAddPhotograpy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddPhotograpy.setText("Add");
        jButtonAddPhotograpy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPhotograpyActionPerformed(evt);
            }
        });

        jButtonCreateHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonCreateHotel.setText("Create");
        jButtonCreateHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateHotelActionPerformed(evt);
            }
        });

        jButtonPreviousImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BackArrowIcon.png"))); // NOI18N
        jButtonPreviousImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousImageActionPerformed(evt);
            }
        });

        jButtonNextImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ForwardArrowIcon.png"))); // NOI18N
        jButtonNextImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextImageActionPerformed(evt);
            }
        });

        jButton1.setText("See");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jLabelImage);

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
                    .addComponent(jComboBoxCountry, 0, 170, Short.MAX_VALUE)
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
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldNearAttractions, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxServices, javax.swing.GroupLayout.Alignment.LEADING, 0, 120, Short.MAX_VALUE)
                            .addComponent(jTextFieldRequirements))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonAddRequirements, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAddAttractions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAddServices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonPreviousImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNextImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jButtonCreateHotel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddPhotograpy))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddServices, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jComboBoxServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jButtonAddPhotograpy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCreateHotel)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonPreviousImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNextImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
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
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
        chargeComboBoxSelectHotel();
    }//GEN-LAST:event_formWindowOpened

    private void chargeYears(){
        int year = 2015;
        while(year > 1974){
            jComboBoxBuiltYear.addItem(year);
            year--;
        }
    }
    
    private void chargeComboBoxService(){
        jComboBoxServices.removeAllItems();
        global.getGeneralServiceList().stream().forEach((temporalService) -> {
            jComboBoxServices.addItem(temporalService.getName() + "-" + temporalService.getCode());
        });        
    }
    
    private void chargeComboBoxSelectHotel(){
        jComboBoxSelectHotel.removeAllItems();
        global.getGeneralHotelList().stream().forEach((temporalHotel) -> {
            jComboBoxSelectHotel.addItem(temporalHotel.getName() + "--->" + temporalHotel.getCountry());
        });
    }
    
    private void jButtonAddPhotograpyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPhotograpyActionPerformed
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new FileNameExtensionFilter("Image files",
        "jpg","jpeg","png"));
        int state = selector.showOpenDialog(this);
        if(state == JFileChooser.APPROVE_OPTION){
            try{
                ImageIcon image = new ImageIcon(ImageIO.read(selector.getSelectedFile()));
                setGraphicImage(image);
                this.photographsList.add(image);
                indexImage = this.photographsList.size()-1;
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(this, "Image not supported, please choose another one",
                "Error!", JOptionPane.INFORMATION_MESSAGE, warningIcon);
            }
        }
    }//GEN-LAST:event_jButtonAddPhotograpyActionPerformed

    private void setGraphicImage(ImageIcon image){
        jLabelImage.setIcon(new ImageIcon(image.getImage().getScaledInstance(jLabelImage.getWidth()-1,
        jLabelImage.getHeight()-1,Image.SCALE_DEFAULT)));
    }
    
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
            if(!(photographsList.size() > 0)){
                JOptionPane.showMessageDialog(this, "You need at least 1 Photography", 
                "Warning!",JOptionPane.INFORMATION_MESSAGE, warningIcon);
                return;
            }
            //Instance of hotel.
            global.addHotel(new Hotel(jTextFieldName.getText(),jTextFieldAddress.getText(),
            jComboBoxCountry.getSelectedItem().toString(),jTextFieldPhoneNumber.getText(),
            Integer.parseInt(jComboBoxStarsNumber.getSelectedItem().toString()),jComboBoxLodgingType.
            getSelectedItem().toString(),jTextFieldHotelSize.getText(),jComboBoxBuiltYear.
            getSelectedItem().toString(),jComboBoxCheckInHours.getSelectedItem().
            toString() + ":" + jComboBoxCheckInMin.getSelectedItem().toString(),
            jComboBoxCheckOutHours.getSelectedItem().toString() + ":" + 
            jComboBoxCheckOutMin.getSelectedItem().toString(),checkInRequirementsList,
            nearbyAttractionList,servicesList,photographsList));
            //Information to the user.
            JOptionPane.showMessageDialog(this, "Data saved succesfully!", "Notification",
            JOptionPane.INFORMATION_MESSAGE, checkIcon);
            jComboBoxSelectHotel.addItem(jTextFieldName.getText() + "--->" + jComboBoxCountry
            .getSelectedItem().toString());
            //Reset components and variables.
            resetComponentsAndVariablesCreateHotel();
        }
        else
            JOptionPane.showMessageDialog(this, "Missing Data!", "Warning!",
            JOptionPane.INFORMATION_MESSAGE, warningIcon);
    }//GEN-LAST:event_jButtonCreateHotelActionPerformed

    private void jButtonAddServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddServicesActionPerformed
        if(!(jComboBoxServices.getItemCount() == 0)){
            String actualService = jComboBoxServices.getSelectedItem().toString().split("-")[0];
            jComboBoxServices.removeItemAt(jComboBoxServices.getSelectedIndex());
            servicesList.add(global.searchService(actualService));
        }
    }//GEN-LAST:event_jButtonAddServicesActionPerformed

    private void jTextFieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameKeyTyped
        if(evt.getKeyChar() == ' ' && jTextFieldName.getText().length() == 0)
            evt.consume();
    }//GEN-LAST:event_jTextFieldNameKeyTyped

    private void jTextFieldAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddressKeyTyped
        if(evt.getKeyChar() == ' ' && jTextFieldAddress.getText().length() == 0)
            evt.consume();
    }//GEN-LAST:event_jTextFieldAddressKeyTyped

    private void jTextFieldPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberKeyTyped
        char scan = evt.getKeyChar();
        if((scan < '0' || scan > '9') && (scan != '+' || jTextFieldPhoneNumber.getText().length() != 0))
            evt.consume();
    }//GEN-LAST:event_jTextFieldPhoneNumberKeyTyped

    private void jButtonPreviousImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousImageActionPerformed
        if(indexImage > 0){
            indexImage--;
            setGraphicImage(this.photographsList.get(indexImage));
        }
    }//GEN-LAST:event_jButtonPreviousImageActionPerformed

    private void jButtonNextImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextImageActionPerformed
        if(indexImage < this.photographsList.size()-1){
           indexImage++;
           setGraphicImage(this.photographsList.get(indexImage));
        }
    }//GEN-LAST:event_jButtonNextImageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jLabelImage.getIcon() != null){
            new PictureViewer((ImageIcon)jLabelImage.getIcon(),this).setVisible(true);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new LogInWindow().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jTextFieldName1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldName1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldName1KeyTyped

    private void jTextFieldAddress1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddress1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddress1KeyTyped

    private void jTextFieldPhoneNumber1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumber1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneNumber1KeyTyped

    private void jButtonAddRequirements1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRequirements1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddRequirements1ActionPerformed

    private void jButtonAddAttractions1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAttractions1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddAttractions1ActionPerformed

    private void jButtonAddServices1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddServices1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddServices1ActionPerformed

    private void jButtonAddPhotograpy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPhotograpy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddPhotograpy1ActionPerformed

    private void jButtonPreviousImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousImage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPreviousImage1ActionPerformed

    private void jButtonNextImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextImage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNextImage1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonCreateHotel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateHotel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateHotel1ActionPerformed

    private void resetComponentsAndVariablesCreateHotel(){
        jTextFieldName.setText("");
        jTextFieldName.setText("");
        jTextFieldAddress.setText("");
        jComboBoxCountry.setSelectedIndex(0);
        jTextFieldPhoneNumber.setText("");
        jComboBoxStarsNumber.setSelectedIndex(0);
        jComboBoxLodgingType.setSelectedIndex(0);
        jTextFieldHotelSize.setText("");
        jComboBoxBuiltYear.setSelectedIndex(0);
        jComboBoxCheckInHours.setSelectedIndex(0);
        jComboBoxCheckInMin.setSelectedIndex(0);
        jComboBoxCheckOutHours.setSelectedIndex(0);
        jComboBoxCheckOutMin.setSelectedIndex(0);
        jLabelImage.setIcon(null);
        indexImage = 0;
        this.checkInRequirementsList.clear();
        this.nearbyAttractionList.clear();
        this.servicesList.clear();
        this.photographsList.clear();
        chargeComboBoxService();
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAddAttractions;
    private javax.swing.JButton jButtonAddAttractions1;
    private javax.swing.JButton jButtonAddPhotograpy;
    private javax.swing.JButton jButtonAddPhotograpy1;
    private javax.swing.JButton jButtonAddRequirements;
    private javax.swing.JButton jButtonAddRequirements1;
    private javax.swing.JButton jButtonAddServices;
    private javax.swing.JButton jButtonAddServices1;
    private javax.swing.JButton jButtonCloseSession;
    private javax.swing.JButton jButtonCreateHotel;
    private javax.swing.JButton jButtonCreateHotel1;
    private javax.swing.JButton jButtonNextImage;
    private javax.swing.JButton jButtonNextImage1;
    private javax.swing.JButton jButtonPreviousImage;
    private javax.swing.JButton jButtonPreviousImage1;
    private javax.swing.JComboBox jComboBoxBuiltYear;
    private javax.swing.JComboBox jComboBoxBuiltYear1;
    private javax.swing.JComboBox jComboBoxCheckInHours;
    private javax.swing.JComboBox jComboBoxCheckInHours1;
    private javax.swing.JComboBox jComboBoxCheckInMin;
    private javax.swing.JComboBox jComboBoxCheckInMin1;
    private javax.swing.JComboBox jComboBoxCheckOutHours;
    private javax.swing.JComboBox jComboBoxCheckOutHours1;
    private javax.swing.JComboBox jComboBoxCheckOutMin;
    private javax.swing.JComboBox jComboBoxCheckOutMin1;
    private javax.swing.JComboBox jComboBoxCountry;
    private javax.swing.JComboBox jComboBoxCountry1;
    private javax.swing.JComboBox jComboBoxLodgingType;
    private javax.swing.JComboBox jComboBoxLodgingType1;
    private javax.swing.JComboBox jComboBoxSelectHotel;
    private javax.swing.JComboBox jComboBoxServices;
    private javax.swing.JComboBox jComboBoxServices1;
    private javax.swing.JComboBox jComboBoxStarsNumber;
    private javax.swing.JComboBox jComboBoxStarsNumber1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelImage1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAddress1;
    private javax.swing.JTextField jTextFieldHotelSize;
    private javax.swing.JTextField jTextFieldHotelSize1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldName1;
    private javax.swing.JTextField jTextFieldNearAttractions;
    private javax.swing.JTextField jTextFieldNearAttractions1;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldPhoneNumber1;
    private javax.swing.JTextField jTextFieldRequirements;
    private javax.swing.JTextField jTextFieldRequirements1;
    // End of variables declaration//GEN-END:variables
}
