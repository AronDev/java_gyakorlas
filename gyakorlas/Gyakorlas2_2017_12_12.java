package java_gyakorlas.gyakorlas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Gyakorlas2_2017_12_12 {
    public static void main(String[] args) {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new InputStreamReader(System.in));
            double tomb[] = new double[8];
            double input = 0;
            double osszeg = 0;
            int fizettek = 0;
            int haromnal_tobb = 0;
            int max = 0;
            boolean ot_gomboc = false;
            for(int i = 0; i < tomb.length; i++) {
                System.out.print("Add meg a(z) " + (i+1) + ". fagyi méretét: ");
                input = Double.parseDouble(be.readLine());
                if(input >= 0.5 && input <= 5) {
                    tomb[i] = input;
                    osszeg += tomb[i];
                    if(tomb[i] > 3) haromnal_tobb++;
                    if(tomb[i] > tomb[max]) {
                        max = i;
                    }
                    if(tomb[i] == 5) ot_gomboc = true;
                } else {
                    System.err.println("A gombócszámnak 0.5 és 5 között kell lennie!");
                    i--;
                }
            }
            fizettek = (int)osszeg*250;
            System.out.println("Összesen " + osszeg + " gombóc fagyit vettek.");
            System.out.println("Ennek az ára " + fizettek + " Ft volt összesen.");
            System.out.println(haromnal_tobb + " alkalommal vettek több mint három gombócot");
            System.out.println("Legnagyobb fagyi a(z) " + tomb[max] + " volt és a(z) " + max + ". napon vették.");
            if(ot_gomboc) System.out.println("Legalább egyszer vettek 5 gombócos fagyit.");
            else System.out.println("Nem vettek 5 gombócos fagyit.");
        } catch(IOException e) {
            System.err.println("HIBA: " + e);
        } catch(NumberFormatException e) {
            System.err.println("Csak szám lehet!");
        } finally {
             if(be != null) {
                 try {
                     be.close();
                 } catch(IOException e) {}
             }
        }
    }
}
