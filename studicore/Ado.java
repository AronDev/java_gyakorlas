package java_gyakorlas.studicore;

import java.util.Scanner;
public class Ado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bevétel: ");
        int bevetel = sc.nextInt();
        sc.nextLine();
        System.out.print("Kiadás: ");
        int kiadas = sc.nextInt();
        System.out.println("Iparűzési adó: " + (int)(bevetel*0.02) + " Ft");
        int nyereseg = bevetel-kiadas;
        System.out.println("Nyereség: " + nyereseg + " Ft");
        int afa = (nyereseg/100)*20;
        System.out.println("ÁFA: " + afa + " Ft");
        int nettoNyereseg = nyereseg-afa;
        System.out.println("Nettó nyereség: " + nettoNyereseg + " Ft");
        System.out.println("Társasági adó: " + (int)(nettoNyereseg*0.15) + " Ft");
    }
}
