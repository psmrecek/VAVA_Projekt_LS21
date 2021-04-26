/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.data;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import org.apache.log4j.Logger;

/**
 * Class <code>CurrentTime</code> is holding current application 
 * time and date. It allows to simulate time changes, so it only allows 
 * changing time forward.
 * CurrentTime class is Singleton, so it can be accessed from any point 
 * of application
 */
public class CurrentTime implements Serializable{
    private static final long serialVersionUID = 0;
    private static CurrentTime currentTime = null;
    private Date dateTime;
    
    private CurrentTime(){
        this.dateTime = new Date();
    }
    
    public static CurrentTime CurrentTime(){
        if (currentTime == null)
            currentTime = new CurrentTime();     
        System.out.println(InputProcessor.dateToString(currentTime.getDateTime()));
        return currentTime;
    }

    public Date getDateTime() {
        return this.dateTime;
    }
 
    public void addMinute(){
        dateTime = new Date((dateTime.getTime() + 60000));
    }
    
    public boolean setDateTime(LocalDateTime localDateTime){
        Date newDate = LocalDateTimeToDate(localDateTime);
        if (newDate.before(this.dateTime))
            return false;
        this.dateTime = newDate;
        Logger.getLogger(CurrentTime.class.getName()).info("Time change succesful");
        return true;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    
    
    
    public static Date LocalDateTimeToDate(LocalDateTime localDateTime){
        Instant instant = localDateTime.toInstant(ZoneOffset.ofHours(2));
        return Date.from(instant);
    }
    
    public static Date LocalDateToDate(LocalDate localDate){
        return java.util.Date.from(localDate.atStartOfDay().
                atZone(ZoneId.systemDefault()).toInstant());
        
    }   
}
