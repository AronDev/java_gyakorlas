import java.util.Scanner;
import java.util.Locale;
public class Suti1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány deka liszt kell a sütihez? ");
        int reqLiszt = sc.nextInt();
        sc.nextLine();
        System.out.print("Hány tojás kell a sütihez? ");
        int reqTojas = sc.nextInt();
        sc.nextLine();
        System.out.print("Hány deka cukor kell a sütihez? ");
        int reqCukor = sc.nextInt();
        sc.nextLine();
        System.out.print("Hány deka liszt van otthon? ");
        int avLiszt = sc.nextInt();
        sc.nextLine();
        System.out.print("Hány tojás van otthon? ");
        int avTojas = sc.nextInt();
        sc.nextLine();
        System.out.print("Hány deka cukor van otthon? ");
        int avCukor = sc.nextInt();
        sc.nextLine();

        double x = (double)avLiszt/reqLiszt;
        double y = (double)avTojas/reqTojas;
        double z = (double)avCukor/reqCukor;

        double sutiEredmeny = 0;

        if (x <= y && x <= z) {
            sutiEredmeny = x;
        } else if (y <= z && y <= x) {
            sutiEredmeny = y;
        } else {
            sutiEredmeny = z;
        }

        System.out.printf(Locale.ENGLISH,"A megadott mennyiségekből %.1f adag készülhet el.",sutiEredmeny);
    }
}
