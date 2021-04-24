/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import sk.stu.fiit.gui.team.AddTeamWindow;
import sk.stu.fiit.gui.team.ManageTeamWindow;
import sk.stu.fiit.gui.league.LeagueInfoWindow;
import sk.stu.fiit.gui.league.AddLeagueWindow;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.CurrentTime;
import sk.stu.fiit.data.InputProcessor;
import sk.stu.fiit.data.Lists;
import sk.stu.fiit.data.Save;
import sk.stu.fiit.gui.league.MatchWindow;
import sk.stu.fiit.league.League;
import sk.stu.fiit.user.*;


/**
 *
 * @author schon
 */
public class MainGui extends javax.swing.JFrame {
    private final Logger logger = Logger.getLogger(MainGui.class.getName());
    private Lists lists;
    private CurrentTime currentTime = CurrentTime.CurrentTime();
    private User loggedUser = null;
    private final LoginWindow loginWindow;
    private short mode = 0;
    
    /**
     * Creates new form MainGui
     * @param loginWindow
     * @param loggedUser
     * @param lists
     */
    public MainGui(LoginWindow loginWindow, User loggedUser, Lists lists) {
        this.lists = lists;
        initComponents();
        this.loggedUser = loggedUser;
        this.loginWindow = loginWindow;
        loginWindow.setVisible(false);
        initApplication();
    }
    
    public MainGui(LoginWindow loginWindow, String loggedUser, Lists lists) {
        this.lists = lists;
        initComponents();
        this.loginWindow = loginWindow;
        loginWindow.setVisible(false);
        initApplication();
    }
    
    private void initApplication(){
        tickTock();
        loginVisibility();
        this.setVisible(true);
        checkStatus();
    }
    
    public void setLists(Lists lists) {
        this.lists = lists;
        checkStatus();
    }
    
    private void deleteRows(DefaultTableModel model) {
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
    }
    
    public void setTable(){ //TODO only active leagues
        DefaultTableModel model = (DefaultTableModel) leaguesTable.getModel();
        deleteRows(model);
        int numberOfColumns = leaguesTable.getColumnCount();
        Object[] rowData = new Object[numberOfColumns];

        for (League league : lists.getLeagues()) {
            if(Boolean.logicalOr(Boolean.logicalAnd(league.isPast(), this.mode == 2), 
                    Boolean.logicalOr(Boolean.logicalAnd(league.isFuture(), this.mode == 1), 
                            Boolean.logicalAnd(league.isActive(), this.mode == 0)))){
                rowData[0] = league.getName();
                rowData[1] = league.getGame();
                rowData[2] = league.getMaxNumberTeams();
                rowData[3] = InputProcessor.dateToString(league.getStartDate());
                rowData[4] = InputProcessor.dateToString(league.getEndDate());
                model.addRow(rowData);
            }
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
        leaguesTable = new javax.swing.JTable();
        leaguesLabel = new javax.swing.JLabel();
        leagueInfoButton = new javax.swing.JButton();
        leagueOrganizerPanel = new javax.swing.JPanel();
        createLeagueButton = new javax.swing.JButton();
        organizerButton = new javax.swing.JButton();
        newMessageButton = new javax.swing.JButton();
        playerPanel = new javax.swing.JPanel();
        createTeamButton = new javax.swing.JButton();
        playerMessagesButton = new javax.swing.JButton();
        manageTeamButton = new javax.swing.JButton();
        leaveButton = new javax.swing.JButton();
        adminPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        showPanel = new javax.swing.JPanel();
        activeButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        futureButton = new javax.swing.JButton();
        profilButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        setTitle(bundle.getString("Esport ligy")); // NOI18N
        setMinimumSize(new java.awt.Dimension(937, 590));

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
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
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(logoutButton, gridBagConstraints);

        leaguesScrollPane.setMaximumSize(new java.awt.Dimension(200, 70));
        leaguesScrollPane.setMinimumSize(new java.awt.Dimension(200, 70));
        leaguesScrollPane.setPreferredSize(new java.awt.Dimension(200, 70));

        leaguesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        leaguesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        leaguesScrollPane.setViewportView(leaguesTable);
        if (leaguesTable.getColumnModel().getColumnCount() > 0) {
            leaguesTable.getColumnModel().getColumn(4).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 50;
        jPanel1.add(leaguesScrollPane, gridBagConstraints);

        leaguesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        leaguesLabel.setForeground(new java.awt.Color(0, 153, 153));
        leaguesLabel.setText("Aktívne ligy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPanel1.add(leaguesLabel, gridBagConstraints);

        leagueInfoButton.setText("Viac informácií");
        leagueInfoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                leagueInfoButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        jPanel1.add(leagueInfoButton, gridBagConstraints);

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

        organizerButton.setText("Manažuj zápasy");
        organizerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                organizerButtonMouseReleased(evt);
            }
        });
        leagueOrganizerPanel.add(organizerButton, new java.awt.GridBagConstraints());

        newMessageButton.setText("Správy");
        leagueOrganizerPanel.add(newMessageButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(playerPanel, gridBagConstraints);

        adminPanel.setLayout(new java.awt.GridBagLayout());

        saveButton.setText("Uložiť");
        saveButton.setToolTipText("Uložiť aktuálny stav aplikácie do súboru");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        adminPanel.add(saveButton, gridBagConstraints);

        loadButton.setText("Načítať");
        loadButton.setToolTipText("Načítať posledne uložený stav aplikácie zo súboru");
        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loadButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        adminPanel.add(loadButton, gridBagConstraints);

        jLabel1.setText("Možnosti aplikácie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        adminPanel.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        jPanel1.add(adminPanel, gridBagConstraints);

        showPanel.setLayout(new java.awt.GridBagLayout());

        activeButton.setText("Aktívne");
        activeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                activeButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        showPanel.add(activeButton, gridBagConstraints);

        historyButton.setText("Odohrané");
        historyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                historyButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        showPanel.add(historyButton, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Zobrazenie:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        showPanel.add(jLabel2, gridBagConstraints);

        futureButton.setText("Naplánované");
        futureButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                futureButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        showPanel.add(futureButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(showPanel, gridBagConstraints);

        profilButton.setText("Profil");
        profilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                profilButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(profilButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

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
        setTable();
    }
    
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

    public void checkPlayerButtons(){
        leaveButton.setVisible(true);
        createTeamButton.setVisible(true);
        playerPanel.setVisible(true);
        manageTeamButton.setVisible(true);
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
            adminPanel.setVisible(false);
            leagueOrganizerPanel.setVisible(false);
            setTimeButton.setVisible(false);
            playerPanel.setVisible(false);
            activeButton.setVisible(false);
            
        if (this.loggedUser == null){  // Admin
            setTimeButton.setVisible(true);
            adminPanel.setVisible(true);
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
    
    private void leagueInfo(){
        if (leaguesTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Vyber ligu z tabuľky líg", "Problém s výberom", JOptionPane.WARNING_MESSAGE);
            logger.error("Trying to see more info without selected row");
            return;
        }
        LeagueInfoWindow leagueInfoWindow;
        if(this.mode == 0)
            leagueInfoWindow = new LeagueInfoWindow(lists.getActiveLeague(leaguesTable.getSelectedRow()));
        if(this.mode == 1)
            leagueInfoWindow = new LeagueInfoWindow(lists.getFutureLeague(leaguesTable.getSelectedRow()));
        if(this.mode == 2)
            leagueInfoWindow = new LeagueInfoWindow(lists.getPastLeague(leaguesTable.getSelectedRow()));
    }
    
    private void logoutButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseReleased
        logout();
    }//GEN-LAST:event_logoutButtonMouseReleased

    private void createLeagueButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLeagueButtonMouseReleased
        new AddLeagueWindow((LeagueOrganizer) loggedUser, lists).setVisible(true);
    }//GEN-LAST:event_createLeagueButtonMouseReleased

    private void createTeamButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTeamButtonMouseReleased
        new AddTeamWindow((Player) loggedUser, lists, this).setVisible(true);
    }//GEN-LAST:event_createTeamButtonMouseReleased

    private void manageTeamButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageTeamButtonMouseReleased
        new ManageTeamWindow((Player) loggedUser, lists, this).setVisible(true);
    }//GEN-LAST:event_manageTeamButtonMouseReleased

    private void loadButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadButtonMouseReleased
        try {
            (new Save()).load(this);
        } catch (IOException | ClassNotFoundException ex) {
            this.logger.error("Problem with loading from file! Error "+ex);
        }
    }//GEN-LAST:event_loadButtonMouseReleased

    private void saveButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseReleased
        try {
            (new Save()).save(lists, currentTime);
        } catch (IOException ex) {
            this.logger.error("Problem when trying to serialize! Error "+ex);
        }
    }//GEN-LAST:event_saveButtonMouseReleased

    private void leagueInfoButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leagueInfoButtonMouseReleased
        leagueInfo();
    }//GEN-LAST:event_leagueInfoButtonMouseReleased

    private void activeButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activeButtonMouseReleased
        this.mode = 0;
        activeButton.setVisible(false);
        historyButton.setVisible(true);
        futureButton.setVisible(true);
        leaguesLabel.setText("Aktívne ligy");
        setTable();
    }//GEN-LAST:event_activeButtonMouseReleased

    private void futureButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_futureButtonMouseReleased
        this.mode = 1;
        activeButton.setVisible(true);
        historyButton.setVisible(true);
        futureButton.setVisible(false);
        leaguesLabel.setText("Naplánované ligy");
        setTable();
    }//GEN-LAST:event_futureButtonMouseReleased

    private void historyButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyButtonMouseReleased
        this.mode = 2;
        activeButton.setVisible(true);
        historyButton.setVisible(false);
        futureButton.setVisible(true);
        leaguesLabel.setText("Odohrané ligy");
        setTable();
    }//GEN-LAST:event_historyButtonMouseReleased

    private void profileChanges(){
        
    }
    
    private void profilButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilButtonMouseReleased
        profileChanges();
    }//GEN-LAST:event_profilButtonMouseReleased

    private void organizerButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizerButtonMouseReleased
        new MatchWindow(this, lists, (LeagueOrganizer) loggedUser).setVisible(true);
    }//GEN-LAST:event_organizerButtonMouseReleased

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activeButton;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JButton createLeagueButton;
    private javax.swing.JButton createTeamButton;
    private javax.swing.JLabel currentTimeLabel;
    private javax.swing.JButton futureButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leagueInfoButton;
    private javax.swing.JPanel leagueOrganizerPanel;
    private javax.swing.JLabel leaguesLabel;
    private javax.swing.JScrollPane leaguesScrollPane;
    private javax.swing.JTable leaguesTable;
    private javax.swing.JButton leaveButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageTeamButton;
    private javax.swing.JButton newMessageButton;
    private javax.swing.JButton organizerButton;
    private javax.swing.JButton playerMessagesButton;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JButton profilButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton setTimeButton;
    private javax.swing.JPanel showPanel;
    private javax.swing.JLabel timeInfoLabel1;
    // End of variables declaration//GEN-END:variables
}
