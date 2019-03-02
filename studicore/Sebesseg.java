package java_gyakorlas.studicore;

import java.util.Scanner;
public class Sebesseg {
    public static void main(String[] args) {
        System.out.print("Hány km/h-val ment? ");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        if (v < 51) {
            System.out.println("Ön szabályosan hajtott.");
        } else {
            int buntetes;
            System.out.print("Az Ön büntetése ");
            if (v <= 65) buntetes = 0;
            else if (v <= 75) buntetes = 30000;
            else if (v <= 85) buntetes = 45000;
            else if (v <= 95) buntetes = 60000;
            else if (v <= 105) buntetes = 90000;
            else if (v <= 115) buntetes = 130000;
            else if (v <= 125) buntetes = 200000;
            else buntetes = 300000;
            System.out.println(buntetes + ",- Ft.");
        }
    }
}
