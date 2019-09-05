import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Gyakorlas5_2017_10_06 {
    public static void main(String[] args) {
        PrintWriter ki = null;
        try {
            ki = new PrintWriter(new FileWriter("valasz.txt"));
            for(int i = 0; i < 10; i++) {
                ki.println(i + ". sor");
            }
        } catch(IOException e) {
            System.out.println("Hiba: " + e);
        } finally {
            if(ki != null) {
                ki.close();
            }
        }  
    }
}
