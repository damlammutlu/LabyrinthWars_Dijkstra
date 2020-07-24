
package labyrinthwars;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
//import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JLabel;
import javax.swing.JTextArea;
//import java.io.UnsupportedEncodingException;
public class StarWars extends javax.swing.JFrame {

    String [][]yeni =new String[11][14]; //butonların da erişimi için global tanımladık
    String [][]yeni1 =new String[11][14];
    String []veri= new String[13];
    LukeSkywalker ls = new LukeSkywalker(3);
    MasterYoda my = new MasterYoda(6);
    int sayici=0,can=0;
    int konum=0,konum1=0,baskonum=0;
    public StarWars()
    {
        initComponents();
       
        String str="";
        String parcalar;
        String damla;
        
      try{
        //dosyadan okuyoruz satır satır  
      FileInputStream fStream= new FileInputStream("Harita.txt");
      DataInputStream dStream= new DataInputStream(fStream);
      BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
      for(int i=0; i<13;i++){
          str = bReader.readLine();
          veri[i]=str;
      }
      dStream.close();
      }
      catch(Exception e){
          System.out.println("hata");
      }//dosyadan okumanın sonu
     
        for (int i = 2; i < 13; i++) {
          
            veri[i]= veri[i].replaceAll("\\s",""); //boşlukları sildik
       }
        
        //BURADA DOSYADAN OKUDUĞUMUZ VERİYİ (DİZEYE ATMIŞTIK) SUBSTRING İLE PARÇALAYIP MATRİSE AKTARDIK
        for (int i = 0; i <11; i++) {
            for (int j = 0; j < 14; j++) {
                if (j==13) {
                    parcalar=veri[i+2].substring(j);
                    yeni[i][j]=parcalar;
                }
                else{
                    parcalar=veri[i+2].substring(j,j+1);
                    yeni[i][j]=parcalar;
                }
               
            }
           
        }
        
        yeni1[5][0]="A";
        yeni1[0][4]="B";
        yeni1[0][12]="C";
        yeni1[5][13]="D";
        yeni1[10][4]="E";
        
        //JTextArea textArea = new JTextArea(yeni[0][0]);
        String Arazi=yeni[0][0]+"    "+yeni[0][1]+"    "+yeni[0][2]+"    "+yeni[0][3]+"    "+"B"+"    "+yeni[0][5]+"    "+yeni[0][6]+"    "+yeni[0][7]+"    "+yeni[0][8]+"    "+yeni[0][9]+"    "+yeni[0][10]+"    "+yeni[0][11]+"    "+"C"+"    "+yeni[0][13]+"\n\n"+
                yeni[1][0]+"    "+yeni[1][1]+"    "+yeni[1][2]+"    "+yeni[1][3]+"    "+yeni[1][4]+"    "+yeni[1][5]+"    "+yeni[1][6]+"    "+yeni[1][7]+"    "+yeni[1][8]+"    "+yeni[1][9]+"    "+yeni[1][10]+"    "+yeni[1][11]+"    "+yeni[1][12]+"    "+yeni[1][13]+"\n\n"+
                yeni[2][0]+"    "+yeni[2][1]+"    "+yeni[2][2]+"    "+yeni[2][3]+"    "+yeni[2][4]+"    "+yeni[2][5]+"    "+yeni[2][6]+"    "+yeni[2][7]+"    "+yeni[2][8]+"    "+yeni[2][9]+"    "+yeni[2][10]+"    "+yeni[2][11]+"    "+yeni[2][12]+"    "+yeni[2][13]+"\n\n"+
                yeni[3][0]+"    "+yeni[3][1]+"    "+yeni[3][2]+"    "+yeni[3][3]+"    "+yeni[3][4]+"    "+yeni[3][5]+"    "+yeni[3][6]+"    "+yeni[3][7]+"    "+yeni[3][8]+"    "+yeni[3][9]+"    "+yeni[3][10]+"    "+yeni[3][11]+"    "+yeni[3][12]+"    "+yeni[3][13]+"\n\n"+
                yeni[4][0]+"    "+yeni[4][1]+"    "+yeni[4][2]+"    "+yeni[4][3]+"    "+yeni[4][4]+"    "+yeni[4][5]+"    "+yeni[4][6]+"    "+yeni[4][7]+"    "+yeni[4][8]+"    "+yeni[4][9]+"    "+yeni[4][10]+"    "+yeni[4][11]+"    "+yeni[4][12]+"    "+yeni[4][13]+"\n\n"+
                "A"+"    "+yeni[5][1]+"    "+yeni[5][2]+"    "+yeni[5][3]+"    "+yeni[5][4]+"    "+yeni[5][5]+"    "+yeni[5][6]+"    "+yeni[5][7]+"    "+yeni[5][8]+"    "+yeni[5][9]+"    "+yeni[5][10]+"    "+yeni[5][11]+"    "+yeni[5][12]+"    "+"D"+"\n\n"+
                yeni[6][0]+"    "+yeni[6][1]+"    "+yeni[6][2]+"    "+yeni[6][3]+"    "+yeni[6][4]+"    "+yeni[6][5]+"    "+yeni[6][6]+"    "+yeni[6][7]+"    "+yeni[6][8]+"    "+yeni[6][9]+"    "+yeni[6][10]+"    "+yeni[6][11]+"    "+yeni[6][12]+"    "+yeni[6][13]+"\n\n"+
                yeni[7][0]+"    "+yeni[7][1]+"    "+yeni[7][2]+"    "+yeni[7][3]+"    "+yeni[7][4]+"    "+yeni[7][5]+"    "+yeni[7][6]+"    "+yeni[7][7]+"    "+yeni[7][8]+"    "+yeni[7][9]+"    "+yeni[7][10]+"    "+yeni[7][11]+"    "+yeni[7][12]+"    "+yeni[7][13]+"\n\n"+
                yeni[8][0]+"    "+yeni[8][1]+"    "+yeni[8][2]+"    "+yeni[8][3]+"    "+yeni[8][4]+"    "+yeni[8][5]+"    "+yeni[8][6]+"    "+yeni[8][7]+"    "+yeni[8][8]+"    "+yeni[8][9]+"    "+yeni[8][10]+"    "+yeni[8][11]+"    "+yeni[8][12]+"    "+yeni[8][13]+"\n\n"+
                yeni[9][0]+"    "+yeni[9][1]+"    "+yeni[9][2]+"    "+yeni[9][3]+"    "+yeni[9][4]+"    "+yeni[9][5]+"    "+yeni[9][6]+"    "+yeni[9][7]+"    "+yeni[9][8]+"    "+yeni[9][9]+"    "+yeni[9][10]+"    "+yeni[9][11]+"    "+yeni[9][12]+"    "+yeni[9][13]+"\n\n"+
                yeni[10][0]+"    "+yeni[10][1]+"    "+yeni[10][2]+"    "+yeni[10][3]+"    "+"E"+"    "+yeni[10][5]+"    "+yeni[10][6]+"    "+yeni[10][7]+"    "+yeni[10][8]+"    "+yeni[10][9]+"    "+yeni[10][10]+"    "+yeni[10][11]+"    "+yeni[10][12]+"    "+yeni[10][13]+"\n\n"
        ;
        //Labirentimizin kopyasını oluşturduk
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 14; j++) {
                yeni1[i][j]=yeni[i][j];
            }
        }
       
        
        jTextArea1.setText(Arazi);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Luke Skywalker");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setText("Master Yoda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jLabel1.setText("EN KISA YOL");

        jLabel2.setText("En Kısa Yol:");

        jLabel3.setText("Can");

        jLabel4.setText("Can           :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ls.LukeSkywalker("Luke", "iyi", 5, 6);
        jButton2.setVisible(false);
        yeni1[5][6]="L";
        yeni1[5][0]="A";
        yeni1[0][4]="B";
        yeni1[0][12]="C";
        yeni1[5][13]="D";
        yeni1[10][4]="E";
        String Arazi=yeni1[0][0]+"    "+yeni1[0][1]+"    "+yeni1[0][2]+"    "+yeni1[0][3]+"    "+yeni1[0][4]+"    "+yeni1[0][5]+"    "+yeni1[0][6]+"    "+yeni1[0][7]+"    "+yeni1[0][8]+"    "+yeni1[0][9]+"    "+yeni1[0][10]+"    "+yeni1[0][11]+"    "+yeni1[0][12]+"    "+yeni1[0][13]+"\n\n"+
                yeni1[1][0]+"    "+yeni1[1][1]+"    "+yeni1[1][2]+"    "+yeni1[1][3]+"    "+yeni1[1][4]+"    "+yeni1[1][5]+"    "+yeni1[1][6]+"    "+yeni1[1][7]+"    "+yeni1[1][8]+"    "+yeni1[1][9]+"    "+yeni1[1][10]+"    "+yeni1[1][11]+"    "+yeni1[1][12]+"    "+yeni1[1][13]+"\n\n"+
                yeni1[2][0]+"    "+yeni1[2][1]+"    "+yeni1[2][2]+"    "+yeni1[2][3]+"    "+yeni1[2][4]+"    "+yeni1[2][5]+"    "+yeni1[2][6]+"    "+yeni1[2][7]+"    "+yeni1[2][8]+"    "+yeni1[2][9]+"    "+yeni1[2][10]+"    "+yeni1[2][11]+"    "+yeni1[2][12]+"    "+yeni1[2][13]+"\n\n"+
                yeni1[3][0]+"    "+yeni1[3][1]+"    "+yeni1[3][2]+"    "+yeni1[3][3]+"    "+yeni1[3][4]+"    "+yeni1[3][5]+"    "+yeni1[3][6]+"    "+yeni1[3][7]+"    "+yeni1[3][8]+"    "+yeni1[3][9]+"    "+yeni1[3][10]+"    "+yeni1[3][11]+"    "+yeni1[3][12]+"    "+yeni1[3][13]+"\n\n"+
                yeni1[4][0]+"    "+yeni1[4][1]+"    "+yeni1[4][2]+"    "+yeni1[4][3]+"    "+yeni1[4][4]+"    "+yeni1[4][5]+"    "+yeni1[4][6]+"    "+yeni1[4][7]+"    "+yeni1[4][8]+"    "+yeni1[4][9]+"    "+yeni1[4][10]+"    "+yeni1[4][11]+"    "+yeni1[4][12]+"    "+yeni1[4][13]+"\n\n"+
                yeni1[5][0]+"    "+yeni1[5][1]+"    "+yeni1[5][2]+"    "+yeni1[5][3]+"    "+yeni1[5][4]+"    "+yeni1[5][5]+"    "+yeni1[5][6]+"    "+yeni1[5][7]+"    "+yeni1[5][8]+"    "+yeni1[5][9]+"    "+yeni1[5][10]+"    "+yeni1[5][11]+"    "+yeni1[5][12]+"    "+yeni1[5][13]+"\n\n"+
                yeni1[6][0]+"    "+yeni1[6][1]+"    "+yeni1[6][2]+"    "+yeni1[6][3]+"    "+yeni1[6][4]+"    "+yeni1[6][5]+"    "+yeni1[6][6]+"    "+yeni1[6][7]+"    "+yeni1[6][8]+"    "+yeni1[6][9]+"    "+yeni1[6][10]+"    "+yeni1[6][11]+"    "+yeni1[6][12]+"    "+yeni1[6][13]+"\n\n"+
                yeni1[7][0]+"    "+yeni1[7][1]+"    "+yeni1[7][2]+"    "+yeni1[7][3]+"    "+yeni1[7][4]+"    "+yeni1[7][5]+"    "+yeni1[7][6]+"    "+yeni1[7][7]+"    "+yeni1[7][8]+"    "+yeni1[7][9]+"    "+yeni1[7][10]+"    "+yeni1[7][11]+"    "+yeni1[7][12]+"    "+yeni1[7][13]+"\n\n"+
                yeni1[8][0]+"    "+yeni1[8][1]+"    "+yeni1[8][2]+"    "+yeni1[8][3]+"    "+yeni1[8][4]+"    "+yeni1[8][5]+"    "+yeni1[8][6]+"    "+yeni1[8][7]+"    "+yeni1[8][8]+"    "+yeni1[8][9]+"    "+yeni1[8][10]+"    "+yeni1[8][11]+"    "+yeni1[8][12]+"    "+yeni1[8][13]+"\n\n"+
                yeni1[9][0]+"    "+yeni1[9][1]+"    "+yeni1[9][2]+"    "+yeni1[9][3]+"    "+yeni1[9][4]+"    "+yeni1[9][5]+"    "+yeni1[9][6]+"    "+yeni1[9][7]+"    "+yeni1[9][8]+"    "+yeni1[9][9]+"    "+yeni1[9][10]+"    "+yeni1[9][11]+"    "+yeni1[9][12]+"    "+yeni1[9][13]+"\n\n"+
                yeni1[10][0]+"    "+yeni1[10][1]+"    "+yeni1[10][2]+"    "+yeni1[10][3]+"    "+yeni1[10][4]+"    "+yeni1[10][5]+"    "+yeni1[10][6]+"    "+yeni1[10][7]+"    "+yeni1[10][8]+"    "+yeni1[10][9]+"    "+yeni1[10][10]+"    "+yeni1[10][11]+"    "+yeni1[10][12]+"    "+yeni1[10][13]+"\n\n"
        ;

        jTextArea1.setText(Arazi);
        
        /* yeni[5][6]="L";
        System.out.println(yeni[5][6]);*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         my.MasterYoda("Yoda","iyi",5,6);
         jButton1.setVisible(false);
         yeni1[5][6]="M";
         yeni1[5][0]="A";
         yeni1[0][4]="B";
         yeni1[0][12]="C";
         yeni1[5][13]="D";
         yeni1[10][4]="E";
        String Arazi=yeni1[0][0]+"    "+yeni1[0][1]+"    "+yeni1[0][2]+"    "+yeni1[0][3]+"    "+yeni1[0][4]+"    "+yeni1[0][5]+"    "+yeni1[0][6]+"    "+yeni1[0][7]+"    "+yeni1[0][8]+"    "+yeni1[0][9]+"    "+yeni1[0][10]+"    "+yeni1[0][11]+"    "+yeni1[0][12]+"    "+yeni1[0][13]+"\n\n"+
                yeni1[1][0]+"    "+yeni1[1][1]+"    "+yeni1[1][2]+"    "+yeni1[1][3]+"    "+yeni1[1][4]+"    "+yeni1[1][5]+"    "+yeni1[1][6]+"    "+yeni1[1][7]+"    "+yeni1[1][8]+"    "+yeni1[1][9]+"    "+yeni1[1][10]+"    "+yeni1[1][11]+"    "+yeni1[1][12]+"    "+yeni1[1][13]+"\n\n"+
                yeni1[2][0]+"    "+yeni1[2][1]+"    "+yeni1[2][2]+"    "+yeni1[2][3]+"    "+yeni1[2][4]+"    "+yeni1[2][5]+"    "+yeni1[2][6]+"    "+yeni1[2][7]+"    "+yeni1[2][8]+"    "+yeni1[2][9]+"    "+yeni1[2][10]+"    "+yeni1[2][11]+"    "+yeni1[2][12]+"    "+yeni1[2][13]+"\n\n"+
                yeni1[3][0]+"    "+yeni1[3][1]+"    "+yeni1[3][2]+"    "+yeni1[3][3]+"    "+yeni1[3][4]+"    "+yeni1[3][5]+"    "+yeni1[3][6]+"    "+yeni1[3][7]+"    "+yeni1[3][8]+"    "+yeni1[3][9]+"    "+yeni1[3][10]+"    "+yeni1[3][11]+"    "+yeni1[3][12]+"    "+yeni1[3][13]+"\n\n"+
                yeni1[4][0]+"    "+yeni1[4][1]+"    "+yeni1[4][2]+"    "+yeni1[4][3]+"    "+yeni1[4][4]+"    "+yeni1[4][5]+"    "+yeni1[4][6]+"    "+yeni1[4][7]+"    "+yeni1[4][8]+"    "+yeni1[4][9]+"    "+yeni1[4][10]+"    "+yeni1[4][11]+"    "+yeni1[4][12]+"    "+yeni1[4][13]+"\n\n"+
                yeni1[5][0]+"    "+yeni1[5][1]+"    "+yeni1[5][2]+"    "+yeni1[5][3]+"    "+yeni1[5][4]+"    "+yeni1[5][5]+"    "+yeni1[5][6]+"    "+yeni1[5][7]+"    "+yeni1[5][8]+"    "+yeni1[5][9]+"    "+yeni1[5][10]+"    "+yeni1[5][11]+"    "+yeni1[5][12]+"    "+yeni1[5][13]+"\n\n"+
                yeni1[6][0]+"    "+yeni1[6][1]+"    "+yeni1[6][2]+"    "+yeni1[6][3]+"    "+yeni1[6][4]+"    "+yeni1[6][5]+"    "+yeni1[6][6]+"    "+yeni1[6][7]+"    "+yeni1[6][8]+"    "+yeni1[6][9]+"    "+yeni1[6][10]+"    "+yeni1[6][11]+"    "+yeni1[6][12]+"    "+yeni1[6][13]+"\n\n"+
                yeni1[7][0]+"    "+yeni1[7][1]+"    "+yeni1[7][2]+"    "+yeni1[7][3]+"    "+yeni1[7][4]+"    "+yeni1[7][5]+"    "+yeni1[7][6]+"    "+yeni1[7][7]+"    "+yeni1[7][8]+"    "+yeni1[7][9]+"    "+yeni1[7][10]+"    "+yeni1[7][11]+"    "+yeni1[7][12]+"    "+yeni1[7][13]+"\n\n"+
                yeni1[8][0]+"    "+yeni1[8][1]+"    "+yeni1[8][2]+"    "+yeni1[8][3]+"    "+yeni1[8][4]+"    "+yeni1[8][5]+"    "+yeni1[8][6]+"    "+yeni1[8][7]+"    "+yeni1[8][8]+"    "+yeni1[8][9]+"    "+yeni1[8][10]+"    "+yeni1[8][11]+"    "+yeni1[8][12]+"    "+yeni1[8][13]+"\n\n"+
                yeni1[9][0]+"    "+yeni1[9][1]+"    "+yeni1[9][2]+"    "+yeni1[9][3]+"    "+yeni1[9][4]+"    "+yeni1[9][5]+"    "+yeni1[9][6]+"    "+yeni1[9][7]+"    "+yeni1[9][8]+"    "+yeni1[9][9]+"    "+yeni1[9][10]+"    "+yeni1[9][11]+"    "+yeni1[9][12]+"    "+yeni1[9][13]+"\n\n"+
                yeni1[10][0]+"    "+yeni1[10][1]+"    "+yeni1[10][2]+"    "+yeni1[10][3]+"    "+yeni1[10][4]+"    "+yeni1[10][5]+"    "+yeni1[10][6]+"    "+yeni1[10][7]+"    "+yeni1[10][8]+"    "+yeni1[10][9]+"    "+yeni1[10][10]+"    "+yeni1[10][11]+"    "+yeni1[10][12]+"    "+yeni1[10][13]+"\n\n"
        ;
        jTextArea1.setText(Arazi);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        int matris1[][] = new int[11][14];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 14; j++) {
                matris1[i][j]=Integer.valueOf(yeni[i][j]);
            }
        }
        //Burda oluşturduğumuz yeni matrisinin integer tipindeki matris matrisiyle iyi karakterlerin kontrolü yapılmaktadır
        //if komutunun içerisinde ilk önce çerçeve kontrolü yapılır. Daha sonra buton kontrolü yapılır.
        //if komutunun altında eski konumun 0,1 cinsinden değeri tekrar kendisine verilir ve yeni konuma L harfi işlenir.
        if(ls.gety()!=13&&matris1[ls.getx()][ls.gety()+1]!=0&&evt.getKeyCode()==KeyEvent.VK_RIGHT){
            System.out.println("sag"+ls.getx());
            yeni1[ls.getx()][ls.gety()]=yeni[ls.getx()][ls.gety()];
            yeni1[ls.getx()][ls.gety()+1]="L";
            ls.LukeSkywalker("Luke", "iyi", ls.getx(), ls.gety()+1);
        }
        if(ls.gety()!=0&&matris1[ls.getx()][ls.gety()-1]!=0&&evt.getKeyCode()==KeyEvent.VK_LEFT){
            System.out.println("sol"+ls.gety());
            yeni1[ls.getx()][ls.gety()]=yeni[ls.getx()][ls.gety()];
            yeni1[ls.getx()][ls.gety()-1]="L";
            ls.LukeSkywalker("Luke", "iyi", ls.getx(), ls.gety()-1);
        }
        if(ls.getx()!=0&&matris1[ls.getx()-1][ls.gety()]!=0&&evt.getKeyCode()==KeyEvent.VK_UP){
            System.out.println("yukarı");
            yeni1[ls.getx()][ls.gety()]=yeni[ls.getx()][ls.gety()];
            yeni1[ls.getx()-1][ls.gety()]="L";
            ls.LukeSkywalker("Luke", "iyi", ls.getx()-1, ls.gety());
        }
        if(ls.getx()!=10&&matris1[ls.getx()+1][ls.gety()]!=0&&evt.getKeyCode()==KeyEvent.VK_DOWN){
            System.out.println("asagi");
            yeni1[ls.getx()][ls.gety()]=yeni[ls.getx()][ls.gety()];
            yeni1[ls.getx()+1][ls.gety()]="L";
            ls.LukeSkywalker("Luke", "iyi", ls.getx()+1, ls.gety());
        }
        
        //BURADA KARAKTERLERİN BAŞ HARFİNE GÖRE NESNELERİNİ OLUŞTURUYORUZ
        char harf=veri[0].charAt(9); //KARAKTERİ BELİRLEDİK
        
       // System.out.println(harf);
       
        if(harf=='S'){ //STORMTROOPER
            Stormtrooper st1= new Stormtrooper();
            char yer=veri[0].charAt(27); // GİRECEĞİ KAPIYI BELİRLEDİK
            if (sayici==0) {
                switch (yer) {
                case 'A':
                    st1.Stormtrooper("st1","kotu",5,0);
                    konum=st1.getx()*14+st1.gety();
                    baskonum=5*14+0;
                    break;
                case 'B':
                    st1.Stormtrooper("st1","kotu",0,4);
                    konum=st1.getx()*14+st1.gety();
                    baskonum=0*14+4;
                    break;
                case 'C':
                    st1.Stormtrooper("st1","kotu",0,12);
                    konum=st1.getx()*14+st1.gety();
                    baskonum=0*14+12;
                    break;
                case 'D':
                    st1.Stormtrooper("st1","kotu",5,13);
                    konum=st1.getx()*14+st1.gety();
                    baskonum=5*14+13;
                    break;
                case 'E':
                    st1.Stormtrooper("st1","kotu",10,4);
                    konum=st1.getx()*14+st1.gety();
                    baskonum=10*14+4;
                    break;
                default:
                    break;
            }
            }
            else{
                st1.Stormtrooper("st1","kotu",st1.getx(),st1.gety());
                //konum=st1.getx()*14+st1.gety();
            }
            
            sayici++;
            
            
            //"YENİ" STRİNG TİPİNDE ONU İNT E ÇEVİRDİK "MATRİS" ADINI ALDI
            int matris[][] = new int[11][14];
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 14; j++) {
                    matris[i][j]=Integer.valueOf(yeni[i][j]);
                }
            }
            //KOMŞULUK MATRİSİ OLUŞTURDUK
             int graph[][] = new int[154][154];
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                    graph[i][j]=0;
                 }

            }
            
             int a=0,b=0;
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                     int indis1,indis2;
                     if (matris[a][b]==0) {
                         graph[i][j]=0;
                     }
                     else if(matris[a][b]==1){
                         if(a!=0&&matris[a-1][b]==1){//0 ilk indisi sıfır olan satırdan öteye geçmemesi için ve yukarıdaki komşunun komşuluk değerine bakmak için ilk indisi 1 eksilttik
                             indis1=a*14+b;//Yeni oluşturacağımız graphın ilk indisi olarak indis1 i kullandık. İndis1 bizim düğümlerimizin hepsini temsil eden bir dizidir
                             indis2=(a-1)*14+b;//İndis2 bizim herhangi bir düğümümüzün komşusu olan düğümü belirtir
                             graph[indis1][indis2]=1;//Komşuluk uzaklığı girilir
                             indis1=0;indis2=0;
                         }
                         if(b!=13&&matris[a][b+1]==1){//sağ düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=a*14+(b+1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(a!=10&&matris[a+1][b]==1){//aşağı düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=(a+1)*14+b;
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(b!=0&&matris[a][b-1]==1){//Sol düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=a*14+(b-1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         indis1=0;indis2=0;
                     }

                 }
                 b++; 
                 if(b==14){
                     b=0;
                     a++;
                 }

            }// KOMŞULUK MATRİSİ SONU
             
         int iyi_karakter=ls.getx()*14+ls.gety();
         int yol=st1.EnKısaYol(graph, konum, iyi_karakter,0);
         int kuyruk[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kuyruk[i]=0;
         }
            
        
         String dugum_sayisi=String.valueOf(yol-1);
         int number1=st1.EnKısaYol(graph, konum, iyi_karakter,1),number2=number1;
         kuyruk[1]=number1;
         for (int i = 2; i < yol; i++) {
            kuyruk[i]=st1.EnKısaYol(graph, konum, number2,i);
            if(kuyruk[i]==number2-14){
                number2-=14;
            }
            else if (kuyruk[i]==number2+14) {
                number2+=14;
            }
            else if (kuyruk[i]==number2-1) {
                 number2-=1;
            }
            else if (kuyruk[i]==number2+1) {
                 number2+=1;
            }
            
         }
         for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 14; j++) {
                 yeni1[i][j]=yeni[i][j];
             }
         }
         ls.LukeSkywalker("Luke", "iyi", ls.getx(), ls.gety());
         yeni1[ls.getx()][ls.gety()]="L";
         
         int bolum[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             bolum[i]=0;
         }
         int kalan[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kalan[i]=0;
         }
         for (int i = 1; i < kuyruk.length; i++) {
             bolum[i]=(kuyruk[i])/14;
             kalan[i]=(kuyruk[i])%14;
             yeni1[bolum[i]][kalan[i]]="S";
         }
         //st1.getx()=bolum[2];
        
         st1.Stormtrooper("st1","kotu",bolum[kuyruk.length-1],kalan[kuyruk.length-1]);
         
         can=my.getcan()+3;
            if (iyi_karakter==konum) {
                can--;
            }
        konum=st1.getx()*14+st1.gety();
        String health=String.valueOf(can);
         jLabel3.setText(health);
        
         
         jLabel1.setText(dugum_sayisi);
         
        }//STORMTROOPER SONU
        
        
        //DARTHVADER
        else if(harf=='D'){ 
            DarthVader d1= new DarthVader();
            char yer=veri[0].charAt(25); // GİRECEĞİ KAPIYI BELİRLEDİK
            if (sayici==0) {
            switch (yer) {
                case 'A':
                    d1.DarthVader("d1","kotu",5,0);
                    konum=d1.getx()*14+d1.gety();
                    baskonum=5*14+0;
                    break;
                case 'B':
                    d1.DarthVader("d1","kotu",0,4);
                    konum=d1.getx()*14+d1.gety();
                    baskonum=0*14+4;
                    break;
                case 'C':
                    d1.DarthVader("d1","kotu",0,12);
                    konum=d1.getx()*14+d1.gety();
                    baskonum=0*14+12;
                    break;
                case 'D':
                    d1.DarthVader("d1","kotu",5,13);
                    konum=d1.getx()*14+d1.gety();
                    baskonum=5*14+13;
                    break;
                case 'E':
                    d1.DarthVader("d1","kotu",10,4);
                    konum=d1.getx()*14+d1.gety();
                    baskonum=10*14+4;
                    break;
                default:
                    break;
            }
            }
            else   {
                d1.DarthVader("d1","kotu",d1.getx(),d1.gety());
            }
            sayici++;
             //"YENİ" STRİNG TİPİNDE ONU İNT E ÇEVİRDİK "MATRİS" ADINI ALDI
            int matris[][] = new int[11][14];
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 14; j++) {
                    matris[i][j]=Integer.valueOf(yeni[i][j]);
                }
            }

            //KOMŞULUK MATRİSİ OLUŞTURDUK
             int graph[][] = new int[154][154];
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                    graph[i][j]=0;

                 }

            }
             int a=0,b=0;
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                     int indis1,indis2;
                     if (matris[a][b]==0) {
                         graph[i][j]=0;
                     }
                     else if(matris[a][b]==1){
                         if(a!=0&&matris[a-1][b]==1){
                             indis1=a*14+b;
                             indis2=(a-1)*14+b;
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(b!=13&&matris[a][b+1]==1){
                             indis1=a*14+b;
                             indis2=a*14+(b+1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(a!=10&&matris[a+1][b]==1){
                             indis1=a*14+b;
                             indis2=(a+1)*14+b;
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(b!=0&&matris[a][b-1]==1){
                             indis1=a*14+b;
                             indis2=a*14+(b-1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         indis1=0;indis2=0;
                     }

                 }
                 b++; 
                 if(b==14){
                     b=0;
                     a++;
                 }

            }// KOMŞULUK MATRİSİ SONU
             
             int iyi_karakter=ls.getx()*14+ls.gety();
         int yol=d1.EnKısaYol(graph, konum, iyi_karakter,0);
         int kuyruk[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kuyruk[i]=0;
         }
            
        
         String dugum_sayisi=String.valueOf(yol-1);
         int number1=d1.EnKısaYol(graph, konum, iyi_karakter,1),number2=number1;
         kuyruk[1]=number1;
         for (int i = 2; i < yol; i++) {
            kuyruk[i]=d1.EnKısaYol(graph, konum, number2,i);
            if(kuyruk[i]==number2-14){
                number2-=14;
            }
            else if (kuyruk[i]==number2+14) {
                number2+=14;
            }
            else if (kuyruk[i]==number2-1) {
                 number2-=1;
            }
            else if (kuyruk[i]==number2+1) {
                 number2+=1;
            }
            
         }
         for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 14; j++) {
                 yeni1[i][j]=yeni[i][j];
             }
         }
         ls.LukeSkywalker("Luke", "iyi", ls.getx(), ls.gety());
         yeni1[ls.getx()][ls.gety()]="L";
         
         int bolum[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             bolum[i]=0;
         }
         int kalan[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kalan[i]=0;
         }
         for (int i = 1; i < kuyruk.length; i++) {
             bolum[i]=(kuyruk[i]-1)/14;
             kalan[i]=(kuyruk[i])%14;
             yeni1[bolum[i]][kalan[i]]="D";
         }
         //st1.getx()=bolum[2];
        
         d1.DarthVader("d1","kotu",bolum[kuyruk.length-1],kalan[kuyruk.length-1]);
         
         can=ls.getcan()+3;
            if (iyi_karakter==konum) {
                can--;
            }
        konum=d1.getx()*14+d1.gety();
        String health=String.valueOf(can);
         
         jLabel1.setText(dugum_sayisi);
         jLabel3.setText(health);
       // d1.dijkstra(graph, 4);  
        }//DARTHVADER SONU
        
        //KYLOREN
        else if(harf=='K'){
            KyloRen k1= new KyloRen();
            char yer=veri[0].charAt(22); // GİRECEĞİ KAPIYI BELİRLEDİK
            if(sayici==0){
            switch (yer) {
                case 'A':
                    k1.KyloRen("k1","kotu",5,0);
                    konum=k1.getx()*14+k1.gety();
                    baskonum=5*14+0;
                    break;
                case 'B':
                    k1.KyloRen("k1","kotu",0,4);
                    konum=k1.getx()*14+k1.gety();
                    baskonum=0*14+4;
                    break;
                case 'C':
                    k1.KyloRen("k1","kotu",0,12);
                    konum=k1.getx()*14+k1.gety();
                    baskonum=0*14+12;
                    break;
                case 'D':
                    k1.KyloRen("k1","kotu",5,13);
                    konum=k1.getx()*14+k1.gety();
                    baskonum=5*14+13;
                    break;
                case 'E':
                    k1.KyloRen("k1","kotu",10,4);
                    konum=k1.getx()*14+k1.gety();
                    baskonum=10*14+4;
                    break;
                default:
                    break;
            }
            }
            else{
                k1.KyloRen("k1","kotu",k1.getx(),k1.gety());
                //konum=st1.getx()*14+st1.gety();
            }
            
            sayici++;
            
            
            //"YENİ" STRİNG TİPİNDE ONU İNT E ÇEVİRDİK "MATRİS" ADINI ALDI
            int matris[][] = new int[11][14];
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 14; j++) {
                    matris[i][j]=Integer.valueOf(yeni[i][j]);
                }
            }
            //KOMŞULUK MATRİSİ OLUŞTURDUK
             int graph[][] = new int[154][154];
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                    graph[i][j]=0;
                 }

            }
            
             int a=0,b=0;
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                     int indis1,indis2;
                     if (matris[a][b]==0) {
                         graph[i][j]=0;
                     }
                     else if(matris[a][b]==1){
                         if(a!=0&&matris[a-1][b]==1){//0 ilk indisi sıfır olan satırdan öteye geçmemesi için ve yukarıdaki komşunun komşuluk değerine bakmak için ilk indisi 1 eksilttik
                             indis1=a*14+b;//Yeni oluşturacağımız graphın ilk indisi olarak indis1 i kullandık. İndis1 bizim düğümlerimizin hepsini temsil eden bir dizidir
                             indis2=(a-1)*14+b;//İndis2 bizim herhangi bir düğümümüzün komşusu olan düğümü belirtir
                             graph[indis1][indis2]=1;//Komşuluk uzaklığı girilir
                             indis1=0;indis2=0;
                         }
                         if(b!=13&&matris[a][b+1]==1){//sağ düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=a*14+(b+1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(a!=10&&matris[a+1][b]==1){//aşağı düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=(a+1)*14+b;
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(b!=0&&matris[a][b-1]==1){//Sol düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=a*14+(b-1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         indis1=0;indis2=0;
                     }

                 }
                 b++; 
                 if(b==14){
                     b=0;
                     a++;
                 }

            }// KOMŞULUK MATRİSİ SONU
             
         int iyi_karakter=ls.getx()*14+ls.gety();
         int yol=k1.EnKısaYol(graph, konum, iyi_karakter,0);
         int kuyruk[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kuyruk[i]=0;
         }
            
        
         String dugum_sayisi=String.valueOf(yol-1);
         int number1=k1.EnKısaYol(graph, konum, iyi_karakter,1),number2=number1;
         kuyruk[1]=number1;
         for (int i = 2; i < yol; i++) {
            kuyruk[i]=k1.EnKısaYol(graph, konum, number2,i);
            if(kuyruk[i]==number2-14){
                number2-=14;
            }
            else if (kuyruk[i]==number2+14) {
                number2+=14;
            }
            else if (kuyruk[i]==number2-1) {
                 number2-=1;
            }
            else if (kuyruk[i]==number2+1) {
                 number2+=1;
            }
            
         }
         for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 14; j++) {
                 yeni1[i][j]=yeni[i][j];
             }
         }
         ls.LukeSkywalker("Luke", "iyi", ls.getx(), ls.gety());
         yeni1[ls.getx()][ls.gety()]="L";
         
         int bolum[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             bolum[i]=0;
         }
         int kalan[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kalan[i]=0;
         }
         for (int i = 1; i < kuyruk.length; i++) {
             bolum[i]=(kuyruk[i])/14;
             kalan[i]=(kuyruk[i])%14;
             yeni1[bolum[i]][kalan[i]]="K";
         }
         //st1.getx()=bolum[2];
        can=my.getcan()+3;
         k1.KyloRen("k1","kotu",bolum[kuyruk.length-1],kalan[kuyruk.length-1]);
         
         if (iyi_karakter==konum) {
                can--;
            }
         konum=k1.getx()*14+k1.gety();
         k1.KyloRen("k1","kotu",bolum[kuyruk.length-2],kalan[kuyruk.length-2]);
         
         
            if (iyi_karakter==konum) {
                can--;
            }
        konum=k1.getx()*14+k1.gety();
        String health=String.valueOf(can);
         jLabel3.setText(health);
        
         
         jLabel1.setText(dugum_sayisi);
            
        }
        
            
        
        yeni1[5][0]="A";
        yeni1[0][4]="B";
        yeni1[0][12]="C";
        yeni1[5][13]="D";
        yeni1[10][4]="E";
        
        
        String Arazi=yeni1[0][0]+"    "+yeni1[0][1]+"    "+yeni1[0][2]+"    "+yeni1[0][3]+"    "+yeni1[0][4]+"    "+yeni1[0][5]+"    "+yeni1[0][6]+"    "+yeni1[0][7]+"    "+yeni1[0][8]+"    "+yeni1[0][9]+"    "+yeni1[0][10]+"    "+yeni1[0][11]+"    "+yeni1[0][12]+"    "+yeni1[0][13]+"\n\n"+
                yeni1[1][0]+"    "+yeni1[1][1]+"    "+yeni1[1][2]+"    "+yeni1[1][3]+"    "+yeni1[1][4]+"    "+yeni1[1][5]+"    "+yeni1[1][6]+"    "+yeni1[1][7]+"    "+yeni1[1][8]+"    "+yeni1[1][9]+"    "+yeni1[1][10]+"    "+yeni1[1][11]+"    "+yeni1[1][12]+"    "+yeni1[1][13]+"\n\n"+
                yeni1[2][0]+"    "+yeni1[2][1]+"    "+yeni1[2][2]+"    "+yeni1[2][3]+"    "+yeni1[2][4]+"    "+yeni1[2][5]+"    "+yeni1[2][6]+"    "+yeni1[2][7]+"    "+yeni1[2][8]+"    "+yeni1[2][9]+"    "+yeni1[2][10]+"    "+yeni1[2][11]+"    "+yeni1[2][12]+"    "+yeni1[2][13]+"\n\n"+
                yeni1[3][0]+"    "+yeni1[3][1]+"    "+yeni1[3][2]+"    "+yeni1[3][3]+"    "+yeni1[3][4]+"    "+yeni1[3][5]+"    "+yeni1[3][6]+"    "+yeni1[3][7]+"    "+yeni1[3][8]+"    "+yeni1[3][9]+"    "+yeni1[3][10]+"    "+yeni1[3][11]+"    "+yeni1[3][12]+"    "+yeni1[3][13]+"\n\n"+
                yeni1[4][0]+"    "+yeni1[4][1]+"    "+yeni1[4][2]+"    "+yeni1[4][3]+"    "+yeni1[4][4]+"    "+yeni1[4][5]+"    "+yeni1[4][6]+"    "+yeni1[4][7]+"    "+yeni1[4][8]+"    "+yeni1[4][9]+"    "+yeni1[4][10]+"    "+yeni1[4][11]+"    "+yeni1[4][12]+"    "+yeni1[4][13]+"\n\n"+
                yeni1[5][0]+"    "+yeni1[5][1]+"    "+yeni1[5][2]+"    "+yeni1[5][3]+"    "+yeni1[5][4]+"    "+yeni1[5][5]+"    "+yeni1[5][6]+"    "+yeni1[5][7]+"    "+yeni1[5][8]+"    "+yeni1[5][9]+"    "+yeni1[5][10]+"    "+yeni1[5][11]+"    "+yeni1[5][12]+"    "+yeni1[5][13]+"\n\n"+
                yeni1[6][0]+"    "+yeni1[6][1]+"    "+yeni1[6][2]+"    "+yeni1[6][3]+"    "+yeni1[6][4]+"    "+yeni1[6][5]+"    "+yeni1[6][6]+"    "+yeni1[6][7]+"    "+yeni1[6][8]+"    "+yeni1[6][9]+"    "+yeni1[6][10]+"    "+yeni1[6][11]+"    "+yeni1[6][12]+"    "+yeni1[6][13]+"\n\n"+
                yeni1[7][0]+"    "+yeni1[7][1]+"    "+yeni1[7][2]+"    "+yeni1[7][3]+"    "+yeni1[7][4]+"    "+yeni1[7][5]+"    "+yeni1[7][6]+"    "+yeni1[7][7]+"    "+yeni1[7][8]+"    "+yeni1[7][9]+"    "+yeni1[7][10]+"    "+yeni1[7][11]+"    "+yeni1[7][12]+"    "+yeni1[7][13]+"\n\n"+
                yeni1[8][0]+"    "+yeni1[8][1]+"    "+yeni1[8][2]+"    "+yeni1[8][3]+"    "+yeni1[8][4]+"    "+yeni1[8][5]+"    "+yeni1[8][6]+"    "+yeni1[8][7]+"    "+yeni1[8][8]+"    "+yeni1[8][9]+"    "+yeni1[8][10]+"    "+yeni1[8][11]+"    "+yeni1[8][12]+"    "+yeni1[8][13]+"\n\n"+
                yeni1[9][0]+"    "+yeni1[9][1]+"    "+yeni1[9][2]+"    "+yeni1[9][3]+"    "+yeni1[9][4]+"    "+yeni1[9][5]+"    "+yeni1[9][6]+"    "+yeni1[9][7]+"    "+yeni1[9][8]+"    "+yeni1[9][9]+"    "+yeni1[9][10]+"    "+yeni1[9][11]+"    "+yeni1[9][12]+"    "+yeni1[9][13]+"\n\n"+
                yeni1[10][0]+"    "+yeni1[10][1]+"    "+yeni1[10][2]+"    "+yeni1[10][3]+"    "+yeni1[10][4]+"    "+yeni1[10][5]+"    "+yeni1[10][6]+"    "+yeni1[10][7]+"    "+yeni1[10][8]+"    "+yeni1[10][9]+"    "+yeni1[10][10]+"    "+yeni1[10][11]+"    "+yeni1[10][12]+"    "+yeni1[10][13]+"\n\n"
        ;
        jTextArea1.setText(Arazi);
        
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        int matris2[][] = new int[11][14];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 14; j++) {
                matris2[i][j]=Integer.valueOf(yeni[i][j]);
            }
        }
        if(my.gety()!=13&&matris2[my.getx()][my.gety()+1]!=0&&evt.getKeyCode()==KeyEvent.VK_RIGHT){
            System.out.println("sag"+my.getx());
            yeni1[my.getx()][my.gety()]=yeni[my.getx()][my.gety()];
            yeni1[my.getx()][my.gety()+1]="M";
            my.MasterYoda("Yoda", "iyi", my.getx(), my.gety()+1);
        }
        if(my.gety()!=0&&matris2[my.getx()][my.gety()-1]!=0&&evt.getKeyCode()==KeyEvent.VK_LEFT){
            System.out.println("sol"+my.gety());
            yeni1[my.getx()][my.gety()]=yeni[my.getx()][my.gety()];
            yeni1[my.getx()][my.gety()-1]="M";
            my.MasterYoda("Yoda", "iyi", my.getx(), my.gety()-1);
        }
        if(my.getx()!=0&&matris2[my.getx()-1][my.gety()]!=0&&evt.getKeyCode()==KeyEvent.VK_UP){
            System.out.println("yukarı");
            yeni1[my.getx()][my.gety()]=yeni[my.getx()][my.gety()];
            yeni1[my.getx()-1][my.gety()]="M";
            my.MasterYoda("Yoda", "iyi", my.getx()-1, my.gety());
        }
        if(my.getx()!=10&&matris2[my.getx()+1][my.gety()]!=0&&evt.getKeyCode()==KeyEvent.VK_DOWN){
            System.out.println("asagi");
            yeni1[my.getx()][my.gety()]=yeni[my.getx()][my.gety()];
            yeni1[my.getx()+1][my.gety()]="M";
            my.MasterYoda("Yoda", "iyi", my.getx()+1, my.gety());
        }
        //BURADA KARAKTERLERİN BAŞ HARFİNE GÖRE NESNELERİNİ OLUŞTURUYORUZ
        char harf=veri[0].charAt(9); //KARAKTERİ BELİRLEDİK
        
       // System.out.println(harf);
       
        if(harf=='S'){ //STORMTROOPER
            Stormtrooper st1= new Stormtrooper();
            char yer=veri[0].charAt(27); // GİRECEĞİ KAPIYI BELİRLEDİK
            if (sayici==0) {
                switch (yer) {
                case 'A':
                    st1.Stormtrooper("st1","kotu",5,0);
                    konum=st1.getx()*14+st1.gety();
                    baskonum=5*14+0;
                    break;
                case 'B':
                    st1.Stormtrooper("st1","kotu",0,4);
                    konum=st1.getx()*14+st1.gety();
                    baskonum=0*14+4;
                    break;
                case 'C':
                    st1.Stormtrooper("st1","kotu",0,12);
                    konum=st1.getx()*14+st1.gety();
                    baskonum=0*14+12;
                    break;
                case 'D':
                    st1.Stormtrooper("st1","kotu",5,13);
                    konum=st1.getx()*14+st1.gety();
                    baskonum=5*14+13;
                    break;
                case 'E':
                    st1.Stormtrooper("st1","kotu",10,4);
                    konum=st1.getx()*14+st1.gety();
                    baskonum=10*14+4;
                    break;
                default:
                    break;
            }
            }
            else{
                st1.Stormtrooper("st1","kotu",st1.getx(),st1.gety());
                //konum=st1.getx()*14+st1.gety();
            }
            
            sayici++;
            
            
            //"YENİ" STRİNG TİPİNDE ONU İNT E ÇEVİRDİK "MATRİS" ADINI ALDI
            int matris[][] = new int[11][14];
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 14; j++) {
                    matris[i][j]=Integer.valueOf(yeni[i][j]);
                }
            }
            //KOMŞULUK MATRİSİ OLUŞTURDUK
             int graph[][] = new int[154][154];
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                    graph[i][j]=0;
                 }

            }
            
             int a=0,b=0;
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                     int indis1,indis2;
                     if (matris[a][b]==0) {
                         graph[i][j]=0;
                     }
                     else if(matris[a][b]==1){
                         if(a!=0&&matris[a-1][b]==1){//0 ilk indisi sıfır olan satırdan öteye geçmemesi için ve yukarıdaki komşunun komşuluk değerine bakmak için ilk indisi 1 eksilttik
                             indis1=a*14+b;//Yeni oluşturacağımız graphın ilk indisi olarak indis1 i kullandık. İndis1 bizim düğümlerimizin hepsini temsil eden bir dizidir
                             indis2=(a-1)*14+b;//İndis2 bizim herhangi bir düğümümüzün komşusu olan düğümü belirtir
                             graph[indis1][indis2]=1;//Komşuluk uzaklığı girilir
                             indis1=0;indis2=0;
                         }
                         if(b!=13&&matris[a][b+1]==1){//sağ düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=a*14+(b+1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(a!=10&&matris[a+1][b]==1){//aşağı düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=(a+1)*14+b;
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(b!=0&&matris[a][b-1]==1){//Sol düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=a*14+(b-1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         indis1=0;indis2=0;
                     }

                 }
                 b++; 
                 if(b==14){
                     b=0;
                     a++;
                 }

            }// KOMŞULUK MATRİSİ SONU
             
         int iyi_karakter=my.getx()*14+my.gety();
         int yol=st1.EnKısaYol(graph, konum, iyi_karakter,0);
         int kuyruk[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kuyruk[i]=0;
         }
            
        
         String dugum_sayisi=String.valueOf(yol-1);
         int number1=st1.EnKısaYol(graph, konum, iyi_karakter,1),number2=number1;
         kuyruk[1]=number1;
         for (int i = 2; i < yol; i++) {
            kuyruk[i]=st1.EnKısaYol(graph, konum, number2,i);
            if(kuyruk[i]==number2-14){
                number2-=14;
            }
            else if (kuyruk[i]==number2+14) {
                number2+=14;
            }
            else if (kuyruk[i]==number2-1) {
                 number2-=1;
            }
            else if (kuyruk[i]==number2+1) {
                 number2+=1;
            }
            
         }
         for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 14; j++) {
                 yeni1[i][j]=yeni[i][j];
             }
         }
         my.MasterYoda("Yoda", "iyi", my.getx(), my.gety());
         yeni1[my.getx()][my.gety()]="M";
         
         int bolum[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             bolum[i]=0;
         }
         int kalan[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kalan[i]=0;
         }
         for (int i = 1; i < kuyruk.length; i++) {
             bolum[i]=(kuyruk[i])/14;
             kalan[i]=(kuyruk[i])%14;
             yeni1[bolum[i]][kalan[i]]="S";
         }
         //st1.getx()=bolum[2];
        
         st1.Stormtrooper("st1","kotu",bolum[kuyruk.length-1],kalan[kuyruk.length-1]);
         
         can=6;
         my.setcan(can);
            if (iyi_karakter==konum) {
                can--;
            }
        konum=st1.getx()*14+st1.gety();
        String health=String.valueOf(can);
         jLabel3.setText(health);
         jLabel1.setText(dugum_sayisi);
         
        }//STORMTROOPER SONU
        
        
        //DARTHVADER
        else if(harf=='D'){ 
            DarthVader d1= new DarthVader();
            char yer=veri[0].charAt(25); // GİRECEĞİ KAPIYI BELİRLEDİK
            if (sayici==0) {
            switch (yer) {
                case 'A':
                    d1.DarthVader("d1","kotu",5,0);
                    konum=d1.getx()*14+d1.gety();
                    baskonum=5*14+0;
                    break;
                case 'B':
                    d1.DarthVader("d1","kotu",0,4);
                    konum=d1.getx()*14+d1.gety();
                    baskonum=0*14+4;
                    break;
                case 'C':
                    d1.DarthVader("d1","kotu",0,12);
                    konum=d1.getx()*14+d1.gety();
                    baskonum=0*14+12;
                    break;
                case 'D':
                    d1.DarthVader("d1","kotu",5,13);
                    konum=d1.getx()*14+d1.gety();
                    baskonum=5*14+13;
                    break;
                case 'E':
                    d1.DarthVader("d1","kotu",10,4);
                    konum=d1.getx()*14+d1.gety();
                    baskonum=10*14+4;
                    break;
                default:
                    break;
            }
            }
            else   {
                d1.DarthVader("d1","kotu",d1.getx(),d1.gety());
            }
            sayici++;
             //"YENİ" STRİNG TİPİNDE ONU İNT E ÇEVİRDİK "MATRİS" ADINI ALDI
            int matris[][] = new int[11][14];
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 14; j++) {
                    matris[i][j]=Integer.valueOf(yeni[i][j]);
                }
            }

            //KOMŞULUK MATRİSİ OLUŞTURDUK
             int graph[][] = new int[154][154];
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                    graph[i][j]=0;

                 }

            }
             int a=0,b=0;
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                     int indis1,indis2;
                     if (matris[a][b]==0) {
                         graph[i][j]=0;
                     }
                     else if(matris[a][b]==1){
                         if(a!=0&&matris[a-1][b]==1){
                             indis1=a*14+b;
                             indis2=(a-1)*14+b;
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(b!=13&&matris[a][b+1]==1){
                             indis1=a*14+b;
                             indis2=a*14+(b+1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(a!=10&&matris[a+1][b]==1){
                             indis1=a*14+b;
                             indis2=(a+1)*14+b;
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(b!=0&&matris[a][b-1]==1){
                             indis1=a*14+b;
                             indis2=a*14+(b-1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         indis1=0;indis2=0;
                     }

                 }
                 b++; 
                 if(b==14){
                     b=0;
                     a++;
                 }

            }// KOMŞULUK MATRİSİ SONU
             
             int iyi_karakter=my.getx()*14+my.gety();
         int yol=d1.EnKısaYol(graph, konum, iyi_karakter,0);
         int kuyruk[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kuyruk[i]=0;
         }
            
        
         String dugum_sayisi=String.valueOf(yol-1);
         int number1=d1.EnKısaYol(graph, konum, iyi_karakter,1),number2=number1;
         kuyruk[1]=number1;
         for (int i = 2; i < yol; i++) {
            kuyruk[i]=d1.EnKısaYol(graph, konum, number2,i);
            if(kuyruk[i]==number2-14){
                number2-=14;
            }
            else if (kuyruk[i]==number2+14) {
                number2+=14;
            }
            else if (kuyruk[i]==number2-1) {
                 number2-=1;
            }
            else if (kuyruk[i]==number2+1) {
                 number2+=1;
            }
            
         }
         for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 14; j++) {
                 yeni1[i][j]=yeni[i][j];
             }
         }
         my.MasterYoda("Yoda", "iyi", my.getx(), my.gety());
         yeni1[my.getx()][my.gety()]="M";
         
         int bolum[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             bolum[i]=0;
         }
         int kalan[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kalan[i]=0;
         }
         for (int i = 1; i < kuyruk.length; i++) {
             bolum[i]=(kuyruk[i]-1)/14;
             kalan[i]=(kuyruk[i])%14;
             yeni1[bolum[i]][kalan[i]]="D";
         }
         //st1.getx()=bolum[2];
        
         d1.DarthVader("d1","kotu",bolum[kuyruk.length-1],kalan[kuyruk.length-1]);
         can=6;
         my.setcan(can);
         
            if (iyi_karakter==konum) {
                can--;
            }
        konum=d1.getx()*14+d1.gety();
        String health=String.valueOf(can);
         
         jLabel1.setText(dugum_sayisi);
         jLabel3.setText(health);
       // d1.dijkstra(graph, 4);  
        }//DARTHVADER SONU
        
        //KYLOREN
        else if(harf=='K'){
            KyloRen k1= new KyloRen();
            char yer=veri[0].charAt(22); // GİRECEĞİ KAPIYI BELİRLEDİK
            if(sayici==0){
            switch (yer) {
                case 'A':
                    k1.KyloRen("k1","kotu",5,0);
                    konum=k1.getx()*14+k1.gety();
                    baskonum=5*14+0;
                    break;
                case 'B':
                    k1.KyloRen("k1","kotu",0,4);
                    konum=k1.getx()*14+k1.gety();
                    baskonum=0*14+4;
                    break;
                case 'C':
                    k1.KyloRen("k1","kotu",0,12);
                    konum=k1.getx()*14+k1.gety();
                    baskonum=0*14+12;
                    break;
                case 'D':
                    k1.KyloRen("k1","kotu",5,13);
                    konum=k1.getx()*14+k1.gety();
                    baskonum=5*14+13;
                    break;
                case 'E':
                    k1.KyloRen("k1","kotu",10,4);
                    konum=k1.getx()*14+k1.gety();
                    baskonum=10*14+4;
                    break;
                default:
                    break;
            }
            }
            else{
                k1.KyloRen("k1","kotu",k1.getx(),k1.gety());
                //konum=st1.getx()*14+st1.gety();
            }
            
            sayici++;
            
            
            //"YENİ" STRİNG TİPİNDE ONU İNT E ÇEVİRDİK "MATRİS" ADINI ALDI
            int matris[][] = new int[11][14];
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 14; j++) {
                    matris[i][j]=Integer.valueOf(yeni[i][j]);
                }
            }
            //KOMŞULUK MATRİSİ OLUŞTURDUK
             int graph[][] = new int[154][154];
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                    graph[i][j]=0;
                 }

            }
            
             int a=0,b=0;
             for (int i = 0; i < 154; i++) {
                 for (int j = 0; j < 154; j++) {
                     int indis1,indis2;
                     if (matris[a][b]==0) {
                         graph[i][j]=0;
                     }
                     else if(matris[a][b]==1){
                         if(a!=0&&matris[a-1][b]==1){//0 ilk indisi sıfır olan satırdan öteye geçmemesi için ve yukarıdaki komşunun komşuluk değerine bakmak için ilk indisi 1 eksilttik
                             indis1=a*14+b;//Yeni oluşturacağımız graphın ilk indisi olarak indis1 i kullandık. İndis1 bizim düğümlerimizin hepsini temsil eden bir dizidir
                             indis2=(a-1)*14+b;//İndis2 bizim herhangi bir düğümümüzün komşusu olan düğümü belirtir
                             graph[indis1][indis2]=1;//Komşuluk uzaklığı girilir
                             indis1=0;indis2=0;
                         }
                         if(b!=13&&matris[a][b+1]==1){//sağ düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=a*14+(b+1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(a!=10&&matris[a+1][b]==1){//aşağı düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=(a+1)*14+b;
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         if(b!=0&&matris[a][b-1]==1){//Sol düğümle olan komşuluk için
                             indis1=a*14+b;
                             indis2=a*14+(b-1);
                             graph[indis1][indis2]=1;
                             indis1=0;indis2=0;
                         }
                         indis1=0;indis2=0;
                     }

                 }
                 b++; 
                 if(b==14){
                     b=0;
                     a++;
                 }

            }// KOMŞULUK MATRİSİ SONU
             
         int iyi_karakter=my.getx()*14+my.gety();
         int yol=k1.EnKısaYol(graph, konum, iyi_karakter,0);
         int kuyruk[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kuyruk[i]=0;
         }
            
        
         String dugum_sayisi=String.valueOf(yol-1);
         int number1=k1.EnKısaYol(graph, konum, iyi_karakter,1),number2=number1;
         kuyruk[1]=number1;
         for (int i = 2; i < yol; i++) {
            kuyruk[i]=k1.EnKısaYol(graph, konum, number2,i);
            if(kuyruk[i]==number2-14){
                number2-=14;
            }
            else if (kuyruk[i]==number2+14) {
                number2+=14;
            }
            else if (kuyruk[i]==number2-1) {
                 number2-=1;
            }
            else if (kuyruk[i]==number2+1) {
                 number2+=1;
            }
            
         }
         for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 14; j++) {
                 yeni1[i][j]=yeni[i][j];
             }
         }
         my.MasterYoda("Yoda", "iyi", my.getx(), my.gety());
         yeni1[my.getx()][my.gety()]="M";
         
         int bolum[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             bolum[i]=0;
         }
         int kalan[] = new int[yol];
         for (int i = 0; i < yol; i++) {
             kalan[i]=0;
         }
         for (int i = 1; i < kuyruk.length; i++) {
             bolum[i]=(kuyruk[i])/14;
             kalan[i]=(kuyruk[i])%14;
             yeni1[bolum[i]][kalan[i]]="K";
         }
         //st1.getx()=bolum[2];
        can=6;
         my.setcan(can);
         k1.KyloRen("k1","kotu",bolum[kuyruk.length-1],kalan[kuyruk.length-1]);
         
         if (iyi_karakter==konum) {
                can--;
            }
         konum=k1.getx()*14+k1.gety();
         k1.KyloRen("k1","kotu",bolum[kuyruk.length-2],kalan[kuyruk.length-2]);
         
            if (iyi_karakter==konum) {
                can--;
            }
            konum=k1.getx()*14+k1.gety();
        
        String health=String.valueOf(can);
         jLabel3.setText(health);
        
         
         jLabel1.setText(dugum_sayisi);
            
        }
        yeni1[5][0]="A";
       yeni1[0][4]="B";
       yeni1[0][12]="C";
       yeni1[5][13]="D";
       yeni1[10][4]="E";


        String Arazi=yeni1[0][0]+"    "+yeni1[0][1]+"    "+yeni1[0][2]+"    "+yeni1[0][3]+"    "+yeni1[0][4]+"    "+yeni1[0][5]+"    "+yeni1[0][6]+"    "+yeni1[0][7]+"    "+yeni1[0][8]+"    "+yeni1[0][9]+"    "+yeni1[0][10]+"    "+yeni1[0][11]+"    "+yeni1[0][12]+"    "+yeni1[0][13]+"\n\n"+
                yeni1[1][0]+"    "+yeni1[1][1]+"    "+yeni1[1][2]+"    "+yeni1[1][3]+"    "+yeni1[1][4]+"    "+yeni1[1][5]+"    "+yeni1[1][6]+"    "+yeni1[1][7]+"    "+yeni1[1][8]+"    "+yeni1[1][9]+"    "+yeni1[1][10]+"    "+yeni1[1][11]+"    "+yeni1[1][12]+"    "+yeni1[1][13]+"\n\n"+
                yeni1[2][0]+"    "+yeni1[2][1]+"    "+yeni1[2][2]+"    "+yeni1[2][3]+"    "+yeni1[2][4]+"    "+yeni1[2][5]+"    "+yeni1[2][6]+"    "+yeni1[2][7]+"    "+yeni1[2][8]+"    "+yeni1[2][9]+"    "+yeni1[2][10]+"    "+yeni1[2][11]+"    "+yeni1[2][12]+"    "+yeni1[2][13]+"\n\n"+
                yeni1[3][0]+"    "+yeni1[3][1]+"    "+yeni1[3][2]+"    "+yeni1[3][3]+"    "+yeni1[3][4]+"    "+yeni1[3][5]+"    "+yeni1[3][6]+"    "+yeni1[3][7]+"    "+yeni1[3][8]+"    "+yeni1[3][9]+"    "+yeni1[3][10]+"    "+yeni1[3][11]+"    "+yeni1[3][12]+"    "+yeni1[3][13]+"\n\n"+
                yeni1[4][0]+"    "+yeni1[4][1]+"    "+yeni1[4][2]+"    "+yeni1[4][3]+"    "+yeni1[4][4]+"    "+yeni1[4][5]+"    "+yeni1[4][6]+"    "+yeni1[4][7]+"    "+yeni1[4][8]+"    "+yeni1[4][9]+"    "+yeni1[4][10]+"    "+yeni1[4][11]+"    "+yeni1[4][12]+"    "+yeni1[4][13]+"\n\n"+
                yeni1[5][0]+"    "+yeni1[5][1]+"    "+yeni1[5][2]+"    "+yeni1[5][3]+"    "+yeni1[5][4]+"    "+yeni1[5][5]+"    "+yeni1[5][6]+"    "+yeni1[5][7]+"    "+yeni1[5][8]+"    "+yeni1[5][9]+"    "+yeni1[5][10]+"    "+yeni1[5][11]+"    "+yeni1[5][12]+"    "+yeni1[5][13]+"\n\n"+
                yeni1[6][0]+"    "+yeni1[6][1]+"    "+yeni1[6][2]+"    "+yeni1[6][3]+"    "+yeni1[6][4]+"    "+yeni1[6][5]+"    "+yeni1[6][6]+"    "+yeni1[6][7]+"    "+yeni1[6][8]+"    "+yeni1[6][9]+"    "+yeni1[6][10]+"    "+yeni1[6][11]+"    "+yeni1[6][12]+"    "+yeni1[6][13]+"\n\n"+
                yeni1[7][0]+"    "+yeni1[7][1]+"    "+yeni1[7][2]+"    "+yeni1[7][3]+"    "+yeni1[7][4]+"    "+yeni1[7][5]+"    "+yeni1[7][6]+"    "+yeni1[7][7]+"    "+yeni1[7][8]+"    "+yeni1[7][9]+"    "+yeni1[7][10]+"    "+yeni1[7][11]+"    "+yeni1[7][12]+"    "+yeni1[7][13]+"\n\n"+
                yeni1[8][0]+"    "+yeni1[8][1]+"    "+yeni1[8][2]+"    "+yeni1[8][3]+"    "+yeni1[8][4]+"    "+yeni1[8][5]+"    "+yeni1[8][6]+"    "+yeni1[8][7]+"    "+yeni1[8][8]+"    "+yeni1[8][9]+"    "+yeni1[8][10]+"    "+yeni1[8][11]+"    "+yeni1[8][12]+"    "+yeni1[8][13]+"\n\n"+
                yeni1[9][0]+"    "+yeni1[9][1]+"    "+yeni1[9][2]+"    "+yeni1[9][3]+"    "+yeni1[9][4]+"    "+yeni1[9][5]+"    "+yeni1[9][6]+"    "+yeni1[9][7]+"    "+yeni1[9][8]+"    "+yeni1[9][9]+"    "+yeni1[9][10]+"    "+yeni1[9][11]+"    "+yeni1[9][12]+"    "+yeni1[9][13]+"\n\n"+
                yeni1[10][0]+"    "+yeni1[10][1]+"    "+yeni1[10][2]+"    "+yeni1[10][3]+"    "+yeni1[10][4]+"    "+yeni1[10][5]+"    "+yeni1[10][6]+"    "+yeni1[10][7]+"    "+yeni1[10][8]+"    "+yeni1[10][9]+"    "+yeni1[10][10]+"    "+yeni1[10][11]+"    "+yeni1[10][12]+"    "+yeni1[10][13]+"\n\n"
        ;
        jTextArea1.setText(Arazi);
    }//GEN-LAST:event_jButton2KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StarWars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StarWars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StarWars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StarWars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StarWars().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
