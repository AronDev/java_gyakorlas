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
    }

    private static void beolvasas(String fileName) {
        File file = new File(fileName);
        try(Scanner sc = new Scanner(file)) {
            String sor;
            String [] tordeles;
            while(sc.hasNextLine()) {
                sor = sc.nextLine();
                tordeles = sor.split("\t");
                orszag = new Orszag(
                        Integer.parseInt(tordeles[0]),  // sorszám
                        tordeles[1].charAt(0),          // földrész
                        tordeles[2],                    // országnév
                        Integer.parseInt(tordeles[3]),  // függőség
                        Long.parseLong(tordeles[4]));   // népesség
                System.out.println(orszag.kiiras());
            }
        } catch(FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        } 
    }
}
