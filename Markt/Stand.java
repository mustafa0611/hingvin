

public class Stand
{
    private String name = "n/a";
    private boolean essen = false;
    
    public Stand(){
        
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getEssen() {
        return essen;
    }

    public void setEssen(boolean essen) {
        this.essen = essen;
    }
    
    public void printStand(){
        if(this.essen == true){
            System.out.println("Essensstand");
        } else {
            System.out.println("Marktstand");
        }
    }
}
