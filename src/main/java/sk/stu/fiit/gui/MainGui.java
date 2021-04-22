/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.CurrentTime;
import sk.stu.fiit.data.Lists;
import sk.stu.fiit.user.*;


/**
 *
 * @author schon
 */
public class MainGui extends javax.swing.JFrame {
    private final Logger logger = Logger.getLogger(MainGui.class.getName());
    private final Lists lists = new Lists();
    private CurrentTime currentTime = CurrentTime.CurrentTime();
    private User loggedUser;
    
    /**
     * Creates new form MainGui
     */
    public MainGui() {
        initComponents();
        initApplication();
    }

    
    private void initApplication(){
        BasicConfigurator.configure(); 
        tickTock();
        logoutVisibility();
        
        lists.addUser("Organizátor ligy", "a@a.a", "a", "a", "a", "aaaaaaaA1", "aaaaaaaA1", null);
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        timeInfoLabel1 = new javax.swing.JLabel();
        setTimeButton = new javax.swing.JButton();
        currentTimeLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        registrationButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        nicknameLabel = new javax.swing.JLabel();
        nicknameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        appLabel = new javax.swing.JLabel();
        leaguesScrollPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        activeLeaguesLabel = new javax.swing.JLabel();
        leagueInfoButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        leagueOrganizerPanel = new javax.swing.JPanel();
        createLeagueButton = new javax.swing.JButton();
        organizerButton = new javax.swing.JButton();
        newMessageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        setTitle(bundle.getString("Esport ligy")); // NOI18N
        setMinimumSize(new java.awt.Dimension(937, 590));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        timeInfoLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timeInfoLabel1.setForeground(new java.awt.Color(255, 153, 51));
        timeInfoLabel1.setText(bundle.getString("AKTUÁLNY ČAS:")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(timeInfoLabel1, gridBagConstraints);

        setTimeButton.setText(bundle.getString("NASTAV ČAS")); // NOI18N
        setTimeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                setTimeButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(setTimeButton, gridBagConstraints);

        currentTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        currentTimeLabel.setText("null");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(currentTimeLabel, gridBagConstraints);

        logoutButton.setText("Odhlásenie");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 9;
        jPanel1.add(logoutButton, gridBagConstraints);

        loginPanel.setLayout(new java.awt.GridBagLayout());

        loginButton.setText(bundle.getString("PRIHLÁSENIE")); // NOI18N
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 16;
        loginPanel.add(loginButton, gridBagConstraints);

        registrationButton.setText(bundle.getString("REGISTRÁCIA")); // NOI18N
        registrationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registrationButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 18;
        loginPanel.add(registrationButton, gridBagConstraints);

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setText("Heslo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 12;
        loginPanel.add(passwordLabel, gridBagConstraints);

        nicknameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nicknameLabel.setText("Nickname / email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 8;
        loginPanel.add(nicknameLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        loginPanel.add(nicknameTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        loginPanel.add(passwordField, gridBagConstraints);

        appLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        appLabel.setText("Vstup do aplikácie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 6;
        loginPanel.add(appLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(loginPanel, gridBagConstraints);

        leaguesScrollPane.setMaximumSize(new java.awt.Dimension(200, 70));
        leaguesScrollPane.setMinimumSize(new java.awt.Dimension(200, 70));
        leaguesScrollPane.setPreferredSize(new java.awt.Dimension(200, 70));

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
        leaguesScrollPane.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 50;
        jPanel1.add(leaguesScrollPane, gridBagConstraints);

        activeLeaguesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        activeLeaguesLabel.setForeground(new java.awt.Color(0, 153, 153));
        activeLeaguesLabel.setText("Aktívne ligy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        jPanel1.add(activeLeaguesLabel, gridBagConstraints);

        leagueInfoButton.setText("Viac informácií");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        jPanel1.add(leagueInfoButton, gridBagConstraints);

        historyButton.setText("História");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 26;
        jPanel1.add(historyButton, gridBagConstraints);

        leagueOrganizerPanel.setLayout(new java.awt.GridBagLayout());

        createLeagueButton.setText("Vytvor ligu");
        createLeagueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createLeagueButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        leagueOrganizerPanel.add(createLeagueButton, gridBagConstraints);

        organizerButton.setText("Zverejni výsledky");
        leagueOrganizerPanel.add(organizerButton, new java.awt.GridBagConstraints());

        newMessageButton.setText("Napíš správu");
        leagueOrganizerPanel.add(newMessageButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(leagueOrganizerPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void setCurrentTime(CurrentTime currentTime) {
        this.currentTime = currentTime;
        currentTimeLabel.setText(new SimpleDateFormat("dd-MM-yyyy HH:mm").format(currentTime.getDateTime())); //NOI18N
    }
    
    public boolean setCurrentTime(LocalDateTime dateTime){
        if (this.currentTime.setDateTime(dateTime))
            currentTimeLabel.setText(new SimpleDateFormat("dd-MM-yyyy HH:mm").format(currentTime.getDateTime())); //NOI18N
        else{
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("NASTAVENÝ ČAS NEMÔŽE BYŤ V MINULOSTI") , java.util.ResourceBundle.getBundle("Bundle").getString("CHYBA PRI NASTAVOVANÍ ČASU") , JOptionPane.WARNING_MESSAGE);
            logger.error("Trying to pick time in the past");   //NOI18N
            return false;
        }
        return true;
    }
    
    public void checkStatus(){};
    
    private void tickTock(){
        int running = 1;
        Thread thread1 = new Thread(){
            int time = 0;
            @Override
            @SuppressWarnings("static-access")
            public void run(){
                while (running == 1){
                    String date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(currentTime.getDateTime()); //NOI18N
                    currentTimeLabel.setText(date);
                    time += 1;
                    if(time % 15 == 0)
                        checkStatus();
                    try {
                        this.sleep(60000);
                        currentTime.addMinute();
                    } catch (InterruptedException ex) {
                   
                        logger.error("tickTock problem"); //NOI18N
                    }
                }         
            }
        };
        thread1.start();
     } 
    
    private void setTimeButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setTimeButtonMouseReleased
        ChangeTime changeTime = new ChangeTime();
        changeTime.setChangeTime(this);
    }//GEN-LAST:event_setTimeButtonMouseReleased
    
    private void registration(){ 
        RegistrationWindow registrationWindow = new RegistrationWindow(this.lists);
        registrationWindow.setVisible(true);
    }

    private void logoutVisibility(){
        loginPanel.setVisible(true);
        logoutButton.setVisible(false);
        leaguesScrollPane.setVisible(false);
        activeLeaguesLabel.setVisible(false);
        leagueInfoButton.setVisible(false);
        historyButton.setVisible(false);
        setTimeButton.setVisible(false);
        leagueOrganizerPanel.setVisible(false);
        logger.info("Logout succesfull");
    }
    
    private void loginVisibility(String role){
        if (role.equals("Admin")){
            setTimeButton.setVisible(true);
        }
        
        if (role.equals("Player")){
            
        }
        
        if (role.equals("LeagueOrganizer")){
            leagueOrganizerPanel.setVisible(true);
        }
        
        if (role.equals("Spectator")){
            
        }
        loginPanel.setVisible(false);
        logoutButton.setVisible(true);
        leaguesScrollPane.setVisible(true);
        activeLeaguesLabel.setVisible(true);
        leagueInfoButton.setVisible(true);
        historyButton.setVisible(true);
    }
    
    private void login(){
        String errorMessage = lists.login(nicknameTextField.getText().trim(), String.valueOf(passwordField.getPassword()).trim());
        if (errorMessage.equals("Admin")){
            logger.info("Admin login");
            loginVisibility("Admin");
            return;
        }
       if (errorMessage.isEmpty()){
           User user = lists.getUser(nicknameTextField.getText().trim());
           this.loggedUser = user;
           loginVisibility(user.getClass().getSimpleName());
           logger.info("Login succesful");
       } else {
           JOptionPane.showMessageDialog(rootPane, errorMessage, "Chyba pri prihlasovaní", JOptionPane.WARNING_MESSAGE);
           logger.error("Login error");
       }
    }
    
    private void registrationButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationButtonMouseReleased
        registration();
    }//GEN-LAST:event_registrationButtonMouseReleased

    private void loginButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseReleased
        login();
    }//GEN-LAST:event_loginButtonMouseReleased

    private void logoutButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseReleased
        this.loggedUser = null;
        logoutVisibility();
    }//GEN-LAST:event_logoutButtonMouseReleased

    private void createLeagueButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLeagueButtonMouseReleased
        new LeagueWindow((LeagueOrganizer) loggedUser, lists).setVisible(true);
    }//GEN-LAST:event_createLeagueButtonMouseReleased

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
                if ("Nimbus".equals(info.getName())) { //NOI18N
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainGui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activeLeaguesLabel;
    private javax.swing.JLabel appLabel;
    private javax.swing.JButton createLeagueButton;
    private javax.swing.JLabel currentTimeLabel;
    private javax.swing.JButton historyButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton leagueInfoButton;
    private javax.swing.JPanel leagueOrganizerPanel;
    private javax.swing.JScrollPane leaguesScrollPane;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton newMessageButton;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JTextField nicknameTextField;
    private javax.swing.JButton organizerButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registrationButton;
    private javax.swing.JButton setTimeButton;
    private javax.swing.JLabel timeInfoLabel1;
    // End of variables declaration//GEN-END:variables
}
