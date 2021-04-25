/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.user.message;

import java.io.Serializable;
import java.util.Date;
import sk.stu.fiit.data.CurrentTime;
import sk.stu.fiit.user.User;

/**
 * <code>Message</code> class is used for chatting between {@link User}s.
 * It contains message itself as well as sender information and time of sending.
 * 
 * @see User
 */
public class Message implements Serializable{
    private static final long serialVersionUID = 0;
    private final String head, body;
    private final User sender;
    private final Date sendingTime;

    public Message(String head, String body, User sender) {
        this.head = head;
        this.body = body;
        this.sender = sender;
        this.sendingTime = CurrentTime.CurrentTime().getDateTime();
    }

    public String getHead() {
        return head;
    }

    public String getBody() {
        return body;
    }

    public User getSender() {
        return sender;
    }

    public Date getSendingTime() {
        return sendingTime;
    }
    
}
