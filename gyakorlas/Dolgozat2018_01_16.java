package java_gyakorlas.gyakorlas;

import java.io.*;

public class Dolgozat2018_01_16 {
    public static void main(String args[]) {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new FileReader("suly.txt"));
            double tomb[] = new double[35];
            int j = 0;
            int kover = 0;
            int girnyok = 0;
            double normik_suly = 0;
            int normik = 0;
            double normik_atlag = 0;
            int hajpacni = 0;
            int max = 0, min = 0;
            while(be.ready()) {
                tomb[j] = Double.parseDouble(be.readLine());
                if(tomb[j] > tomb[max]) max = j;
                if(tomb[j] < tomb[min]) min = j;
                if(tomb[j] > 80) kover++;
                if(tomb[j] < 60) girnyok++;
                if(tomb[j] > 120) hajpacni = j;
                if(tomb[j] <= 80) {
                    normik_suly += tomb[j];
                    normik++;
                }
                j++;
            }
            normik_atlag = normik_suly/normik;
            System.out.println("Összesen " + j + " tanuló jár az osztályba.");
            System.out.println("Az osztályban van " + kover + " kövér tanuló, " + girnyok + " girnyó tanuló.");
            System.out.println("A normál súlyú tanulóknak a testsúlyának az átlaga " + normik_atlag + ".");
            System.out.println("Az osztályban a(z) " + hajpacni + ". tanuló hájpacni.");
            System.out.println("A legkövérebb tanuló az " + tomb[max] + " Kg-s, a legsoványabb az " + tomb[min] + " Kg-s.");
            System.out.println("Két tanuló súlyának különbsége: " + (tomb[max] - tomb[min]) );
        } catch(IOException e) {
            
        } finally {
            if(be != null) {
                try {
                    be.close();
                } catch(IOException e) {}
            }
        }
    }
}
