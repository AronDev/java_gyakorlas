package Dolgozat2_2020_01_16;

import java.io.File;
import java.util.ArrayList;

public class ChinaTunnels {
    static File file = new File("files/CNtunnels.csv");
    static ArrayList<Tunnel> tInfo = Functions.readFile(file);
    public static void main(String[] args) {
        Functions.feladat3();
        Functions.feladat4();
        Functions.feladat5();
    }
}
