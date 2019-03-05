package java_gyakorlas.gyakorlas;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Gyakorlas2_2019_03_05 {
    public static void main(String[] args) {
        //feladat1();
        //feladat2();
        //feladat3();
        feladat4();
    }
    private static void feladat1() {
        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 0, n3 = 0;

        try {
            System.out.print("Első szám: ");
            n1 = sc.nextInt();

            System.out.print("Második szám: ");
            n2 = sc.nextInt();

            System.out.print("Szorzatuk: ");
            n3 = sc.nextInt();
        } catch(InputMismatchException ime) {
            System.out.println("Hibás érték!");
        }

        System.out.printf("%d * %d %s %d%n", n1, n2, (n1 * n2 == n3 ? "=" : "!="), n3);
    }
    private static void feladat2() {
        Scanner sc = new Scanner(System.in);

        double a = 0, b = 0, c = 0;

        try {
            System.out.print("Háromszög 'a' oldal: ");
            a = sc.nextDouble();

            System.out.print("Háromszög 'b' oldal: ");
            b = sc.nextDouble();

            System.out.print("Háromszög 'c' oldal: ");
            c = sc.nextDouble();
        } catch(InputMismatchException ime) {
            System.out.println("Hibás érték!");
        }

        if(a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Nem derékszögű háromszög");
        } else {
            System.out.println("Derékszögű háromszög");
        }
    }
    private static void feladat3() {
        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 0, n3 = 0;

        try {
            System.out.print("Első szám: ");
            n1 = sc.nextInt();

            System.out.print("Második szám: ");
            n2 = sc.nextInt();

            System.out.print("Harmadik szám: ");
            n3 = sc.nextInt();
        } catch(InputMismatchException ime) {
            System.out.println("Hibás érték!");
        }

        int max = 0;

        if(n1 > n2 && n1 > n3) {
            max = n1;
        } else if(n2 > n1 && n2 > n3) {
            max = n2;
        } else max = n3;

        System.out.printf("A legnagyobb szám a beírtak közül: %d%n", max);
    }
    private static void feladat4() {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = new ArrayList<Integer>();

        try {
            System.out.print("Első szám: ");
            nums.add(sc.nextInt());

            System.out.print("Második szám: ");
            nums.add(sc.nextInt());

            System.out.print("Harmadik szám: ");
            nums.add(sc.nextInt());

            System.out.print("Negyedik szám: ");
            nums.add(sc.nextInt());
        } catch(InputMismatchException ime) {
            System.out.println("Hibás érték!");
        }

        Collections.sort(nums, Collections.reverseOrder());

        System.out.printf("A második legnagyobb szám a beírtak közül: %d%n", nums.get(1));
    }
}
