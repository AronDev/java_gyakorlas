import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gyakorlas3_2017_10_06 {
    public static void main(String[] args) {
        BufferedReader be = null;
        int tomb[] = new int[20];
        try {
            be = new BufferedReader(new FileReader("fajl2.txt"));
            int lines = 0;
            while(be.ready()) {
                tomb[lines] = Integer.parseInt(be.readLine());
                lines++;
            }
            System.out.println("Tömb elemeinek a száma: " + lines);
            for(int i = 0; i < lines; i++) {
                System.out.println(tomb[i]);
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
