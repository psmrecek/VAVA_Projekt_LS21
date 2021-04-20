package sk.stu.fiit.user;

import java.util.ArrayList;
import sk.stu.fiit.league.Information;
import sk.stu.fiit.league.League;
import sk.stu.fiit.league.Match;

/**
 * �udia, ktor� sleduj� z�pasy, t�my, hr��ov...
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class Spectator {

	private String name;
	private ArrayList<League> leagueList;
	private ArrayList<Match> matchList;
	private ArrayList<Information> informationList;

	public Spectator(){

	}
}//end Spectator