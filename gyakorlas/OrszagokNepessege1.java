/* Gyakorlas1_2019_11_14 */
package Gyakorlas1_2019_11_14;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrszagokNepessege1 {
    static Orszag orszag;
    
    static ArrayList <Orszag> orszagLista = new ArrayList<>();
    
    public static void main(String[] args) {
        beolvasas("files/orszagok.txt");
        feladat1();
        feladat2();
    }

    private static void beolvasas(String fileName) {
        File file = new File(fileName);
        try(Scanner sc = new Scanner(file)) {
            String sor;
            String [] tordeles;
            System.out.println("[I] Beolvasás megkezdve..");
            while(sc.hasNextLine()) {
                sor = sc.nextLine();
                tordeles = sor.split("\t");
                orszag = new Orszag(
                        Integer.parseInt(tordeles[0]),  // sorszám
                        tordeles[1].charAt(0),          // földrész
                        tordeles[2],                    // országnév
                        Integer.parseInt(tordeles[3]),  // függőség
                        Long.parseLong(tordeles[4]));   // népesség
                orszagLista.add(orszag);
            }
            System.out.println("[I] Beolvasás sikeres!");
        } catch(FileNotFoundException fnfe) {
            System.out.println("[E] " + fnfe.getMessage());
        } 
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
        int maxFuggoseg = 0;
        int a = -1;
        int b = 0;
        for(int i = 0; i < orszagLista.size(); i++) {
            if(orszagLista.get(i).fuggoseg > 0) {
                if(a == -1) {
                    a = i;
                }
                b = i;
            }
        }
        System.out.printf("a: %d | b: %d\n", a, b);
        for(int i = a; i < b; i++) {
            if(orszagLista.get(i).nepesseg > orszagLista.get(maxFuggoseg).nepesseg)
                maxFuggoseg = i;
        }
        System.out.printf("[I] Legnépesebb függő ország: %s (%,d fő)\n", orszagLista.get(maxFuggoseg).orszagnev, orszagLista.get(maxFuggoseg).nepesseg);
    }
}
