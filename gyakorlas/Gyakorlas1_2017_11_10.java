package java_gyakorlas.gyakorlas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Gyakorlas1_2017_11_10 {
    public static void main(String args[]) {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new InputStreamReader(System.in));
            double tomb[] = new double[6];
            double osszeg = 0;
            double legkevesebb = 0;
            int legkevesebb_ev = 0;
            double atlag = 0;
            for(int i = 0; i < tomb.length; i++) {
                System.out.print((i+1) + ". év = ");
                tomb[i] = Integer.parseInt(be.readLine());
                osszeg += tomb[i];
                if(i == 0) legkevesebb = tomb[i];
                if(tomb[i] < legkevesebb) {
                    legkevesebb = tomb[i];
                    legkevesebb_ev = i;
                }
            }
            atlag = osszeg/tomb.length;
            System.out.println("Összesen = " + osszeg + "cm");
            System.out.println("Legkevesebb = " + legkevesebb + "cm");
            legkevesebb_ev += 1;
            System.out.println("Év amiben a legkevesebbet nőtt = " + legkevesebb_ev);
            System.out.println("Átlag = " + atlag + "cm");
        } catch(IOException e) {
            System.err.println("Hiba történt!");
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
