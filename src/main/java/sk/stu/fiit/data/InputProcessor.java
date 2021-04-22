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
        
        String dateString = sdfBasic.format(date);
        Date dateWihoutTime = sdfBasic.parse(dateString);

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
    
    public static double priceFromString(String priceString) throws Exception{
        priceString = priceString.replace(",", ".");
        double price = Double.parseDouble(priceString);
        
        if (price < 0.0) {
            throw new Exception("Wrong price");
        }

        return price;
    }
    
    public static int positiveIntFromString(String numberString) throws Exception{
        int number = Integer.parseInt(numberString);
        
        if (number <= 0) {
            throw new Exception("Negative number given");
        }
        
        return number;
    }
    
    public static boolean isPositiveInt(int number){
        return number > 0;
    }
}
