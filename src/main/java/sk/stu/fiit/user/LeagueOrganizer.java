/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.league.League;

/**
 * <code>LeagueOrganizer</code> extends {@link User}.
 * It stores information about possible team organizers,
 * {@link League} they organize.
 * 
 * @see User
 * @see League
 */
public class LeagueOrganizer extends User implements Serializable{
    private static final long serialVersionUID = 0;
    private final ArrayList<League> leagueList = new ArrayList<>();

    public LeagueOrganizer(String email, String name, String surrname, String nickname, String password, Date bornAt) {
        super(email, name, surrname, nickname, password, bornAt);
    }
        
    public void addLeague(League league){
        leagueList.add(league);
    }


    public ArrayList<League> getLeagueList() {
        return leagueList;
    }
    
}