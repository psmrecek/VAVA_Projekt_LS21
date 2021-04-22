/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.user;

import java.util.Date;

/**
 * Abstract class for storing information about all users.
 * @author schon
 */
public abstract class User {
    private final String email, name, surrname, nickname, password;
    private final Date bornAt;

    public User(String email, String name, String surrname, String nickname, String password, Date bornAt) {
        this.email = email;
        this.name = name;
        this.surrname = surrname;
        this.nickname = nickname;
        this.bornAt = bornAt;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }


    
}
