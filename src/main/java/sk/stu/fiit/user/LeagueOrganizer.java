package sk.stu.fiit.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.league.League;
import sk.stu.fiit.team.TeamApplicationForLeague;

/**
 * Zakladate� ligy, jej spr�vca, definuje z�kladn� charakteristiky, schva�uje
 * �iadosti a rie�i administrat�vu a z�pasy.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class LeagueOrganizer extends User implements Serializable{
    private static final long serialVersionUID = 0;
    private ArrayList<League> leagueList = new ArrayList<>();
    private ArrayList<TeamApplicationForLeague> teamApplicationList = new ArrayList<>();

    public LeagueOrganizer(String email, String name, String surrname, String nickname, String password, Date bornAt) {
        super(email, name, surrname, nickname, password, bornAt);
    }
        
    public void addLeague(League league){
        leagueList.add(league);
    }

    public void addApplication(TeamApplicationForLeague tafl){
        teamApplicationList.add(tafl);
    }
	
}