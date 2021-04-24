package sk.stu.fiit.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.league.League;

/**
 * Zakladate� ligy, jej spr�vca, definuje z�kladn� charakteristiky, schva�uje
 * �iadosti a rie�i administrat�vu a z�pasy.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class LeagueOrganizer extends User implements Serializable{
    private static final long serialVersionUID = 0;
    private ArrayList<League> leagueList = new ArrayList<>();

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