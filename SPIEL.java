
import java.awt.*;

public class SPIEL extends SIMULATION 
{
    /** Spielfelder erstellen*/
    SPIELFELD Spielfeld1;
    SPIELFELD Spielfeld2;
    SPIELFELD Spielfeld3;
    SPIELFELD Spielfeld4;
    SCHIFFEFÜNF schlachtschiff;
    SCHIFFEVIER kreuzer;
    SCHIFFEDREI zerstörer;
    SCHIFFEDREI zerstörer1;
    SCHIFFEDREI zerstörer2;
    SCHIFFEZWEI uboot;
    SCHIFFEZWEI uboot1;
    
    /** Konstruktor */
    SPIEL ()
    {
        Spielfeld1 = new SPIELFELD();
        Spielfeld2 = new SPIELFELD();
        Spielfeld3 = new SPIELFELD();
        Spielfeld4 = new SPIELFELD();
        schlachtschiff = new SCHIFFEFÜNF();
        schlachtschiff.SchiffefünfSetzen(2,3,'S');
        kreuzer = new SCHIFFEVIER();
        kreuzer.SchiffevierSetzen(7,4,'O');
        zerstörer = new SCHIFFEDREI();
        zerstörer.SchiffedreiSetzen(10,8,'S');
        zerstörer1 = new SCHIFFEDREI();
        zerstörer1.SchiffedreiSetzen(7,9,'W');
        zerstörer2 = new SCHIFFEDREI();
        zerstörer2.SchiffedreiSetzen(5,6,'O');
        uboot = new SCHIFFEZWEI();
        uboot.SchiffezweiSetzen(5,3,'N');
        uboot1 = new SCHIFFEZWEI();
        uboot1.SchiffezweiSetzen(2,10,'W');
    }

}
