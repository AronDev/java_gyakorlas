import java.util.InputMismatchException;
import java.util.Scanner;

public class Gyakorlas1_2019_03_07 {
    public static void main(String[] args) {
        //feladat1();
        //feladat2();
        //feladat3();
        //feladat4();
        feladat5();
    }
    private static void feladat1() {
        int osszeg = 0;
        for(int i = 0; i <= (int)(Math.sqrt(2008)); i++) {
            osszeg += Math.pow(i, 2);
        }
        System.out.printf("Első 2008 négyzetszám összege: %d%n", osszeg);
    }
    private static void feladat2() {
        // TODO
    }
    private static void feladat3() {
        int i = 124365;
        int j = 432;

        while (i != j) {
            if (i > j) i -= j;
            else j -= i;
        }

        System.out.println("'i' és 'j' lnko-ja: " + i);
    }
    private static void feladat4() {
        int num = 33;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i) {
            if(num % i == 0) {
                flag = true;
                break;
            }
        }
        System.out.printf("A(z) %d %sprímszám", num, (flag ? "" : "nem "));
    }

    public static void feladat5() {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        try {
            System.out.print("Szám > ");
            num = sc.nextInt();
        } catch(InputMismatchException ime) {
            System.out.println("Hibás érték");
        }

        if(num < 0)
            System.out.println("A szám nem lehet negatív!");

        int length = String.valueOf(num).length();

        System.out.printf("A szám %d karakter hosszú", length);

        while(num != 1) {
            if(num % 2 == 0) {
                num /= 2;
                System.out.println("> Páros: " + num);
            } else {
                num = num * 3 + 1;
                System.out.println("> Páratlan: " + num);
            }
        }
    }
}
