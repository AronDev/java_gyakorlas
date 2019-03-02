// konzol, 1 évben az egyes hónapokban mennyi pénzt kaptunk
// egész év, átlagos, hányszor kaptál 3000-nél többet
package java_gyakorlas.gyakorlas;

import java.io.*;

public class Gyakorlas2_2017_11_07 {
   public static void main(String args[]) {
       try {
           BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
           int tomb[] = new int[12];
           int osszes = 0;
           double atlag = 0;
           int tobb_mint = 0;
           for(int i = 0; i < tomb.length; i++) {
               System.out.print("Add meg a(z) " + (i+1) + ". hónapban kapott zsebpénzed = ");
               String s = be.readLine();
               tomb[i] = Integer.parseInt(s);
           }
           for(int i = 0; i < tomb.length; i++) {
               osszes += tomb[i];
               if(tomb[i] >= 3000) tobb_mint++;
           }
           atlag = osszes/tomb.length;
           System.out.println("Összesen " + osszes + " Forintot kaptál");
           System.out.println("Átlag = " + atlag);
           System.out.println(tobb_mint + " alkalommal kaptál többet mint 3000 Forint");
           be.close();
       } catch(IOException e) {
           
       } catch(NumberFormatException e) {
           System.err.println("Csak számot adhatsz meg!");
       }
   } 
}
