package java_gyakorlas.studicore;

import java.util.Scanner;
import java.util.Locale;
public class Tegla {
    public static void main(String[] args) {
        System.out.println("Téglatest térfogat- és felszínszámoló");
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("b=");
        double b = sc.nextDouble();
        System.out.print("c=");
        double c = sc.nextDouble();
        System.out.printf(Locale.GERMANY,"Felszín: %.1f%n",2*(a*b+a*c+b*c));
        System.out.printf(Locale.GERMANY,"Térfogat: %.1f",(a*b*c));
    }
}
