package Dolgozat2_2020_01_16;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChinaTunnels {
    public static void main(String[] args) {
        /* ==== [ Változók ] ==== */
        ArrayList<String> tunnels = new ArrayList<>(100);
        File file = new File("files/CNtunnels.csv");
        boolean success = false;
        
        /* ==== [ Beolvasás ] ==== */
        try(Scanner sc = new Scanner(file)) {
            System.out.println("Beolvasás folyamatban.. (" + file + ")");
            String line = "";
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                tunnels.add(line);
            }
            tunnels.remove(0); // Mezőnevek törlése
            System.out.println("Beolvasás sikeres! (" + file + ")");
            success = true;
        } catch(IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        /* ==== [ Műveletek ] ==== */
        if(success) {
            // 3. feladat
            int UC = 0;
            for(int i = 0; i < tunnels.size(); i++) {
                if(tunnels.get(i).split(";")[2].equals("PRJ")) UC++;
            }
            System.out.println("3.feladat: Tervezés alatt: " + UC + " db");
            
            // 4. feladat
            int max = 0;
            for(int i = 0; i < tunnels.size(); i++) {
                if((!tunnels.get(i).split(";")[2].equals("PRJ") && !tunnels.get(i).split(";")[2].equals("UC")) && (Integer.parseInt(tunnels.get(i).split(";")[1]) > Integer.parseInt(tunnels.get(max).split(";")[1]))) {
                    max = i;
                }
            }
            System.out.println("4.feladat: A leghosszabb megépült alagút neve: " + tunnels.get(max).split(";")[0]);
            
            // 5. feladat
            int[] stat = new int[20];
            for(int i = 0; i < tunnels.size(); i++) {
                switch(tunnels.get(i).split(";")[3]) {
                    case "SI": stat[0]++; break;
                    case "CH": stat[1]++; break;
                    case "FU": stat[2]++; break;
                    case "HB": stat[3]++; break;
                    case "SX": stat[4]++; break;
                    case "GA": stat[5]++; break;
                    case "SH": stat[6]++; break;
                    case "ZJ": stat[7]++; break;
                }
            }
            
            System.out.println("5.feladat: Statisztika");
            System.out.println("SI – " + stat[0] + " db");
            System.out.println("CH – " + stat[1] + " db");
            System.out.println("FU – " + stat[2] + " db");
            System.out.println("HB – " + stat[3] + " db");
            System.out.println("SX – " + stat[4] + " db");
            System.out.println("GA – " + stat[5] + " db");
            System.out.println("SH – " + stat[6] + " db");
            System.out.println("ZJ – " + stat[7] + " db");
            
            // 6. feladat
        } else System.err.println("Hiba történt!");
    }
}
