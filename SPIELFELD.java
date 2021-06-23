import java.awt.*;
import javax.swing.*;

public class SPIELFELD
{
    /** Eigenschaften */
   public GEBIET[][] feld;

    /** Konstruktor */
    public SPIELFELD()
    {
        feld = new GEBIET[10][10];
       /** Anfangswerte setzen fuer alle 100 Felder */
          for (int i=0;i<10;i++) /** senkrecht */
          { 
             for (int j=0;j<10;j++) /** waagrecht */
             { 
                feld[j][i]=new GEBIET();
             }
          }
          
    }

    /** Methoden */
    public String schiesse(int x, int y)
    {
       if (feld[x][y].beschiesseFeld())
       {
          return "Treffer";
       }   
       else
       {
          return "Daneben";
       }
    }
    
    public void gibSpielfeldAufKonsoleAus()
    {
       System.out.println("\n  0123456789"); /** Leerzeile + Beschriftung*/ 
           for (int i=0;i<10;i++)
           {
             System.out.print(i+" ");
             for (int j=0;j<10;j++)
             {
               if (feld[j][i].beschiesseFeld())
               {
                   System.out.print("*");
               }
               else 
               {
                  if (feld[j][i].isSchiff())
                  {
                      System.out.print("X");
                  }
                  else 
                  {
                      System.out.print("-");
                  }
               }
             }
             System.out.println();
           }          
    }
    
}

