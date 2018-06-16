
/**
 *
 * @author HelBlar
 */
public class Krolowa extends Pszczola{
    
    private final String name;
   //==================================================
  //SINGLETON 
 //==================================================
    private Krolowa() {
       super();
       name = "Krystyna"; 
    }
    
    public static Krolowa getInstance() {
        return KrolowaHolder.INSTANCE;
    }

    private static class KrolowaHolder {

        private static final Krolowa INSTANCE = new Krolowa();
    }
    
    //==================================================
   // I kolejne nadpisania
  //==================================================
    @Override
    void patroluj() {
        System.out.println("Jestem królową tego ula nic nie muszę.");
    }

    @Override
    void zapylaj() {
        System.out.println("Jestem królową tego ula nic nie muszę.");
    }

    @Override
    void robMiodek() {
         System.out.println("Jestem królową tego ula nic nie muszę.");
    }

    @Override
    void atakujCzlowieka() {
         System.out.println("Jestem królową tego ula nic nie muszę.");
    }
    
    
}
