/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import sk.stu.fiit.league.League;
import sk.stu.fiit.team.Team;
import sk.stu.fiit.user.LeagueOrganizer;
import sk.stu.fiit.user.Player;
import sk.stu.fiit.user.Spectator;
import sk.stu.fiit.user.*;

/**
Class <code>Lists</code> serves as class storing all information given
 * from GUI. Stores Arrays of registered {@link User}s. 
 * Also checks if given inputs are valid when creating classes. 
 * 
 * @see User
 */
public class Lists implements Serializable{
    private static final long serialVersionUID = 0;
    private final ArrayList<User> users = new ArrayList<>();
    private final ArrayList<League> leagues = new ArrayList<>();
    private final ArrayList<Team> teams = new ArrayList<>();
    
    private String checkEmpty(String field, String type){
        if(field.isEmpty())
            return type+" nemôže byť prázdne!\n";
        return "";
    }
    
    public String addUser(String type, String email, String name, String surrname, String nickname, String password, String passwordCheck, Date bornAt){
        String errorMessage = "";
        errorMessage += checkEmpty(name, "Meno");
        errorMessage += checkEmpty(surrname, "Priezvisko");
        errorMessage += checkEmpty(nickname, "Nickname");

        String emailRegex = "^(.+)@(.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        if (!(emailPattern.matcher(email).matches()))
            errorMessage += "Email musí byť v tvare 'example@mail.com' !\n";
         
        if (!password.equals(passwordCheck))
            errorMessage += "Heslá sa nezhodujú!\n";

        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6,}$";
        Pattern passwordPattern = Pattern.compile(passwordRegex);
        if (!(passwordPattern.matcher(password).matches()))
            errorMessage += "Heslo musí obsahovať aspoň 6 znakov z toho aspoň jedno malé písmeno, veľké písmeno a číslicu!\n";
        
        for (User user : users){
            if (user.getEmail().equals(email)){
                errorMessage += "Tento email už je obsadený!\n";
                break;
            }
            
            if (user.getNickname().equals(nickname)){
                errorMessage += "Tento nickname je už obsadený!\n";
                break;
            }
        }
        
        if(errorMessage.isEmpty()){
            if(type.equals("Hráč"))
                users.add(new Player(email, name, surrname, nickname, password, bornAt));
            if(type.equals("Divák"))
                users.add(new Spectator(email, name, surrname, nickname, password, bornAt));
            if(type.equals("Organizátor ligy"))
                users.add(new LeagueOrganizer(email, name, surrname, nickname, password, bornAt));
        }
        return errorMessage;
    }

    public String login(String nick, String password){
        if(Boolean.logicalAnd(nick.equals("123"), password.equals("321")))
            return "Admin";
        
        for(User user : users){
            if(Boolean.logicalOr(user.getEmail().equals(nick), user.getNickname().equals(nick))){
                if(user.getPassword().equals(password))
                    return "";
            }
        }
        return "Užívateľ s týmito prihlasovacími údajmi neexistuje!\n";
    }
    
    public User getUser(String nick){
        for (User user : users)
            if(Boolean.logicalOr(user.getNickname().equals(nick), user.getEmail().equals(nick)))
                return user;
        return null;
    }
    
    public void addLeague(League league){
        leagues.add(league);
    }
    
    public void addTeam(Team team){
        teams.add(team);
    }

    public ArrayList<League> getLeagues() {
        return leagues;
    }

    public League getActiveLeague(int selectedRow) {
        int current = 0;
        for (League league : leagues){
            if (league.isActive()){
                if(current == selectedRow)
                    return league;
                current += 1;
            }
        }
        return leagues.get(0);
    }
    
    public ArrayList<League> getPlannedLeagues(){
        ArrayList<League> plannedLeagues = new ArrayList<>();
        for (League league : leagues) {
            if (league.isPlanned()) {
                plannedLeagues.add(league);
            }
        }
        return plannedLeagues;
    }
    
    public ArrayList<League> teamsLeagues(Team team){
        ArrayList<League> teamsLeaguesList = new ArrayList<>();
        for (League league : leagues) {
            if (league.isTeamInLeague(team)) {
                teamsLeaguesList.add(league);
            }
        }
        
        return teamsLeaguesList;
    }
    
    public void removeTeam(Team team) {
        teams.remove(team);
    }
    
    public League getPastLeague(int selectedRow){
        int current = 0;
        for (League league : leagues){
            if(league.isPast()){
                if(current == selectedRow)
                    return league;
                current += 1;
            }
        }
        return leagues.get(0);
    }
    
    public League getFutureLeague(int selectedRow){
        int current = 0;
        for (League league : leagues){
            if(league.isFuture()){
                if(current == selectedRow)
                    return league;
                current += 1;
            }
        }
        return leagues.get(0);
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }
    
} 
