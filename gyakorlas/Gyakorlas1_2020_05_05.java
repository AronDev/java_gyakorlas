import java.util.Scanner;

public class Gyakorlas1_2020_05_05 {
    public static void main(String[] args) {
        int szamlalo = 0;
        int eredetiSzamlalo = 0;
        int nevezo = 0;
        int eredetiNevezo = 0;
        int maradek = 0;
        int lnko = 0;


        System.out.println("Számláló: ");
        try (Scanner sc = new Scanner(System.in)) {
            szamlalo = sc.nextInt();
            eredetiSzamlalo = szamlalo;
            do {
                System.out.println("Nevező: ");
                nevezo = sc.nextInt();
            } while (nevezo == 0);
            eredetiNevezo = nevezo;
            while (nevezo != 0) {
                maradek = szamlalo % nevezo;
                szamlalo = nevezo;
                nevezo = maradek;
            }
            lnko = Math.max(szamlalo, nevezo);
            System.out.printf("Eredeti tört: %d/%d\n", eredetiSzamlalo, eredetiNevezo);
            if (lnko == 0) {
                System.out.println("Tovább nem egyszerűsíthető!");
            } else {
                if (eredetiNevezo == lnko) {
                    System.out.printf("Az egész szám: %d\n", eredetiSzamlalo / lnko);
                } else {
                    System.out.printf("Egyszerűsítve: %d/%d\n", eredetiSzamlalo / lnko, eredetiNevezo / lnko);
                }
            }
        }
    }
}
