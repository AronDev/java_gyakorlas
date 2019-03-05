package java_gyakorlas.gyakorlas;

import java.io.*;
public class Gyakorlas3_2017_11_21 {
    public static void main(String[] args) {
        BufferedReader be = null;
        PrintWriter ki = null;
        try {
            be = new BufferedReader(new FileReader("dobas.txt"));
            ki = new PrintWriter(new FileWriter("d_valasz.txt"));
            char tomb[] = new char[20];
            int j = 0;
            int fej = 0;
            int iras = 0;
            while(be.ready()){
                tomb[j] = be.readLine().charAt(0);
                switch(tomb[j]) {
                    case 'f': fej++;break;
                    case 'i': iras++;break;
                    default:System.err.println("Hibás karakter = " + tomb[j]);
                }
            }
            System.out.println("A fejek száma: " + fej);
            System.out.println("Az írások száma: " + iras);
            if(fej > iras) {
                System.out.println("Több fejet dobtál mint írást!");
                ki.println("Tobb fejet dobtál mint irast!");
            }
            else if(iras > fej) {
                System.out.println("Több írást dobtál mint fejet!");
                ki.println("Tobb irast dobtal mint fejet!");
            }
            else if(iras == fej) {
                System.out.println("Ugyanannyi fejet dobtál mint írást!");
                ki.println("Ugyanannyi fejet dobtal mint irast!");
            }
            ki.println("A fejek szama: " + fej);
            ki.println("Az irasok szama: " + iras);
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
