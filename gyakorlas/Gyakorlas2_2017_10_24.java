import java.io.*;

public class Gyakorlas2_2017_10_24 {
    public static void main(String [] args) {
        BufferedReader be = null;
        PrintWriter ki = null;
        try {
            be = new BufferedReader(new FileReader("szamok.txt"));
            ki = new PrintWriter(new FileWriter("v02.txt"));
            double [] tomb = new double[20];
            int j = 0;
            int pozitiv = 0;
            double osszeg = 0;
            while(be.ready()) {
                tomb[j] = Double.parseDouble(be.readLine());
                if(tomb[j] > 0) pozitiv++;
                osszeg += tomb[j];
                System.out.print(tomb[j] + ", ");
            }
            ki.println(osszeg);
            System.out.println();
            System.out.println("Összegük = " + osszeg);
            System.out.println("Ennyi pozitív van = " + pozitiv);
        } catch(IOException  e) {
            System.err.println("Hiba történt!\n" + e);
        } finally {
            if(be != null) {
                try {
                    be.close();
                    ki.close();
                } catch(IOException e) {
                    //TODO
                }
            }
        }
    }
}
