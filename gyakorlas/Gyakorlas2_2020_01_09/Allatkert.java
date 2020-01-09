package Gyakorlas2_2020_01_09;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Allatkert {
    public static void main(String[] args) {
        /* === [ Változók ] === */
        ArrayList<String> allatok1 = new ArrayList<>();
        ArrayList<String> allatok2 = new ArrayList<>();
        
        File[] file = {
            new File("files/budapesti_emlosok.csv"),
            new File("files/veszpremi_emlosok.csv")
        };
        
        /* === [ Beolvasás ] === */
        for(int i = 0; i < file.length; i++) {
            try(Scanner sc = new Scanner(file[i])) {
                System.out.println("Beolvasás folyamatban.. (" + file[i] + ")");
                String line = "";
                while(sc.hasNextLine()) {
                    line = sc.nextLine();
                    if(i == 0) allatok1.add(line);
                    else allatok2.add(line);
                }
                System.out.println("Beolvasás befelyezve! (" + file[i] + ")");
            } catch(IOException ioe) {
                System.err.println("Nem található fájl! (" + file[i] + ")");
            }
        }
        
        /* === [ Műveletek ] === */
        // Budapesti állatok
        System.out.printf("A Budapesti Állatkert emlős állatai (%d darab):\n", allatok1.size());
        for(int i = 0; i < allatok1.size(); i++) {
            System.out.println("\t" + allatok1.get(i));
        }
        
        // Veszprémi állatok
        System.out.printf("A Veszprémi Állatkert emlős állatai (%d darab):\n", allatok2.size());
        for(int i = 0; i < allatok2.size(); i++) {
            System.out.println("\t" + allatok2.get(i));
        }
        
        // Közös állatok kiíratása
        System.out.println("Mindkét állatkertben van:");
        String tmp = "";
        ArrayList<String> both = new ArrayList<>();
        for(int i = 0; i < allatok1.size(); i++) {
            tmp = allatok1.get(i);
            for(int j = 0; j < allatok2.size(); j++) {
                if(tmp.equals(allatok2.get(j)) && !both.contains(tmp)) {
                    both.add(tmp);
                    System.out.println("\t" + tmp);
                }
            }
        }
        System.out.println("Összesen " + both.size());
    }
}
