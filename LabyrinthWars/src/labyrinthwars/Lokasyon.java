
package labyrinthwars;


public abstract class Lokasyon extends Karakter{
    private int x;
    private int y;
    public void Lokasyon(int x, int y){
    this.x=x;
    this.y=y;
    }
    
    public int getx(){
    return this.x;
    }
    public void setx(int x){
    this.x=x;
    }
    public int gety(){
    return this.y;
    }
    public void sety(int y){
    this.y=y;
    }  
    
}
