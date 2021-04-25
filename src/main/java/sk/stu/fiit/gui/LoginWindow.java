/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import sk.stu.fiit.gui.user.RegistrationWindow;
import javax.swing.JOptionPane;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.Lists;
import sk.stu.fiit.data.TestInputs;
import sk.stu.fiit.user.*;


/**
 *
 * @author schon
 */
public class LoginWindow extends javax.swing.JFrame {
    private final Logger logger = Logger.getLogger(LoginWindow.class.getName());
    private Lists lists = new Lists();
    
    /**
     * Creates new form MainGui
     */
    public LoginWindow() {
        initComponents();
        initApplication();
    }
    
    private void initApplication(){
        BasicConfigurator.configure(); 
        lists = TestInputs.createInputs();
        
    }

    public void setLists(Lists lists) {
        this.lists = lists;
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

        loginPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        registrationButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        nicknameLabel = new javax.swing.JLabel();
        nicknameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        appLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        setTitle(bundle.getString("Esport ligy")); // NOI18N
        setMinimumSize(new java.awt.Dimension(937, 590));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        java.awt.GridBagLayout loginPanelLayout = new java.awt.GridBagLayout();
        loginPanelLayout.columnWidths = new int[] {0};
        loginPanelLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        loginPanel.setLayout(loginPanelLayout);

        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginButton.setText(bundle.getString("PRIHLÁSENIE")); // NOI18N
        loginButton.setPreferredSize(new java.awt.Dimension(150, 29));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        loginPanel.add(loginButton, gridBagConstraints);

        registrationButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registrationButton.setText(bundle.getString("REGISTRÁCIA")); // NOI18N
        registrationButton.setPreferredSize(new java.awt.Dimension(150, 29));
        registrationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registrationButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        loginPanel.add(registrationButton, gridBagConstraints);

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setText(bundle.getString("HESLO")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        loginPanel.add(passwordLabel, gridBagConstraints);

        nicknameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nicknameLabel.setText(bundle.getString("NICKNAME / EMAIL")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        loginPanel.add(nicknameLabel, gridBagConstraints);

        nicknameTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nicknameTextField.setPreferredSize(new java.awt.Dimension(150, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        loginPanel.add(nicknameTextField, gridBagConstraints);

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setPreferredSize(new java.awt.Dimension(150, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        loginPanel.add(passwordField, gridBagConstraints);

        appLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        appLabel.setText(bundle.getString("VSTUP DO APLIKÁCIE")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        loginPanel.add(appLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(loginPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registration(){ 
        RegistrationWindow registrationWindow = new RegistrationWindow(this.lists);
        registrationWindow.setVisible(true);
    }

    private void clear(){
        passwordField.setText(""); //NOI18N
        nicknameTextField.setText(""); //NOI18N
    }
    
    private void login(){
        String errorMessage = lists.login(nicknameTextField.getText().trim(), String.valueOf(passwordField.getPassword()).trim());
        if (errorMessage.equals("Admin")){ //NOI18N
            MainGui mainGui = new MainGui(this, "Admin", lists); //NOI18N
            logger.info("Admin login"); //NOI18N
            clear();
            return;
        }
       if (errorMessage.isEmpty()){
           User user = lists.getUser(nicknameTextField.getText().trim());
           MainGui mainGui = new MainGui(this, user, lists);
           logger.info("Login succesful"); //NOI18N
           clear();
       } else {
           JOptionPane.showMessageDialog(rootPane, errorMessage, java.util.ResourceBundle.getBundle("Bundle").getString("CHYBA PRI PRIHLASOVANÍ"), JOptionPane.WARNING_MESSAGE);
           logger.error("Login error"); //NOI18N
       }
    }
    
    private void registrationButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationButtonMouseReleased
        registration();
    }//GEN-LAST:event_registrationButtonMouseReleased

    private void loginButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseReleased
        login();
    }//GEN-LAST:event_loginButtonMouseReleased

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JTextField nicknameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registrationButton;
    // End of variables declaration//GEN-END:variables
}
