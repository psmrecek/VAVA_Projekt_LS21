/*
 * VAVA project
 * Esport League by Martin Schön and Peter Smreček
 * FIIT STU, 2021
 */
package sk.stu.fiit.data;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import sk.stu.fiit.league.League;
import sk.stu.fiit.league.Prize;
import sk.stu.fiit.team.Team;
import sk.stu.fiit.user.LeagueOrganizer;
import sk.stu.fiit.user.Player;
import sk.stu.fiit.user.User;

/**
 *
 * @author PeterSmrecek
 */
public final class TestInputs {
    
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(TestInputs.class.getName());
    
    public static Lists createInputs(){
        Lists lists = new Lists();
        
        try {
            lists.addUser("Organizátor ligy", "a@a.a", "a", "a", "a", "aaaaaaaA1", "aaaaaaaA1", InputProcessor.convertDate("5.4.1998"));
            lists.addUser("Organizátor ligy", "b@b.b", "b", "b", "b", "bbbbbbbB1", "bbbbbbbB1", InputProcessor.convertDate("9.12.1995"));
            lists.addUser("Organizátor ligy", "c@c.c", "c", "c", "c", "cccccccC1", "cccccccC1", InputProcessor.convertDate("4.7.1992"));

            lists.addUser("Hráč", "p@p.p", "p", "p", "p", "pppppppP1", "pppppppP1", InputProcessor.convertDate("1.1.1999"));
            lists.addUser("Hráč", "q@q.q", "q", "q", "q", "qqqqqqqQ1", "qqqqqqqQ1", InputProcessor.convertDate("2.2.1999"));
            lists.addUser("Hráč", "r@r.r", "r", "r", "r", "rrrrrrrR1", "rrrrrrrR1", InputProcessor.convertDate("3.3.1999"));
            lists.addUser("Hráč", "rr@rr.rr", "rr", "rr", "rr", "rrrrrrrR1", "rrrrrrrR1", InputProcessor.convertDate("4.4.1999"));
            lists.addUser("Hráč", "s@s.s", "s", "s", "s", "sssssssS1", "sssssssS1", InputProcessor.convertDate("5.5.1999"));
            lists.addUser("Hráč", "t@t.t", "t", "t", "t", "tttttttT1", "tttttttT1", InputProcessor.convertDate("6.6.1999"));
            lists.addUser("Hráč", "u@u.u", "u", "u", "u", "uuuuuuuU1", "uuuuuuuU1", InputProcessor.convertDate("7.7.1999"));
            lists.addUser("Hráč", "v@v.v", "v", "v", "v", "vvvvvvvV1", "vvvvvvvV1", InputProcessor.convertDate("8.8.1999"));
            lists.addUser("Hráč", "w@w.w", "w", "w", "w", "wwwwwwwW1", "wwwwwwwW1", InputProcessor.convertDate("9.9.1999"));
            lists.addUser("Hráč", "x@x.x", "x", "x", "x", "xxxxxxxX1", "xxxxxxxX1", InputProcessor.convertDate("10.10.1999"));
            lists.addUser("Hráč", "y@y.y", "y", "y", "y", "yyyyyyyY1", "yyyyyyyY1", InputProcessor.convertDate("11.11.1999"));
            lists.addUser("Hráč", "z@z.z", "z", "z", "z", "zzzzzzzZ1", "zzzzzzzZ1", InputProcessor.convertDate("12.12.1999"));
            
            logger.info("Users loaded correctly");
        } catch (ParseException ex) {
            logger.error("Users loaded incorrectly");
        }



        User organizer1 = lists.getUser("a");
        User organizer2 = lists.getUser("b");
        User organizer3 = lists.getUser("c");
        
        User player1 = lists.getUser("p");
        User player2 = lists.getUser("q");
        User player3 = lists.getUser("r");
        User player4 = lists.getUser("rr");
        User player5 = lists.getUser("s");
        User player6 = lists.getUser("t");
        User player7 = lists.getUser("u");
        User player8 = lists.getUser("v");
        User player9 = lists.getUser("w");
        User player10 = lists.getUser("x");
        User player11 = lists.getUser("y");
        User player12 = lists.getUser("z");
        
        ArrayList<ImageIcon> icons = new ArrayList<>();
        int size = 280; 
        
        try {

            BufferedImage img1 = ImageIO.read(new File("images/room1-1.jpg"));
            BufferedImage img2 = ImageIO.read(new File("images/room1-3.jpg"));
            BufferedImage img3 = ImageIO.read(new File("images/room2-2.jpg"));
            BufferedImage img4 = ImageIO.read(new File("images/room3-1.jpg"));
            BufferedImage img5 = ImageIO.read(new File("images/room3-2.jpg"));
            BufferedImage img6 = ImageIO.read(new File("images/room4-1.jpg"));
            BufferedImage img7 = ImageIO.read(new File("images/room4-2.jpeg"));

            icons.add(InputProcessor.resize(img1, size));
            icons.add(InputProcessor.resize(img2, size));
            icons.add(InputProcessor.resize(img3, size));
            icons.add(InputProcessor.resize(img4, size));
            icons.add(InputProcessor.resize(img5, size));
            icons.add(InputProcessor.resize(img6, size));
            icons.add(InputProcessor.resize(img7, size));

            logger.info("Images loaded correctly");

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Images loaded incorrectly");
        }
        
        
        Team team1 = new Team("Tím1", "Popis1", "Motto1", (Player) player1, icons.get(0));
        lists.addTeam(team1);
        Team team2 = new Team("Tím2", "Popis2", "Motto2", (Player) player2, icons.get(1));
        lists.addTeam(team2);
        Team team3 = new Team("Tím3", "Popis3", "Motto3", (Player) player3, icons.get(2));
        lists.addTeam(team3);
        Team team4 = new Team("Tím4", "Popis4", "Motto4", (Player) player4, icons.get(3));
        lists.addTeam(team4);
        
        team1.addPlayer((Player) player5);
        team1.addPlayer((Player) player6);
        team2.addPlayer((Player) player7);
        team2.addPlayer((Player) player8);
        team3.addPlayer((Player) player9);
        team3.addPlayer((Player) player10);
        team4.addPlayer((Player) player11);
        team4.addPlayer((Player) player12);
        
        ArrayList<Prize> prizeList1 = new ArrayList<>();
        prizeList1.add(new Prize("Pohár uhoriek", "Kyselé nakladané", 1, 12.99));
        prizeList1.add(new Prize("Pohár marhulí", "Sladké zavárané", 2, 11.99));
        prizeList1.add(new Prize("Pohár kvašákov", "Poctivo skvasené", 3, 10.99));
        
        ArrayList<Prize> prizeList2 = new ArrayList<>();
        prizeList2.add(new Prize("Zaváraná tekvica", "Všetkými obchádzaná už od roku 2003", 1, 12.99));
        prizeList2.add(new Prize("Zavárané čučoriedky", "Dobré na trávenie", 2, 11.99));
        prizeList2.add(new Prize("Zavárané hrušky", "Lebo veď prečo nie", 3, 10.99));
        
        ArrayList<Prize> prizeList3 = new ArrayList<>();
        prizeList3.add(new Prize("Balíček čipsov", "Pre upchaté cievy", 1, 12.99));
        prizeList3.add(new Prize("Banán v čokoláde", "Skutočný by do finále sčernal", 2, 11.99));
        prizeList3.add(new Prize("Kokosová tyčinka", "Obchadzaná dlhšie ako zaváraná tekvica z vedľajšej ligy", 3, 10.99));
        
        League league1 = null;
        League league2 = null;
        League league3 = null;
        try {
 
            league1 = new League("Pohárová liga", "Nakladanie do pohárov", "Ovocinárska", InputProcessor.convertDate("25.4.2021") , InputProcessor.convertDate("24.5.2021"), 18, 100, 2, "Umožňuje hráčom naučiť sa spracovať potraviny", (LeagueOrganizer) organizer1, prizeList1, icons.get(4));
        lists.addLeague(league1);
        
            league2 = new League("Zaváraná liga", "Zaváranie pohárov", "Kuchárska", InputProcessor.convertDate("25.6.2021") , InputProcessor.convertDate("24.7.2021"), 15, 90, 3, "Prináša hrášom jedinečný zážitok zo zavárania úrody", (LeagueOrganizer) organizer2, prizeList2, icons.get(5));
        lists.addLeague(league2);
        
            league3 = new League("Priemyselne spracovaná liga", "Plastový obal", "Recyklovateľná", InputProcessor.convertDate("25.8.2021") , InputProcessor.convertDate("24.9.2021"), 14, 80, 4, "Hráči môžu vyhrať fantastické ceny devastujúce zdravie", (LeagueOrganizer) organizer3, prizeList3, icons.get(6));
        lists.addLeague(league3);
        
            logger.info("Leagues created correctly");
        } catch (ParseException ex) {
            logger.error("Leagues created incorrectly");
        }
        
        
        league1.addTeam(team1);
        league1.addTeam(team2);
        league2.addTeam(team3);
        league2.addTeam(team4);
        
        return lists;
    }

}
