/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.gui.user;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.Lists;
import sk.stu.fiit.user.User;

/**
 *
 * @author PeterSmrecek
 */
public class ProfileWindow extends javax.swing.JFrame {
    private final User user;
    private final Lists lists;

    /**
     * Creates new form Template
     */
    
    private final Logger logger = Logger.getLogger(ProfileWindow.class.getName());
    
    public ProfileWindow(User user, Lists lists) {
        initComponents();
        this.user = user;
        this.lists = lists;
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
        titleLbl = new javax.swing.JLabel();
        controlsPnl = new javax.swing.JPanel();
        changeBtn = new javax.swing.JButton();
        infoPnl = new javax.swing.JPanel();
        emailLbl = new javax.swing.JLabel();
        nickLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nickTf = new javax.swing.JTextField();
        surrnameTf = new javax.swing.JTextField();
        name1Tf = new javax.swing.JTextField();
        emailTf = new javax.swing.JTextField();
        surrnameLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profil");

        mainPnl.setMinimumSize(new java.awt.Dimension(885, 478));
        mainPnl.setPreferredSize(new java.awt.Dimension(885, 478));
        java.awt.GridBagLayout mainPnlLayout = new java.awt.GridBagLayout();
        mainPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        mainPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        mainPnl.setLayout(mainPnlLayout);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLbl.setText("Osobné údaje");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipady = 20;
        mainPnl.add(titleLbl, gridBagConstraints);

        controlsPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Potvrdenie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        controlsPnl.setLayout(new javax.swing.BoxLayout(controlsPnl, javax.swing.BoxLayout.LINE_AXIS));

        changeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeBtn.setText("Potvrdiť zmenu údajov");
        changeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                changeBtnMouseReleased(evt);
            }
        });
        controlsPnl.add(changeBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 7;
        mainPnl.add(controlsPnl, gridBagConstraints);

        infoPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zmena údajov", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        java.awt.GridBagLayout infoPnlLayout = new java.awt.GridBagLayout();
        infoPnlLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        infoPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        infoPnl.setLayout(infoPnlLayout);

        emailLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLbl.setText("Email");
        emailLbl.setMinimumSize(new java.awt.Dimension(200, 26));
        emailLbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        infoPnl.add(emailLbl, gridBagConstraints);

        nickLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nickLbl.setText("Nickname");
        nickLbl.setMinimumSize(new java.awt.Dimension(200, 26));
        nickLbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        infoPnl.add(nickLbl, gridBagConstraints);

        nameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLbl.setText("Krstné meno");
        nameLbl.setMinimumSize(new java.awt.Dimension(200, 26));
        nameLbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        infoPnl.add(nameLbl, gridBagConstraints);

        nickTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nickTf.setMinimumSize(new java.awt.Dimension(200, 26));
        nickTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(nickTf, gridBagConstraints);

        surrnameTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        surrnameTf.setMinimumSize(new java.awt.Dimension(200, 26));
        surrnameTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(surrnameTf, gridBagConstraints);

        name1Tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name1Tf.setMinimumSize(new java.awt.Dimension(200, 26));
        name1Tf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(name1Tf, gridBagConstraints);

        emailTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailTf.setMinimumSize(new java.awt.Dimension(200, 26));
        emailTf.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        infoPnl.add(emailTf, gridBagConstraints);

        surrnameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        surrnameLbl.setText("Priezvisko");
        surrnameLbl.setMinimumSize(new java.awt.Dimension(200, 26));
        surrnameLbl.setPreferredSize(new java.awt.Dimension(200, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        infoPnl.add(surrnameLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 17;
        mainPnl.add(infoPnl, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeBtnMouseReleased
        changeAction();
    }//GEN-LAST:event_changeBtnMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg1Bg;
    private javax.swing.JButton changeBtn;
    private javax.swing.JPanel controlsPnl;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTf;
    private javax.swing.JPanel infoPnl;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JTextField name1Tf;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel nickLbl;
    private javax.swing.JTextField nickTf;
    private javax.swing.JLabel surrnameLbl;
    private javax.swing.JTextField surrnameTf;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
    
    private void updateAll(){
        name1Tf.setText(this.user.getName());
        surrnameTf.setText(this.user.getSurrname());
        emailTf.setText(this.user.getEmail());
        nickTf.setText(this.user.getNickname());
        this.setVisible(true);
    }
    
    private void changeAction() {
        String errorMessage = lists.changeUser(user, name1Tf.getText().trim(), surrnameTf.getText().trim(), emailTf.getText().trim(), nickTf.getText().trim(),
                !emailTf.getText().trim().equals(this.user.getEmail()), !nickTf.getText().trim().equals(this.user.getNickname()));
        
        if(!errorMessage.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, errorMessage, "Chyba pri menení parametrov používateľa", JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(this.getClass().getName()).error("Error while changing parameters of user");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Zmena údajov prebehla úspešne");
            this.dispose();
        }
        
        
    }


}
