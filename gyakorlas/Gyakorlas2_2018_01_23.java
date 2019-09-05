import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Gyakorlas2_2018_01_23 {
   public static void main(String[] args) {
            int tomb[][] = new int[4][5];
            int osszeg = 0;
            int kevesebb_1000 = 0;
            double atlag = 0;
            BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
            for(int i = 0; i < tomb.length; i++){
                for(int j = 0; j < tomb[i].length; j++) {
                    do {
                        System.out.print("Add meg mennyi pénzt kaptál a(z) " + (i+1) + ". hét " + (j+1) + " napjában: ");
                        try {
                            tomb[i][j] = Integer.parseInt(be.readLine());
                        } catch(IOException e) {}   
                        osszeg += tomb[i][j];
                        if(tomb[i][j] < 1000) kevesebb_1000++;
                    } while(tomb[i][j] < 500 || tomb[i][j] > 2000);
                }
            }
            int heti_osszeg = 0;
            for(int i = 0; i < tomb.length; i++) {
                for(int j = 0; j < tomb[i].length; j++) {
                    heti_osszeg += tomb[i][j];
                }
                System.out.println((i+1) + ". héten " + heti_osszeg + " Forintot kaptunk.");
                heti_osszeg = 0;
            }
            atlag = osszeg/tomb.length;
            System.out.println("\nÖsszesen  " + osszeg + " Forintot kaptunk.");
            System.out.println("Átlagos heti pénzünk " + atlag + " Forint.");
            System.out.println(kevesebb_1000 + " alkalommal kaptál kevesebb pénzt mint 1000 Forint");
   } 
}
