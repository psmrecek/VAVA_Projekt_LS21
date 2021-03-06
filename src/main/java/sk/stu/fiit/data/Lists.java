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
import sk.stu.fiit.user.*;

/**
 * Class <code>Lists</code> serves as class storing all information given
 * from GUI. Stores Arrays of registered {@link User}s, {@link League}s and
 * {@link Team}s. 
 * Also checks if given inputs are valid when creating classes, returns 
 * lists and allows needed kinds of filtering.
 * 
 * @see User
 * @see League
 * @see Team
 */
public class Lists implements Serializable{
    private static final long serialVersionUID = 0;
    private final ArrayList<User> users = new ArrayList<>();;
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
    
    public ArrayList<League> getPlannedLeaguesWithoutTeam(Team team){
        ArrayList<League> plannedLeagues = new ArrayList<>();
        for (League league : leagues) {
            if (league.isFuture() && !league.isTeamInLeague(team)) {
                plannedLeagues.add(league);
            }
        }
        return plannedLeagues;
    }
    
    public ArrayList<League> getTeamsLeagues(Team team){
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
    
    public String changeUser(User user, String name, String surrname, String email, String nickname, boolean changedMail, boolean changedNick){
        String errorMessage = "";
        errorMessage += checkEmpty(name, "Meno");
        errorMessage += checkEmpty(surrname, "Priezvisko");
        errorMessage += checkEmpty(nickname, "Nickname");

        String emailRegex = "^(.+)@(.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        if (!(emailPattern.matcher(email).matches()))
            errorMessage += "Email musí byť v tvare 'example@mail.com' !\n";
        
        
        if(changedMail){
            for (User controlUser : users){
                if (controlUser.getEmail().equals(email)){
                    errorMessage += "Tento email už je obsadený!\n";
                    break;
                }
            }
        }
        
        if(changedNick){
            for (User controlUser : users){
                if (controlUser.getNickname().equals(nickname)){
                    errorMessage += "Tento nickname je už obsadený!\n";
                    break;
                }
            }
        }
        
        if(errorMessage.isEmpty()){
            user.setName(name);
            user.setSurrname(surrname);
            user.setEmail(email);
            user.setNickname(nickname);
        }
        return errorMessage;
    }

    public ArrayList<League> getTeamLeagues(Team team){
        ArrayList<League> teamLeagues = new ArrayList<>();
        for(League league: this.leagues){
            if (league.getTeamList().contains(team))
                teamLeagues.add(league);
        }
        return teamLeagues;
    }

    public ArrayList<User> getFreePlayers() {
       ArrayList<User> freePlayers = new ArrayList<>();
       for(User determine : this.users){
           if(determine.getClass().getSimpleName().equals("Player"))
               if(((Player)determine).getTeam() == null)
                   freePlayers.add(determine);
       }
       return freePlayers;
    }
} 
