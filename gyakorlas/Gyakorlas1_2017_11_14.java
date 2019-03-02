package java_gyakorlas.gyakorlas;

import java.io.*;

public class Gyakorlas1_2017_11_14 {
    public static void main(String[] args) {
        BufferedReader b = null;
        try {
            b = new BufferedReader(new FileReader("f01.txt"));
            double x[] = new double[28];
            int j = 0;
            double osszeg = 0;
            int otnel_nagyobb = 0;
            double min[] = new double[2];
            min[0] = 100;
            min[1] = 0;
            while(b.ready()) {
                x[j] = Double.parseDouble(b.readLine());
                osszeg += x[j];
                if(x[j] > 5.1) otnel_nagyobb++;
                if(x[j] < min[0]) {
                    min[0] = x[j];
                    min[1] = j;
                }
                j++;
            }
            System.out.println("Átlag = " + osszeg/x.length);
            System.out.println("Legkisebb szám = " + min[0]);
            System.out.println("Legkisebb szám helye = " + min[1]);
            System.out.println("5.1-nél nagyob = " + otnel_nagyobb);
        } catch(IOException e) {
            System.err.println("Hiba történt!\n" + e);
        } finally {
            if(b != null) {
                try {
                    b.close();
                } catch(IOException e) {}
            } 
        }
    }
}
