/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.gui.user.message;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.Lists;
import sk.stu.fiit.league.League;
import sk.stu.fiit.team.Team;
import sk.stu.fiit.user.LeagueOrganizer;
import sk.stu.fiit.user.Player;
import sk.stu.fiit.user.User;
import sk.stu.fiit.user.message.Message;

/**
 * Class <code>NewMessageWindow</code> allows logged {@link User} to write new
 * messages to users they are allowed to. It shows up after choosing this option
 * in {@link MessageWindow}.
 * 
 * @see Message
 * @see MessageWindow
 */
public class NewMessageWindow extends javax.swing.JFrame {
    private final ArrayList<User> contacts = new ArrayList<>();
    private final ArrayList<String> description = new ArrayList<>();
    private final User user;
    private final Lists lists;
    private final MessageWindow messageWindow;
    
    public NewMessageWindow(User user, Lists lists, MessageWindow messageWindow){
        initComponents();
        this.user = user;
        this.lists = lists;
        this.messageWindow = messageWindow;
        updateAll();
    }
    
    
    private void adminContacts(){
        playerContacts();
        ArrayList<League> leagues = this.lists.getTeamLeagues(((Player)this.user).getTeam());
        
        for (League league : leagues){
            for(User OrgL : league.getLeagueOrganizerList()){
                this.contacts.add(OrgL);
                this.description.add(" (OrgL "+league.getName()+")");
            }
        }
        
    }
    
    private void playerContacts(){
        for(User teammate : ((Player)this.user).getTeam().getPlayersList()){
            this.contacts.add(teammate);
            this.description.add(" (Spoluhráč "+((Player)this.user).getTeam().getName()+")");
        }
    }
    
    private void organizerContacts(){
        for(League league : ((LeagueOrganizer)this.user).getLeagueList()){
            for(Team team : league.getTeamList()){
                for(Player player : team.getListAdmins()){
                    this.contacts.add(player);
                    this.description.add(" ("+team.getName()+")");
                }
            }
        }
    }
    
    private void updateAll(){
        if(this.user.getClass().getSimpleName().equals("Player")){
            if(((Player)this.user).getTeam() == null){
                this.setVisible(true);
                return;
            }
            if(((Player)this.user).isAdmin()){
                adminContacts();
            } else {
                playerContacts();
            }
        } else 
            organizerContacts();

        String[] con = new String[this.contacts.size()];
        
        for(int item = 0; item < this.contacts.size(); item++)
            con[item] = this.contacts.get(item).getName()+this.description.get(item);
            
        contactsList.setListData(con);

        this.setVisible(true);
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
        allToggleButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactsList = new javax.swing.JList<>();
        sendButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        headerTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        bodyTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Napísať správu");
        setResizable(false);

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        allToggleButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        allToggleButton.setText("Všetkým kontaktom");
        allToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                allToggleButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        jPanel1.add(allToggleButton, gridBagConstraints);

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setMinimumSize(new java.awt.Dimension(259, 131));

        contactsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        contactsList.setMaximumSize(new java.awt.Dimension(37, 90));
        contactsList.setMinimumSize(new java.awt.Dimension(37, 90));
        contactsList.setPreferredSize(new java.awt.Dimension(37, 90));
        jScrollPane1.setViewportView(contactsList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        sendButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sendButton.setText("Poslať");
        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sendButtonMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        jPanel1.add(sendButton, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Kontakty");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel1.add(jLabel1, gridBagConstraints);

        headerTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        headerTextField.setMinimumSize(new java.awt.Dimension(259, 28));
        headerTextField.setPreferredSize(new java.awt.Dimension(259, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(headerTextField, gridBagConstraints);

        jScrollPane3.setAutoscrolls(true);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(259, 131));
        jScrollPane3.setName(""); // NOI18N
        jScrollPane3.setPreferredSize(new java.awt.Dimension(259, 131));

        bodyTextArea.setColumns(20);
        bodyTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bodyTextArea.setLineWrap(true);
        bodyTextArea.setRows(5);
        bodyTextArea.setWrapStyleWord(true);
        bodyTextArea.setMinimumSize(new java.awt.Dimension(240, 100));
        jScrollPane3.setViewportView(bodyTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel1.add(jScrollPane3, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Predmet");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Text");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        jPanel1.add(jLabel3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allToggleButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allToggleButtonMouseReleased
        if(allToggleButton.isSelected())
            contactsList.setEnabled(false);
        else
            contactsList.setEnabled(true);
    }//GEN-LAST:event_allToggleButtonMouseReleased

    private void sendButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendButtonMouseReleased
       String head = headerTextField.getText().trim();
       String body = bodyTextArea.getText().trim();
       
       if(Boolean.logicalOr(head.isEmpty(), body.isEmpty())){
           JOptionPane.showMessageDialog(rootPane, "Je potrebné vyplniť predmet i telo správy", "Problém pri vypĺňaní správy" , JOptionPane.WARNING_MESSAGE);
           Logger.getLogger(this.getClass().getName()).error("Empty body or header in message from user "+this.user.getNickname());
           return;
       }
        
       Message message = new Message(head, body, this.user);
       if(allToggleButton.isSelected()){
           for (User receiver : contacts){
               receiver.addMessage(message);
           }
           Logger.getLogger(this.getClass().getName()).info("Message succesfully sent to whole list");
           JOptionPane.showMessageDialog(rootPane, "Správy úspešne odoslané");
           this.messageWindow.updateAll();
           this.dispose();
       } else {
            for(int index = 0; index < contacts.size(); index++){
            if(contactsList.isSelectedIndex(index)){
                contacts.get(index).addMessage(message);
                Logger.getLogger(this.getClass().getName()).info("Message succesfully sent to "+contacts.get(index).getNickname());
                JOptionPane.showMessageDialog(rootPane, "Správa úspešne odoslaná");
                this.messageWindow.updateAll();
                this.dispose();
                return;
            }     
        }
        JOptionPane.showMessageDialog(rootPane, "Vyber prijíemcu z tabuľky kontaktov!" , "Chyba pri výbere kontaktu" ,JOptionPane.WARNING_MESSAGE);
        Logger.getLogger(this.getClass().getName()).error("Receiver choice not done");
       }
    }//GEN-LAST:event_sendButtonMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton allToggleButton;
    private javax.swing.JTextArea bodyTextArea;
    private javax.swing.JList<String> contactsList;
    private javax.swing.JTextField headerTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
