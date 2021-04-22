package sk.stu.fiit.league;

import sk.stu.fiit.user.LeagueOrganizer;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import sk.stu.fiit.team.Team;


/**
 * Dlhodob� e�portov� s��a� t�mov, obsahuje v�hry, charakteristiky a inform�cie.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class League {
        
    private String name;
    private String game;
    private String genre;
    private Date startDate;
    private Date endDate;
    private int minimalAge;
    private int maxNumberTeams;
    private int numberOfTeamsInMatch;
    private String description;
    private ArrayList<Prize> prizeList;
    private ImageIcon icon;

    private ArrayList<LeagueOrganizer> leagueOrganizerList = new ArrayList<>();
    private ArrayList<Team> teamList = new ArrayList<>();
    private ArrayList<Match> matchList = new ArrayList<>();

    public League(String name, String game, String genre, Date startDate, Date endDate, int minimalAge, int maxNumberTeams, int numberOfTeamsInMatch, String description, LeagueOrganizer leagueOrganizer, ArrayList<Prize> prizeList, ImageIcon icon) {
        this.name = name;
        this.game = game;
        this.genre = genre;
        this.startDate = startDate;
        this.endDate = endDate;
        this.minimalAge = minimalAge;
        this.maxNumberTeams = maxNumberTeams;
        this.numberOfTeamsInMatch = numberOfTeamsInMatch;
        this.description = description;
        this.leagueOrganizerList.add(leagueOrganizer);
        this.prizeList = prizeList;
        this.icon = icon;
        addToLeagueOrganizer(leagueOrganizer);
    }
    
    private void addToLeagueOrganizer(LeagueOrganizer leagueOrganizer){
        leagueOrganizer.addLeague(this);
    }

    public String getName() {
        return name;
    }

    public String getGame() {
        return game;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getMaxNumberTeams() {
        return maxNumberTeams;
    }
    


        
}//end League