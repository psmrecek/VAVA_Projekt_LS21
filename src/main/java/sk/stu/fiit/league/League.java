package sk.stu.fiit.league;

import java.io.Serializable;
import sk.stu.fiit.user.LeagueOrganizer;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;
import sk.stu.fiit.data.CurrentTime;
import sk.stu.fiit.data.InputProcessor;
import sk.stu.fiit.gui.league.LeagueInfoWindow;
import sk.stu.fiit.team.Team;


/**
 * Class <code>League</code> represent a group of teams playing a sport who take
 * part in competitions between each other.
 * The league has entered basic information, such as start and end date, name, 
 * genre, maximum number of teams in the league, number of teams in the match, 
 * logo and description. Each league has its {@link LeagueInfoWindow}, a list of participating 
 * {@link Team}s, list of {@link Match}es that will take place and a list of 
 * {@link Prize}s for the best teams.
 * 
 * @see LeagueOrganizer
 * @see Team
 * @see Match
 * @see Prize
 */
public class League implements Serializable{

    private static final long serialVersionUID = 0;
    private final String name;
    private final String game;
    private final String genre;
    private final Date startDate;
    private final Date endDate;
    private final int recommendedAge;
    private final int maxNumberTeams;
    private final int numberOfTeamsInMatch;
    private final String description;
    private final ArrayList<Prize> prizeList;
    private final ImageIcon icon;

    private final ArrayList<LeagueOrganizer> leagueOrganizerList = new ArrayList<>();
    private final ArrayList<Team> teamList = new ArrayList<>();
    private final ArrayList<Match> matchList = new ArrayList<>();
    private transient final Logger logger = Logger.getLogger(this.getClass().getName());

    public League(String name, String game, String genre, Date startDate, Date endDate, int minimalAge, int maxNumberTeams, int numberOfTeamsInMatch, String description, LeagueOrganizer leagueOrganizer, ArrayList<Prize> prizeList, ImageIcon icon) {
        this.name = name;
        this.game = game;
        this.genre = genre;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recommendedAge = minimalAge;
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
            logger.info("Team " + team.getName()+ " added to the league " + this.getName());
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

    public int getRecommendedAge() {
        return recommendedAge;
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