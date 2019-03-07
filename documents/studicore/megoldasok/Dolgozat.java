import java.util.Scanner;
public class Dolgozat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a dolgozat max. pontszámát: ");
        int max = sc.nextInt();
        sc.nextLine();
        System.out.print("Kérem a dolgozat aktuális pontszámát: ");
        int elert = sc.nextInt();
        System.out.printf("A dolgozat %.2f %%-os lett.",((double)elert/max)*100);
    }
}
