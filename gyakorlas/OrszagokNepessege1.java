/* Gyakorlas1_2019_11_14 */
package Gyakorlas1_2019_11_14;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OrszagokNepessege1 {
    static Orszag orszag;
    
    static ArrayList <Orszag> orszagLista = new ArrayList<>();
    
    public static void main(String[] args) {
        beolvasas("files/orszagok.txt");
        System.out.println("");
        feladat1();
        feladat2();
        feladat3();
        feladat4();
        System.out.println("");
        feladat5();
    }

    private static void beolvasas(String fileName) {
        File file = new File(fileName);
        try(Scanner sc = new Scanner(file)) {
            String sor;
            String [] tordeles;
            System.out.println("[I] Beolvasás megkezdve..");
            while(sc.hasNextLine()) {
                sor = sc.nextLine();
                sor = sor.replaceAll("\\uFEFF", ""); // invisible Unicode character
                tordeles = sor.split("\t");
                orszag = new Orszag(
                        Integer.parseInt(tordeles[0].trim()),   // sorszám
                        tordeles[1].charAt(0),                  // földrész
                        tordeles[2],                            // országnév
                        Integer.parseInt(tordeles[3].trim()),   // függőség
                        Long.parseLong(tordeles[4]));           // népesség
                orszagLista.add(orszag);
            }
            System.out.println("[I] Beolvasás sikeres!");
        } catch(FileNotFoundException fnfe) {
            System.out.println("[E] " + fnfe.getMessage());
        } 
    }
    
    static Orszag getOrszagByID(int sID) {
        for(int i = 0; i < orszagLista.size(); i++) {
            if(orszagLista.get(i).id == sID) {
                return orszagLista.get(i);
            }
        }
        return null;
    }
    
    private static void feladat1() {
        /* Melyik a legnépesebb ország? */
        int max = 0;
        for(int i = 0; i < orszagLista.size(); i++) {
            if(orszagLista.get(i).nepesseg > orszagLista.get(max).nepesseg) max = i;
        }
        System.out.printf("[I] Legnépesebb ország: %s (%,d fő)\n", orszagLista.get(max).orszagnev, orszagLista.get(max).nepesseg);
    }

    private static void feladat2() {
        /* Melyik a legnépesebb függő terület? */
        int startIndex = -1, j = 0;
        while(startIndex == -1) {
            if(orszagLista.get(j).fuggoseg > 0) startIndex = j;
            j++;
        }
        
        int max = startIndex;
        for(int i = 0; i < orszagLista.size(); i++) {
            if(orszagLista.get(i).fuggoseg > 0 && orszagLista.get(max).fuggoseg > 0) {
                if(orszagLista.get(i).nepesseg > orszagLista.get(max).nepesseg) {
                    max = i;
                }
            }
        }
        System.out.printf("[I] Legnépesebb függő ország: %s (%,d fő)\n", orszagLista.get(max).orszagnev, orszagLista.get(max).nepesseg);
    }

    private static void feladat3() {
        /* Írja ki a földrészeket és népességszámukat csökkenő lakosságszám szerinti sorrendben! */
    }

    private static void feladat4() {
        /* Melyik országnak van a legtöbb külterülete? */        
        int max = 0;
        int [] kulteruletek = new int[orszagLista.size()];    

        for(int i = 0; i < orszagLista.size(); i++) {
            if(orszagLista.get(i).fuggoseg > 0) {
                kulteruletek[orszagLista.get(i).fuggoseg] ++;
            }
        }
        
        for(int i = 0; i < orszagLista.size(); i++) {
            if(kulteruletek[i] > kulteruletek[max]) max = i;
        }
        System.out.printf("[I] Legtöbb külterülettel rendelkező ország: %s (%d db)\n", getOrszagByID(max).orszagnev, kulteruletek[max]);
    }

    private static void feladat5() {
        /* Hozza létre az „európa.txt” nevű állományt az európai országok nevével és népességszám adataival! */
        File outputFile = new File ("europa.txt");
        try(PrintWriter pw = new PrintWriter(outputFile)) {
            System.out.println("[I] Fájl írása megkezdve..");
            for(int i = 0; i < orszagLista.size(); i++) {
                pw.println(String.format("%s\t%d\n", orszagLista.get(i).orszagnev, orszagLista.get(i).nepesseg));
            }
            System.out.println("[I] Fájl írás sikeres!");
        } catch(FileNotFoundException fnfe) {
            try {
                outputFile.createNewFile();
                feladat5();
            } catch(IOException ioe) {
            }
        }

    }
}
