import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gyakorlas1_2018_02_02 {
    public static void main(String[] args) {
        int tomb[][] = new int[4][5];
        String tantargyak[] = {"Matek","Programozás","Informatika","Tesi"};
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        int curr = 0;
        int osszeg = 0;
        double atlag[] = new double[4];
        for(int i = 0; i < tomb.length; i++) {
            for(int j = 0; j < tomb[i].length; j++) {
                try {
                    System.out.print("Adja meg a(z) " + tantargyak[i] + " " + (j+1) + ". jegyét:  ");
                    curr = Integer.parseInt(be.readLine());
                    if(curr >= 1 && curr <= 5) {
                        tomb[i][j] = curr;
                        osszeg += curr;
                    } else {
                        System.err.println("A jegynek 1 és 5 között kell lennie!");
                        j--;
                    }
                } catch(IOException e) { 
                    System.err.println("Hiba: " + e);
                }
            }
            atlag[i] = (double)osszeg/5;
            osszeg = 0;
            System.out.println(tantargyak[i] + " tantárgy átlaga: " + atlag[i]);
        }        
    }
}
