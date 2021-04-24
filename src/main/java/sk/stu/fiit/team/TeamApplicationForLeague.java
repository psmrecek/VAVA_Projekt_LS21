package sk.stu.fiit.team;

import java.io.Serializable;
import sk.stu.fiit.user.Player;

/**
 * �iados�, ktor� pod�va Administr�tor t�mu ktor� schva�uje Organiz�tor ligy. Jej
 * schv�lenie je podmienkou pre ��as� t�mu v lige.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class TeamApplicationForLeague implements Serializable{
        
        private static final long serialVersionUID = 0;
	private String text;
        private Player admin;

	public TeamApplicationForLeague(){

	}
}//end TeamApplicationForLeague