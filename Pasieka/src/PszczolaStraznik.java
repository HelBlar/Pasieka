/**
 *
 * @author HelBlar
 */
class PszczolaStraznik extends Pszczola{
    private final String name;
    private int age;
    
    
     //==================================================
    //Przeciążamy konstruktor
   //==================================================
    public PszczolaStraznik(String name){
        this.name = name;
    }
    public PszczolaStraznik(String name,int age){
        this.name = name;
        this.age = age;
    }
     //==================================================
    //Piękny przykład nadpisania metod abstrakcyjnych
   //==================================================
    @Override
     void patroluj() {
        System.out.println("Jestem Pszczołą patrolującą i patrolowanie to moja pasja, już się za to biorę.");
    }
    //==================================================
   //Piękny przykład przeciążania metody 
  //==================================================
    void patroluj(int czas){
        System.out.println("Patrol potrwa: "+czas+" godzin.");
              
    }

    @Override
    void zapylaj() {
        System.out.println("Tym zajmują się pszczoły zapylające.");
    }

    @Override
    void robMiodek() {
        System.out.println("Od tego są robotnice.");
    }

    @Override
    void atakujCzlowieka() {
        System.out.println("Jestem Pszczołą patrolującą atakowanie ludzi to zadanie dla pszczelich komandosów");
    }
    

    public String getName() {
        return name;
    }
    
    
}
