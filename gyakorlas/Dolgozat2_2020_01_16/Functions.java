package Dolgozat2_2020_01_16;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Functions {
    public static ArrayList<Tunnel> readFile(File file) {
        ArrayList<Tunnel> outputArr = new ArrayList<>();
        try(Scanner sc = new Scanner(file)) {
            System.out.println("Beolvasás folyamatban.. (" + file + ")");
            String[] inputData;
            sc.nextLine(); // Skip header
            Tunnel t;
            while(sc.hasNextLine()) {
                inputData = sc.nextLine().split(";");
                t = new Tunnel(inputData[0], Integer.parseInt(inputData[1]), inputData[2], inputData[3]);
                outputArr.add(t);
            }
            System.out.println("Beolvasás sikeres! (" + file + ")");
        } catch(IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        return outputArr;
    }
    
    public static void feladat3() {
        int Under_Planning = 0;
        for(int i = 0; i < ChinaTunnels.tInfo.size(); i++) {
            if(ChinaTunnels.tInfo.get(i).YearOfDelivery.equals("PRJ")) Under_Planning++;
        }
        System.out.println("3.feladat: Tervezés alatt: " + Under_Planning + " db");
    }
    
    public static void feladat4() {
        int max = 0;
        for(int i = 0; i < ChinaTunnels.tInfo.size(); i++) {
            if((!ChinaTunnels.tInfo.get(i).YearOfDelivery.equals("PRJ") && !ChinaTunnels.tInfo.get(i).YearOfDelivery.equals("UC")) && ChinaTunnels.tInfo.get(i).Length > ChinaTunnels.tInfo.get(max).Length) {
                    max = i;
            }
        }
        System.out.println("4.feladat: A leghosszabb megépült alagút neve: " + ChinaTunnels.tInfo.get(max).Name);
    }
    
    public static void feladat5() {
        System.out.println("5.feladat: Statisztika");
        
        ArrayList<String> ProvinceNames = new ArrayList<>();
        String firstProvince = "";
        for (int i = 0; i < ChinaTunnels.tInfo.size(); i++) {
            firstProvince = ChinaTunnels.tInfo.get(i).Province.subSequence(0, 2).toString();
            if (!ProvinceNames.contains(firstProvince)) {
                ProvinceNames.add(firstProvince);
            }
        }
        
        int[] count = new int[ProvinceNames.size()];
        
        for (int i = 0; i < ChinaTunnels.tInfo.size(); i++) {
            for (int j = 0; j < ProvinceNames.size(); j++) {
                if (ChinaTunnels.tInfo.get(i).Province.equals(ProvinceNames.get(j))) {
                    count[j] ++;
                }
            }
        }
        
        for (int i = 0; i < count.length; i++) {
            if(count[i] > 2) {
                System.out.printf("%s - %d db\n", ProvinceNames.get(i), count[i]);   
            }
        }
    }
}
