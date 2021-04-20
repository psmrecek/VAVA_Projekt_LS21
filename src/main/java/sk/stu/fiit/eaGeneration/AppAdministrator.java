package sk.stu.fiit.eaGEneration;

import java.util.ArrayList;


/**
 * Osoba poveren� spr�vou aplik�cie. Scha�ovate� �iadost� a superv�zor.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class AppAdministrator extends User {

	private String nickname;
	private ArrayList<RequestLeagueCreation> requestLeagueCreationList;
	private ArrayList<Team> teamList;
	private ArrayList<League> leagueList;

	public AppAdministrator(){

	}
}//end AppAdministrator