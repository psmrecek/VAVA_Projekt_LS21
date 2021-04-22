package sk.stu.fiit.team;

import sk.stu.fiit.user.TeamAdministrator;
import sk.stu.fiit.user.Player;
import java.util.ArrayList;


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
    private ArrayList<Player> adminList = new ArrayList<>();
    private ArrayList<Player> playersList = new ArrayList<>();

    public Team(String name, String description, String motto, Player player) {
        this.name = name;
        this.description = description;
        this.motto = motto;
        this.adminList.add(player);
        
        player.setTeam(this);
    }

    
        
}//end Team