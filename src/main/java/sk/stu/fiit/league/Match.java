package sk.stu.fiit.league;

import java.io.Serializable;
import sk.stu.fiit.team.Team;
import java.util.ArrayList;
import java.util.Date;

/**
 * S��a�n� tretnutie t�mov, ktor� vy�sti v rozdelenie bodov pod�a poradia.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class Match implements Serializable{

        private static final long serialVersionUID = 0;
	private Date date;
	private String result;
	private String type;
	private ArrayList<Team> teamList;

	public Match(){

	}
}//end Match