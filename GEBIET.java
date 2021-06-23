
public class GEBIET
{
    /** ob das Feld beschossen wurde*/
    boolean beschossenesFeld;
    
    /** ob ein Schiff auf dem Feld ist*/
    boolean schiffAufFeld;
    
    
    
    /** Konstruktor*/
    GEBIET ()
    {
        beschossenesFeld = false;
        schiffAufFeld = false;
    }
    
    /** */
    public boolean beschiesseFeld()
    {
        beschossenesFeld = true;
        
        if (schiffAufFeld) 
        {
            versenkeSchiff();
            return true;
        }
        else 
        {
            return false;
        }
    }

    public void setzeSchiff()
    {
        schiffAufFeld = true;
    }
   
    public void versenkeSchiff()
    {
        schiffAufFeld = false;
    }   
   
    public boolean FeldWurdeBeschossen()
    {
        return beschossenesFeld;
    }
   
    public boolean isSchiff()
    {
        return schiffAufFeld;
    }   
}
