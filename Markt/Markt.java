

public class Markt
{
    private String name = "Heumarkt";
    private String stadt = "Wien";
    private Stand pos1;
    private Stand pos2;
    private Stand pos3;
    private Stand pos4;

    public Markt(){
    }
    
 public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public Stand getPos1() {
        return pos1;
    }

    public void setPos1(Stand pos1) {
        this.pos1 = pos1;
    }

    public Stand getPos2() {
        return pos2;
    }

    public void setPos2(Stand pos2) {
        this.pos2 = pos2;
    }

    public Stand getPos3() {
        return pos3;
    }

    public void setPos3(Stand pos3) {
        this.pos3 = pos3;
    }

    public Stand getPos4() {
        return pos4;
    }

    public void setPos4(Stand pos4) {
        this.pos4 = pos4;
    }    
    
    public boolean standHinzufuegen(Stand stand){
        if(pos1 == null){
            pos1 = stand;
            return true;
        }
        
        if(pos2 == null){
            pos2 = stand;
            return true;
        }
        
        if(pos3 == null){
            this.pos3 = stand;
            return true;
        }
        
        if(pos4 == null){
            pos4 = stand;
            return true;
        }
        
        System.err.println("Es gibt keine freie plaetze mehr!");
        return false;
    }
    
    public int anzahlStaende(){
        int summe = 0;
        
        if(pos1 != null){
         summe = summe + 1; // 0 + 1 = 1
        }
        
        if(pos2 != null){
         summe = summe + 1; // 1 + 1 = 2
        }
        
        if(pos3 != null){
         summe++; // summe = summe + 1  => 2 + 1 = 3
        }
        
        if(pos4 != null){
           summe++; // 4;
        }
        
        return summe;
    }
    
    public int anzahlEssensStaende(){
        int summe = 0;
        if(pos1 != null && pos1.getEssen() == true){
            summe++;
        }
        
        if(pos2 != null && pos2.getEssen() == true){
            summe++;
        }
        
        if(pos3 != null && pos3.getEssen() == true){
            summe++;
        }
        
        if(pos4 != null && pos4.getEssen() == true){
            summe++;
        }        
        return summe;
    }
}
