package java_gyakorlas.studicore;

import java.util.Scanner;
public class Korosztaly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány éves? ");
        int kor = sc.nextInt();
        if (kor < 0 || kor > 130) {
            System.out.println("Hibás bevitel.");
        } else {
            System.out.print("A foglalkozás: ");
            if (kor <= 5) {
                System.out.println("gyerek.");
            } else if (kor <= 18) {
                System.out.println("iskolás.");
            } else if (kor <= 64) {
                System.out.println("dolgozó.");
            } else {
                System.out.println("nyugdíjas.");
            }
        }
    }

}