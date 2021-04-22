package sk.stu.fiit.user;

import java.util.ArrayList;
import java.util.Date;
import sk.stu.fiit.team.Team;
import sk.stu.fiit.team.TeamApplicationForLeague;

/**
 * Spr�vca t�mu, ktor� je z�rove� jeho �lenom. Rie�i administrat�vu t�mu.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class TeamAdministrator extends Player {

    private ArrayList<TeamApplicationForLeague> teamApplicationList = new ArrayList<>();
    private ArrayList<Team> teamList = new ArrayList<>();

    public TeamAdministrator(String email, String name, String surname, String nickname, String password, Date bornAt) {
        super(email, name, surname, nickname, password, bornAt);
    }
    
    public void addTeam(Team team){
        teamList.add(team);
    }
    
    public void addApplication(TeamApplicationForLeague tafl){
        teamApplicationList.add(tafl);
    }

        
}