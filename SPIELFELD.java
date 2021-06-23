
public class SPIELFELD
{
    /** ob das Feld beschossen wurde*/
    boolean beschossenesFeld;
    
    /** ob ein Schiff auf dem Feld ist*/
    boolean schiffAufFeld;
    
    
    
    /** Konstruktur*/
    SPIELFELD ()
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
