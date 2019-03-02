package java_gyakorlas.studicore;

import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a Celsius-fok értéket: ");
        double celsius = sc.nextDouble();
        System.out.printf("Fahrenheitben: %.1f fok.",(celsius * 9/5) + 32);
    }
}
