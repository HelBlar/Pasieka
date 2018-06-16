
import java.io.FileNotFoundException;

/**
 *
 * @author HelBlar
 */
public class Start {


    public static void main(String[] args) throws FileNotFoundException {
        
      
     //==================================================
    //Przeciążamy konstruktor i metodę
   //==================================================
      PszczolaStraznik p = new PszczolaStraznik("Joker");
      PszczolaStraznik p0 = new PszczolaStraznik("Batman", 30);
      p0.patroluj();
      p0.patroluj(20);
      
      
      System.out.println("");
      System.out.println("******************");
      System.out.println("");
      
      
     //==================================================
    //Wczytywanie sortowanie i wyświetlanie.
   //==================================================
      PszczolaKomandos p1= new PszczolaKomandos("Wiesław");
      p1.wczytajNazwiska("cele.txt");
      p1.atakujCzlowieka();
      
      
      System.out.println("");
      System.out.println("******************");
      System.out.println("");
      
      
      
     //==================================================
    //Singleton 
   //==================================================
      Krolowa krolowa1 = Krolowa.getInstance();
        System.out.println(krolowa1);
      Krolowa krolowa2 = Krolowa.getInstance(); 
        System.out.println(krolowa2);
     
    }
    
}
 