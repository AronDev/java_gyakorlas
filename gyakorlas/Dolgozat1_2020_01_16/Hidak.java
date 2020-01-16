package Dolgozat1_2020_01_16;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hidak {
    public static void main(String[] args) {
        /* ==== [ Változók ] ==== */
        File file = new File("files/hidak.csv");
        ArrayList<String> bridges = new ArrayList<>();
        boolean success = false;
        
        /* ==== [ Beolvasás ] ==== */
        try(Scanner sc = new Scanner(file)) {
            System.out.println("Beolvasás folyamatban.. (" + file + ")");
            String line = "";
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                bridges.add(line);
            }
            bridges.remove(0); // Mezőnevek törlése
            System.out.println("Beolvasás sikeres! (" + file + ")");
            success = true;
        } catch(IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        
        /* ==== [ Műveletek ] ==== */
        if(success) {
            // 3. feladat
            System.out.println("3. feladat: A függőhidak száma az állományban: " + bridges.size());
            
            // 4. feladat
            int japanCount = 0;
            for(int i = 0; i < bridges.size(); i++) {
                if(bridges.get(i).split(";")[1].contains("Japán")) japanCount++;
            }
            System.out.println("4. feladat: A függőhidak száma Japánban: " + japanCount);
            
            // 5. feladat
            boolean germanFound = false;
            for(int i = 0; i < bridges.size(); i++) {
                if(bridges.get(i).split(";")[1].contains("Németország")) {
                    germanFound = true;
                    break;
                }
            }
            System.out.printf("5. feladat: Az adatok között %s németországi híd.\n", (germanFound ? "van" : "nincs"));
            
            // 6. feladat
            int max = 0;
            for(int i = 0; i < bridges.size(); i++) {
                if(Integer.parseInt(bridges.get(i).split(";")[2]) > Integer.parseInt(bridges.get(max).split(";")[2])) {
                    max = i;
                }
            }
            System.out.println("6.feladat: A legnagyobb támaszközű híd adatai:");
            System.out.println("\tNév: " + bridges.get(max).split(";")[0]);
            System.out.println("\tElhelyezkedés: " + bridges.get(max).split(";")[1]);
            System.out.println("\tTámaszköz: " + bridges.get(max).split(";")[2] + "m");
            System.out.println("\tÁtadás: " + bridges.get(max).split(";")[3]);
        } else System.err.println("Hiba történt!");
    }
}
