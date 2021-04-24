/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.user;

import java.io.Serializable;
import java.util.Date;

/**
 * Abstract class for storing information about all users.
 * @author schon
 */
public abstract class User implements Serializable{
    private static final long serialVersionUID = 0;
    private String email, name, surrname, nickname, password;
    private Date bornAt;

    public User(String email, String name, String surrname, String nickname, String password, Date bornAt) {
        this.email = email;
        this.name = name;
        this.surrname = surrname;
        this.nickname = nickname;
        this.bornAt = bornAt;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurrname() {
        return surrname;
    }

    public Date getBornAt() {
        return bornAt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBornAt(Date bornAt) {
        this.bornAt = bornAt;
    }
}
