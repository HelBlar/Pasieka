
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PszczolaKomandos extends PszczolaStraznik{
    //==================================================
    //Super
   //==================================================
    public PszczolaKomandos(String name) {
        super(name);
    }
    
    
    ArrayList<String> cele = new ArrayList<>();
    
    //==================================================
   // Super
  //==================================================
    
    @Override
    public void patroluj() {
        super.patroluj(); 
    }

    
    //==================================================
   // Sortowanie i wyświetlanie danych wczytanych metodą wczytajNazwiska();
  //==================================================
    
    @Override
     public void atakujCzlowieka() {
      if (cele.size()>0){
           System.out.println("Czarna Lista: ");
           Collections.sort(cele);
        
        for (String cel : cele) {
            System.out.println(cel);
        }
          System.out.println("Przystępuję do ataku.");
       } else {
                System.out.println("Lista celów pusta, podaj cele metodą \"wczytajNazwiska\"");
                }
           
       
        
       
    }
     //==================================================
    // Wczytywanie danych tekstowych z pliku do ArrayList
   //==================================================
    public void wczytajNazwiska(String dataPath) throws FileNotFoundException{
        FileReader open = new FileReader(dataPath);
        Scanner read = new Scanner(open);
        String data;
        while(read.hasNext()){
            data=read.next();
            cele.add(data);
        }
       
       
       
    }  
}
