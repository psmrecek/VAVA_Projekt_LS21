/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import sk.stu.fiit.user.LeagueOrganizer;
import sk.stu.fiit.user.Player;
import sk.stu.fiit.user.Spectator;
import sk.stu.fiit.user.User;

/**
Class <code>Lists</code> serves as class storing all information given
 * from GUI. Stores Arrays of registered {@link User}s. 
 * Also checks if given inputs are valid when creating classes. 
 * 
 * @see User
 */
public class Lists {
    private final ArrayList<User> users = new ArrayList<>();
    
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
}
