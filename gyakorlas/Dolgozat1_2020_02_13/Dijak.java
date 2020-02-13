package Dolgozat1_2020_02_13;

import java.io.File;
import java.util.ArrayList;

public class Dijak {
    static File file = new File("files/dijak.csv");
    static ArrayList<Award> awardInfo = Functions.readFile(file);
    public static void main(String[] args) {
        System.out.println("\nBaseball díjak 2007 - 2010\n");
        Functions.feladat3();
        Functions.feladat4();
        Functions.feladat6();
    }
}
