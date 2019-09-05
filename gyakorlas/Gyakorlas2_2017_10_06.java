import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gyakorlas2_2017_10_06 {
    public static void main(String[] args) {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new FileReader("fajl2.txt"));
            int lines = 0;
            while(be.ready()) {
                System.out.println(Integer.parseInt(be.readLine()));
                lines++;
            }
            System.out.println("Beolvasott sorok száma: " + lines);
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
