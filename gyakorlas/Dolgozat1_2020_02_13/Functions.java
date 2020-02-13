package Dolgozat1_2020_02_13;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Functions {
    public static ArrayList<Award> readFile(File file) {
        ArrayList<Award> outputArr = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            System.out.println("Beolvasás folyamatban.. (" + file + ")");
            String[] inputData;
            sc.nextLine(); // Skip header
            Award t;
            while(sc.hasNextLine()) {
                inputData = sc.nextLine().split(";");
                t = new Award(inputData[0], inputData[1], Integer.parseInt(inputData[2]), inputData[3]);
                outputArr.add(t);
            }
            System.out.println("Beolvasás sikeres! (" + file + ")");
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        return outputArr;
    }
    
    public static void feladat3() {
        System.out.printf("3. feladat:\n\t2007 és 2010 között %d díjat osztottak ki.\n", Dijak.awardInfo.size());
    }
    
    public static void feladat4() {
        System.out.print("4. feladat:\n\tKérem a játékos nevét: ");
        
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        
        Award foundAward = null;
        
        for (int i = 0; i < Dijak.awardInfo.size(); i++) {
            if (Dijak.awardInfo.get(i).playerName.equalsIgnoreCase(inputStr)) {
                foundAward = Dijak.awardInfo.get(i);
                break;
            }
        }
        
        if (foundAward != null) System.out.printf("\n\tnév: %s\n\tdíj: %s\n\tév: %d\n", foundAward.playerName, foundAward.awardName, foundAward.awardYear);
        else System.out.println("Nincs ilyen nevű játékos!");
    }
    
    public static void feladat6() {
        System.out.println("6. feladat:");
        
        for (int i = 0; i < Dijak.awardInfo.size(); i++) {
            if (Dijak.awardInfo.get(i).awardYear == 2009) {
                if (Dijak.awardInfo.get(i).awardName.equalsIgnoreCase("Gold Glove")) {
                    System.out.println("\t" + Dijak.awardInfo.get(i).playerName);
                }
            }
        }
    }
}
