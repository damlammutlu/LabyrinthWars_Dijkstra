
package labyrinthwars;

public class MasterYoda extends Lokasyon {
    private int can;
    public MasterYoda(int can){
        can=6;
    }
    
    public void MasterYoda( String Ad, String Tur, int x, int y){
        setAd(Ad);
        setTur(Tur);
        Tur="iyi";
        setx(x);
        sety(y);
    }
    
    public int getcan(){
    return this.can;
    }
    public void setcan(int can){
    this.can=6;
    }
    
    
}