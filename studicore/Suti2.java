package java_gyakorlas.studicore;

import java.util.Scanner;
import java.util.Locale;
public class Suti2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány deka liszt kell a sütihez? ");
        int szuksegesLiszt = sc.nextInt();
        sc.nextLine();
        System.out.print("Hány tojás kell a sütihez? ");
        int szuksegesTojas = sc.nextInt();
        sc.nextLine();
        System.out.print("Hány deka cukor kell a sütihez? ");
        int szuksegesCukor = sc.nextInt();
        sc.nextLine();
        System.out.print("Hány deka liszt van otthon? ");
        int vanLiszt = sc.nextInt();
        sc.nextLine();
        System.out.print("Hány tojás van otthon? ");
        int vanTojas = sc.nextInt();
        sc.nextLine();
        System.out.print("Hány deka cukor van otthon? ");
        int vanCukor = sc.nextInt();
        sc.nextLine();

        double x = (double)vanLiszt/szuksegesLiszt;
        double y = (double)vanTojas/szuksegesTojas;
        double z = (double)vanCukor/szuksegesCukor;

        int sutiEredmeny;

        if (x >= y && x >= z) {
            sutiEredmeny = (int)(Math.ceil(x));
        } else if (y >= z && y >= x) {
            sutiEredmeny = (int)(Math.ceil(y));
        } else {
            sutiEredmeny = (int)(Math.ceil(z));
        }

        int x1 = sutiEredmeny*szuksegesLiszt-vanLiszt;
        int y1 = sutiEredmeny*szuksegesTojas-vanTojas;
        int z1 = sutiEredmeny*szuksegesCukor-vanCukor;

        System.out.printf(Locale.ENGLISH,"Összesen %d adagot készítünk.%n",sutiEredmeny);
        System.out.printf(Locale.ENGLISH,"Venni kell még %d deka lisztet, %d db. tojást és %d deka cukrot.",x1,y1,z1);
    }
}
