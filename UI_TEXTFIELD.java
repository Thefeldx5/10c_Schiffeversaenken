import java.awt.*;
import java.awt.event.*;

class UI_TEXTFIELD
{
    Frame fenster;
    Label fragetext;
    
    

    /**
     * Constructor for objects of class OBERFLAECHE
     */
    public UI_TEXTFIELD()
    {
        fenster = new Frame("UI");
        fenster.setSize(600,400);
        fenster.setLocation(0,30);
        fenster.setVisible(true);
        fenster.setLayout(null);
        
        fragetext = new Label();
        fragetext.setText("Hier steht später die Frage und ggf. die Antworten.");
        fragetext.setVisible(true);
        fragetext.setLocation(200,50);
        fragetext.setSize(400,50);
        fenster.add(fragetext);
        
      
    }  
 
}
