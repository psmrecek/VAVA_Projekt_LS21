/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.CurrentTime;
import sk.stu.fiit.data.InputProcessor;
import sk.stu.fiit.data.Lists;
import sk.stu.fiit.league.League;
import sk.stu.fiit.league.Prize;
import sk.stu.fiit.team.Team;
import sk.stu.fiit.user.LeagueOrganizer;
import sk.stu.fiit.user.TeamAdministrator;

/**
 *
 * @author PeterSmrecek
 */
public class TeamWindow extends javax.swing.JFrame {

    /**
     * Creates new form Template
     */
    
    private final Logger logger = Logger.getLogger(TeamWindow.class.getName());
    final JFileChooser fc = new JFileChooser();
    
    private TeamAdministrator teamAdministrator;
    private Lists lists;
    private List<JTextField> tfInfoList;
    private ImageIcon icon;
    
    public TeamWindow(TeamAdministrator teamAdministrator, Lists lists) {
        initComponents();
        
        this.teamAdministrator = teamAdministrator;
        this.lists = lists;
        
        this.tfInfoList = Arrays.asList(nameTf, gameTf);
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
        createLeagueBtn = new javax.swing.JButton();
        addIconBtn = new javax.swing.JButton();
        infoPnl = new javax.swing.JPanel();
        l1Lbl = new javax.swing.JLabel();
        gameTf = new javax.swing.JTextField();
        nameTf = new javax.swing.JTextField();
        l2Lbl = new javax.swing.JLabel();
        l4Lbl = new javax.swing.JLabel();
        descriptionSp = new javax.swing.JScrollPane();
        descriptionTa = new javax.swing.JTextArea();
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
        setTitle("Vytvor tím");

        java.awt.GridBagLayout mainPnlLayout = new java.awt.GridBagLayout();
        mainPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        mainPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        mainPnl.setLayout(mainPnlLayout);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLbl.setText("Vytvorenie tímu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
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
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(imagePnl, gridBagConstraints);

        controlsPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ovládacie prvky", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        controlsPnl.setMinimumSize(new java.awt.Dimension(30, 57));
        controlsPnl.setPreferredSize(new java.awt.Dimension(30, 57));
        controlsPnl.setLayout(new javax.swing.BoxLayout(controlsPnl, javax.swing.BoxLayout.LINE_AXIS));

        createLeagueBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createLeagueBtn.setText("Vytvoriť tím");
        createLeagueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createLeagueBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(createLeagueBtn);

        addIconBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addIconBtn.setText("Zvoliť logo ligy");
        addIconBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addIconBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(addIconBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(controlsPnl, gridBagConstraints);

        infoPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informácie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        java.awt.GridBagLayout infoPnlLayout = new java.awt.GridBagLayout();
        infoPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
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

        gameTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gameTf.setMinimumSize(new java.awt.Dimension(200, 26));
        gameTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(gameTf, gridBagConstraints);

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

        l4Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l4Lbl.setText("Popis");
        l4Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l4Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        infoPnl.add(l4Lbl, gridBagConstraints);

        descriptionSp.setPreferredSize(new java.awt.Dimension(200, 240));
        descriptionSp.setRequestFocusEnabled(false);

        descriptionTa.setColumns(20);
        descriptionTa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descriptionTa.setLineWrap(true);
        descriptionTa.setRows(5);
        descriptionTa.setPreferredSize(new java.awt.Dimension(200, 104));
        descriptionSp.setViewportView(descriptionTa);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 11;
        infoPnl.add(descriptionSp, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(infoPnl, gridBagConstraints);

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
            .addComponent(mainPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
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

    private void createLeagueBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLeagueBtnMouseReleased
        // TODO add your handling code here:
        createLeagueAction();
    }//GEN-LAST:event_createLeagueBtnMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton addIconBtn;
    private javax.swing.ButtonGroup bg1Bg;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JPanel controlsPnl;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JButton createLeagueBtn;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JScrollPane descriptionSp;
    private javax.swing.JTextArea descriptionTa;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JTextField gameTf;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JPanel imagePnl;
    private javax.swing.JPanel infoPnl;
    private javax.swing.JLabel l1Lbl;
    private javax.swing.JLabel l2Lbl;
    private javax.swing.JLabel l4Lbl;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField nameTf;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel titleLbl;
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
    
    private void createLeagueAction() {
        String description = descriptionTa.getText();
        if (isEmptyField(tfInfoList) || description.isEmpty()) {
            errorMessage("Žiadne pole Informácií nesmie zostať prázdne!");
            return;
        }
        
        String nameString = nameTf.getText();
        String mottoString = gameTf.getText();
        
        if (icon == null) {
            errorMessage("Logo tímu nesmie zostať prázdne!");
            return;
        }
        
        Team team = new Team(nameString, description, mottoString, teamAdministrator);
        
        lists.addTeam(team);
        
        this.dispose();
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
}
