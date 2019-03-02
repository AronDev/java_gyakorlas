package java_gyakorlas.studicore;

import java.util.Scanner;
public class Vezeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány éves? ");
        int age = sc.nextInt();
        if(age >= 17) {
            System.out.println("Vezethet autót.");
        } else {
            System.out.println("Nem vezethet autót.");
        }
    }
}
