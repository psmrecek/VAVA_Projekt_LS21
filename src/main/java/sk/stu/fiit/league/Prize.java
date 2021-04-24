package sk.stu.fiit.league;

import java.io.Serializable;

/**
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class Prize implements Serializable{
        
    private static final long serialVersionUID = 0;
    private String name;
    private String description;
    private int position;
    private double price;

    public Prize(String name, String description, int position, double price) {
        this.name = name;
        this.description = description;
        this.position = position;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPosition() {
        return position;
    }

    public double getPrice() {
        return price;
    }


}//end Prize