/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.user.message;

import java.io.Serializable;
import sk.stu.fiit.team.Team;
import sk.stu.fiit.user.User;

/**
 *
 * @author schon
 */
public class TeamInvitation extends Message implements Serializable{
    private static final long serialVersionUID = 0;
    private Team team;
    
    public TeamInvitation(String head, String body, User sender) {
        super(head, body, sender);
    }
    
}
