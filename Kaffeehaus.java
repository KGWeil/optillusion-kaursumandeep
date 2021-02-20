
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{       
    int s=40;
    int[] abstaende={10,20,30,20,10,20,30,20,10,20};
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,500);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        parallelen();
        zeichneQuadrate();
        zeichenAlleQuadrate();
    }
    
    public void parallelen(){
        strokeWeight(2);
        stroke(150);
        
        for(int i=0;i<10;i++){
            line(0,i*40,640,i*40);
        }
    }
    
    public void zeichneQuadrate(){
        strokeWeight(0);
        stroke(0);
        fill(0);
        
        for (int i=0;i<10;i++){
            rect(10+i*80,0,40,40);
        }
    }
    
    public void zeichenAlleQuadrate(){
        for (int k=0;k<10;k++){
            for (int i=0;i<8;i++){
                rect(abstaende[k]+i*s*2,1+k*s,s,s);
            }
        }
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
