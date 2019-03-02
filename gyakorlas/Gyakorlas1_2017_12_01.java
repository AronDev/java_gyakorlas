package java_gyakorlas.gyakorlas;

import java.io.*;

public class Gyakorlas1_2017_12_01 {
    public static void main(String[] args) {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new FileReader("forras.txt"));
            int tomb[] = new int[13];
            int j = 0;
            double atlag = 0;
            int osszeg = 0;
            String tiznel_kevesebb = "FIRST";
            String tiz_negyven = "FIRST";
            while(be.ready()) {
                tomb[j] = Integer.parseInt(be.readLine());
                osszeg += tomb[j];
                if(tomb[j] < 10) {
                    tiznel_kevesebb += (", " + j);
                }
                if(tomb[j] > 10 && tomb[j] < 40) {
                    tiz_negyven += (", " + j);
                }
                j++;
            }
            atlag = (osszeg/j);
            System.out.println("Összesen " + osszeg + " ügyfél volt a 13 nap alatt.");
            System.out.println("Az ügyfelek számának az átlaga " + atlag + " volt.");
            System.out.println("Ezeken a napokon volt 10-nél kevesebb ügyfél: " + tiznel_kevesebb.replace("FIRST,",""));
            System.out.println("Ezeken a napokon volt 10 és 40 közötti ügyfélszám: " + tiz_negyven.replace("FIRST,",""));
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
