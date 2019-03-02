package java_gyakorlas.studicore;

import java.util.Scanner;
public class Szamolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.) összeadás");
        System.out.println("2.) kivonás");
        System.out.println("3.) szorzás");
        System.out.println("4.) osztás");
        System.out.print("Melyik műveletet hajtsam végre? ");
        int menuPont = sc.nextInt();
        sc.nextLine();
        if(menuPont > 0 && menuPont < 5) {
            System.out.print("Kérem az egyik számot: ");
            double num1 = sc.nextInt();
            sc.nextLine();
            System.out.print("Kérem a másik számot: ");
            double num2 = sc.nextInt();
            switch(menuPont) {
                case 1: System.out.println("Az eredmény: " + (int)(num1 + num2)); break;
                case 2: System.out.println("Az eredmény: " + (int)(num1 - num2)); break;
                case 3: System.out.println("Az eredmény: " + (int)(num1 * num2)); break;
                case 4: {
                    if(!(num1 == 0 || num2 == 0)) {
                        System.out.println("Az eredmény: " + (num1 / num2));
                    } else {
                        System.out.println("Nullával való osztás.");
                    }
                    break;
                }
            }
        } else {
            System.out.println("Hibás művelet.");
        }
    }
}
