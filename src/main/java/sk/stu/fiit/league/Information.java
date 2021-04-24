package sk.stu.fiit.league;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * S�bor d�t ur�en�ch na zverejnenie.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class Information implements Serializable{

        private static final long serialVersionUID = 0;
	private ArrayList<League> leagueList;
	private ArrayList<Match> matchList;

	public Information(){

	}
}//end Information