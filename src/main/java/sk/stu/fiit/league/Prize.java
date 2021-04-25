package sk.stu.fiit.league;

import java.io.Serializable;

/**
 * Class <code>Prize</code> represents a thing given as a reward to the 
 * winner(s) of a league. Prize has its name, description, price and position.
 */
public class Prize implements Serializable{
        
    private static final long serialVersionUID = 0;
    private final String name;
    private final String description;
    private final int position;
    private final double price;

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