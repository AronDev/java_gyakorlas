package Gyakorlas1_2020_01_23;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Adatbeolvasas {
    static ArrayList<String>[] emlosok = new ArrayList[2];
    public static void main(String[] args) {
        // ArrayList inicializálása
        for(int i = 0; i < emlosok.length; i++) {
            emlosok[i] = new ArrayList<>();
        }
        
        // Fájlok
        File[] files = {
            new File("files/budapesti_emlosok.csv"),
            new File("files/veszpremi_emlosok.csv")
        };
        
        // Beolvasás
        for(int i = 0; i < emlosok.length; i++) {
            beolvasas(files[i], emlosok[i]);
        }
        
        // Alap statisztikák
        for(int i = 0; i < emlosok.length; i++) {
            System.out.println("'" + files[i] + "'");
            System.out.printf("\t└ Darab: %d\n", emlosok[i].size());
        }
    }

    private static void beolvasas(File file, ArrayList<String> output) {
        try(Scanner sc = new Scanner(file)) {
            while(sc.hasNextLine()) {
                output.add(sc.nextLine());
            }
            System.out.printf("Beolvasás sikeres! (%s)\n", file);
        } catch(Exception e) {
            System.err.printf("Beolvasás sikertelen! (%s)\n", file);
            System.err.println("\t└ " + e.getMessage());
        }
    }
}
