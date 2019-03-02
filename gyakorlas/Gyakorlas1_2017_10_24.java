package java_gyakorlas.gyakorlas;

import java.io.*;

public class Gyakorlas1_2017_10_24 {
    public static void main(String args[]) {
        BufferedReader be = null;
        PrintWriter ki = null;
        try {
            be = new BufferedReader(new FileReader("betu.txt"));
            ki = new PrintWriter(new FileWriter("v01.txt"));
            int x = 0;
            int j = 0;
            char a;
            while(be.ready()) {
                a = be.readLine().charAt(0);
                if(a == 'a') x++;
                System.out.print(a + ", ");
                ki.print(a + ", ");
                j++;
            }
            System.out.println();
            System.out.println("Összesen " + x + " db 'a' betű van.");
            System.out.println("Összesen " + j + " db betű van.");
        } catch(IOException e) {
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
