/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.gui;

import java.text.ParseException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.InputProcessor;
import sk.stu.fiit.data.Lists;

/**
 *
 * @author schon
 */
public class RegistrationWindow extends javax.swing.JFrame {
    private final Lists lists;
    
    /**
     * Creates new form RegistrationGui
     * @param lists 
     */
    public RegistrationWindow(Lists lists){
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        registrationButton = new javax.swing.JButton();
        userTypeComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        surrnameLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        nickLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        repeatPasswordLabel = new javax.swing.JLabel();
        bornAtLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        checkPasswordField = new javax.swing.JPasswordField();
        nicknameTextField = new javax.swing.JTextField();
        surrnameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        dayComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        dayLabel = new javax.swing.JLabel();
        monthLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrácia");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        registrationButton.setText("Zaregistrovať");
        registrationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registrationButtonMouseReleased(evt);
            }
        });
        getContentPane().add(registrationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hráč", "Divák", "Organizátor ligy" }));
        getContentPane().add(userTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Registrujem sa ako");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 150, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setText("Meno:");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        surrnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        surrnameLabel.setText("Priezvisko:");
        getContentPane().add(surrnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        mailLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mailLabel.setText("Email:");
        getContentPane().add(mailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        nickLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nickLabel.setText("Nickname: ");
        getContentPane().add(nickLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setText("Heslo:");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        repeatPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        repeatPasswordLabel.setText("Zopakuj heslo:");
        getContentPane().add(repeatPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        bornAtLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bornAtLabel.setText("Dátum narodenia:");
        getContentPane().add(bornAtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 150, -1));
        getContentPane().add(checkPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 150, -1));
        getContentPane().add(nicknameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 150, -1));
        getContentPane().add(surrnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 150, -1));
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, -1));

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(dayComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(monthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));
        yearComboBox.setSelectedIndex(100);
        getContentPane().add(yearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        dayLabel.setText("Deň");
        getContentPane().add(dayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        monthLabel.setText("Mesiac");
        getContentPane().add(monthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        yearLabel.setText("Rok");
        getContentPane().add(yearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrationButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationButtonMouseReleased
        Logger logger = Logger.getLogger(RegistrationWindow.class.getName());
        try {
            String errorMessage =lists.addUser(String.valueOf(userTypeComboBox.getSelectedItem()),
                    emailTextField.getText().trim(), nameTextField.getText().trim(),
                    surrnameTextField.getText().trim(), nicknameTextField.getText().trim(),
                    String.valueOf(passwordField.getPassword()).trim(), String.valueOf(checkPasswordField.getPassword()).trim(),
                    InputProcessor.convertDate(String.valueOf(dayComboBox.getSelectedIndex()+1)+"."+
                            String.valueOf(monthComboBox.getSelectedIndex()+1)+"."+
                            String.valueOf(yearComboBox.getSelectedItem())));
                
            if (errorMessage.isEmpty()){
                logger.info("User registration succesful");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, errorMessage, "Chyba pri registracii", JOptionPane.WARNING_MESSAGE);
                logger.error("Wrong input in registration");
            }
            
        } catch (ParseException ex) {
            logger.error("Error with date parsing in user registration");
        }
    }//GEN-LAST:event_registrationButtonMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bornAtLabel;
    private javax.swing.JPasswordField checkPasswordField;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nickLabel;
    private javax.swing.JTextField nicknameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registrationButton;
    private javax.swing.JLabel repeatPasswordLabel;
    private javax.swing.JLabel surrnameLabel;
    private javax.swing.JTextField surrnameTextField;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JComboBox<String> yearComboBox;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
