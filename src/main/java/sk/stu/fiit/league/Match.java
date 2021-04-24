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
        private String winner;
        private String activeLink;

    public Match(Date date, String type, ArrayList<Team> teamList, String activeLink) {
        this.date = date;
        this.type = type;
        this.teamList = teamList;
        this.activeLink = activeLink;
        this.winner = "---";
        this.result = "---";
    }
            

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Date getDate() {
        return date;
    }

    public String getResult() {
        return result;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Team> getTeamList() {
        return teamList;
    }
    
        
        
        
}//end Match