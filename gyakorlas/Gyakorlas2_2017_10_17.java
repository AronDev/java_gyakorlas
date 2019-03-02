package java_gyakorlas.gyakorlas;

import java.io.*;

public class Gyakorlas2_2017_10_17 {
    public static void main(String args[]) {
        BufferedReader be = null;
        PrintWriter ki = null;
        try {
            be = new BufferedReader(new FileReader("szam.txt"));
            ki = new PrintWriter(new FileWriter("eredmeny.txt"));
            int tomb[] = new int[20];
            int j = 0;
            int sum = 0;
            while(be.ready()) {
                tomb[j] = Integer.parseInt(be.readLine());
                sum += tomb[j];
                j++;
            }
            ki.println("Eredmeny = " + sum);
        } catch(IOException e) {
            System.err.println("Hiba történt! \n " + e);
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
