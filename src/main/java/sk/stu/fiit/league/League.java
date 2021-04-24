package sk.stu.fiit.league;

import java.io.Serializable;
import sk.stu.fiit.user.LeagueOrganizer;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import sk.stu.fiit.data.CurrentTime;
import sk.stu.fiit.data.InputProcessor;
import sk.stu.fiit.team.Team;


/**
 * Dlhodob� e�portov� s��a� t�mov, obsahuje v�hry, charakteristiky a inform�cie.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class League implements Serializable{

    private static final long serialVersionUID = 0;
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
    
    public String getStartDateString() {
        return InputProcessor.dateToString(startDate);
    }

    public String getEndDateString() {
        return InputProcessor.dateToString(endDate);
    }

    public int getMaxNumberTeams() {
        return maxNumberTeams;
    }
    
    public boolean addTeam(Team team){
        if (teamList.size() < maxNumberTeams) {
            teamList.add(team);
            return true;
        } else{
            return false;
        }
    }
    
    public int getCurrentTeamsInLeague(){
        return teamList.size();
    }
    
    public boolean isActive(){
        CurrentTime currentTime = CurrentTime.CurrentTime();
        return Boolean.logicalAnd(this.getStartDate().before(currentTime.getDateTime()), this.getEndDate().after(currentTime.getDateTime()));
    }

    public boolean isPast(){
        CurrentTime currentTime = CurrentTime.CurrentTime();
        return this.getEndDate().before(currentTime.getDateTime());
    }
    
    public boolean isFuture(){
         CurrentTime currentTime = CurrentTime.CurrentTime();
         return this.getStartDate().after(currentTime.getDateTime());
    }
    
    public String getGenre() {
        return genre;
    }

    public int getMinimalAge() {
        return minimalAge;
    }

    public int getNumberOfTeamsInMatch() {
        return numberOfTeamsInMatch;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Prize> getPrizeList() {
        return prizeList;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public ArrayList<LeagueOrganizer> getLeagueOrganizerList() {
        return leagueOrganizerList;
    }

    public ArrayList<Team> getTeamList() {
        return teamList;
    }

    public ArrayList<Match> getMatchList() {
        return matchList;
    }
    
    public boolean isTeamInLeague(Team team){
        return teamList.contains(team);
    }

    public void addMatch(Match match){
        this.matchList.add(match);
    }
    
    public boolean isBetween(Date date){
        if (date.after(startDate) && date.before(endDate)){
            return true;
        } else if (date.equals(startDate) || date.equals(endDate)) {
            return true;
        }
        
        return false;
    }
        
}