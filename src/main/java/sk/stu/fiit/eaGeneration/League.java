package sk.stu.fiit.eaGeneration;

import java.util.ArrayList;


/**
 * Dlhodob� e�portov� s��a� t�mov, obsahuje v�hry, charakteristiky a inform�cie.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class League {

	private String description;
	private String name;
	private ArrayList<Team> teamList;
	private ArrayList<Match> matchList;
	private LeagueCharacteristics leagueCharacteristics;
	private ArrayList<Prize> prizeList;
	private ArrayList<LeagueOrganizer> leagueOrganizerList;

	public League(){

	}
}//end League