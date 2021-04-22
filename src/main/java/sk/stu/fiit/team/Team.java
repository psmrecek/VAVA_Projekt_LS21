package sk.stu.fiit.team;

import sk.stu.fiit.user.TeamAdministrator;
import sk.stu.fiit.user.Player;
import java.util.ArrayList;


/**
 * Skupina hr��ov vystupuj�ca ako jeden s��a�n� celok.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class Team {

	private String description;
	private String name;
	private ArrayList<TeamAdministrator> adminList;
	private ArrayList<Player> playersList;

	public Team(){

	}
}//end Team