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
import java.util.Date;
import org.apache.log4j.Logger;
import sk.stu.fiit.gui.MainGui;

/**
 * Class <code>Save</code> is used for serialization. It allows 
 * serializing objects of {@link Lists} and {@link CurrentTime} from
 * running application status.
 *
 * @see Lists
 * @see CurrentTime
 */
public class Save implements Serializable{
private static final long serialVersionUID = 0;
    private static final Logger logger = Logger.getLogger(Save.class.getName());
    private Lists lists;
    private Date currentDate;
    
    public void save(Lists lists, CurrentTime currentTime) throws IOException, FileNotFoundException{
        this.lists = lists;
        this.currentDate = currentTime.getDateTime();
        try (ObjectOutputStream ser = new ObjectOutputStream(new FileOutputStream("leaguesaves.out"))) {
            ser.writeObject(this);
            logger.info("Serialized objects");
            ser.close();
        }
    }
    
    public void load(MainGui mainGui) throws FileNotFoundException, IOException, ClassNotFoundException{
        Save lastSave;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("leaguesaves.out"))) {
            lastSave = (Save) in.readObject();
            logger.info("Loading was succesful");
            in.close();
        }
        this.currentDate = lastSave.currentDate;
        this.lists = lastSave.lists;
        CurrentTime.CurrentTime().setDateTime(this.currentDate);
        mainGui.refreshTime();
        mainGui.getLoginWindow().setLists(lists);
        mainGui.setLists(lists);
    }
}
