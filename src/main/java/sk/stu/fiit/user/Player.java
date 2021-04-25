/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.user;

import java.io.Serializable;
import java.util.Date;
import sk.stu.fiit.team.Team;


/**
 * <code>Player</code> extends {@link User} and represents players in 
 * our application. It stores information about their {@link Team}, alongside with
 * information, if player is administrator of the team.
 * 
 * @see User
 * @see Team
 */
public class Player extends User implements Serializable{
    private static final long serialVersionUID = 0;
    private boolean Admin;
    private Team team;
    
    public Player(String email, String name, String surrname, String nickname, String password, Date bornAt) {
        super(email, name, surrname, nickname, password, bornAt);
        this.Admin = false;
        this.team = null;
    }
    
    public boolean isAdmin(){
        return Admin;
    }

    public void setTeam(Team team) {  // null in case of deleting from team
        this.team = team;
    }

    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }

    public Team getTeam() {
        return team;
    }
    
    
}