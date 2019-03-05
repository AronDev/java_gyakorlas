package java_gyakorlas.gyakorlas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gyakorlas2_2018_01_09 {
    public static void main(String args[]) {
        // Feladat 1.
        System.out.println("Szia, ma kedd van!");
        // Feladat 2.
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        String nevek[] = new String[2];
        try {
            for(int i = 0; i < 2; i++) {
                System.out.print("Add meg a(z) " + (i+1) + ". nevet: ");
                nevek[i] = be.readLine();
            }
            if(nevek[0].length() > nevek[1].length()) {
                System.out.println(nevek[0] + " hosszabb mint a(z) " + nevek[1] + ".");
            } else if(nevek[0].length() == nevek[1].length()) {
                System.out.println("A két név ugyanolyan hosszú.");
            } else if(nevek[0].length() < nevek[1].length()) {
                System.out.println(nevek[1] + " hosszabb mint a(z) " + nevek[0] + ".");
            }
        } catch(IOException e) {
            System.err.println("HIBA: " + e);
        }
        // Feladat 3.
        int tomb_Rnd[] = new int[20];
        int osszeg = 0;
        double atlag = 0;
        int tizenot = 0;
        for(int i = 0; i < tomb_Rnd.length; i++) {
            tomb_Rnd[i] = (int)(10*Math.random()+10);
            System.out.print(tomb_Rnd[i] + " ");
            if(tomb_Rnd[i] == 15) tizenot = i;
            osszeg += tomb_Rnd[i];
        }
        atlag = osszeg/tomb_Rnd.length;
        System.out.println();
        System.out.println("Tömb elemeinek átlaga " + atlag);
        System.out.println("Első 15 értékű szám a(z) " + tizenot + ". helyen van.");
    }
}
