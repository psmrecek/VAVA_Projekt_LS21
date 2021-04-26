/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.team;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.Lists;
import sk.stu.fiit.user.Player;


/**
 * Class <code>Team</code> represents a group of players participating
 * in a league. Each team has its own name, description, motto and logo.
 * The founding member, {@link Player} of the team is the administrator. An 
 * administrator can promote players to administrators. The administrator 
 * can remove players, cancel a team or join a league. 
 * 
 * @see Player
 */
public class Team implements Serializable{

    private static final long serialVersionUID = 0;
    private String name;
    private String description;
    private String motto;
    private ImageIcon icon;
    private ArrayList<Player> playersList = new ArrayList<>();
    private transient final Logger logger = Logger.getLogger(this.getClass().getName());

    public Team(String name, String description, String motto, Player player, ImageIcon icon) {
        this.name = name;
        this.description = description;
        this.motto = motto;
        this.playersList.add(player);
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
        player.setTeam(this);
        logger.info("Player "+player.getNickname()+" added to the team "+this.getName());
    }
    
    public ArrayList<Player> getListAdmins(){
        ArrayList<Player> adminList = new ArrayList<>();
        
        for (Player player : playersList) {
            if (player.isAdmin()) {
                adminList.add(player);
            }
        }
        
        return adminList;
    }
        
    public boolean removePlayer(Player player){
        if (player.isAdmin()) {
            return false;
        } else{
            playersList.remove(player);
            logger.info("Player " + player.getNickname() + " removed from the team " + this.getName());
            player.setTeam(null);
            player.setAdmin(false);
            return true;
        }
    }
    
    public void deleteTeam(Lists lists){
        for (Player player : playersList) {
            player.setTeam(null);
            player.setAdmin(false);
        }
        playersList.clear();
        logger.info("Canceled team " + this.getName());
        lists.removeTeam(this);
    }
}