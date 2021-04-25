/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import java.awt.Window;
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
import sk.stu.fiit.gui.user.ProfileWindow;
import sk.stu.fiit.gui.user.message.MessageWindow;
import sk.stu.fiit.gui.league.MatchWindow;
import sk.stu.fiit.league.League;
import sk.stu.fiit.team.Team;
import sk.stu.fiit.user.*;
import sk.stu.fiit.user.message.Message;
import sk.stu.fiit.user.message.TeamInvitation;


/**
 * The main application window. Every logged in {@link User} gets to this window. 
 * Shows current time, {@link League} information, shows action options for user 
 * roles. Users can communicate with each other through {@link Message}s. 
 * {@link Team} members can send {@link TeamInvitation} to other {@link Player}s.
 * 
 * @see User
 * @see Player
 * @see LeagueOrganizer
 * @see Spectator
 * @see League
 * @see Message
 * @see TeamInvitation
 */

public class MainGui extends javax.swing.JFrame {
    private final Logger logger = Logger.getLogger(MainGui.class.getName());
    private Lists lists;
    private CurrentTime currentTime = CurrentTime.CurrentTime();
    private User loggedUser = null;
    private final LoginWindow loginWindow;
    private short mode = 0;
    
    public MainGui(LoginWindow loginWindow, User loggedUser, Lists lists) {
        this.lists = lists;
        initComponents();
        this.loggedUser = loggedUser;
        this.loginWindow = loginWindow;
        loginWindow.setVisible(false);
        
        nameLbl.setText(loggedUser.getName());
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
        this.loginWindow.setLists(this.lists);
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
        nameInfoLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        setTitle(bundle.getString("PRIHLÁSENÝ POUŽÍVATEĽ")); // NOI18N
        setMinimumSize(new java.awt.Dimension(937, 590));

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        timeInfoLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timeInfoLabel1.setForeground(new java.awt.Color(255, 153, 51));
        timeInfoLabel1.setText(bundle.getString("AKTUÁLNY ČAS:")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(timeInfoLabel1, gridBagConstraints);

        setTimeButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setTimeButton.setText(bundle.getString("NASTAV ČAS")); // NOI18N
        setTimeButton.setMinimumSize(new java.awt.Dimension(150, 30));
        setTimeButton.setPreferredSize(new java.awt.Dimension(150, 30));
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

        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutButton.setText(bundle.getString("ODHLÁSENIE")); // NOI18N
        logoutButton.setMinimumSize(new java.awt.Dimension(150, 30));
        logoutButton.setPreferredSize(new java.awt.Dimension(150, 30));
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
        leaguesLabel.setText(bundle.getString("AKTÍVNE LIGY")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPanel1.add(leaguesLabel, gridBagConstraints);

        leagueInfoButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        leagueInfoButton.setText(bundle.getString("VIAC INFORMÁCIÍ")); // NOI18N
        leagueInfoButton.setMinimumSize(new java.awt.Dimension(150, 30));
        leagueInfoButton.setPreferredSize(new java.awt.Dimension(150, 30));
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

        createLeagueButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createLeagueButton.setText(bundle.getString("VYTVORIŤ LIGU")); // NOI18N
        createLeagueButton.setMinimumSize(new java.awt.Dimension(150, 30));
        createLeagueButton.setPreferredSize(new java.awt.Dimension(150, 30));
        createLeagueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createLeagueButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        leagueOrganizerPanel.add(createLeagueButton, gridBagConstraints);

        organizerButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizerButton.setText(bundle.getString("MANAŽUJ ZÁPASY")); // NOI18N
        organizerButton.setMinimumSize(new java.awt.Dimension(150, 30));
        organizerButton.setPreferredSize(new java.awt.Dimension(150, 30));
        organizerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                organizerButtonMouseReleased(evt);
            }
        });
        leagueOrganizerPanel.add(organizerButton, new java.awt.GridBagConstraints());

        newMessageButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newMessageButton.setText(bundle.getString("SPRÁVY")); // NOI18N
        newMessageButton.setMinimumSize(new java.awt.Dimension(150, 30));
        newMessageButton.setPreferredSize(new java.awt.Dimension(150, 30));
        newMessageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newMessageButtonMouseReleased(evt);
            }
        });
        leagueOrganizerPanel.add(newMessageButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(leagueOrganizerPanel, gridBagConstraints);

        playerPanel.setLayout(new java.awt.GridBagLayout());

        createTeamButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createTeamButton.setText(bundle.getString("VYTVORIŤ TÍM")); // NOI18N
        createTeamButton.setMinimumSize(new java.awt.Dimension(150, 30));
        createTeamButton.setPreferredSize(new java.awt.Dimension(150, 30));
        createTeamButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createTeamButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        playerPanel.add(createTeamButton, gridBagConstraints);

        playerMessagesButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        playerMessagesButton.setText(bundle.getString("SPRÁVY")); // NOI18N
        playerMessagesButton.setMinimumSize(new java.awt.Dimension(150, 30));
        playerMessagesButton.setPreferredSize(new java.awt.Dimension(150, 30));
        playerMessagesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playerMessagesButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        playerPanel.add(playerMessagesButton, gridBagConstraints);

        manageTeamButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageTeamButton.setText(bundle.getString("SPRAVOVAŤ TÍM")); // NOI18N
        manageTeamButton.setMinimumSize(new java.awt.Dimension(150, 30));
        manageTeamButton.setPreferredSize(new java.awt.Dimension(150, 30));
        manageTeamButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                manageTeamButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        playerPanel.add(manageTeamButton, gridBagConstraints);

        leaveButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        leaveButton.setText(bundle.getString("ODÍSŤ Z TÍMU")); // NOI18N
        leaveButton.setMinimumSize(new java.awt.Dimension(150, 30));
        leaveButton.setPreferredSize(new java.awt.Dimension(150, 30));
        leaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                leaveButtonMouseReleased(evt);
            }
        });
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

        saveButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveButton.setText(bundle.getString("ULOŽIŤ")); // NOI18N
        saveButton.setToolTipText(bundle.getString("ULOŽIŤ AKTUÁLNY STAV APLIKÁCIE DO SÚBORU")); // NOI18N
        saveButton.setMinimumSize(new java.awt.Dimension(150, 30));
        saveButton.setPreferredSize(new java.awt.Dimension(150, 30));
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        adminPanel.add(saveButton, gridBagConstraints);

        loadButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loadButton.setText(bundle.getString("NAČÍTAŤ")); // NOI18N
        loadButton.setToolTipText(bundle.getString("NAČÍTAŤ POSLEDNE ULOŽENÝ STAV APLIKÁCIE ZO SÚBORU")); // NOI18N
        loadButton.setMinimumSize(new java.awt.Dimension(150, 30));
        loadButton.setPreferredSize(new java.awt.Dimension(150, 30));
        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loadButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        adminPanel.add(loadButton, gridBagConstraints);

        jLabel1.setText(bundle.getString("MOŽNOSTI APLIKÁCIE")); // NOI18N
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

        activeButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        activeButton.setText(bundle.getString("AKTÍVNE")); // NOI18N
        activeButton.setMinimumSize(new java.awt.Dimension(150, 30));
        activeButton.setPreferredSize(new java.awt.Dimension(150, 30));
        activeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                activeButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        showPanel.add(activeButton, gridBagConstraints);

        historyButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        historyButton.setText(bundle.getString("ODOHRANÉ")); // NOI18N
        historyButton.setMinimumSize(new java.awt.Dimension(150, 30));
        historyButton.setPreferredSize(new java.awt.Dimension(150, 30));
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
        jLabel2.setText(bundle.getString("ZOBRAZENIE:  ")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        showPanel.add(jLabel2, gridBagConstraints);

        futureButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        futureButton.setText(bundle.getString("NAPLÁNOVANÉ")); // NOI18N
        futureButton.setMinimumSize(new java.awt.Dimension(150, 30));
        futureButton.setPreferredSize(new java.awt.Dimension(150, 30));
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

        profilButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profilButton.setText(bundle.getString("PROFIL")); // NOI18N
        profilButton.setMinimumSize(new java.awt.Dimension(150, 30));
        profilButton.setPreferredSize(new java.awt.Dimension(150, 30));
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

        nameInfoLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameInfoLbl.setText(bundle.getString("PRIHLÁSENÝ POUŽÍVATEĽ: ")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(nameInfoLbl, gridBagConstraints);

        nameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLbl.setText(bundle.getString("ADMINISTRÁTOR APLIKÁCIE")); // NOI18N
        nameLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(nameLbl, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
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
            profilButton.setVisible(false);
            return;
        }
        
        if (this.loggedUser.getClass().getSimpleName().equals("Player")){ //NOI18N
            checkPlayerButtons();
        }
        
        if (this.loggedUser.getClass().getSimpleName().equals("LeagueOrganizer")){ //NOI18N
            leagueOrganizerPanel.setVisible(true);
        }
        
        if (this.loggedUser.getClass().getSimpleName().equals("Spectator")){ //NOI18N
            
        }
    }
   
    private void logout(){
        System.gc();
        for (Window window : Window.getWindows())
            window.dispose();
        
        this.loggedUser = null;
        //this.dispose();
        this.loginWindow.setVisible(true);
        
        logger.info("Logged out"); //NOI18N
    }
    
    private void leagueInfo(){
        if (leaguesTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("VYBER LIGU Z TABUĽKY LÍG"), java.util.ResourceBundle.getBundle("Bundle").getString("PROBLÉM S VÝBEROM"), JOptionPane.WARNING_MESSAGE);
            logger.error("Trying to see more info without selected row"); //NOI18N
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
            this.logger.error("Problem with loading from file! Error "+ex); //NOI18N
        }
    }//GEN-LAST:event_loadButtonMouseReleased

    private void saveButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseReleased
        try {
            (new Save()).save(lists, currentTime);
        } catch (IOException ex) {
            this.logger.error("Problem when trying to serialize! Error "+ex); //NOI18N
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
        leaguesLabel.setText(java.util.ResourceBundle.getBundle("Bundle").getString("AKTÍVNE LIGY"));
        setTable();
    }//GEN-LAST:event_activeButtonMouseReleased

    private void futureButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_futureButtonMouseReleased
        this.mode = 1;
        activeButton.setVisible(true);
        historyButton.setVisible(true);
        futureButton.setVisible(false);
        leaguesLabel.setText(java.util.ResourceBundle.getBundle("Bundle").getString("NAPLÁNOVANÉ LIGY"));
        setTable();
    }//GEN-LAST:event_futureButtonMouseReleased

    private void historyButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyButtonMouseReleased
        this.mode = 2;
        activeButton.setVisible(true);
        historyButton.setVisible(false);
        futureButton.setVisible(true);
        leaguesLabel.setText(java.util.ResourceBundle.getBundle("Bundle").getString("ODOHRANÉ LIGY"));
        setTable();
    }//GEN-LAST:event_historyButtonMouseReleased

    private void profileChanges(){
        ProfileWindow profileWindow = new ProfileWindow(this.loggedUser, lists);
    }
    
    private void profilButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilButtonMouseReleased
        profileChanges();
    }//GEN-LAST:event_profilButtonMouseReleased

    private void messages(){
        MessageWindow messageWindow = new MessageWindow(this.loggedUser, this.lists, this);
    }
    
    private void playerMessagesButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerMessagesButtonMouseReleased
        messages();
    }//GEN-LAST:event_playerMessagesButtonMouseReleased

    private void newMessageButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newMessageButtonMouseReleased
        messages();
    }//GEN-LAST:event_newMessageButtonMouseReleased

    private void organizerButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizerButtonMouseReleased
        new MatchWindow(this, lists, (LeagueOrganizer) loggedUser).setVisible(true);
    }//GEN-LAST:event_organizerButtonMouseReleased

    private void leaveButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveButtonMouseReleased
        leaveTeam();
    }//GEN-LAST:event_leaveButtonMouseReleased

    
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
    private javax.swing.JLabel nameInfoLbl;
    private javax.swing.JLabel nameLbl;
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

    private void leaveTeam() {
        Player loggedPlayer = (Player) loggedUser;
        Team playersTeam = loggedPlayer.getTeam();
        if (playersTeam != null) {
            if (playersTeam.removePlayer(loggedPlayer)) {
                JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("ÚSPEŠNE SI OPUSTIL TÍM"), java.util.ResourceBundle.getBundle("Bundle").getString("ODCHOD Z TÍMU"), JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("NEPODARILO SA OPUSTIŤ TÍM!\nADMINISTRÁTOR Z TÍMU NEMÔŽE ODÍSŤ.\nNAJSKÔR PRESUŇTE ADMINISTRÁTORSKÉ PRÁVA NA INÉHO HRÁČA!"), java.util.ResourceBundle.getBundle("Bundle").getString("ODCHOD Z TÍMU"), JOptionPane.ERROR_MESSAGE);
            }
        }
        checkPlayerButtons();
    }
}
