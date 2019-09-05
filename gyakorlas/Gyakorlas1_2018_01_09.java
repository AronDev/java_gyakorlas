import java.io.*;

public class Gyakorlas1_2018_01_09 {
    public static void main(String[] args) {
        BufferedReader be = null;
        PrintWriter ki = null;
        try {
            be = new BufferedReader(new FileReader("adatok.txt"));
            ki = new PrintWriter(new FileWriter("valasz.txt"));
            String fajl_Raw = "";
            fajl_Raw = be.readLine();
            String tomb_[] = fajl_Raw.split(";");
            double tomb[] = new double[tomb_.length];
            int max = 0,min = 0;
            double osszeg = 0;
            double atlag = 0;
            int nagyobb_atlagnal = 0;
            int minusz_haromnal_kisebb = 0;
            for(int i = 0; i < tomb_.length; i++) {
                tomb[i] = Double.parseDouble(tomb_[i]);
                System.out.print(tomb[i] + "\t");
                osszeg += tomb[i];
                if(tomb[i] > tomb[max]) max = i;
                if(tomb[i] < tomb[min]) min = i;
            }
            atlag = osszeg/tomb.length;
            for(int i = 0; i < tomb.length; i++) {
                if(tomb[i] > atlag) nagyobb_atlagnal++;
                if(tomb[i] < -3) minusz_haromnal_kisebb++;
            }
            System.out.println();
            System.out.println("Legnagyobb szám a(z) " + tomb[max] + " és a legkisebb a(z) " + tomb[min]);
            ki.println("Legnagyobb szám a(z) " + tomb[max] + " és a legkisebb a(z) " + tomb[min]);
            System.out.println("Tömb elemeinek összege " + osszeg);
            ki.println("Tömb elemeinek összege " + osszeg);
            System.out.println(nagyobb_atlagnal + " szám van ami nagyobb az elemek átlagánál.");
            ki.println(nagyobb_atlagnal + " szám van ami nagyobb az elemek átlagánál.");
            System.out.println(minusz_haromnal_kisebb + " szám van ami kisebb mint -3.");
            ki.println(minusz_haromnal_kisebb + " szám van ami kisebb mint -3.");
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
