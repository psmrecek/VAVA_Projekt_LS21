/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.gui.league;

import sk.stu.fiit.gui.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.Lists;
import sk.stu.fiit.user.LeagueOrganizer;

/**
 *
 * @author PeterSmrecek
 */
public class MatchWindow extends javax.swing.JFrame {

    /**
     * Creates new form Template
     */
    
    private final Logger logger = Logger.getLogger(MatchWindow.class.getName());
    private MainGui mainGui;
    private Lists lists;
    private LeagueOrganizer leagueOrganizer;
    
    public MatchWindow(MainGui mainGui, Lists lists, LeagueOrganizer leagueOrganizer) {
        initComponents();
        
        this.mainGui = mainGui;
        this.lists = lists;
        this.leagueOrganizer = leagueOrganizer;
        
        updateAll();
        
//        atributesCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "C++", "ABAP", "VBA", "Python", "Ruby", "iOS", "Iné" }));
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
        tableScroll = new javax.swing.JScrollPane();
        tableTbl = new javax.swing.JTable();
        titleLbl = new javax.swing.JLabel();
        imagePnl = new javax.swing.JPanel();
        imageLbl = new javax.swing.JLabel();
        controlsPnl = new javax.swing.JPanel();
        b1Btn = new javax.swing.JButton();
        b2Btn = new javax.swing.JButton();
        b3Btn = new javax.swing.JButton();
        b4Btn = new javax.swing.JButton();
        b5Btn = new javax.swing.JButton();
        b6Btn = new javax.swing.JButton();
        b7Btn = new javax.swing.JButton();
        b8Btn = new javax.swing.JButton();
        b9Btn = new javax.swing.JButton();
        infoPnl = new javax.swing.JPanel();
        l3Lbl = new javax.swing.JLabel();
        l6Lbl = new javax.swing.JLabel();
        l4Lbl = new javax.swing.JLabel();
        l7Lbl = new javax.swing.JLabel();
        tf6Tf = new javax.swing.JTextField();
        l9Lbl = new javax.swing.JLabel();
        rb2Rb = new javax.swing.JRadioButton();
        l1Lbl = new javax.swing.JLabel();
        tf7Tf = new javax.swing.JTextField();
        l8Lbl = new javax.swing.JLabel();
        tf5Tf = new javax.swing.JTextField();
        rb1Rb = new javax.swing.JRadioButton();
        tf2Tf = new javax.swing.JTextField();
        tf4Tf = new javax.swing.JTextField();
        tf1Tf = new javax.swing.JTextField();
        l5Lbl = new javax.swing.JLabel();
        tf3Tf = new javax.swing.JTextField();
        l2Lbl = new javax.swing.JLabel();
        cb1Cb = new javax.swing.JComboBox<>();
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

        java.awt.GridBagLayout mainPnlLayout = new java.awt.GridBagLayout();
        mainPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        mainPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        mainPnl.setLayout(mainPnlLayout);

        tableScroll.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[Názov tabuľky]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        tableScroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableScroll.setPreferredSize(new java.awt.Dimension(462, 200));

        tableTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "[Stĺpec 1]", "[Stĺpec 2]", "[Stĺpec 3]", "[Stĺpec 4]", "[Stĺpec 5]"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTbl.getTableHeader().setReorderingAllowed(false);
        tableScroll.setViewportView(tableTbl);
        if (tableTbl.getColumnModel().getColumnCount() > 0) {
            tableTbl.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(tableScroll, gridBagConstraints);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLbl.setText("[Nadpis]");
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
        imageLbl.setText("[Obrázok]");
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
        controlsPnl.setLayout(new javax.swing.BoxLayout(controlsPnl, javax.swing.BoxLayout.LINE_AXIS));

        b1Btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b1Btn.setText("[Tlačidlo 1]");
        b1Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b1BtnMouseReleased(evt);
            }
        });
        controlsPnl.add(b1Btn);

        b2Btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b2Btn.setText("[Tlačidlo 2]");
        b2Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b2BtnMouseReleased(evt);
            }
        });
        controlsPnl.add(b2Btn);

        b3Btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b3Btn.setText("[Tlačidlo 3]");
        b3Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b3BtnMouseReleased(evt);
            }
        });
        controlsPnl.add(b3Btn);

        b4Btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b4Btn.setText("[Tlačidlo 4]");
        b4Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b4BtnMouseReleased(evt);
            }
        });
        controlsPnl.add(b4Btn);

        b5Btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b5Btn.setText("[Tlačidlo 5]");
        b5Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b5BtnMouseReleased(evt);
            }
        });
        controlsPnl.add(b5Btn);

        b6Btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b6Btn.setText("[Tlačidlo 6]");
        b6Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b6BtnMouseReleased(evt);
            }
        });
        controlsPnl.add(b6Btn);

        b7Btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b7Btn.setText("[Tlačidlo 7]");
        b7Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b7BtnMouseReleased(evt);
            }
        });
        controlsPnl.add(b7Btn);

        b8Btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b8Btn.setText("[Tlačidlo 8]");
        b8Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b8BtnMouseReleased(evt);
            }
        });
        controlsPnl.add(b8Btn);

        b9Btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b9Btn.setText("[Tlačidlo 9]");
        b9Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b9BtnMouseReleased(evt);
            }
        });
        controlsPnl.add(b9Btn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.gridwidth = 7;
        mainPnl.add(controlsPnl, gridBagConstraints);

        infoPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informácie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        java.awt.GridBagLayout infoPnlLayout = new java.awt.GridBagLayout();
        infoPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        infoPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        infoPnl.setLayout(infoPnlLayout);

        l3Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l3Lbl.setText("[Popis 3]");
        l3Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l3Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        infoPnl.add(l3Lbl, gridBagConstraints);

        l6Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l6Lbl.setText("[Popis 6]");
        l6Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l6Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        infoPnl.add(l6Lbl, gridBagConstraints);

        l4Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l4Lbl.setText("[Popis 4]");
        l4Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l4Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        infoPnl.add(l4Lbl, gridBagConstraints);

        l7Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l7Lbl.setText("[Popis 7]");
        l7Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l7Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        infoPnl.add(l7Lbl, gridBagConstraints);

        tf6Tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf6Tf.setMinimumSize(new java.awt.Dimension(200, 26));
        tf6Tf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(tf6Tf, gridBagConstraints);

        l9Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l9Lbl.setText("[Popis 9]");
        l9Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l9Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        infoPnl.add(l9Lbl, gridBagConstraints);

        rb2Rb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb2Rb.setText("[Voľba 2]");
        rb2Rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2RbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        infoPnl.add(rb2Rb, gridBagConstraints);

        l1Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l1Lbl.setText("[Popis 1]");
        l1Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l1Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        infoPnl.add(l1Lbl, gridBagConstraints);

        tf7Tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf7Tf.setMinimumSize(new java.awt.Dimension(200, 26));
        tf7Tf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(tf7Tf, gridBagConstraints);

        l8Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l8Lbl.setText("[Popis 8]");
        l8Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l8Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        infoPnl.add(l8Lbl, gridBagConstraints);

        tf5Tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf5Tf.setMinimumSize(new java.awt.Dimension(200, 26));
        tf5Tf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(tf5Tf, gridBagConstraints);

        rb1Rb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb1Rb.setSelected(true);
        rb1Rb.setText("[Voľba 1]");
        rb1Rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1RbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        infoPnl.add(rb1Rb, gridBagConstraints);

        tf2Tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf2Tf.setMinimumSize(new java.awt.Dimension(200, 26));
        tf2Tf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(tf2Tf, gridBagConstraints);

        tf4Tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf4Tf.setMinimumSize(new java.awt.Dimension(200, 26));
        tf4Tf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(tf4Tf, gridBagConstraints);

        tf1Tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf1Tf.setMinimumSize(new java.awt.Dimension(200, 26));
        tf1Tf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(tf1Tf, gridBagConstraints);

        l5Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l5Lbl.setText("[Popis 5]");
        l5Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l5Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        infoPnl.add(l5Lbl, gridBagConstraints);

        tf3Tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf3Tf.setMinimumSize(new java.awt.Dimension(200, 26));
        tf3Tf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(tf3Tf, gridBagConstraints);

        l2Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l2Lbl.setText("[Popis 2]");
        l2Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l2Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        infoPnl.add(l2Lbl, gridBagConstraints);

        cb1Cb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb1Cb.setMinimumSize(new java.awt.Dimension(200, 26));
        cb1Cb.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(cb1Cb, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 17;
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
            .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void rb1RbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1RbActionPerformed
        // TODO add your handling code here:
        rb1Action();
    }//GEN-LAST:event_rb1RbActionPerformed

    private void rb2RbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2RbActionPerformed
        // TODO add your handling code here:
        rb2Action();
    }//GEN-LAST:event_rb2RbActionPerformed

    private void b1BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1BtnMouseReleased
        // TODO add your handling code here:
        btn1Action();
    }//GEN-LAST:event_b1BtnMouseReleased

    private void b2BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2BtnMouseReleased
        // TODO add your handling code here:
        btn2Action();
    }//GEN-LAST:event_b2BtnMouseReleased

    private void b3BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3BtnMouseReleased
        // TODO add your handling code here:
        btn3Action();
    }//GEN-LAST:event_b3BtnMouseReleased

    private void b4BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4BtnMouseReleased
        // TODO add your handling code here:
        btn4Action();
    }//GEN-LAST:event_b4BtnMouseReleased

    private void b5BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5BtnMouseReleased
        // TODO add your handling code here:
        btn5Action();
    }//GEN-LAST:event_b5BtnMouseReleased

    private void b6BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6BtnMouseReleased
        // TODO add your handling code here:
        btn6Action();
    }//GEN-LAST:event_b6BtnMouseReleased

    private void b7BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7BtnMouseReleased
        // TODO add your handling code here:
        btn7Action();
    }//GEN-LAST:event_b7BtnMouseReleased

    private void b8BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8BtnMouseReleased
        // TODO add your handling code here:
        btn8Action();
    }//GEN-LAST:event_b8BtnMouseReleased

    private void b9BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9BtnMouseReleased
        // TODO add your handling code here:
        btn9Action();
    }//GEN-LAST:event_b9BtnMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton b1Btn;
    private javax.swing.JButton b2Btn;
    private javax.swing.JButton b3Btn;
    private javax.swing.JButton b4Btn;
    private javax.swing.JButton b5Btn;
    private javax.swing.JButton b6Btn;
    private javax.swing.JButton b7Btn;
    private javax.swing.JButton b8Btn;
    private javax.swing.JButton b9Btn;
    private javax.swing.ButtonGroup bg1Bg;
    private javax.swing.JComboBox<String> cb1Cb;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JPanel controlsPnl;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JPanel imagePnl;
    private javax.swing.JPanel infoPnl;
    private javax.swing.JLabel l1Lbl;
    private javax.swing.JLabel l2Lbl;
    private javax.swing.JLabel l3Lbl;
    private javax.swing.JLabel l4Lbl;
    private javax.swing.JLabel l5Lbl;
    private javax.swing.JLabel l6Lbl;
    private javax.swing.JLabel l7Lbl;
    private javax.swing.JLabel l8Lbl;
    private javax.swing.JLabel l9Lbl;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JRadioButton rb1Rb;
    private javax.swing.JRadioButton rb2Rb;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JTable tableTbl;
    private javax.swing.JTextField tf1Tf;
    private javax.swing.JTextField tf2Tf;
    private javax.swing.JTextField tf3Tf;
    private javax.swing.JTextField tf4Tf;
    private javax.swing.JTextField tf5Tf;
    private javax.swing.JTextField tf6Tf;
    private javax.swing.JTextField tf7Tf;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
    
    private void updateAll(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void btn1Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void btn2Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void btn3Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void btn4Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void btn5Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void btn6Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void btn7Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void btn8Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void btn9Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void deleteRows(DefaultTableModel model) {
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
    }

    private void populateCustomersTbl(JTable table, ArrayList list) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        deleteRows(model);

        int numberOfColumns = table.getColumnCount();
        Object[] rowData = new Object[numberOfColumns];

        for (int i = 0; i < list.size(); i++) {

//            rowData[0] = list.get(i).getCustomer().getName();
//            rowData[1] = list.get(i).getRoom().getName();
//            rowData[2] = sdfRoom.format(start);
//            rowData[3] = sdfRoom.format(end);
//
//            if (end.after(compareDate)) {
//                rowData[4] = false;
//            } else {
//                rowData[4] = true;
//            }
            model.addRow(rowData);
        }
    }

    private void rb1Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void rb2Action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
