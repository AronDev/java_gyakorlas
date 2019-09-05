import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gyakorlas4_2017_10_06 {
    public static void main(String[] args) {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new FileReader("fajl3.txt"));
            String sor;
            int szamok[] = new int[20];
            sor = be.readLine();
            String darabok[] = sor.split(",");
            for(int i = 0; i < darabok.length; i++) {
                szamok[i] = Integer.parseInt(darabok[i]);
                System.out.println(szamok[i]);
            }
        } catch(IOException e) {
            System.out.println("Hiba: " + e);
        } finally {
            if(be != null) {
                try {
                    be.close();
                } catch(IOException e) {}
            }
        }
    }
}
