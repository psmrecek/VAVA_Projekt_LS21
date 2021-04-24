package sk.stu.fiit.team;

import sk.stu.fiit.user.Player;
import java.util.ArrayList;
import javax.swing.ImageIcon;


/**
 * Skupina hr��ov vystupuj�ca ako jeden s��a�n� celok.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class Team {

    private String name;
    private String description;
    private String motto;
    private ImageIcon icon;
    private ArrayList<Player> adminList = new ArrayList<>();
    private ArrayList<Player> playersList = new ArrayList<>();

    public Team(String name, String description, String motto, Player player, ImageIcon icon) {
        this.name = name;
        this.description = description;
        this.motto = motto;
        this.adminList.add(player);
        this.icon = icon;
        addToPlayer(player);
    }

    private void addToPlayer(Player player){
        player.setTeam(this);
        player.setAdmin(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public ArrayList<Player> getAdminList() {
        return adminList;
    }

    public void setAdminList(ArrayList<Player> adminList) {
        this.adminList = adminList;
    }

    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(ArrayList<Player> playersList) {
        this.playersList = playersList;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    
    public void addPlayer(Player player){
        playersList.add(player);
    }
        
}