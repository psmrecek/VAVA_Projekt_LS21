/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.user;

import java.io.Serializable;
import java.util.Date;

/**
 * <code>Spectator</code> extends {@link User} and is used for 
 * people, who are willing to use application for spectating purposes only.
 * 
 * @see User
 */
public class Spectator extends User implements Serializable{
        private static final long serialVersionUID = 0;
	
    public Spectator(String email, String name, String surrname, String nickname, String password, Date bornAt) {
        super(email, name, surrname, nickname, password, bornAt);
    }
}