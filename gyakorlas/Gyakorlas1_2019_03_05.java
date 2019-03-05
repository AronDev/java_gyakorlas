package java_gyakorlas.gyakorlas;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *
 * 'Számolások' a 'documents/Gyakorló feladatok JAVA.pdf' -ből
 *
 */

public class Gyakorlas1_2019_03_05 {
    public static void main(String[] args) {
        //feladat1();
        //feladat2();
        //feladat3();
        //feladat5();
        //feladat6();
        //feladat7();
        feladat8();
    }

    /*
     * 1. feladat
     */

    private static void feladat1() {
        Scanner sc = new Scanner(System.in);
        int szamok[] = new int[2];

        try {
            System.out.print("Add meg az első számot: ");
            szamok[0] = sc.nextInt();
            System.out.print("Add meg a második számot: ");
            szamok[1] = sc.nextInt();
        } catch(InputMismatchException ime) {
            System.err.println("Hibás érték!");
        }

        System.out.println("A két szám..");
        System.out.printf("..összege: %d%n", (szamok[0] + szamok[1]));
        System.out.printf("..különbsége: %d%n", (szamok[0]-szamok[1]));
        System.out.printf("..szorzata: %d%n", (szamok[0]*szamok[1]));
        System.out.printf("..hányadosai: %.0f, %.0f%n", (double)(szamok[0] / szamok[1]),(double)(szamok[1] / szamok[0]));
    }

    /*
     * 2. feladat
     */

    private static void feladat2() {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0;

        try {
            System.out.print("'a' befogó: ");
            a = sc.nextInt();
            System.out.print("'b' befogó: ");
            b = sc.nextInt();
        } catch(InputMismatchException ime) {
            System.err.println("Hibás érték!");
        }
        double c = Math.sqrt(a*a+b*b);
        double T = (a*b/2);
        double K = a+b+c;

        System.out.printf("'c' átfogó: %.2f%n", c);
        System.out.printf("'K' kerület: %.2f%n", K);
        System.out.printf("'T' terület: %.2f%n", T);
        System.out.printf("'r' köréírt kör sugara: %.2f%n", (c/2));
        System.out.printf("'R' beírt kör sugara: %.2f%n", (a*b/K));
    }

    /*
     * 3. feladat
     */

    private static void feladat3() {
        Scanner sc = new Scanner(System.in);

        double P1[] = new double[2];
        double P2[] = new double[2];

        try {
            System.out.print("Add meg a P1 pont X értékét: ");
            P1[0] = sc.nextDouble();

            System.out.print("Add meg a P1 pont Y értékét: ");
            P1[1] = sc.nextDouble();

            System.out.print("Add meg a P2 pont X értékét: ");
            P2[0] = sc.nextDouble();

            System.out.print("Add meg a P2 pont Y értékét: ");
            P2[1] = sc.nextDouble();
        } catch(InputMismatchException ime) {
            System.out.println("Hibás érték!");
        }

        double szakasz = Math.sqrt((P2[1] - P1[1]) * (P2[1] - P1[1]) + (P2[0] - P1[0]) * (P2[0] - P1[0]));

        System.out.printf("P1(%.2f;%.2f) és P2(%.2f;%.2f) között húzott egyenes hossza: %.2f%n",
                P1[0], P1[1], P2[0], P2[1], szakasz);
    }

    /*
     * 5. feladat
     */

    private static void feladat5() {
        Scanner sc = new Scanner(System.in);

        double a = 0, b = 0, c = 0;

        try {
            System.out.print("Add meg a háromszog 'a' befogóját: ");
            a = sc.nextDouble();

            System.out.print("Add meg a háromszog 'b' befogóját: ");
            b = sc.nextDouble();

            System.out.print("Add meg a háromszog 'c' átfogóját: ");
            c = sc.nextDouble();
        } catch(InputMismatchException ime) {
            System.out.println("Hibás érték!");
        }

        // Heron's formula
        double s = (a+b+c)/2;
        double T = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("A háromszög területe: %.2f%n", T);
    }

    /*
     * 6. feladat
     */

    private static void feladat6() {
        Scanner sc = new Scanner(System.in);

        double arfolyam = 0;
        int arBKV = 270;
        int arKave = 70;
        int arTej = 210;
        int arBor = 700;

        try {
            System.out.print("Add meg az euró árfolyamot: ");
            arfolyam = sc.nextDouble();
        } catch(InputMismatchException ime) {
            System.out.println("Hibás érték!");
        }

        System.out.printf("Egy BKV jegy: %.2f%n", (arBKV/arfolyam));
        System.out.printf("Egy autómatából kávé: %.2f%n", (arKave/arfolyam));
        System.out.printf("Egy liter tej: %.2f%n", (arTej/arfolyam));
        System.out.printf("Egy üveg bor: %.2f%n", (arBor/arfolyam));
    }

    /*
     * 7. feladat
     */

    private static void feladat7() {
        Scanner sc = new Scanner(System.in);

        double inputCelsius = 0;

        try {
            System.out.print("Celsius: ");
            inputCelsius = sc.nextDouble();
        } catch(InputMismatchException ime) {
            System.out.println("Hibás érték!");
        }

        System.out.printf("%.2f C = %.2f F%n", inputCelsius, (inputCelsius * 5/9 + 32));
    }

    /*
     * 8. feladat
     */

    private static void feladat8() {
        int bank = 2000000;
        int ev = 3;
        double kamat = 2.32;
        double osszeg = bank;

        for(int i = 0; i < ev; i++) {
            osszeg += osszeg * (kamat / 100);
        }
        System.out.printf("Éves kamat: %.2f%%%n", kamat);
        System.out.printf("%d év múlva %.0f Forintunk lesz%n", ev, osszeg);
    }
}
