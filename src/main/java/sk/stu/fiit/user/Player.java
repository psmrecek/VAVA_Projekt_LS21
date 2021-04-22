package sk.stu.fiit.user;

import java.util.Date;
import sk.stu.fiit.team.Team;


/**
 * Osoba, ktor� sa z��ast�uje hier, zap�ja sa do t�mov a cez t�my sa zap�ja do l�g
 * a z�pasov.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class Player extends User {
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