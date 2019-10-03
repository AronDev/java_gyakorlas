import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gyakorlas1_2019_10_03 {
    public static void main(String[] args) {
        // Változók
        double [] nums = new double[10*3];
        File input = new File("meresek.csv");     
        Scanner sc = null;
        String line = "";
        
        try {
            sc = new Scanner(input);
            
            int lineCount = 0;
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(lineCount + ".\t" + line);
                lineCount++;
            }
            
            System.out.println("Beolvasott sorok száma: " + lineCount);
        } catch(FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(
                    null,
                    fnfe.getMessage(),
                    "Hiba a megnyitáskor",
                    0);
        } finally {
            if(sc != null) {
                sc.close();   
            }
        }
    }
}
