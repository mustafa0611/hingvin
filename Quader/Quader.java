

public class Quader
{
    private int laenge;
    private int breite;
    private int hoehe;
    
    public Quader(){
        
    }
    
    public Quader(int laenge, int breite, int hoehe){
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }
    
     public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }
    
    public int berechneFlaeche(int seite1, int seite2){
        return seite1 * seite2;
    }
    
    public int berechenOberflaeche(){
        return 2 * (laenge * breite + laenge * hoehe + breite * hoehe);
    }
    
    public int berchneVolumen(){
        return laenge * breite * hoehe;
    }
    
    public int berchneMasse(String matrial, float rho){
        return (int) rho * this.berchneVolumen();
    }
    
    public String toString() {
        return "Quader{" +
                "laenge=" + laenge +
                ", breite=" + breite +
                ", hoehe=" + hoehe +
                '}';
    }
}
