/*
Gyakorlas1_2019_10_03 (Laz) feladat megoldása dinamikus adatszerkezettel.
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gyakorlas1_2019_10_10 {
    public static void main(String[] args) {
        // Változók
        File file = new File("meresek.csv");
        Scanner sc = null;
        ArrayList <Double> data = new ArrayList<>();
        
        // Beolvasás
        try {
            // Változók
            sc = new Scanner(file);
            String lineStr = ""; // Adott sor tartalma
            String [] tmp = new String[3]; // Sor 3 értéke
            
            // Sorok beolvasása
            while(sc.hasNextLine()) { // Beolvasás míg van következő sor
                lineStr = sc.nextLine(); // Sor beolvasása
                lineStr = lineStr.replace(",", "."); // Vesszők cserélése pont karakterre
                tmp = lineStr.split("\t"); // 3 érték 'tmp' tömbbe helyezése tabonként
                for(String lineNum : tmp) {
                    data.add(Double.valueOf(lineNum)); // Érték hozzáadása a dinamikus tömbhöz
                }
            }
            
            // Statisztika változók
            int maxIndex = 0; // Legnagyobb érték indexe
            int minIndex = 0; // Legkisebb érték indexe
            double arraySum = 0.0; // Összeg
            double arrayAvg = 0.0; // Átlag
            int feverCount = 0; // Lázak mennyisége
            double biggestDiff = 0; // Legnagyobb különbség 2 mérés között
            boolean biggerThan40 = false;
            
            // Statisztika számolás
            for(int i = 0; i < data.size(); i++) {
                if(data.get(i) > data.get(maxIndex)) maxIndex = i; // Max érték keresése
                if(data.get(i) < data.get(minIndex)) minIndex = i; // Min érték keresése
                if(data.get(i) >= 37.5) feverCount++; // Lázak számítása
                if(data.get(i) > 40.0 && !biggerThan40) biggerThan40 = true;
                arraySum += data.get(i); // Összeg számítása
            }
            arrayAvg = arraySum / data.size(); // Átlag számítása
            biggestDiff = data.get(maxIndex) - data.get(minIndex); // Legnagyobb érték két mérés között
            
            // Végeredmény formázása
            String finalStr = "";
            finalStr += String.format("%d sor sikeresen beolvasva a '%s' fájlból.\n\n", data.size(), file);
            finalStr += String.format("Legnagyobb mért hőmérséklete a betegnek %,.2f Celsius fok volt.\n", data.get(maxIndex));
            finalStr += String.format("Legkisebb mért hőmérséklete a betegnek %,.2f Celsius fok volt.\n", data.get(minIndex));
            finalStr += String.format("Legnagyobb különbség két mérés között %,.2f Celsius fok volt.\n", biggestDiff);
            finalStr += String.format("Betegnek az átlaghőmérséklete %,.2f Celsius fok volt.\n", arrayAvg);
            finalStr += String.format("A betegnek %d alkalommal volt láza vagy hőemelkedése.\n", feverCount);
            finalStr += String.format("%s a betegnek nagyobb mint 40.0 Celsius fokos láza.\n", biggerThan40 ? "Volt" : "Nem volt");
            finalStr = finalStr.replaceAll(",", "."); // Vesszők átalakítása pont karakterre
            
            // Végeredmény kiíratása
            showMsg("Végeredmény", finalStr, JOptionPane.INFORMATION_MESSAGE);
        } catch(FileNotFoundException fnfe) {
            showMsg("Hiba a megnyitáskor!", fnfe.getMessage(), JOptionPane.ERROR_MESSAGE);
        } finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
    static void showMsg(String title, String msg, int type) {
        JOptionPane.showMessageDialog(null, msg, title, type);
    }
}
