package Graphic;

import Logic.Attraction;
import Logic.Global;
import Logic.Hotel;
import Logic.Room.Room;
import Logic.Room.RoomType;
import Logic.Service;
import Logic.User.Administrator;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
    private Hotel actualHotelManageHotel;
    private Hotel actualHotelManageRooms;
    int indexImageCreate = 0, indexImageManage = 0;
    
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
        jPanelCreateHotels = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCountryCreate = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxStarsNumberCreate = new javax.swing.JComboBox();
        jComboBoxLodgingTypeCreate = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxBuiltYearCreate = new javax.swing.JComboBox();
        jTextFieldNameCreate = new javax.swing.JTextField();
        jTextFieldAddressCreate = new javax.swing.JTextField();
        jTextFieldPhoneNumberCreate = new javax.swing.JTextField();
        jTextFieldHotelSizeCreate = new javax.swing.JTextField();
        jComboBoxCheckInHoursCreate = new javax.swing.JComboBox();
        jComboBoxCheckInMinCreate = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxCheckOutMinCreate = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxCheckOutHoursCreate = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldRequirementsCreate = new javax.swing.JTextField();
        jButtonAddRequirementsCreate = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldNearAttractionsCreate = new javax.swing.JTextField();
        jButtonAddAttractionsCreate = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButtonAddServicesCreate = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButtonAddPhotograpyCreate = new javax.swing.JButton();
        jComboBoxServicesCreate = new javax.swing.JComboBox();
        jButtonCreateHotel = new javax.swing.JButton();
        jButtonPreviousImageCreate = new javax.swing.JButton();
        jButtonNextImageCreate = new javax.swing.JButton();
        jButtonSeeCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabelImageCreate = new javax.swing.JLabel();
        jPanelManageHotels = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxSelectHotelManageHotel = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldNameManage = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldAddressManage = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxCountryManage = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldPhoneNumberManage = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jComboBoxStarsNumberManage = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jComboBoxLodgingTypeManage = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldHotelSizeManage = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBoxBuiltYearManage = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jComboBoxCheckInHoursManage = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jComboBoxCheckOutHoursManage = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jComboBoxCheckInMinManage = new javax.swing.JComboBox();
        jComboBoxCheckOutMinManage = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldRequirementsManage = new javax.swing.JTextField();
        jButtonAddRequirementsManage = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jTextFieldNearAttractionsManage = new javax.swing.JTextField();
        jButtonAddAttractionsManage = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jComboBoxServicesManage = new javax.swing.JComboBox();
        jButtonAddServicesManage = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jButtonAddPhotograpyManage = new javax.swing.JButton();
        jLabelImageManage = new javax.swing.JLabel();
        jButtonPreviousImageManage = new javax.swing.JButton();
        jButtonNextImageManage = new javax.swing.JButton();
        jButtonSeeManage = new javax.swing.JButton();
        jButtonActualizeHotel = new javax.swing.JButton();
        jComboBoxCheckInRequirementsManage = new javax.swing.JComboBox();
        jButtonDeleteCheckInRequirementManage = new javax.swing.JButton();
        jComboBoxDeleteNearAttraction = new javax.swing.JComboBox();
        jButtonDeleteNearAttractionManage = new javax.swing.JButton();
        jComboBoxDeleteServicesManage = new javax.swing.JComboBox();
        jButtonDeleteServiceManage = new javax.swing.JButton();
        jButtonDeleteImageManage = new javax.swing.JButton();
        jPanelManageHotelRooms = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jComboBoxSelectHotelManageRooms = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListRoomsManageRooms = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListRoomTypeManageRooms = new javax.swing.JList();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListRoomRegistersManageRooms = new javax.swing.JList();
        jButtonUpdateRoomType = new javax.swing.JButton();
        jButtonSee = new javax.swing.JButton();

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

        jLabel1.setText("Name:");

        jLabel2.setText("Address:");

        jLabel3.setText("Country:");

        jComboBoxCountryCreate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Costa Rica", "Afganistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan ", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi ", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos Islands", "Colombia", "Comoros", "Congo", "Cook Islands", "Ivory Coast", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Great Britain", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "North Korea", "South Korea", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macao", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar, Burma", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Island", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion Island", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Samoa", "San Marino", "Sao Tome and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Tibet", "Timor-Leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (Britain)", "Virgin Islands (U.S.)", "Western Sahara", "Yemen", "Zambia", "Zimbabwe" }));

        jLabel4.setText("Phone Number:");

        jLabel5.setText("Stars Number:");

        jLabel6.setText("Lodging Type:");

        jComboBoxStarsNumberCreate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jComboBoxLodgingTypeCreate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rooms", "Cabins", "Villages" }));

        jLabel7.setText("Hotel Size:");

        jLabel8.setText("Built Year:");

        jLabel9.setText("Check-In Hour:");

        jLabel10.setText("Check-Out Hour:");

        jTextFieldNameCreate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNameCreateKeyTyped(evt);
            }
        });

        jTextFieldAddressCreate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddressCreateKeyTyped(evt);
            }
        });

        jTextFieldPhoneNumberCreate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneNumberCreateKeyTyped(evt);
            }
        });

        jTextFieldHotelSizeCreate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHotelSizeCreateKeyTyped(evt);
            }
        });

        jComboBoxCheckInHoursCreate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "11", "12", "13", "14", "15", "16" }));

        jComboBoxCheckInMinCreate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        jLabel11.setText("h");

        jLabel12.setText("min");

        jLabel13.setText("min");

        jComboBoxCheckOutMinCreate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        jLabel14.setText("h");

        jComboBoxCheckOutHoursCreate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "11", "12", "13", "14", "15", "16" }));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel15.setText("Check In Requirements:");

        jTextFieldRequirementsCreate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRequirementsCreateKeyTyped(evt);
            }
        });

        jButtonAddRequirementsCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddRequirementsCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRequirementsCreateCreateActionPerformed(evt);
            }
        });

        jLabel16.setText("Near Attractions:");

        jTextFieldNearAttractionsCreate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNearAttractionsCreateKeyTyped(evt);
            }
        });

        jButtonAddAttractionsCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddAttractionsCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAttractionsCreateActionPerformed(evt);
            }
        });

        jLabel17.setText("Services:");

        jButtonAddServicesCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddServicesCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddServicesCreateActionPerformed(evt);
            }
        });

        jLabel18.setText("Photographs:");

        jButtonAddPhotograpyCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddPhotograpyCreate.setText("Add");
        jButtonAddPhotograpyCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPhotograpyCreateActionPerformed(evt);
            }
        });

        jButtonCreateHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonCreateHotel.setText("Create");
        jButtonCreateHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateHotelActionPerformed(evt);
            }
        });

        jButtonPreviousImageCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BackArrowIcon.png"))); // NOI18N
        jButtonPreviousImageCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousImageCreateActionPerformed(evt);
            }
        });

        jButtonNextImageCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ForwardArrowIcon.png"))); // NOI18N
        jButtonNextImageCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextImageCreateActionPerformed(evt);
            }
        });

        jButtonSeeCreate.setText("See");
        jButtonSeeCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeCreateActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jLabelImageCreate);

        javax.swing.GroupLayout jPanelCreateHotelsLayout = new javax.swing.GroupLayout(jPanelCreateHotels);
        jPanelCreateHotels.setLayout(jPanelCreateHotelsLayout);
        jPanelCreateHotelsLayout.setHorizontalGroup(
            jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCountryCreate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNameCreate)
                    .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                                .addComponent(jComboBoxCheckOutHoursCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jComboBoxCheckOutMinCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addComponent(jComboBoxStarsNumberCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxBuiltYearCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                                .addComponent(jComboBoxCheckInHoursCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)
                                .addComponent(jComboBoxCheckInMinCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldHotelSizeCreate, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxLodgingTypeCreate, javax.swing.GroupLayout.Alignment.LEADING, 0, 127, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))
                    .addComponent(jTextFieldAddressCreate)
                    .addComponent(jTextFieldPhoneNumberCreate))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCreateHotelsLayout.createSequentialGroup()
                        .addComponent(jButtonPreviousImageCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNextImageCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSeeCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jButtonCreateHotel))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNearAttractionsCreate)
                            .addComponent(jComboBoxServicesCreate, 0, 165, Short.MAX_VALUE)
                            .addComponent(jTextFieldRequirementsCreate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddServicesCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddAttractionsCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddRequirementsCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddPhotograpyCreate)))
                .addContainerGap())
        );
        jPanelCreateHotelsLayout.setVerticalGroup(
            jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddRequirementsCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jTextFieldRequirementsCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jTextFieldNearAttractionsCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddAttractionsCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17)
                            .addComponent(jComboBoxServicesCreate)
                            .addComponent(jButtonAddServicesCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jButtonAddPhotograpyCreate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonSeeCreate)
                                .addComponent(jButtonCreateHotel))
                            .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonNextImageCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonPreviousImageCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldPhoneNumberCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBoxStarsNumberCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jComboBoxLodgingTypeCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldHotelSizeCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jComboBoxBuiltYearCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCreateHotelsLayout.createSequentialGroup()
                                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldNameCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldAddressCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(15, 15, 15)
                                .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxCountryCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxCheckInHoursCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCheckInMinCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCreateHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBoxCheckOutHoursCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCheckOutMinCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create hotel", jPanelCreateHotels);

        jLabel19.setText("Select the hotel:");

        jComboBoxSelectHotelManageHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxSelectHotelManageHotelMouseClicked(evt);
            }
        });
        jComboBoxSelectHotelManageHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectHotelManageHotelActionPerformed(evt);
            }
        });

        jLabel20.setText("Name:");

        jTextFieldNameManage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNameManageKeyTyped(evt);
            }
        });

        jLabel21.setText("Address:");

        jTextFieldAddressManage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddressManageKeyTyped(evt);
            }
        });

        jLabel22.setText("Country:");

        jComboBoxCountryManage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Costa Rica", "Afganistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan ", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi ", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos Islands", "Colombia", "Comoros", "Congo", "Cook Islands", "Ivory Coast", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Great Britain", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "North Korea", "South Korea", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macao", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar, Burma", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Island", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion Island", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Samoa", "San Marino", "Sao Tome and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Tibet", "Timor-Leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (Britain)", "Virgin Islands (U.S.)", "Western Sahara", "Yemen", "Zambia", "Zimbabwe" }));

        jLabel23.setText("Phone Number:");

        jTextFieldPhoneNumberManage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneNumberManageKeyTyped(evt);
            }
        });

        jLabel24.setText("Stars Number:");

        jComboBoxStarsNumberManage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel25.setText("Lodging Type:");

        jComboBoxLodgingTypeManage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rooms", "Cabins", "Villages" }));

        jLabel26.setText("Hotel Size:");

        jTextFieldHotelSizeManage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHotelSizeManageKeyTyped(evt);
            }
        });

        jLabel27.setText("Built Year:");

        jLabel28.setText("Check-In Hour:");

        jComboBoxCheckInHoursManage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "11", "12", "13", "14", "15", "16" }));

        jLabel29.setText("Check-Out Hour:");

        jComboBoxCheckOutHoursManage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "11", "12", "13", "14", "15", "16" }));

        jLabel30.setText("h");

        jLabel31.setText("h");

        jComboBoxCheckInMinManage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        jComboBoxCheckOutMinManage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        jLabel32.setText("min");

        jLabel33.setText("min");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel34.setText("Check In Requirements:");

        jTextFieldRequirementsManage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRequirementsManageKeyTyped(evt);
            }
        });

        jButtonAddRequirementsManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddRequirementsManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRequirementsManageActionPerformed(evt);
            }
        });

        jLabel35.setText("Near Attractions:");

        jTextFieldNearAttractionsManage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNearAttractionsManageKeyTyped(evt);
            }
        });

        jButtonAddAttractionsManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddAttractionsManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAttractionsManageActionPerformed(evt);
            }
        });

        jLabel36.setText("Services:");

        jComboBoxServicesManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicesManageActionPerformed(evt);
            }
        });

        jButtonAddServicesManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddServicesManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddServicesManageActionPerformed(evt);
            }
        });

        jLabel37.setText("Photographs:");

        jButtonAddPhotograpyManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/AddIcon.png"))); // NOI18N
        jButtonAddPhotograpyManage.setText("Add");
        jButtonAddPhotograpyManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPhotograpyManageActionPerformed(evt);
            }
        });

        jLabelImageManage.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        jButtonPreviousImageManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BackArrowIcon.png"))); // NOI18N
        jButtonPreviousImageManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousImageManageActionPerformed(evt);
            }
        });

        jButtonNextImageManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ForwardArrowIcon.png"))); // NOI18N
        jButtonNextImageManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextImageManageActionPerformed(evt);
            }
        });

        jButtonSeeManage.setText("See");
        jButtonSeeManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeManageActionPerformed(evt);
            }
        });

        jButtonActualizeHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CheckIcon16.png"))); // NOI18N
        jButtonActualizeHotel.setText("Update");
        jButtonActualizeHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizeHotelActionPerformed(evt);
            }
        });

        jButtonDeleteCheckInRequirementManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DeleteIcon.png"))); // NOI18N
        jButtonDeleteCheckInRequirementManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteCheckInRequirementManageActionPerformed(evt);
            }
        });

        jButtonDeleteNearAttractionManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DeleteIcon.png"))); // NOI18N
        jButtonDeleteNearAttractionManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteNearAttractionManageActionPerformed(evt);
            }
        });

        jButtonDeleteServiceManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DeleteIcon.png"))); // NOI18N
        jButtonDeleteServiceManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteServiceManageActionPerformed(evt);
            }
        });

        jButtonDeleteImageManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DeleteIcon.png"))); // NOI18N
        jButtonDeleteImageManage.setText("Delete");
        jButtonDeleteImageManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteImageManageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManageHotelsLayout = new javax.swing.GroupLayout(jPanelManageHotels);
        jPanelManageHotels.setLayout(jPanelManageHotelsLayout);
        jPanelManageHotelsLayout.setHorizontalGroup(
            jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel22)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxStarsNumberManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxBuiltYearManage, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNameManage, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(jTextFieldAddressManage)
                                .addComponent(jComboBoxSelectHotelManageHotel, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldHotelSizeManage)
                                .addComponent(jComboBoxLodgingTypeManage, 0, 161, Short.MAX_VALUE)
                                .addComponent(jComboBoxCountryManage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextFieldPhoneNumberManage, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxCheckOutHoursManage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCheckInHoursManage, 0, 41, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                        .addComponent(jComboBoxCheckInMinManage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageHotelsLayout.createSequentialGroup()
                                        .addComponent(jComboBoxCheckOutMinManage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33))))))
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxDeleteNearAttraction, javax.swing.GroupLayout.Alignment.TRAILING, 0, 160, Short.MAX_VALUE)
                                    .addComponent(jComboBoxServicesManage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDeleteServicesManage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNearAttractionsManage, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldRequirementsManage)
                                    .addComponent(jComboBoxCheckInRequirementsManage, 0, 160, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDeleteServiceManage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddServicesManage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDeleteNearAttractionManage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddAttractionsManage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDeleteCheckInRequirementManage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddRequirementsManage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageHotelsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAddPhotograpyManage))
                            .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabelImageManage, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonPreviousImageManage)
                                .addGap(3, 3, 3)
                                .addComponent(jButtonNextImageManage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSeeManage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDeleteImageManage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonActualizeHotel)
                                .addGap(4, 4, 4)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelManageHotelsLayout.setVerticalGroup(
            jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddRequirementsManage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(jComboBoxSelectHotelManageHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34)
                                .addComponent(jTextFieldRequirementsManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxCheckInRequirementsManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonDeleteCheckInRequirementManage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageHotelsLayout.createSequentialGroup()
                                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNearAttractionsManage)
                                            .addComponent(jButtonAddAttractionsManage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButtonDeleteNearAttractionManage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jComboBoxDeleteNearAttraction))
                                        .addGap(16, 16, 16)))
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxServicesManage)
                                        .addComponent(jLabel36))
                                    .addComponent(jButtonAddServicesManage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxDeleteServicesManage)
                                    .addComponent(jButtonDeleteServiceManage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonAddPhotograpyManage)
                                    .addComponent(jLabel37))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButtonSeeManage)
                                            .addComponent(jButtonDeleteImageManage)
                                            .addComponent(jButtonActualizeHotel)))
                                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                        .addComponent(jLabelImageManage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonNextImageManage)
                                            .addComponent(jButtonPreviousImageManage)))))
                            .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21)
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel22)
                                            .addComponent(jComboBoxCountryManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel23)
                                            .addComponent(jTextFieldPhoneNumberManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel24)
                                            .addComponent(jComboBoxStarsNumberManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel25)
                                            .addComponent(jComboBoxLodgingTypeManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel26)
                                            .addComponent(jTextFieldHotelSizeManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel27)
                                            .addComponent(jComboBoxBuiltYearManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelManageHotelsLayout.createSequentialGroup()
                                        .addComponent(jTextFieldNameManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(jTextFieldAddressManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(jComboBoxCheckInHoursManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCheckInMinManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel32))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelManageHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(jComboBoxCheckOutHoursManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCheckOutMinManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel33))))
                        .addGap(36, 36, 36))))
        );

        jTabbedPane1.addTab("Manage hotels", jPanelManageHotels);

        jLabel38.setText("Select the hotel:");

        jComboBoxSelectHotelManageRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxSelectHotelManageRoomsMouseClicked(evt);
            }
        });
        jComboBoxSelectHotelManageRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectHotelManageRoomsActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel39.setText("Room:");

        jLabel40.setText("Room type associated:");

        jListRoomsManageRooms.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListRoomsManageRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListRoomsManageRoomsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListRoomsManageRooms);

        jScrollPane3.setViewportView(jListRoomTypeManageRooms);

        jLabel41.setText("Room registers:");

        jListRoomRegistersManageRooms.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane4.setViewportView(jListRoomRegistersManageRooms);

        jButtonUpdateRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CheckIcon16.png"))); // NOI18N
        jButtonUpdateRoomType.setText("Update");
        jButtonUpdateRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateRoomTypeActionPerformed(evt);
            }
        });

        jButtonSee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LoupeIcon.png"))); // NOI18N
        jButtonSee.setText("See");
        jButtonSee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManageHotelRoomsLayout = new javax.swing.GroupLayout(jPanelManageHotelRooms);
        jPanelManageHotelRooms.setLayout(jPanelManageHotelRoomsLayout);
        jPanelManageHotelRoomsLayout.setHorizontalGroup(
            jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageHotelRoomsLayout.createSequentialGroup()
                .addGroup(jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageHotelRoomsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel38)
                        .addGap(4, 4, 4)
                        .addComponent(jComboBoxSelectHotelManageRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelManageHotelRoomsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)
                            .addComponent(jButtonUpdateRoomType, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSee, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanelManageHotelRoomsLayout.setVerticalGroup(
            jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageHotelRoomsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageHotelRoomsLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel38))
                    .addComponent(jComboBoxSelectHotelManageRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageHotelRoomsLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelManageHotelRoomsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelManageHotelRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonUpdateRoomType)
                            .addComponent(jButtonSee)))))
        );

        jTabbedPane1.addTab("Manage hotel rooms", jPanelManageHotelRooms);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(571, 571, 571)
                .addComponent(jButtonCloseSession))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButtonCloseSession))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSessionActionPerformed
        new LogInWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCloseSessionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        chargeYears(jComboBoxBuiltYearCreate);
        chargeYears(jComboBoxBuiltYearManage);
        chargeComboBoxService();
        chargeComboBoxSelectHotel(jComboBoxSelectHotelManageHotel);
        chargeComboBoxSelectHotel(jComboBoxSelectHotelManageRooms);
    }//GEN-LAST:event_formWindowOpened

       private void chargeYears(JComboBox toCharge){
        int year = 2015;
        while(year > 1974){
            toCharge.addItem(year);
            year--;
        }
    }
    
    private void chargeComboBoxService(){
        jComboBoxServicesCreate.removeAllItems();
        global.getGeneralServiceList().stream().forEach((temporalService) -> {
            jComboBoxServicesCreate.addItem(temporalService.getName() + "-" + temporalService.getCode());
        });        
    }
    
    private void chargeComboBoxSelectHotel(JComboBox comboBox){
        comboBox.removeAllItems();
        global.getGeneralHotelList().stream().forEach((temporalHotel) -> {
            comboBox.addItem(temporalHotel.getName() + "," + temporalHotel.getCountry());
        });
    }
    
    private void jButtonAddPhotograpyCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPhotograpyCreateActionPerformed
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new FileNameExtensionFilter("Image files",
        "jpg","jpeg","png"));
        int state = selector.showOpenDialog(this);
        if(state == JFileChooser.APPROVE_OPTION){
            try{
                ImageIcon image = new ImageIcon(ImageIO.read(selector.getSelectedFile()));
                setGraphicImageCreate(image);
                this.photographsList.add(image);
                indexImageCreate = this.photographsList.size()-1;
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(this, "Image not supported, please choose another one",
                "Error!", JOptionPane.INFORMATION_MESSAGE, warningIcon);
            }
        }
    }//GEN-LAST:event_jButtonAddPhotograpyCreateActionPerformed

    private void setGraphicImageCreate(ImageIcon image){
        jLabelImageCreate.setIcon(new ImageIcon(image.getImage()
        .getScaledInstance(jLabelImageCreate.getWidth()-1,
        jLabelImageCreate.getHeight()-1,Image.SCALE_DEFAULT)));
    }
    
    private void setGraphicImageManage(ImageIcon image){
        jLabelImageManage.setIcon(new ImageIcon(image.getImage()
        .getScaledInstance(jLabelImageManage.getWidth()-1,
        jLabelImageManage.getHeight()-1,Image.SCALE_DEFAULT)));
    }
    
    private void jButtonAddRequirementsCreateCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRequirementsCreateCreateActionPerformed
        if(!jTextFieldRequirementsCreate.getText().isEmpty()){
            this.checkInRequirementsList.add(jTextFieldRequirementsCreate.getText());
            jTextFieldRequirementsCreate.setText("");
        }
    }//GEN-LAST:event_jButtonAddRequirementsCreateCreateActionPerformed

    private void jButtonAddAttractionsCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAttractionsCreateActionPerformed
        if(!jTextFieldNearAttractionsCreate.getText().isEmpty()){
            this.nearbyAttractionList.add(new Attraction(jTextFieldNearAttractionsCreate.getText()));
            jTextFieldNearAttractionsCreate.setText("");
        }
    }//GEN-LAST:event_jButtonAddAttractionsCreateActionPerformed

    private void jButtonCreateHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateHotelActionPerformed
        if(!jTextFieldNameCreate.getText().isEmpty() && !jTextFieldAddressCreate.getText().isEmpty() &&
        !jTextFieldPhoneNumberCreate.getText().isEmpty() && !jTextFieldHotelSizeCreate.getText().isEmpty()){
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
            global.addHotel(new Hotel(jTextFieldNameCreate.getText(),jTextFieldAddressCreate.getText(),
            jComboBoxCountryCreate.getSelectedItem().toString(),jTextFieldPhoneNumberCreate.getText(),
            Integer.parseInt(jComboBoxStarsNumberCreate.getSelectedItem().toString()),
            jComboBoxLodgingTypeCreate.getSelectedItem().toString(),
            jTextFieldHotelSizeCreate.getText(),jComboBoxBuiltYearCreate.getSelectedItem()
            .toString(),jComboBoxCheckInHoursCreate.getSelectedItem().
            toString() + ":" + jComboBoxCheckInMinCreate.getSelectedItem().toString(),
            jComboBoxCheckOutHoursCreate.getSelectedItem().toString() + ":" + 
            jComboBoxCheckOutMinCreate.getSelectedItem().toString(),(ArrayList<String>)
            checkInRequirementsList.clone(),(ArrayList<Attraction>)nearbyAttractionList.clone(),
            (ArrayList<Service>)servicesList.clone(),(ArrayList<ImageIcon>)photographsList.clone()));
            //Information to the user.
            JOptionPane.showMessageDialog(this,"Data saved succesfully!","Notification",
            JOptionPane.INFORMATION_MESSAGE, checkIcon);
            jComboBoxSelectHotelManageHotel.addItem(jTextFieldNameCreate.getText() + "," + 
            jComboBoxCountryCreate.getSelectedItem().toString());
            //Reset components and variables.
            resetComponentsAndVariablesCreateHotel();
        }
        else
            JOptionPane.showMessageDialog(this,"Missing Data!","Warning!",
            JOptionPane.INFORMATION_MESSAGE, warningIcon);
    }//GEN-LAST:event_jButtonCreateHotelActionPerformed

    private void jButtonAddServicesCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddServicesCreateActionPerformed
        if(jComboBoxServicesCreate.getItemCount() != 0){
            String actualService = jComboBoxServicesCreate.getSelectedItem().toString().split("-")[0];
            jComboBoxServicesCreate.removeItemAt(jComboBoxServicesCreate.getSelectedIndex());
            servicesList.add(global.searchService(actualService));
        }
    }//GEN-LAST:event_jButtonAddServicesCreateActionPerformed

    private void jTextFieldNameCreateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameCreateKeyTyped
        jTextFieldKeyTyped(evt,jTextFieldNameCreate);
    }//GEN-LAST:event_jTextFieldNameCreateKeyTyped

    private void jTextFieldAddressCreateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddressCreateKeyTyped
        jTextFieldKeyTyped(evt,jTextFieldAddressCreate);
    }//GEN-LAST:event_jTextFieldAddressCreateKeyTyped

    private void jTextFieldPhoneNumberCreateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberCreateKeyTyped
        jTextFieldPhoneNumberKeyTyped(evt,jTextFieldPhoneNumberCreate);
    }//GEN-LAST:event_jTextFieldPhoneNumberCreateKeyTyped

    private void jButtonPreviousImageCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousImageCreateActionPerformed
        if(indexImageCreate > 0){
            indexImageCreate--;
            setGraphicImageCreate(this.photographsList.get(indexImageCreate));
        }
    }//GEN-LAST:event_jButtonPreviousImageCreateActionPerformed

    private void jButtonNextImageCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextImageCreateActionPerformed
        if(indexImageCreate < this.photographsList.size() - 1){
           indexImageCreate++;
           setGraphicImageCreate(this.photographsList.get(indexImageCreate));
        }
    }//GEN-LAST:event_jButtonNextImageCreateActionPerformed

    private void jButtonSeeCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeCreateActionPerformed
        if(jLabelImageCreate.getIcon() != null){
            new PictureViewer(photographsList.get(indexImageCreate),this).setVisible(true);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonSeeCreateActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new LogInWindow().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jTextFieldHotelSizeCreateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHotelSizeCreateKeyTyped
        jTextFieldHotelSize(evt,jTextFieldHotelSizeCreate);
    }//GEN-LAST:event_jTextFieldHotelSizeCreateKeyTyped

    private void jTextFieldNameManageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameManageKeyTyped
        jTextFieldKeyTyped(evt,jTextFieldNameManage);
    }//GEN-LAST:event_jTextFieldNameManageKeyTyped

    private void jTextFieldAddressManageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddressManageKeyTyped
        jTextFieldKeyTyped(evt,jTextFieldAddressManage);
    }//GEN-LAST:event_jTextFieldAddressManageKeyTyped

    private void jTextFieldPhoneNumberManageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberManageKeyTyped
        jTextFieldPhoneNumberKeyTyped(evt,jTextFieldPhoneNumberManage);
    }//GEN-LAST:event_jTextFieldPhoneNumberManageKeyTyped

    private void jButtonAddRequirementsManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRequirementsManageActionPerformed
        if(!jTextFieldRequirementsManage.getText().isEmpty()){
            actualHotelManageHotel.addCheckInRequierement(jTextFieldRequirementsManage.getText());
            jComboBoxCheckInRequirementsManage.addItem(jTextFieldRequirementsManage.getText());
            jTextFieldRequirementsManage.setText("");
        }
    }//GEN-LAST:event_jButtonAddRequirementsManageActionPerformed

    private void jButtonAddAttractionsManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAttractionsManageActionPerformed
        if(!jTextFieldNearAttractionsManage.getText().isEmpty()){
            Attraction newAttraction = new Attraction(jTextFieldNearAttractionsManage.getText());
            actualHotelManageHotel.addNearbyAttraction(newAttraction);
            jComboBoxDeleteNearAttraction.addItem(newAttraction.getName() + "-" +
            newAttraction.getCode());
            jTextFieldNearAttractionsManage.setText("");
        }
    }//GEN-LAST:event_jButtonAddAttractionsManageActionPerformed

    private void jButtonAddServicesManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddServicesManageActionPerformed
        if(jComboBoxServicesManage.getItemCount() != 0){
            String actualService = jComboBoxServicesManage.getSelectedItem().toString().split("-")[0];
            jComboBoxServicesManage.removeItemAt(jComboBoxServicesManage.getSelectedIndex());
            actualHotelManageHotel.addService(global.searchService(actualService));
            chargeComboBoxDeleteServiceManage();
        }
    }//GEN-LAST:event_jButtonAddServicesManageActionPerformed

    private void jButtonAddPhotograpyManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPhotograpyManageActionPerformed
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new FileNameExtensionFilter("Image files",
        "jpg","jpeg","png"));
        int state = selector.showOpenDialog(this);
        if(state == JFileChooser.APPROVE_OPTION){
            try{
                ImageIcon image = new ImageIcon(ImageIO.read(selector.getSelectedFile()));
                setGraphicImageManage(image);
                actualHotelManageHotel.addPhotography(image);
                indexImageManage = actualHotelManageHotel.getPhotographsList().size()-1;
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(this, "Image not supported, please choose another one",
                "Error!", JOptionPane.INFORMATION_MESSAGE, warningIcon);
            }
        }
    }//GEN-LAST:event_jButtonAddPhotograpyManageActionPerformed

    private void jButtonPreviousImageManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousImageManageActionPerformed
        if(indexImageManage > 0 && actualHotelManageHotel != null){
            indexImageManage--;
            setGraphicImageManage(actualHotelManageHotel.getPhotographsList().get(indexImageManage));
        }
    }//GEN-LAST:event_jButtonPreviousImageManageActionPerformed

    private void jButtonNextImageManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextImageManageActionPerformed
        if(actualHotelManageHotel != null){
            if(indexImageManage < actualHotelManageHotel.getPhotographsList().size() - 1){
                indexImageManage++;
                setGraphicImageManage(actualHotelManageHotel.getPhotographsList().get(indexImageManage));
            }
        }
    }//GEN-LAST:event_jButtonNextImageManageActionPerformed

    private void jButtonSeeManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeManageActionPerformed
        new PictureViewer(actualHotelManageHotel.getPhotographsList().get(indexImageManage),
        this).setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_jButtonSeeManageActionPerformed

    private void jButtonActualizeHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizeHotelActionPerformed
        if(!jTextFieldNameManage.getText().isEmpty() && !jTextFieldAddressManage
        .getText().isEmpty() && !jTextFieldPhoneNumberManage.getText().isEmpty() &&
        !jTextFieldHotelSizeManage.getText().isEmpty()){
            actualHotelManageHotel.setName(jTextFieldNameManage.getText());
            actualHotelManageHotel.setAddress(jTextFieldAddressManage.getText());
            actualHotelManageHotel.setCountry(jComboBoxCountryManage.getSelectedItem().toString());
            actualHotelManageHotel.setPhoneNumber(jTextFieldPhoneNumberManage.getText());
            actualHotelManageHotel.setBuiltYear(jComboBoxBuiltYearManage.getSelectedItem().toString());
            actualHotelManageHotel.setHotelSize(jTextFieldHotelSizeManage.getText());
            actualHotelManageHotel.setCheckInTime(jComboBoxCheckInHoursManage.getSelectedItem()
            .toString() + ":" + jComboBoxCheckInMinManage.getSelectedItem().toString());
            actualHotelManageHotel.setCheckOutTime(jComboBoxCheckOutHoursManage.getSelectedItem()
            .toString() + ":" + jComboBoxCheckOutMinManage.getSelectedItem().toString());
            JOptionPane.showMessageDialog(this, "Information update sucefully", "Message",
            JOptionPane.INFORMATION_MESSAGE,checkIcon);
            chargeComboBoxSelectHotel(jComboBoxSelectHotelManageHotel);
            
        }
        else
            JOptionPane.showMessageDialog(this, "Missing some data", "Warning",
            JOptionPane.INFORMATION_MESSAGE,warningIcon);
    }//GEN-LAST:event_jButtonActualizeHotelActionPerformed

    private void jTextFieldHotelSizeManageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHotelSizeManageKeyTyped
        jTextFieldHotelSize(evt,jTextFieldHotelSizeManage);
    }//GEN-LAST:event_jTextFieldHotelSizeManageKeyTyped

    private void jTextFieldRequirementsManageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRequirementsManageKeyTyped
        jTextFieldKeyTyped(evt,jTextFieldRequirementsManage);
    }//GEN-LAST:event_jTextFieldRequirementsManageKeyTyped

    private void jButtonDeleteCheckInRequirementManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteCheckInRequirementManageActionPerformed
        if(jComboBoxCheckInRequirementsManage.getItemCount() != 0){
            actualHotelManageHotel.deleteCheckInRequierement(jComboBoxCheckInRequirementsManage
            .getSelectedIndex());
            jComboBoxCheckInRequirementsManage.removeItemAt(jComboBoxCheckInRequirementsManage
            .getSelectedIndex());
        }
    }//GEN-LAST:event_jButtonDeleteCheckInRequirementManageActionPerformed

    private void jButtonDeleteNearAttractionManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteNearAttractionManageActionPerformed
        if(jComboBoxDeleteNearAttraction.getItemCount() != 0){
            actualHotelManageHotel.deleteNearbyAttaction(jComboBoxDeleteNearAttraction
            .getSelectedIndex());
            jComboBoxDeleteNearAttraction.removeItemAt(jComboBoxDeleteNearAttraction
            .getSelectedIndex());
        }
    }//GEN-LAST:event_jButtonDeleteNearAttractionManageActionPerformed

    private void jComboBoxServicesManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicesManageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServicesManageActionPerformed

    private void jComboBoxSelectHotelManageHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSelectHotelManageHotelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelectHotelManageHotelMouseClicked

    private void jComboBoxSelectHotelManageHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectHotelManageHotelActionPerformed
        //Loading hotel information requested.
        if(jComboBoxSelectHotelManageHotel.getSelectedItem() != null){
            Hotel selectedHotel = global.searchHotel(jComboBoxSelectHotelManageHotel.getSelectedItem()
            .toString().split(",")[0]);
            actualHotelManageHotel = selectedHotel;
            jTextFieldNameManage.setText(selectedHotel.getName());
            jTextFieldAddressManage.setText(selectedHotel.getAddress());
            //For the countries jComboBox.
            int cont = 0;
            while(!jComboBoxCountryManage.getItemAt(cont).toString().equals(selectedHotel
            .getCountry()))
                cont++;
            jComboBoxCountryManage.setSelectedIndex(cont);
            jTextFieldPhoneNumberManage.setText(selectedHotel.getPhoneNumber());
            jComboBoxStarsNumberManage.setSelectedIndex(selectedHotel.getStarsNumber()-1);
            //For the loading type jComboBox.
            cont = 0;
            while(!jComboBoxLodgingTypeManage.getItemAt(cont).toString()
            .equals(selectedHotel.getLodgingType()))
                cont++;
            jComboBoxLodgingTypeManage.setSelectedIndex(cont);
            jTextFieldHotelSizeManage.setText(selectedHotel.getHotelSize());
            jComboBoxBuiltYearManage.setSelectedIndex(2015 - Integer.parseInt(selectedHotel
            .getBuiltYear()));
            //For check in hour.
            jComboBoxCheckInHoursManage.setSelectedIndex(Integer.parseInt(selectedHotel
            .getCheckInTime().split(":")[0]) - 10);
            //For check in minutes.
            jComboBoxCheckInMinManage.setSelectedIndex(Integer.parseInt(selectedHotel
            .getCheckInTime().split(":")[1]) / 15);
            //For check out hour.
            jComboBoxCheckOutHoursManage.setSelectedIndex(Integer.parseInt(selectedHotel
            .getCheckOutTime().split(":")[0]) - 10);
            //For check out minutes.
            jComboBoxCheckOutMinManage.setSelectedIndex(Integer.parseInt(selectedHotel
            .getCheckOutTime().split(":")[1]) / 15);
            //For check in requirements.
            jComboBoxCheckInRequirementsManage.removeAllItems();
            actualHotelManageHotel.getCheckInRequirementsList().stream().forEach((temporalRequirement) -> {
                jComboBoxCheckInRequirementsManage.addItem(temporalRequirement);
            });
            //For near attractions.
            jComboBoxDeleteNearAttraction.removeAllItems();
            actualHotelManageHotel.getNearbyAttractionList().stream().forEach((temporalAttraction) -> {
                jComboBoxDeleteNearAttraction.addItem(temporalAttraction.getName() +
                "-" + temporalAttraction.getCode());
            });
            //For services.
            chargeComboBoxServicesManage();
            chargeComboBoxDeleteServiceManage();
            indexImageManage = 0;
            setGraphicImageManage(actualHotelManageHotel.getPhotographsList().get(indexImageManage));
        }
    }//GEN-LAST:event_jComboBoxSelectHotelManageHotelActionPerformed
    
    private void chargeComboBoxServicesManage(){
        jComboBoxServicesManage.removeAllItems();
        global.getGeneralServiceList().stream().filter((temporalService) -> 
        (actualHotelManageHotel.searchService(temporalService.getName()) == null)).forEach((temporalService) -> {
            jComboBoxServicesManage.addItem(temporalService.getName() + "-" +
            temporalService.getCode());
        });
    }
    
    private void chargeComboBoxDeleteServiceManage(){
        jComboBoxDeleteServicesManage.removeAllItems();
        actualHotelManageHotel.getServicesList().stream().forEach((temporalService) -> {
            jComboBoxDeleteServicesManage.addItem(temporalService.getName() + "-" +
            temporalService.getCode()); 
        });
    }
    
    private void jTextFieldNearAttractionsManageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNearAttractionsManageKeyTyped
        jTextFieldKeyTyped(evt,jTextFieldNearAttractionsManage);
    }//GEN-LAST:event_jTextFieldNearAttractionsManageKeyTyped

    private void jTextFieldRequirementsCreateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRequirementsCreateKeyTyped
        jTextFieldKeyTyped(evt,jTextFieldRequirementsCreate);
    }//GEN-LAST:event_jTextFieldRequirementsCreateKeyTyped

    private void jTextFieldNearAttractionsCreateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNearAttractionsCreateKeyTyped
        jTextFieldKeyTyped(evt,jTextFieldNearAttractionsCreate);
    }//GEN-LAST:event_jTextFieldNearAttractionsCreateKeyTyped

    private void jButtonDeleteServiceManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteServiceManageActionPerformed
        actualHotelManageHotel.deleteService(jComboBoxDeleteServicesManage.getSelectedIndex());
        chargeComboBoxServicesManage();
        jComboBoxDeleteServicesManage.removeItemAt(jComboBoxDeleteServicesManage
        .getSelectedIndex());
    }//GEN-LAST:event_jButtonDeleteServiceManageActionPerformed

    private void jButtonDeleteImageManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteImageManageActionPerformed
        if(actualHotelManageHotel.getPhotographsList().size() > 1){
            actualHotelManageHotel.deletePhotography(indexImageManage);
            setGraphicImageManage(actualHotelManageHotel.getPhotographsList().get(0));
            indexImageManage = 0;
        }
        else
            JOptionPane.showMessageDialog(this, "The hotel must have at least one image.", "Warning",
            JOptionPane.INFORMATION_MESSAGE,warningIcon);
    }//GEN-LAST:event_jButtonDeleteImageManageActionPerformed

    private void jComboBoxSelectHotelManageRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSelectHotelManageRoomsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelectHotelManageRoomsMouseClicked

    private void jComboBoxSelectHotelManageRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectHotelManageRoomsActionPerformed
        //Loading hotel information requested.
        if(jComboBoxSelectHotelManageRooms.getSelectedItem() != null){
            Hotel selectedHotel = global.searchHotel(jComboBoxSelectHotelManageRooms.getSelectedItem()
            .toString().split(",")[0]);
            actualHotelManageRooms = selectedHotel;
            chargeJListRoomsManageRooms();
            chargeJListRoomTypeManageRooms();
            chargeJListRoomRegistersManageRooms();
            setRoomTypeAssociated();
        }
    }//GEN-LAST:event_jComboBoxSelectHotelManageRoomsActionPerformed

    private void jListRoomsManageRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListRoomsManageRoomsMouseClicked
        setRoomTypeAssociated();
        chargeJListRoomRegistersManageRooms();
    }//GEN-LAST:event_jListRoomsManageRoomsMouseClicked

    private void jButtonUpdateRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateRoomTypeActionPerformed
        if(actualHotelManageRooms == null)
            return;
        if(actualHotelManageRooms.getRoomList().isEmpty())
            return;
        if(actualHotelManageRooms.getRoomTypesAvailablesList().isEmpty())
            return;
        actualHotelManageRooms.getRoomList().get(jListRoomsManageRooms.getSelectedIndex())
        .setType(actualHotelManageRooms.getRoomTypesAvailablesList().get(jListRoomTypeManageRooms
        .getSelectedIndex()),actualHotelManageRooms,jListRoomsManageRooms.getSelectedIndex());
        chargeJListRoomsManageRooms();
        setRoomTypeAssociated();
        chargeJListRoomRegistersManageRooms();
    }//GEN-LAST:event_jButtonUpdateRoomTypeActionPerformed

    private void jButtonSeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeActionPerformed
        if(actualHotelManageRooms != null && jListRoomRegistersManageRooms.getSelectedIndex() != -1
        && jListRoomRegistersManageRooms.getSelectedIndex() != -1){
            new RegisterViewer(this, actualHotelManageRooms.getRoomList()
            .get(jListRoomsManageRooms.getSelectedIndex()).getRegisterList()
            .get(jListRoomRegistersManageRooms.getSelectedIndex())).setVisible(true);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonSeeActionPerformed

    private void chargeJListRoomsManageRooms(){
        if(actualHotelManageRooms.getRoomList().size() > 0){
            DefaultListModel model = new DefaultListModel();
            actualHotelManageRooms.getRoomList().stream().forEach((temporalRoom) -> {
                model.addElement("Room: " + temporalRoom.getNumber() + "--->Floor: " + 
                temporalRoom.getType().getFloor());
            });
            jListRoomsManageRooms.setModel(model);
            jListRoomsManageRooms.setSelectedIndex(0);
        }
    }
    
    private void chargeJListRoomTypeManageRooms(){
        if(actualHotelManageRooms.getRoomTypesAvailablesList().size() > 0){
            DefaultListModel model = new DefaultListModel();
            actualHotelManageRooms.getRoomTypesAvailablesList().stream().forEach((temporalRoomType) -> {
                model.addElement(temporalRoomType.getRoomType());
            });
            jListRoomTypeManageRooms.setModel(model);
        }
    }
    
    private void chargeJListRoomRegistersManageRooms(){        
        if(actualHotelManageRooms.getRoomList().size() > 0){
            DefaultListModel<String> model = new DefaultListModel();
            Room selectedRoom = actualHotelManageRooms.getRoomList()
            .get(jListRoomsManageRooms.getSelectedIndex());
            selectedRoom.getRegisterList().stream().forEach((temporalRegister) -> {
                model.addElement(temporalRegister.getDateCode());
            });
            jListRoomRegistersManageRooms.setModel(model);
        }
    }
    
    private void setRoomTypeAssociated(){
        if(actualHotelManageRooms.getRoomList().size() > 0){
            RoomType roomTypeSelected = actualHotelManageRooms.getRoomList()
            .get(jListRoomsManageRooms.getSelectedIndex()).getType();
            for(int i = 0;i < jListRoomTypeManageRooms.getModel().getSize();i++){
                if(jListRoomTypeManageRooms.getModel().getElementAt(i).toString()
                .equals(roomTypeSelected.getRoomType())){
                    jListRoomTypeManageRooms.setSelectedIndex(i);
                    return;
                }
            }
        }
    }
    
    private void resetComponentsAndVariablesCreateHotel(){
        jTextFieldNameCreate.setText("");
        jTextFieldNameCreate.setText("");
        jTextFieldAddressCreate.setText("");
        jComboBoxCountryCreate.setSelectedIndex(0);
        jTextFieldPhoneNumberCreate.setText("");
        jComboBoxStarsNumberCreate.setSelectedIndex(0);
        jComboBoxLodgingTypeCreate.setSelectedIndex(0);
        jTextFieldHotelSizeCreate.setText("");
        jComboBoxBuiltYearCreate.setSelectedIndex(0);
        jComboBoxCheckInHoursCreate.setSelectedIndex(0);
        jComboBoxCheckInMinCreate.setSelectedIndex(0);
        jComboBoxCheckOutHoursCreate.setSelectedIndex(0);
        jComboBoxCheckOutMinCreate.setSelectedIndex(0);
        jLabelImageCreate.setIcon(null);
        indexImageCreate = 0;
        this.checkInRequirementsList.clear();
        this.nearbyAttractionList.clear();
        this.servicesList.clear();
        this.photographsList.clear();
        chargeComboBoxService();
    }
    
    private void jTextFieldKeyTyped(java.awt.event.KeyEvent evt, JTextField jTextField){
        if(evt.getKeyChar() == ' ' && jTextField.getText().length() == 0)
            evt.consume();
    }
    
    private void jTextFieldPhoneNumberKeyTyped(java.awt.event.KeyEvent evt, JTextField jTextFieldPhoneNumber){
        char scan = evt.getKeyChar();
        if((scan < '0' || scan > '9') && (scan != '+' || jTextFieldPhoneNumber.getText().length() != 0))
            evt.consume();
    }
    
    private void jTextFieldHotelSize(java.awt.event.KeyEvent evt, JTextField jtextFieldHotelSize){
        char scan = evt.getKeyChar();
        if((scan < '0' || scan > '9') && (scan != 'm' || jtextFieldHotelSize
        .getText().length() == 0 || (jtextFieldHotelSize.getText().lastIndexOf("m")
        != -1)))
            evt.consume();
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorWindow(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizeHotel;
    private javax.swing.JButton jButtonAddAttractionsCreate;
    private javax.swing.JButton jButtonAddAttractionsManage;
    private javax.swing.JButton jButtonAddPhotograpyCreate;
    private javax.swing.JButton jButtonAddPhotograpyManage;
    private javax.swing.JButton jButtonAddRequirementsCreate;
    private javax.swing.JButton jButtonAddRequirementsManage;
    private javax.swing.JButton jButtonAddServicesCreate;
    private javax.swing.JButton jButtonAddServicesManage;
    private javax.swing.JButton jButtonCloseSession;
    private javax.swing.JButton jButtonCreateHotel;
    private javax.swing.JButton jButtonDeleteCheckInRequirementManage;
    private javax.swing.JButton jButtonDeleteImageManage;
    private javax.swing.JButton jButtonDeleteNearAttractionManage;
    private javax.swing.JButton jButtonDeleteServiceManage;
    private javax.swing.JButton jButtonNextImageCreate;
    private javax.swing.JButton jButtonNextImageManage;
    private javax.swing.JButton jButtonPreviousImageCreate;
    private javax.swing.JButton jButtonPreviousImageManage;
    private javax.swing.JButton jButtonSee;
    private javax.swing.JButton jButtonSeeCreate;
    private javax.swing.JButton jButtonSeeManage;
    private javax.swing.JButton jButtonUpdateRoomType;
    private javax.swing.JComboBox jComboBoxBuiltYearCreate;
    private javax.swing.JComboBox jComboBoxBuiltYearManage;
    private javax.swing.JComboBox jComboBoxCheckInHoursCreate;
    private javax.swing.JComboBox jComboBoxCheckInHoursManage;
    private javax.swing.JComboBox jComboBoxCheckInMinCreate;
    private javax.swing.JComboBox jComboBoxCheckInMinManage;
    private javax.swing.JComboBox jComboBoxCheckInRequirementsManage;
    private javax.swing.JComboBox jComboBoxCheckOutHoursCreate;
    private javax.swing.JComboBox jComboBoxCheckOutHoursManage;
    private javax.swing.JComboBox jComboBoxCheckOutMinCreate;
    private javax.swing.JComboBox jComboBoxCheckOutMinManage;
    private javax.swing.JComboBox jComboBoxCountryCreate;
    private javax.swing.JComboBox jComboBoxCountryManage;
    private javax.swing.JComboBox jComboBoxDeleteNearAttraction;
    private javax.swing.JComboBox jComboBoxDeleteServicesManage;
    private javax.swing.JComboBox jComboBoxLodgingTypeCreate;
    private javax.swing.JComboBox jComboBoxLodgingTypeManage;
    private javax.swing.JComboBox jComboBoxSelectHotelManageHotel;
    private javax.swing.JComboBox jComboBoxSelectHotelManageRooms;
    private javax.swing.JComboBox jComboBoxServicesCreate;
    private javax.swing.JComboBox jComboBoxServicesManage;
    private javax.swing.JComboBox jComboBoxStarsNumberCreate;
    private javax.swing.JComboBox jComboBoxStarsNumberManage;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImageCreate;
    private javax.swing.JLabel jLabelImageManage;
    private javax.swing.JList jListRoomRegistersManageRooms;
    private javax.swing.JList jListRoomTypeManageRooms;
    private javax.swing.JList jListRoomsManageRooms;
    private javax.swing.JPanel jPanelCreateHotels;
    private javax.swing.JPanel jPanelManageHotelRooms;
    private javax.swing.JPanel jPanelManageHotels;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAddressCreate;
    private javax.swing.JTextField jTextFieldAddressManage;
    private javax.swing.JTextField jTextFieldHotelSizeCreate;
    private javax.swing.JTextField jTextFieldHotelSizeManage;
    private javax.swing.JTextField jTextFieldNameCreate;
    private javax.swing.JTextField jTextFieldNameManage;
    private javax.swing.JTextField jTextFieldNearAttractionsCreate;
    private javax.swing.JTextField jTextFieldNearAttractionsManage;
    private javax.swing.JTextField jTextFieldPhoneNumberCreate;
    private javax.swing.JTextField jTextFieldPhoneNumberManage;
    private javax.swing.JTextField jTextFieldRequirementsCreate;
    private javax.swing.JTextField jTextFieldRequirementsManage;
    // End of variables declaration//GEN-END:variables
}
