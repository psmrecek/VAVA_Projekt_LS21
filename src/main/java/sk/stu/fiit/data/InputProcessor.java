/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.data;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;

/**
 * Class <code>InputProcessor</code> contains methods for date-string conversion,
 * methods for checking, if number is valid price or valid index and method for 
 * resizing images.
 * 
 */
public final class InputProcessor {
    
    private static final Logger logger = Logger.getLogger(InputProcessor.class.getName());
    private static final SimpleDateFormat sdfBasic = new SimpleDateFormat("dd.MM.yyyy");
    
    private InputProcessor(){
    }
    
    public static Date dateWithoutTime(Date date) throws ParseException {
        
        String dateString = sdfBasic.format(date);
        Date dateWihoutTime = sdfBasic.parse(dateString);

        return dateWihoutTime;
    }

    public static boolean validDateRange(Date currentDateApp, Date startDate, Date endDate) {
        Date currWihoutTime = null;
        try {
            currWihoutTime = dateWithoutTime(currentDateApp);
        } catch (ParseException ex) {
            logger.error("Unable to convert date");
            return false;
        }
        return (startDate.after(currWihoutTime) && endDate.after(startDate));
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
            logger.error("Given number is not valid price");
            throw new Exception("Wrong price");
        }

        return price;
    }
    
    public static int positiveIntFromString(String numberString) throws Exception{
        int number = Integer.parseInt(numberString);
        
        if (number <= 0) {
            logger.error("Given number is not valid index");
            throw new Exception("Negative number given");
        }
        
        return number;
    }
    
    public static boolean isPositiveInt(int number){
        return number > 0;
    }
    
    public static ImageIcon resize(BufferedImage img, int maxSize) {
        double vertical = img.getHeight();
        double horizontal = img.getWidth();
        double coef;
        if (vertical > horizontal) {
            coef = vertical / maxSize;
        } else {
            coef = horizontal / maxSize;
        }

        vertical /= coef;
        horizontal /= coef;

        return new ImageIcon(img.getScaledInstance((int) horizontal, (int) vertical, Image.SCALE_DEFAULT));
    }

    public static String dateToString(Date date){
        return sdfBasic.format(date);
    }

}
