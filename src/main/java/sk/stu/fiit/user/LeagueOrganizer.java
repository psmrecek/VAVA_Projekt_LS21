package sk.stu.fiit.user;

import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.league.League;
import sk.stu.fiit.league.LeagueCharacteristics;
import sk.stu.fiit.team.TeamApplicationForLeague;

/**
 * Zakladate� ligy, jej spr�vca, definuje z�kladn� charakteristiky, schva�uje
 * �iadosti a rie�i administrat�vu a z�pasy.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class LeagueOrganizer extends User {

	private String nickname;
	private ArrayList<League> leagueList;
	private ArrayList<TeamApplicationForLeague> teamApplicationList;
	private ArrayList<LeagueCharacteristics> leagueCharacteristics;

    public LeagueOrganizer(String email, String name, String surrname, String nickname, String password, Date bornAt) {
        super(email, name, surrname, nickname, password, bornAt);
    }
        
        
	
}