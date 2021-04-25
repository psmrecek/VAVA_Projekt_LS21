/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.gui.league;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
import sk.stu.fiit.user.LeagueOrganizer;

/**
 *
 * @author PeterSmrecek
 */
public class AddLeagueWindow extends javax.swing.JFrame {

    /**
     * Creates new form Template
     */
    
    private final Logger logger = Logger.getLogger(AddLeagueWindow.class.getName());
    final JFileChooser fc = new JFileChooser();
    
    private final LeagueOrganizer leagueOrganizer;
    private final Lists lists;
    private final List<JTextField> tfInfoList;
    private final List<JTextField> tfPrizeList;
    private final ArrayList<Prize> prizeList = new ArrayList<>();
    private ImageIcon icon;
    
    public AddLeagueWindow(LeagueOrganizer leagueOrganizer, Lists lists) {
        initComponents();
        
        this.leagueOrganizer = leagueOrganizer;
        this.lists = lists;
        
        this.tfInfoList = Arrays.asList(nameTf, gameTf, genreTf, dateStartTf, dateEndTf, ageRestrictionTf, maxTeamsTf, teamsInMatchTf);
        this.tfPrizeList = Arrays.asList(positionTf, prizeNameTf, prizeDescriptionTf, priceTf);
        
        updateAll();
        
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
        createLeagueBtn = new javax.swing.JButton();
        addPrizeBtn = new javax.swing.JButton();
        removePrizeBtn = new javax.swing.JButton();
        addIconBtn = new javax.swing.JButton();
        infoPnl = new javax.swing.JPanel();
        l3Lbl = new javax.swing.JLabel();
        l6Lbl = new javax.swing.JLabel();
        dateEndTf = new javax.swing.JTextField();
        l9Lbl = new javax.swing.JLabel();
        l1Lbl = new javax.swing.JLabel();
        maxTeamsTf = new javax.swing.JTextField();
        l8Lbl = new javax.swing.JLabel();
        dateStartTf = new javax.swing.JTextField();
        gameTf = new javax.swing.JTextField();
        nameTf = new javax.swing.JTextField();
        l5Lbl = new javax.swing.JLabel();
        genreTf = new javax.swing.JTextField();
        l2Lbl = new javax.swing.JLabel();
        teamsInMatchTf = new javax.swing.JTextField();
        ageRestrictionTf = new javax.swing.JTextField();
        l7Lbl = new javax.swing.JLabel();
        prizesPnl = new javax.swing.JPanel();
        l1Lbl1 = new javax.swing.JLabel();
        positionTf = new javax.swing.JTextField();
        prizeNameTf = new javax.swing.JTextField();
        l2Lbl1 = new javax.swing.JLabel();
        l3Lbl1 = new javax.swing.JLabel();
        prizeDescriptionTf = new javax.swing.JTextField();
        priceTf = new javax.swing.JTextField();
        l4Lbl1 = new javax.swing.JLabel();
        descriptionPnl = new javax.swing.JPanel();
        l4Lbl = new javax.swing.JLabel();
        descriptionSp = new javax.swing.JScrollPane();
        descriptionTa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vytvor ligu");

        java.awt.GridBagLayout mainPnlLayout = new java.awt.GridBagLayout();
        mainPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        mainPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        mainPnl.setLayout(mainPnlLayout);

        tableScroll.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Výhry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        tableScroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tableTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Umiestnenie", "Názov výhry", "Popis", "Finančná hodnota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTbl.getTableHeader().setReorderingAllowed(false);
        tableScroll.setViewportView(tableTbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(tableScroll, gridBagConstraints);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLbl.setText("Vytvorenie ligy");
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
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(imagePnl, gridBagConstraints);

        controlsPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ovládacie prvky", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        controlsPnl.setLayout(new javax.swing.BoxLayout(controlsPnl, javax.swing.BoxLayout.LINE_AXIS));

        createLeagueBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createLeagueBtn.setText("Vytvoriť ligu");
        createLeagueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createLeagueBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(createLeagueBtn);

        addPrizeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addPrizeBtn.setText("Pridať výhru");
        addPrizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addPrizeBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(addPrizeBtn);

        removePrizeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        removePrizeBtn.setText("Odobrať výhru");
        removePrizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                removePrizeBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(removePrizeBtn);

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
        gridBagConstraints.gridy = 30;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(controlsPnl, gridBagConstraints);

        infoPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informácie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        java.awt.GridBagLayout infoPnlLayout = new java.awt.GridBagLayout();
        infoPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        infoPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        infoPnl.setLayout(infoPnlLayout);

        l3Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l3Lbl.setText("Žáner");
        l3Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l3Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        infoPnl.add(l3Lbl, gridBagConstraints);

        l6Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l6Lbl.setText("Dátum ukončenia");
        l6Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l6Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        infoPnl.add(l6Lbl, gridBagConstraints);

        dateEndTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateEndTf.setMinimumSize(new java.awt.Dimension(200, 26));
        dateEndTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(dateEndTf, gridBagConstraints);

        l9Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l9Lbl.setText("Počet tímov v zápase");
        l9Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l9Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        infoPnl.add(l9Lbl, gridBagConstraints);

        l1Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l1Lbl.setText("Názov ligy");
        l1Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l1Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        infoPnl.add(l1Lbl, gridBagConstraints);

        maxTeamsTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        maxTeamsTf.setMinimumSize(new java.awt.Dimension(200, 26));
        maxTeamsTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(maxTeamsTf, gridBagConstraints);

        l8Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l8Lbl.setText("Maximálny počet tímov");
        l8Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l8Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        infoPnl.add(l8Lbl, gridBagConstraints);

        dateStartTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateStartTf.setMinimumSize(new java.awt.Dimension(200, 26));
        dateStartTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(dateStartTf, gridBagConstraints);

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

        l5Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l5Lbl.setText("Dátum začiatku");
        l5Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l5Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        infoPnl.add(l5Lbl, gridBagConstraints);

        genreTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genreTf.setMinimumSize(new java.awt.Dimension(200, 26));
        genreTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(genreTf, gridBagConstraints);

        l2Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l2Lbl.setText("Hra");
        l2Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l2Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        infoPnl.add(l2Lbl, gridBagConstraints);

        teamsInMatchTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teamsInMatchTf.setMinimumSize(new java.awt.Dimension(200, 26));
        teamsInMatchTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(teamsInMatchTf, gridBagConstraints);

        ageRestrictionTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageRestrictionTf.setMinimumSize(new java.awt.Dimension(200, 26));
        ageRestrictionTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(ageRestrictionTf, gridBagConstraints);

        l7Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l7Lbl.setText("Vekové obmedzenie");
        l7Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l7Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        infoPnl.add(l7Lbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(infoPnl, gridBagConstraints);

        prizesPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Výhry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        java.awt.GridBagLayout prizesPnlLayout = new java.awt.GridBagLayout();
        prizesPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        prizesPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        prizesPnl.setLayout(prizesPnlLayout);

        l1Lbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l1Lbl1.setText("Umiestnenie");
        l1Lbl1.setMinimumSize(new java.awt.Dimension(200, 26));
        l1Lbl1.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        prizesPnl.add(l1Lbl1, gridBagConstraints);

        positionTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        positionTf.setMinimumSize(new java.awt.Dimension(200, 26));
        positionTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        prizesPnl.add(positionTf, gridBagConstraints);

        prizeNameTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prizeNameTf.setMinimumSize(new java.awt.Dimension(200, 26));
        prizeNameTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        prizesPnl.add(prizeNameTf, gridBagConstraints);

        l2Lbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l2Lbl1.setText("Názov výhry");
        l2Lbl1.setMinimumSize(new java.awt.Dimension(200, 26));
        l2Lbl1.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        prizesPnl.add(l2Lbl1, gridBagConstraints);

        l3Lbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l3Lbl1.setText("Popis");
        l3Lbl1.setMinimumSize(new java.awt.Dimension(200, 26));
        l3Lbl1.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        prizesPnl.add(l3Lbl1, gridBagConstraints);

        prizeDescriptionTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prizeDescriptionTf.setMinimumSize(new java.awt.Dimension(200, 26));
        prizeDescriptionTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        prizesPnl.add(prizeDescriptionTf, gridBagConstraints);

        priceTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priceTf.setMinimumSize(new java.awt.Dimension(200, 26));
        priceTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 9;
        prizesPnl.add(priceTf, gridBagConstraints);

        l4Lbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l4Lbl1.setText("Finančná hodnota");
        l4Lbl1.setMinimumSize(new java.awt.Dimension(200, 26));
        l4Lbl1.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        prizesPnl.add(l4Lbl1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(prizesPnl, gridBagConstraints);

        descriptionPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Popis ligy", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        descriptionPnl.setMinimumSize(new java.awt.Dimension(230, 77));
        java.awt.GridBagLayout descriptionPnlLayout = new java.awt.GridBagLayout();
        descriptionPnlLayout.columnWidths = new int[] {0};
        descriptionPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        descriptionPnl.setLayout(descriptionPnlLayout);

        l4Lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l4Lbl.setText("Popis");
        l4Lbl.setMinimumSize(new java.awt.Dimension(200, 26));
        l4Lbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        descriptionPnl.add(l4Lbl, gridBagConstraints);

        descriptionSp.setPreferredSize(new java.awt.Dimension(100, 240));
        descriptionSp.setRequestFocusEnabled(false);

        descriptionTa.setColumns(20);
        descriptionTa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descriptionTa.setLineWrap(true);
        descriptionTa.setRows(5);
        descriptionTa.setWrapStyleWord(true);
        descriptionSp.setViewportView(descriptionTa);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        descriptionPnl.add(descriptionSp, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        mainPnl.add(descriptionPnl, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPrizeBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPrizeBtnMouseReleased
        addPrizeAction();
    }//GEN-LAST:event_addPrizeBtnMouseReleased

    private void removePrizeBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removePrizeBtnMouseReleased
        removePrizeAction();
    }//GEN-LAST:event_removePrizeBtnMouseReleased

    private void addIconBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addIconBtnMouseReleased
        addIconAction();
    }//GEN-LAST:event_addIconBtnMouseReleased

    private void createLeagueBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLeagueBtnMouseReleased
        createLeagueAction();
    }//GEN-LAST:event_createLeagueBtnMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addIconBtn;
    private javax.swing.JButton addPrizeBtn;
    private javax.swing.JTextField ageRestrictionTf;
    private javax.swing.ButtonGroup bg1Bg;
    private javax.swing.JPanel controlsPnl;
    private javax.swing.JButton createLeagueBtn;
    private javax.swing.JTextField dateEndTf;
    private javax.swing.JTextField dateStartTf;
    private javax.swing.JPanel descriptionPnl;
    private javax.swing.JScrollPane descriptionSp;
    private javax.swing.JTextArea descriptionTa;
    private javax.swing.JTextField gameTf;
    private javax.swing.JTextField genreTf;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JPanel imagePnl;
    private javax.swing.JPanel infoPnl;
    private javax.swing.JLabel l1Lbl;
    private javax.swing.JLabel l1Lbl1;
    private javax.swing.JLabel l2Lbl;
    private javax.swing.JLabel l2Lbl1;
    private javax.swing.JLabel l3Lbl;
    private javax.swing.JLabel l3Lbl1;
    private javax.swing.JLabel l4Lbl;
    private javax.swing.JLabel l4Lbl1;
    private javax.swing.JLabel l5Lbl;
    private javax.swing.JLabel l6Lbl;
    private javax.swing.JLabel l7Lbl;
    private javax.swing.JLabel l8Lbl;
    private javax.swing.JLabel l9Lbl;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JTextField maxTeamsTf;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField positionTf;
    private javax.swing.JTextField priceTf;
    private javax.swing.JTextField prizeDescriptionTf;
    private javax.swing.JTextField prizeNameTf;
    private javax.swing.JPanel prizesPnl;
    private javax.swing.JButton removePrizeBtn;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JTable tableTbl;
    private javax.swing.JTextField teamsInMatchTf;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
    
    private void updateAll(){
        populatePrizesTbl();
    }
    
    private void addPrizeAction() {
        if (isEmptyField(tfPrizeList)) {
            errorMessage("Žiadne pole Výhier nesmie zostať prázdne!");
            return;
        }
        
        String name = prizeNameTf.getText();
        String description = prizeDescriptionTf.getText();
        String positionString = positionTf.getText();
        String priceString = priceTf.getText(); 
        
        int position;
        double price;
        
        try {
            price = InputProcessor.priceFromString(priceString);
        } catch (Exception e) {
            errorMessage("Nie je zadaná platná finančná hodnota!");
            return;
        }
        
        try {
            position = InputProcessor.positiveIntFromString(positionString);
        } catch (Exception e) {
            errorMessage("Nie je zadaná platná pozícia!");
            return;
        }
        
        prizeList.add(new Prize(name, description, position, price));
        updateAll();
        clearPrizeTf();
    }
    
    private void removePrizeAction() {
        int prizteTableIndex = getRow(tableTbl, "Nie je vybraná žiadna výhra z tabuľky!");
        if (prizteTableIndex == -1) {
            return;
        }
        
        prizeList.remove(prizteTableIndex);
        updateAll();
    }
    
    private void addIconAction() {
        int returnVal = fc.showOpenDialog(this);

        File file;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        } else {
            errorMessage("Nie je vybraný žiaden súbor!");
            return;
        }

        try {
            BufferedImage img = ImageIO.read(file);
            icon = InputProcessor.resize(img, 280);
        } catch (IOException e) {
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
        String gameString = gameTf.getText();
        String genreString = genreTf.getText();
        String startDateString = dateStartTf.getText();
        String endDateString = dateEndTf.getText();
        String minimalAgeString = ageRestrictionTf.getText();
        String maxTeamsString = maxTeamsTf.getText();
        String teamsInMatchString = teamsInMatchTf.getText();
       
        Date startDate;
        Date endDate;
        try {
            startDate = InputProcessor.convertDate(startDateString);
            endDate = InputProcessor.convertDate(endDateString);
        } catch (ParseException ex) {
            errorMessage("Zadaný nesprávny formát dátumu!");
            return;
        }
        
        Date current = CurrentTime.CurrentTime().getDateTime();
        if (!InputProcessor.validDateRange(current, startDate, endDate)) {
            errorMessage("Zadaný dátum musí byť neskorší ako súčasný dátum a dátum ukončenia musí byť neskorší ako dátum začiatku!");
            return;
        }
        
        int minimalAge;
        int maxTeams;
        int teamsInMatch;
        
        try {
            minimalAge = InputProcessor.positiveIntFromString(minimalAgeString);
            maxTeams = InputProcessor.positiveIntFromString(maxTeamsString);
            teamsInMatch = InputProcessor.positiveIntFromString(teamsInMatchString);
        } catch (Exception e) {
            errorMessage("V informáciách môžu byť zadané iba celé kladné čísla!");
            return;
        }
        
        if (prizeList.isEmpty()) {
            errorMessage("Liga musí obsahovať aspoň jednu výhru!");
            return;
        }
        
        if (icon == null) {
            errorMessage("Logo ligy nesmie zostať prázdne!");
            return;
        }
        
        League league = new League(nameString, gameString, genreString, startDate, endDate, minimalAge, maxTeams, teamsInMatch, description, this.leagueOrganizer, prizeList, icon);
        
        lists.addLeague(league);
        this.dispose();
    }
    
    private int getRow(JTable table, String message) {
        int index = table.getSelectedRow();

        if (InputProcessor.isPositiveInt(index)) {
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

    private void populatePrizesTbl() {
        DefaultTableModel model = (DefaultTableModel) tableTbl.getModel();
        deleteRows(model);

        int numberOfColumns = tableTbl.getColumnCount();
        Object[] rowData = new Object[numberOfColumns];

        for (int i = 0; i < prizeList.size(); i++) {

            rowData[0] = prizeList.get(i).getPosition();
            rowData[1] = prizeList.get(i).getName();
            rowData[2] = prizeList.get(i).getDescription();
            rowData[3] = Double.toString(prizeList.get(i).getPrice());

            model.addRow(rowData);
        }
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
    
    private void clearPrizeTf(){
        tfPrizeList.forEach(jTextField -> {
            jTextField.setText("");
        });
    }
}
