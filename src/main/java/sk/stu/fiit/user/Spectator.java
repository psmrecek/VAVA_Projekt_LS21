package sk.stu.fiit.user;

import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.league.Information;
import sk.stu.fiit.league.League;
import sk.stu.fiit.league.Match;

/**
 * �udia, ktor� sleduj� z�pasy, t�my, hr��ov...
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class Spectator extends User{
	private String name;
	private ArrayList<League> leagueList;
	private ArrayList<Match> matchList;
	private ArrayList<Information> informationList;

	
    public Spectator(String email, String name, String surrname, String nickname, String password, Date bornAt) {
        super(email, name, surrname, nickname, password, bornAt);
    }
}//end Spectator