/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mokleters
 */
import javax.swing.JOptionPane;

public class tugas_praktikum_2 {
    
    public static void main (String[] args){
        
        int i = 0;
        boolean ada = false;
        int[] data = new int[20];
        
        data[0]=1;
        data[1]=2;
        data[2]=3;
        data[3]=4;
        data[4]=5;
        data[5]=6;
        data[6]=7;
        data[7]=8;
        data[8]=9;
        data[9]=10;
        data[10]=11;
        data[11]=12;
        data[12]=13;
        data[13]=14;
        data[14]=15;
        data[15]=16;
        data[16]=17;
        data[17]=18;
        data[18]=19;
        data[19]=20;
     
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Cari data = "+"\n"+"1-20"));
    for(i=0; i<=data.length-1; i++) {
     if(data[i]==cari) {
        ada = true;
        break;
    }
    
}

if (ada == true)
     JOptionPane.showMessageDialog(null,"ada di index data " + "[" + i + "]");
   else
    JOptionPane.showMessageDialog(null,"tidak ada");
  }

}