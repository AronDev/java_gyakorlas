import java.io.*;

public class Gyakorlas1_2017_10_17 {
    public static void main(String [] args) {
        BufferedReader be = null;
        PrintWriter ki = null;
        try {
            be = new BufferedReader(new FileReader("fajl3.txt"));
            ki = new PrintWriter(new FileWriter("fajl4.txt"));
            String [] tomb = new String[20];
            int j = 0;
            while(be.ready()) {
                tomb[j] = be.readLine();
                ki.print(tomb[j] + ", ");
                System.out.println(j + ": " + tomb[j]);
                j++;
            }
            System.out.println("Beolvasott sorok száma: " + j);
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
