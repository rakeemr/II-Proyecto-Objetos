package Graphic;

import Logic.Global;
import Logic.Hotel;
import Logic.Room.Room;
import Logic.User.Client;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ReservationWindow extends javax.swing.JFrame {
    private final JFrame ancestor;
    private final Hotel selectedHotel;
    private final Client currentUser;
    private final Global global;
    private final ImageIcon warningIcon;
    private final ImageIcon exclamationIcon;
    private final ImageIcon checkIcon;
    private ArrayList<Room> roomsAvailables;
    private ArrayList<Room> roomsSelected;
    
    public ReservationWindow(JFrame ancestor, Hotel selectedHotel, Client currentUser) {
        initComponents();
        this.setTitle("Reservation view");
        this.setResizable(false);
        this.setLocationRelativeTo(ancestor);
        this.setIconImage(new ImageIcon(getClass().getResource("/Img/HotelIcon.png")).getImage());
        this.ancestor = ancestor;
        this.selectedHotel = selectedHotel;
        this.currentUser = currentUser;
        this.global = Global.getInstance();
        this.warningIcon = new ImageIcon(getClass().getResource("/Img/WarningIcon.png"));
        this.exclamationIcon = new ImageIcon(getClass().getResource("/Img/ExclamationIcon.png"));
        this.checkIcon = new ImageIcon(getClass().getResource("/Img/CheckIcon.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTypesOfRoom = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListRoomsAvailables = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateChooserComboCheckInDate = new datechooser.beans.DateChooserCombo();
        dateChooserComboCheckOutDate = new datechooser.beans.DateChooserCombo();
        jButtonContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Select the type of room you want to reservet:");

        jListTypesOfRoom.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListTypesOfRoom.setToolTipText("");
        jListTypesOfRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListTypesOfRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListTypesOfRoom);

        jLabel2.setText("Select the rooms you want to reserve:");

        jScrollPane2.setViewportView(jListRoomsAvailables);

        jLabel3.setText("Select the start date that hath this reservation:");

        jLabel4.setText("Select the date of termination that hath this reservation:");

        dateChooserComboCheckInDate.setNothingAllowed(false);
        try {
            dateChooserComboCheckInDate.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2015, 5, 13),
                new java.util.GregorianCalendar(2015, 5, 13))));
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    dateChooserComboCheckInDate.setLocale(new java.util.Locale("es", "CR", ""));

    dateChooserComboCheckOutDate.setLocale(new java.util.Locale("es", "CR", ""));

    jButtonContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/RigthArrow.png"))); // NOI18N
    jButtonContinue.setText("Continue");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonContinue)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)))
                        .addGap(15, 15, 15)))
                .addComponent(jLabel4)
                .addComponent(dateChooserComboCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dateChooserComboCheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(511, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dateChooserComboCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dateChooserComboCheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButtonContinue)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ancestor.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        chargeJListTypesOfRoom();
    }//GEN-LAST:event_formWindowOpened

    private void jListTypesOfRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListTypesOfRoomMouseClicked
        String[] splitList = dateChooserComboCheckInDate.getText().split("/");
        GregorianCalendar checkInDate = new GregorianCalendar(Integer.parseInt(splitList[2]),
        Integer.parseInt(splitList[1]),Integer.parseInt(splitList[0]));
        splitList = dateChooserComboCheckOutDate.getText().split("/");
        GregorianCalendar checkOutDate = new GregorianCalendar(Integer.parseInt(splitList[2]),
        Integer.parseInt(splitList[1]),Integer.parseInt(splitList[0]));
        roomsAvailables = selectedHotel.checkForAvailablesRooms(jListTypesOfRoom
        .getSelectedIndex(), checkInDate, checkOutDate);
        chargeJListRoomsAvailables();
    }//GEN-LAST:event_jListTypesOfRoomMouseClicked

    private void chargeJListRoomsAvailables(){
        DefaultListModel model = new DefaultListModel();
        roomsAvailables.stream().forEach((temporalRoom) -> {
            model.addElement("Room: " + temporalRoom.getNumber());
        });
        jListRoomsAvailables.setModel(model);
    }
    
    private void chargeJListTypesOfRoom(){
        DefaultListModel model = new DefaultListModel();
        selectedHotel.getRoomTypesAvailablesList().stream().forEach((temporalRoomType) -> {
            model.addElement(temporalRoomType.getRoomType());
        });
        jListTypesOfRoom.setModel(model);
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
            java.util.logging.Logger.getLogger(ReservationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationWindow(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserComboCheckInDate;
    private datechooser.beans.DateChooserCombo dateChooserComboCheckOutDate;
    private javax.swing.JButton jButtonContinue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jListRoomsAvailables;
    private javax.swing.JList jListTypesOfRoom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
