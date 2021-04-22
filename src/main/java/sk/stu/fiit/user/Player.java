package sk.stu.fiit.user;

import java.util.Date;


/**
 * Osoba, ktor� sa z��ast�uje hier, zap�ja sa do t�mov a cez t�my sa zap�ja do l�g
 * a z�pasov.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class Player extends User {

    
    public Player(String email, String name, String surrname, String nickname, String password, Date bornAt) {
        super(email, name, surrname, nickname, password, bornAt);
    }
}