/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.apache.log4j.Logger;
import sk.stu.fiit.gui.MainGui;

/**
 *
 * @author schon
 */
public class Save implements Serializable{
private static final long serialVersionUID = 0;
    private static final Logger logger = Logger.getLogger(Save.class.getName());
    private Lists lists;
    private CurrentTime currentTime;
    
    public void save(Lists lists, CurrentTime currentTime) throws IOException, FileNotFoundException{
        this.lists = lists;
        this.currentTime = currentTime;
        try (ObjectOutputStream ser = new ObjectOutputStream(new FileOutputStream("bookingsave.out"))) {
            ser.writeObject(this);
            logger.info("Serialized objects");
            ser.close();
        }
    }
    
    public void load(MainGui mainGui) throws FileNotFoundException, IOException, ClassNotFoundException{
        Save lastSave;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("bookingsave.out"))) {
            lastSave = (Save) in.readObject();
            logger.info("Loading was succesful");
            in.close();
        }
        this.currentTime = lastSave.currentTime;
        this.lists = lastSave.lists;
        mainGui.setCurrentTime(this.currentTime);
        mainGui.setLists(lists);
    }
}
