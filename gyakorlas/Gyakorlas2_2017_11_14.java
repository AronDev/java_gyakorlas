package java_gyakorlas.gyakorlas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gyakorlas2_2017_11_14 {
    public static void main(String[] args) {
        BufferedReader x = null;
        try {
            x = new BufferedReader(new FileReader("f02.txt"));
            double osszeg = 0;
            int tiznel_nagyobb = 0;
            double max[] = new double[2];
            String a = x.readLine();
            String b[] = a.split(" ");
            double y[] = new double[b.length];
            for(int i = 0; i < y.length; i++) {
                y[i] = Double.parseDouble(b[i]);
                if(y[i] > 10) tiznel_nagyobb++;
                if(y[i] > max[0]) {
                    max[0] = y[i];
                    max[1] = i;
                }
                osszeg += y[i];
            }
            System.out.println("Összeg = " + osszeg);
            System.out.println("Legnagyobb szám = " + max[0]);
            System.out.println("Legnagyobb szám helye = " + (int)max[1]);
            System.out.println("Tíznél nagyobb számok = " + tiznel_nagyobb);
        } catch(IOException e) {
            System.err.println("Hiba történt!\n" + e);
        } finally {
            if(x != null) {
                try {
                    x.close();
                } catch(IOException e) {}
            } 
        }
    }
}
