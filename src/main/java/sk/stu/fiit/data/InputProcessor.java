/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;

/**
 *
 * @author PeterSmrecek
 */
public final class InputProcessor {
    
    private static final Logger logger = Logger.getLogger(InputProcessor.class.getName());
    private static SimpleDateFormat sdfBasic = new SimpleDateFormat("dd.MM.yyyy");
    
    public static Date dateWithoutTime(Date date) throws ParseException {
        SimpleDateFormat sdfCreate = new SimpleDateFormat("dd.MM.yyyy");
        String dateString = sdfCreate.format(date);
        Date dateWihoutTime = null;

        dateWihoutTime = sdfCreate.parse(dateString);

        return dateWihoutTime;
    }

    public static boolean validDateRange(Date currentDateApp, Date accommStartDate, Date accommEndDate) {
        Date currWihoutTime = null;
        try {
            currWihoutTime = dateWithoutTime(currentDateApp);
        } catch (ParseException ex) {
            logger.error("Unable to convert date");
            return false;
        }
        return (accommStartDate.after(currWihoutTime) && accommEndDate.after(accommStartDate));
    }
    
    public static Date convertDate(String dateString) throws ParseException{
        Date date;
        date = sdfBasic.parse(dateString);
        return date;
    }
    
}
