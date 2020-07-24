
package labyrinthwars;


public class LukeSkywalker extends Lokasyon{
    private int can;
    
    public LukeSkywalker(int can){
        can=3;
    }
    
    public void LukeSkywalker( String Ad, String Tur, int x, int y){
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
    this.can=3;
    }
    
   
}
