/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.gui.team;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.InputProcessor;
import sk.stu.fiit.data.Lists;
import sk.stu.fiit.gui.MainGui;
import sk.stu.fiit.league.League;
import sk.stu.fiit.team.Team;
import sk.stu.fiit.user.Player;
import sk.stu.fiit.user.User;

/**
 *
 * @author PeterSmrecek
 */
public class ManageTeamWindow extends javax.swing.JFrame {

    /**
     * Creates new form Template
     */
    
    private final Logger logger = Logger.getLogger(ManageTeamWindow.class.getName());
    final JFileChooser fc = new JFileChooser();
    
    private Player admin;
    private Team team;
    private MainGui mainGui;
    private Lists lists;
    private List<JTextField> tfInfoList;
    private ImageIcon icon;
    
    public ManageTeamWindow(Player admin, Lists lists, MainGui mainGui) {
        initComponents();
        
        this.admin = admin;
        this.lists = lists;
        this.mainGui = mainGui;
        this.team = admin.getTeam();
        
        this.tfInfoList = Arrays.asList(nameTf, mottoTf);
        
        updateAll();
        
        // Hotovo
        // Zmenit motto
        // Zmenit nazov
        // Zmenit logo
        
        // Urobit
        // Posielat pozvanky hracom
        // Vyhadzovat hracov
        // Urobit z hraca administratora
        // Rozpustit tim
        // Poslat ziadost do ligy

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

        bg1Bg = new javax.swing.ButtonGroup();
        mainPnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        imagePnl = new javax.swing.JPanel();
        imageLbl = new javax.swing.JLabel();
        controlsPnl = new javax.swing.JPanel();
        addAdminBtn = new javax.swing.JButton();
        removeAdminBtn = new javax.swing.JButton();
        removePlayerBtn = new javax.swing.JButton();
        deleteTeamBtn = new javax.swing.JButton();
        newPlayersBtn = new javax.swing.JButton();
        leagueBtn = new javax.swing.JButton();
        infoPnl = new javax.swing.JPanel();
        l1Lbl = new javax.swing.JLabel();
        mottoTf = new javax.swing.JTextField();
        nameTf = new javax.swing.JTextField();
        l2Lbl = new javax.swing.JLabel();
        descriptionSp = new javax.swing.JScrollPane();
        descriptionTa = new javax.swing.JTextArea();
        l4Lbl1 = new javax.swing.JLabel();
        enableEdit = new javax.swing.JCheckBox();
        addIconBtn = new javax.swing.JButton();
        updateTeamBtn = new javax.swing.JButton();
        playersScroll = new javax.swing.JScrollPane();
        playersTbl = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manažovanie tímu");

        java.awt.GridBagLayout mainPnlLayout = new java.awt.GridBagLayout();
        mainPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        mainPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        mainPnl.setLayout(mainPnlLayout);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLbl.setText("Manažovanie tímu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipady = 20;
        mainPnl.add(titleLbl, gridBagConstraints);

        imagePnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Obrázok", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        imagePnl.setLayout(new java.awt.GridBagLayout());

        imageLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        imageLbl.setMinimumSize(new java.awt.Dimension(280, 280));
        imageLbl.setPreferredSize(new java.awt.Dimension(280, 280));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        imagePnl.add(imageLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(imagePnl, gridBagConstraints);

        controlsPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ovládacie prvky", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        controlsPnl.setMaximumSize(new java.awt.Dimension(256, 200));
        controlsPnl.setMinimumSize(new java.awt.Dimension(22, 80));
        controlsPnl.setPreferredSize(new java.awt.Dimension(22, 80));
        controlsPnl.setLayout(new javax.swing.BoxLayout(controlsPnl, javax.swing.BoxLayout.LINE_AXIS));

        addAdminBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addAdminBtn.setText("Urobiť administrátorom");
        addAdminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addAdminBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(addAdminBtn);

        removeAdminBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        removeAdminBtn.setText("Odobrať administrátorské práva");
        removeAdminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                removeAdminBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(removeAdminBtn);

        removePlayerBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        removePlayerBtn.setText("Odobrať hráča z tímu");
        removePlayerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                removePlayerBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(removePlayerBtn);

        deleteTeamBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteTeamBtn.setText("Rozpustiť tím");
        deleteTeamBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteTeamBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(deleteTeamBtn);

        newPlayersBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newPlayersBtn.setText("Nábor hráčov");
        newPlayersBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newPlayersBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(newPlayersBtn);

        leagueBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        leagueBtn.setText("Prihlásiť do ligy");
        leagueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                leagueBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(leagueBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        mainPnl.add(controlsPnl, gridBagConstraints);

        infoPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informácie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        infoPnl.setMinimumSize(new java.awt.Dimension(420, 320));
        infoPnl.setPreferredSize(new java.awt.Dimension(430, 300));
        java.awt.GridBagLayout infoPnlLayout = new java.awt.GridBagLayout();
        infoPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        infoPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        infoPnl.setLayout(infoPnlLayout);

        l1Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l1Lbl.setText("Názov tímu");
        l1Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l1Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        infoPnl.add(l1Lbl, gridBagConstraints);

        mottoTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mottoTf.setMinimumSize(new java.awt.Dimension(200, 26));
        mottoTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(mottoTf, gridBagConstraints);

        nameTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameTf.setMinimumSize(new java.awt.Dimension(200, 26));
        nameTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(nameTf, gridBagConstraints);

        l2Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l2Lbl.setText("Motto");
        l2Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l2Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        infoPnl.add(l2Lbl, gridBagConstraints);

        descriptionSp.setMinimumSize(new java.awt.Dimension(200, 240));
        descriptionSp.setPreferredSize(new java.awt.Dimension(200, 240));
        descriptionSp.setRequestFocusEnabled(false);

        descriptionTa.setColumns(20);
        descriptionTa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descriptionTa.setLineWrap(true);
        descriptionTa.setRows(5);
        descriptionSp.setViewportView(descriptionTa);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        infoPnl.add(descriptionSp, gridBagConstraints);

        l4Lbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l4Lbl1.setText("Popis");
        l4Lbl1.setMinimumSize(new java.awt.Dimension(200, 26));
        l4Lbl1.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        infoPnl.add(l4Lbl1, gridBagConstraints);

        enableEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enableEdit.setText("Povoliť úpravy");
        enableEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableEditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        infoPnl.add(enableEdit, gridBagConstraints);

        addIconBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addIconBtn.setText("Zmeniť logo tímu");
        addIconBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addIconBtnMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        infoPnl.add(addIconBtn, gridBagConstraints);

        updateTeamBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updateTeamBtn.setText("Uložiť úpravy tímu");
        updateTeamBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateTeamBtnMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        infoPnl.add(updateTeamBtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(infoPnl, gridBagConstraints);

        playersScroll.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hráči", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        playersScroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        playersScroll.setPreferredSize(new java.awt.Dimension(350, 428));

        playersTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        playersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Číslo", "Administrátor", "Meno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        playersTbl.getTableHeader().setReorderingAllowed(false);
        playersScroll.setViewportView(playersTbl);
        if (playersTbl.getColumnModel().getColumnCount() > 0) {
            playersTbl.getColumnModel().getColumn(0).setMaxWidth(100);
            playersTbl.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(playersScroll, gridBagConstraints);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Súbor");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Otvoriť");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Uložiť");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Uložiť ako");
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Skončiť");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Upraviť");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Vystrihnúť");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Kopírovať");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Prilepiť");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Vymazať");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Pomocník");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Obsah");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("O aplikácií");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 1203, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void addIconBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addIconBtnMouseReleased
        // TODO add your handling code here:
        addIconAction();
    }//GEN-LAST:event_addIconBtnMouseReleased

    private void updateTeamBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateTeamBtnMouseReleased
        // TODO add your handling code here:
        editTeamAction();
    }//GEN-LAST:event_updateTeamBtnMouseReleased

    private void enableEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableEditActionPerformed
        // TODO add your handling code here:
        setEditableInfo(enableEdit.isSelected());
    }//GEN-LAST:event_enableEditActionPerformed

    private void addAdminBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAdminBtnMouseReleased
        // TODO add your handling code here:
        addAdminAction();
    }//GEN-LAST:event_addAdminBtnMouseReleased

    private void removeAdminBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeAdminBtnMouseReleased
        // TODO add your handling code here:
        removeAdminAction();
    }//GEN-LAST:event_removeAdminBtnMouseReleased

    private void removePlayerBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removePlayerBtnMouseReleased
        // TODO add your handling code here:
        removePlayerAction();
    }//GEN-LAST:event_removePlayerBtnMouseReleased

    private void deleteTeamBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTeamBtnMouseReleased
        // TODO add your handling code here:
        deleteTeamAction();
    }//GEN-LAST:event_deleteTeamBtnMouseReleased

    private void newPlayersBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPlayersBtnMouseReleased
        // TODO add your handling code here:
        newPlayersAction();
    }//GEN-LAST:event_newPlayersBtnMouseReleased

    private void leagueBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leagueBtnMouseReleased
        // TODO add your handling code here:
        leagueAction();
    }//GEN-LAST:event_leagueBtnMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton addAdminBtn;
    private javax.swing.JButton addIconBtn;
    private javax.swing.ButtonGroup bg1Bg;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JPanel controlsPnl;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JButton deleteTeamBtn;
    private javax.swing.JScrollPane descriptionSp;
    private javax.swing.JTextArea descriptionTa;
    private javax.swing.JMenu editMenu;
    private javax.swing.JCheckBox enableEdit;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JPanel imagePnl;
    private javax.swing.JPanel infoPnl;
    private javax.swing.JLabel l1Lbl;
    private javax.swing.JLabel l2Lbl;
    private javax.swing.JLabel l4Lbl1;
    private javax.swing.JButton leagueBtn;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField mottoTf;
    private javax.swing.JTextField nameTf;
    private javax.swing.JButton newPlayersBtn;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JScrollPane playersScroll;
    private javax.swing.JTable playersTbl;
    private javax.swing.JButton removeAdminBtn;
    private javax.swing.JButton removePlayerBtn;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton updateTeamBtn;
    // End of variables declaration//GEN-END:variables

    private void addIconAction() {
        int returnVal = fc.showOpenDialog(this);

        File file = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        } else {
            errorMessage("Nie je vybraný žiaden súbor!");
            return;
        }

        try {
            BufferedImage img = ImageIO.read(file);
            icon = InputProcessor.resize(img, 280);
        } catch (Exception e) {
            errorMessage("Vybraný súbor nie je možné použiť ako logo!");
            logger.warn("Wrong image selected");
            return;
        }
        
        imageLbl.setIcon(icon);
    }
    
    private void editTeamAction() {
        String description = descriptionTa.getText();
        if (isEmptyField(tfInfoList) || description.isEmpty()) {
            errorMessage("Žiadne pole Informácií nesmie zostať prázdne!");
            return;
        }
        
        String nameString = nameTf.getText();
        String mottoString = mottoTf.getText();
        
        if (icon == null) {
            errorMessage("Logo tímu nesmie zostať prázdne!");
            return;
        }
        
        team.setName(nameString);
        team.setMotto(mottoString);
        team.setDescription(description);
        team.setIcon(icon);
        
        updateAll();
        mainGui.checkPlayerButtons();
    }
    
    private boolean isEmptyField(List<JTextField> list){
        for (int i = 0; i < list.size(); i++) {
            JTextField get = list.get(i);
            if (get.getText().isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    private void errorMessage(String message){
        JOptionPane.showMessageDialog(rootPane, message,
                "Chyba!", JOptionPane.ERROR_MESSAGE);
    }
    
    private void setEditableInfo(boolean bool){
        for (JTextField jTextField : tfInfoList) {
            jTextField.setEditable(bool);
        }
        
        descriptionTa.setEditable(bool);
        addIconBtn.setVisible(bool);
        updateTeamBtn.setVisible(bool);
    }

    private void updateAll() {
        enableEdit.setSelected(false);
        
        setEditableInfo(false);
        
        nameTf.setText(team.getName());
        mottoTf.setText(team.getMotto());
        descriptionTa.setText(team.getDescription());
        icon = team.getIcon();
        imageLbl.setIcon(icon);
        
        populatePlayersTbl();
    }
    
    private int getRow(JTable table, String message) {
        int index = table.getSelectedRow();

        if (index >= 0) {
            return index;
        } else {
            errorMessage(message);
        }
        return -1;
    }

    private void deleteRows(DefaultTableModel model) {
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
    }

    private void populatePlayersTbl() {
        DefaultTableModel model = (DefaultTableModel) playersTbl.getModel();
        deleteRows(model);

        int numberOfColumns = playersTbl.getColumnCount();
        Object[] rowData = new Object[numberOfColumns];
        ArrayList<Player> list = team.getPlayersList();
        
        for (int i = 0; i < list.size(); i++) {

            rowData[0] = i + 1;
            rowData[1] = list.get(i).isAdmin();
            rowData[2] = list.get(i).getNickname();
            model.addRow(rowData);
        }
    }
    
    private Player getSelectedPlayer(){
        int playerTableIndex = getRow(playersTbl, "Nie je vybraný žiaden hráč z tabuľky!");
        if (playerTableIndex == -1) {
            return null;
        }
        
        return team.getPlayersList().get(playerTableIndex);
    }

    private void addAdminAction() {
        Player player = getSelectedPlayer();
        if (player != null) {
            player.setAdmin(true);
            updateAll();
        }
    }

    private void removeAdminAction() {
        Player player = getSelectedPlayer();
        if (player != null) {
            ArrayList<Player> adminList = team.getListAdmins();
            if (adminList.contains(player)) {
                if (adminList.size() > 1) {
                    player.setAdmin(false);
                } else{
                    errorMessage("V tíme musí zostať aspoň jeden administrátor!");
                }
            } else{
                errorMessage("Zvolený hráč nie je administrátor!");
            }
            updateAll();
        }
    }

    private void removePlayerAction() {
        Player player = getSelectedPlayer();
        if (player != null) {
            if (team.removePlayer(player)) {
                updateAll();
            } else{
                errorMessage("Z tímu nie je možné odobrať administrátora.\nNajskôr hráčovi odoberte práva administrátora a potom ho odoberte z tímu!");
            }
        }
    }

    private void deleteTeamAction() {
        int option = JOptionPane.showConfirmDialog(rootPane, "Naozaj si prajete rozpustiť tím?", "Potvrdenie rozpustenia tímu", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (option == JOptionPane.OK_OPTION) {
            System.out.println("Teraz");
        }
        
    }

    private void newPlayersAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void leagueAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
