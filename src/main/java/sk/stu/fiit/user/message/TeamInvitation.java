/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.user.message;

import java.io.Serializable;
import sk.stu.fiit.team.Team;
import sk.stu.fiit.user.Player;
import sk.stu.fiit.user.User;

/**
 * <code>TeamInvitation</code> inherits {@link Message} class. It serves
 * as a way of inviting {@link Player}s to {@link Team}s. 
 * 
 * @see Player
 * @see Team
 * @see Message
 */
public class TeamInvitation extends Message implements Serializable{
    private static final long serialVersionUID = 0;
    private final Team team;
    
    public TeamInvitation(String head, String body, User sender, Team team) {
        super(head, body, sender);
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }
}
