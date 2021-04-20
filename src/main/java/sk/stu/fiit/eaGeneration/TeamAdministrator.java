package sk.stu.fiit.eaGeneration;

import java.util.ArrayList;

/**
 * Spr�vca t�mu, ktor� je z�rove� jeho �lenom. Rie�i administrat�vu t�mu.
 * @author PeterSmrecek
 * @version 1.0
 * @created 19-apr-2021 18:21:18
 */
public class TeamAdministrator extends User {

	private String nickname;
	private ArrayList<TeamApplicationForLeague> teamApplicationList;
	private ArrayList<Team> teamList;

	public TeamAdministrator(){

	}
}//end TeamAdministrator