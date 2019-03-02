package java_gyakorlas.studicore;

import java.util.Scanner;
public class Csempe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A szoba magassága: ");
        double szobaZ = (sc.nextDouble()*100);
        sc.nextLine();
        System.out.print("A szoba szélessége: ");
        double szobaX = (sc.nextDouble()*100);
        sc.nextLine();
        System.out.print("A szoba hosszúsága: ");
        double szobaY = (sc.nextDouble()*100);

        double csempeMeret = 25.0;

        double x1 = Math.ceil(szobaX/csempeMeret);
        double y1 = Math.ceil(szobaY/csempeMeret);
        double z1 = Math.ceil(szobaZ/csempeMeret);

        double szuksegesCsempe = (x1*z1*2)+(y1*z1*2);

        System.out.println("A szoba kicsempézéséhez " + (int)(szuksegesCsempe) + " csempe kell.");
    }
}
