import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gyakorlas1_2017_11_28 {
    public static void main(String[] args) {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new FileReader("forras.txt"));
            int tomb[] = new int[30];
            int j = 0;
            int osszeg = 0;
            double atlag = 0;
            int min = 0;
            int max = 0;
            int forgalom = 1;
            while(be.ready()) {
                tomb[j] = Integer.parseInt(be.readLine());
                osszeg += tomb[j];
                if(tomb[j] > tomb[max]) {
                    max = j;
                }
                if(tomb[j] < tomb[min]) {
                    min = j;
                }
                forgalom += (tomb[j]*900);
                j++;
            }
            atlag = osszeg/j;
            System.out.println("Vásárolt virágok átlaga " + atlag + " db volt.");
            System.out.println("Valentín napon " + tomb[14] + " darab virágot adtak el.");
            if(tomb[14] > atlag) {
                System.out.println("Ez az átlaghoz képest " + (tomb[14] - atlag) + "-el nagyobb.");
            }
            else if(tomb[14] < atlag) {
                System.out.println("Ez az átlaghoz képest " + (atlag - tomb[14]) + "-el kevesebb.");
            }
            else System.out.println("Ez az átlaghoz képest megyegyező");
            System.out.println("A(z) " + max + ". napon adták el a legtöbb virágot ami " + tomb[max] + " darab volt.");
            System.out.println("A(z) " + min + ". napon adták el a legkevesebb virágot ami " + tomb[min] + " darab volt.");
            System.out.println("Összesen " + forgalom + " Ft a forgalom.");
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
