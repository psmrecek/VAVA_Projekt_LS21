package sk.stu.fiit.user;

import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.league.League;
import sk.stu.fiit.team.Team;


/**
 * Osoba poveren� spr�vou aplik�cie. Scha�ovate� �iadost� a superv�zor.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class AppAdministrator extends User{
	private ArrayList<Team> teamList;
	private ArrayList<League> leagueList;


    public AppAdministrator(String email, String name, String surrname, String nickname, String password, Date bornAt) {
        super(email, name, surrname, nickname, password, bornAt);
    }

	
}//end AppAdministrator