package sk.stu.fiit.eaGeneration;

import java.util.ArrayList;


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
	private ArrayList<RequestLeagueCreation> requestLeagueCreationList;
	private ArrayList<LeagueCharacteristics> leagueCharacteristics;

	public LeagueOrganizer(){

	}
}//end LeagueOrganizer