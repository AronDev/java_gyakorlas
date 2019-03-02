package java_gyakorlas.gyakorlas;

import java.io.*;

public class Gyakorlas4_2017_10_24 {
    public static void main(String args[]) {
        BufferedReader be = null;
        PrintWriter ki = null;
        try {
            be = new BufferedReader(new FileReader("egesz.txt"));
            ki = new PrintWriter(new FileWriter("v04.txt"));
            String sor = be.readLine();
            String _tomb[] = sor.split(";");
            int tomb[] = new int[_tomb.length];
            int osszeg = 0;
            int negativ = 0;
            int pozitiv = 0;
            double atlag = 0;
            for(int i = 0; i < _tomb.length; i++) {
                tomb[i] = Integer.parseInt(_tomb[i]);
                osszeg += tomb[i];
                if(tomb[i] > 0) pozitiv++;
                else if(tomb[i] < 0) negativ++;
            }
            atlag = osszeg/tomb.length;
            for(int i = 0; i < tomb.length; i++) {
                if(tomb[i] > 0) {
                    ki.print(tomb[i] + ", ");
                }
            }
            System.out.println("Számok összege = " + osszeg);
            System.out.println("Pozitív számok = " + pozitiv);
            System.out.println("Negatív számok = " + negativ);
            System.out.println("Pozitív számok átlaga = " + atlag);
        } catch(IOException  e) {
            System.err.println("Hiba történt!\n" + e);
        } finally {
            if(be != null) {
                try {
                    be.close();
                    ki.close();
                } catch(IOException e) {}
            }
        }
    }
}