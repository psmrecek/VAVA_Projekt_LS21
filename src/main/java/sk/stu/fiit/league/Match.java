package sk.stu.fiit.league;

import java.io.Serializable;
import sk.stu.fiit.team.Team;
import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.data.InputProcessor;

/**
 * <code>Match</code> is used for match simulation between {@link Team}s
 * It provides all of the important information about the match and it's result.
 * 
 * @see Team
 */
public class Match implements Serializable{

        private static final long serialVersionUID = 0;
	private final Date date;
	private String result;
	private final String type;
	private final ArrayList<Team> teamList;
        private String winner;
        private final String activeLink;

    public Match(Date date, String type, ArrayList<Team> teamList, String activeLink) {
        this.date = date;
        this.type = type;
        this.teamList = teamList;
        this.activeLink = activeLink;
        this.winner = "---";
        this.result = "---";
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getActiveLink() {
        return activeLink;
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
    
    public String getDateString() {
        return InputProcessor.dateToString(date);
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

    public String getTeamsListString() {
        ArrayList<String> names = new ArrayList<>();
        
        for (Team team : teamList) {
            names.add(team.getName());
        }
        return String.join(", ", names);
    }
    
}