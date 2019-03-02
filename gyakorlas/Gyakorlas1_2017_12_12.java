import java.io.*;
public class Gyakorlas1_2017_12_12 {
    public static void main(String[] args) {
        BufferedReader be = null;
        PrintWriter ki = null;
        try {
            be = new BufferedReader(new FileReader("jegy.txt"));
            ki = new PrintWriter(new FileWriter("adat.txt"));
            int j = 0;
            double atlag;
            int osszeg = 0;
            int max = 0;
            int harmas = -1;
            int kettesek = 0;
            boolean egyes = false;
            int tomb[] = new int[10];
            while(be.ready()) {
                do { 
                    tomb[j] = Integer.parseInt(be.readLine()); 
                } while(tomb[j] < 1 || tomb[j] > 5);
                osszeg += tomb[j];
                if(tomb[j] > tomb[max]) max = j;
                if(tomb[j] == 3 && harmas == -1) harmas = j;
                if(tomb[j] == 1) egyes = true;
                if(tomb[j] == 2) kettesek++;
                j++;
            }
            atlag = osszeg/j;
            System.out.println("A jegyek összege " + osszeg + "-as.");
            ki.println("A jegyek osszege " + osszeg + "-as.");
            System.out.println("A jegyek átlaga " + atlag + ".");
            ki.println("A jegyek atlaga " + atlag + ".");
            System.out.println("Legjobb jegy a(z) " + tomb[max] + "-as.");
            ki.println("Legjobb jegy a(z) " + tomb[max] + "-as.");
            if(kettesek > 0) {
                System.out.println("Összesen " + kettesek + " darab kettes van a jegyek között.");
                ki.println("Osszesen " + kettesek + " darab kettes van a jegyek kozott");
            }
            else {
                System.out.println("Egy kettes sincs a  jegyek között.");
                ki.println("Egy kettes sincs a jegyek között.");
            }
            if(harmas != -1) {
                System.out.println("A jegyek között az első hármas a(z) " + (harmas+1) + ". helyen van.");
                ki.println("A jegyek kozott az elso harmas a(z) " + (harmas+1) + ". helyen van.");
            }
            else { 
                System.out.println("A jegyek között nincs hármas.");
                ki.println("A jegyek kozott nincs harmas.");
            }
            if(egyes) {
                System.out.println("A jegyek között van legalább egy egyes");
                ki.println("A jegyek kozott van legalabb egy egyes.");
            }
            else { 
                System.out.println("A jegyek között nincs egyes.");
                ki.println("A jegyek között nincs egyes.");
            }
        } catch(IOException e) {
            System.err.println("HIBA: " + e);
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
