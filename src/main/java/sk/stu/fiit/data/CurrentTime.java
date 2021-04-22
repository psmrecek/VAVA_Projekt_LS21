/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import org.apache.log4j.Logger;

/**
 *
 * @author schon
 */
public class CurrentTime {
    private static CurrentTime currentTime = null;
    private Date dateTime;
    
    private CurrentTime(){
        this.dateTime = new Date();
    }
    
    public static CurrentTime CurrentTime(){
        if (currentTime == null)
            currentTime = new CurrentTime();      
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
    
    
    public static Date LocalDateTimeToDate(LocalDateTime localDateTime){
        Instant instant = localDateTime.toInstant(ZoneOffset.ofHours(2));
        return Date.from(instant);
    }
    
    public static Date LocalDateToDate(LocalDate localDate){
        return java.util.Date.from(localDate.atStartOfDay().
                atZone(ZoneId.systemDefault()).toInstant());
        
    }   
}
