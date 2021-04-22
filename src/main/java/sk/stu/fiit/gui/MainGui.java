/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.CurrentTime;
import sk.stu.fiit.data.InputProcessor;
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
    private User loggedUser = null;
    private final LoginWindow loginWindow;
    
    /**
     * Creates new form MainGui
     * @param loginWindow
     * @param loggedUser
     */
    public MainGui(LoginWindow loginWindow, User loggedUser) {
        initComponents();
        this.loggedUser = loggedUser;
        this.loginWindow = loginWindow;
        loginWindow.setVisible(false);
        initApplication();
    }
    
        public MainGui(LoginWindow loginWindow, String loggedUser) {
        initComponents();
        this.loginWindow = loginWindow;
        loginWindow.setVisible(false);
        initApplication();
    }

    
    private void initApplication(){
        tickTock();
        loginVisibility();
        this.setVisible(true);
        setActiveTable();
    }
    
    
    private void deleteRows(DefaultTableModel model) {
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
    }
    public void setActiveTable(){ //TODO only active leagues
        DefaultTableModel model = (DefaultTableModel) activeLeaguesTable.getModel();
        deleteRows(model);

        int numberOfColumns = activeLeaguesTable.getColumnCount();
        Object[] rowData = new Object[numberOfColumns];

        for (int i = 0; i < lists.getLeagues().size(); i++) {
            
            rowData[0] = lists.getLeagues().get(i).getName();
            rowData[1] = lists.getLeagues().get(i).getGame();
            rowData[2] = lists.getLeagues().get(i).getMaxNumberTeams();
            rowData[3] = InputProcessor.dateToString(lists.getLeagues().get(i).getStartDate());
            rowData[4] = InputProcessor.dateToString(lists.getLeagues().get(i).getEndDate());
            model.addRow(rowData);
        }
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
        leaguesScrollPane = new javax.swing.JScrollPane();
        activeLeaguesTable = new javax.swing.JTable();
        activeLeaguesLabel = new javax.swing.JLabel();
        leagueInfoButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        leagueOrganizerPanel = new javax.swing.JPanel();
        createLeagueButton = new javax.swing.JButton();
        organizerButton = new javax.swing.JButton();
        newMessageButton = new javax.swing.JButton();
        playerPanel = new javax.swing.JPanel();
        createTeamButton = new javax.swing.JButton();
        playerMessagesButton = new javax.swing.JButton();
        manageTeamButton = new javax.swing.JButton();
        leaveButton = new javax.swing.JButton();

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

        leaguesScrollPane.setMaximumSize(new java.awt.Dimension(200, 70));
        leaguesScrollPane.setMinimumSize(new java.awt.Dimension(200, 70));
        leaguesScrollPane.setPreferredSize(new java.awt.Dimension(200, 70));

        activeLeaguesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Meno", "Hra", "Počet tímov", "Od", "Do"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        leaguesScrollPane.setViewportView(activeLeaguesTable);
        if (activeLeaguesTable.getColumnModel().getColumnCount() > 0) {
            activeLeaguesTable.getColumnModel().getColumn(0).setResizable(false);
            activeLeaguesTable.getColumnModel().getColumn(1).setResizable(false);
            activeLeaguesTable.getColumnModel().getColumn(2).setResizable(false);
            activeLeaguesTable.getColumnModel().getColumn(3).setResizable(false);
            activeLeaguesTable.getColumnModel().getColumn(4).setResizable(false);
        }

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

        createLeagueButton.setText("Vytvoriť ligu");
        createLeagueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createLeagueButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        leagueOrganizerPanel.add(createLeagueButton, gridBagConstraints);

        organizerButton.setText("Zverejniť výsledky");
        leagueOrganizerPanel.add(organizerButton, new java.awt.GridBagConstraints());

        newMessageButton.setText("Správy");
        leagueOrganizerPanel.add(newMessageButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(leagueOrganizerPanel, gridBagConstraints);

        playerPanel.setLayout(new java.awt.GridBagLayout());

        createTeamButton.setText("Vytvoriť tím");
        createTeamButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createTeamButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        playerPanel.add(createTeamButton, gridBagConstraints);

        playerMessagesButton.setText("Správy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        playerPanel.add(playerMessagesButton, gridBagConstraints);

        manageTeamButton.setText("Spravovať tím");
        manageTeamButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                manageTeamButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        playerPanel.add(manageTeamButton, gridBagConstraints);

        leaveButton.setText("Odísť z tímu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        playerPanel.add(leaveButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(playerPanel, gridBagConstraints);

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
    
    public void checkStatus(){
        setActiveTable();
    };
    
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

    private void checkPlayerButtons(){
        playerPanel.setVisible(true);
            Player player = (Player) loggedUser;
            if(Boolean.logicalAnd(player.isAdmin(), player.getTeam() != null))
                createTeamButton.setVisible(false);
            if(Boolean.logicalAnd(!player.isAdmin(), player.getTeam() != null)){
                manageTeamButton.setVisible(false);
                createTeamButton.setVisible(false);
            }
            if(Boolean.logicalAnd(!player.isAdmin(), player.getTeam() == null)){
                leaveButton.setVisible(false);
                manageTeamButton.setVisible(false);
            }
    }
    

    private void loginVisibility(){
            leagueOrganizerPanel.setVisible(false);
            setTimeButton.setVisible(false);
            playerPanel.setVisible(false);
            
        if (this.loggedUser == null){  // Admin
            setTimeButton.setVisible(true);
            return;
        }
        
        if (this.loggedUser.getClass().getSimpleName().equals("Player")){
            checkPlayerButtons();
        }
        
        if (this.loggedUser.getClass().getSimpleName().equals("LeagueOrganizer")){
            leagueOrganizerPanel.setVisible(true);
        }
        
        if (this.loggedUser.getClass().getSimpleName().equals("Spectator")){
            
        }
    }
    
   
    private void logout(){
        this.loggedUser = null;
        this.dispose();
        this.loginWindow.setVisible(true);
    }
    
    private void logoutButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseReleased
        logout();
    }//GEN-LAST:event_logoutButtonMouseReleased

    private void createLeagueButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLeagueButtonMouseReleased
        new AddLeagueWindow((LeagueOrganizer) loggedUser, lists).setVisible(true);
    }//GEN-LAST:event_createLeagueButtonMouseReleased

    private void createTeamButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTeamButtonMouseReleased
        // TODO add your handling code here:
        new AddTeamWindow((Player) loggedUser, lists).setVisible(true);
    }//GEN-LAST:event_createTeamButtonMouseReleased

    private void manageTeamButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageTeamButtonMouseReleased
        // TODO add your handling code here:
        new ManageTeamWindow((Player) loggedUser, lists).setVisible(true);
    }//GEN-LAST:event_manageTeamButtonMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activeLeaguesLabel;
    private javax.swing.JTable activeLeaguesTable;
    private javax.swing.JButton createLeagueButton;
    private javax.swing.JButton createTeamButton;
    private javax.swing.JLabel currentTimeLabel;
    private javax.swing.JButton historyButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leagueInfoButton;
    private javax.swing.JPanel leagueOrganizerPanel;
    private javax.swing.JScrollPane leaguesScrollPane;
    private javax.swing.JButton leaveButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageTeamButton;
    private javax.swing.JButton newMessageButton;
    private javax.swing.JButton organizerButton;
    private javax.swing.JButton playerMessagesButton;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JButton setTimeButton;
    private javax.swing.JLabel timeInfoLabel1;
    // End of variables declaration//GEN-END:variables
}
