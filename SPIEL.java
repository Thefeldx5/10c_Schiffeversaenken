
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
        kreuzer = new SCHIFFEVIER();
        zerstörer = new SCHIFFEDREI();
        zerstörer1 = new SCHIFFEDREI();
        zerstörer2 = new SCHIFFEDREI();
        uboot = new SCHIFFEZWEI();
        uboot1 = new SCHIFFEZWEI();
    }

}
