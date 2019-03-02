package java_gyakorlas.gyakorlas;

import java.io.*;

public class Dolgozat_2017_10_17 {
    public static void main(String[] args) {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new FileReader("adataok.txt"));
            int tomb[] = new int[25];
            int j = 0;
            while(be.ready()) {
                tomb[j] = Integer.parseInt(be.readLine());
                System.out.println(tomb[j]);
                j++;
            }
            System.out.println("Összes beolvasott sor: " + j);
            for(int i = 0; i < j; i++) {
                System.out.print(tomb[i] + ", ");
            }
        } catch(IOException e) {
            System.err.println("Hiba történt! \n " + e);
        } finally {
            if(be != null) {
                try {
                    be.close();
                } catch(IOException e) {}
            }
        }
    }
    
}
