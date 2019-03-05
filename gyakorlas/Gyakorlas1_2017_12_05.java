package java_gyakorlas.gyakorlas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gyakorlas1_2017_12_05 {
    public static void main(String[] args) {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new FileReader("gyumolcs.txt"));
            int tomb[] = new int[20];
            String egeszseges[] = {"Egyszer sem","Egyszer","Kétszer","Háromszor","Négyszer","Ötször","Hatszor","Hétszer","Nyolccor","Kilenccer","Tízszer","Több mint tízszer"};
            int j = 0;
            int osszeg = 0;
            double atlag = 0;
            boolean minden_nap = true;
            int max = 0;
            int egeszseges_ = 0;
            System.out.println("Naponta fogyasztott gyümölcsök száma: ");
            while(be.ready()) {
                tomb[j] = Integer.parseInt(be.readLine());
                System.out.println((j+1) + ". nap: " + tomb[j]);
                osszeg += tomb[j];
                if(tomb[j] == 0) minden_nap = false;
                if(tomb[j] > tomb[max]) {
                    max = j;
                }
                if(tomb[j] >= 3) egeszseges_++;
                j++;
            }
            atlag = osszeg/j;
            System.out.println("Összesen " + osszeg + " darab gyümölcsöt ettem.");
            System.out.println("Átlagosan napi " + atlag + " darab gyümölcsöt fogyasztok.");
            if(minden_nap) System.out.println("Minden nap ettem gyümölcsöt.");
            else System.out.println("Nem minden nap ettem gyümölcsöt.");
            System.out.println("A legtöbb gyümölcs amit ettem egy nap a(z) " + tomb[max] + " darab volt.");
            System.out.println(egeszseges[(egeszseges_-1)] + " ettem egészségesen.");
        } catch(IOException e) {
            System.err.println("HIBA: " + e);
        } finally {
            if(be != null) {
                try {
                    be.close();
                } catch(IOException e) {}
            }
        }
    }
}
