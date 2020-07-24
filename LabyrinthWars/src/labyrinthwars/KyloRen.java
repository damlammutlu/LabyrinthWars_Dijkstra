
package labyrinthwars;


public class KyloRen extends Lokasyon {
     public void KyloRen(){
         //setAd("");
       //  setTur("");
      /*  String tur = this.getTur();
        tur="kotu";*/
        }
    public void KyloRen( String Ad, String Tur, int x, int y){
        setAd(Ad);
        setTur(Tur);
        Tur="kotu";
        setx(x);
        sety(y);
    }
    
    static final int dugum=154; 
    int minDistance(int uzaklik[], Boolean dogruluk[]) 
    { 
        
        int min = Integer.MAX_VALUE, min_indis=-1; 
  
        for (int i = 0; i < dugum; i++) 
            if (dogruluk[i] == false && uzaklik[i] <= min) 
            { 
                min = uzaklik[i]; 
                min_indis = i; 
            } 
  
        return min_indis; 
    } 
  
   @Override
    int EnKısaYol(int graph[][], int start, int end, int dıs_sayac) 
    { 
        int uzaklik[] = new int[dugum];
        
        Boolean dogruluk[] = new Boolean[dugum]; 
  
        
        for (int i = 0; i < dugum; i++) 
        { 
            uzaklik[i] = Integer.MAX_VALUE; 
            dogruluk[i] = false; 
        } 
  
        
        uzaklik[start] = 0; 
  
        
        for (int sayac = 0; sayac < dugum-1; sayac++) 
        { 
            int u = minDistance(uzaklik, dogruluk);
            dogruluk[u] = true; 
            for (int i = 0; i < dugum; i++){  
                if (!dogruluk[i] && graph[u][i]!=0 && uzaklik[u] != Integer.MAX_VALUE && uzaklik[u]+graph[u][i] < uzaklik[i]) 
                    uzaklik[i] = uzaklik[u] + graph[u][i];
            }
        }
        //değişen kısım
        int kuyruk=0;
        int son=end;
        
        if (dıs_sayac==0) {
            son=uzaklik[end];
        }
        else {
                    
            if (graph[son-1][son]==1&&uzaklik[son-1]==uzaklik[son]-1) {
                kuyruk=son-1;
                son=son-1;
            }
            else if (son-14>0&&uzaklik[son-14]==uzaklik[son]-1) {
                kuyruk=son-1;
                son=son-14;
            }
            else if (uzaklik[son+1]==uzaklik[son]-1) {
                kuyruk=son-1;
                son=son+1;
            }
            else if (son+14<139&&uzaklik[son+14]==uzaklik[son]-1) {
                kuyruk=son-1;
                son=son+14;
            }
        }
        
       return son;
    }
}
