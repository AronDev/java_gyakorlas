import java.io.*;

public class Gyakorlas3_2017_10_17 {
    public static void main(String args[]) {
        BufferedReader be = null;
        PrintWriter ki = null;
        try {
            be = new BufferedReader(new FileReader("ar.txt"));
            ki = new PrintWriter(new FileWriter("cipo.txt"));
            int arak[] = new int[3];
            int db[] = new int[3];
            int eladas = 0;
            double csokkentes = 0.3;
            db[0] = 70;
            db[1] = 50;
            db[2] = 30;
            int j = 0;
            while(be.ready()) {
                arak[j] = Integer.parseInt(be.readLine());
                eladas *= (arak[j] * db[j] * 1.5);
                j++;
            }
            eladas -= eladas * csokkentes;
            //Folytatás...
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
