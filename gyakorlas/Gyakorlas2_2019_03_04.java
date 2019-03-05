package java_gyakorlas.gyakorlas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gyakorlas2_2019_03_04 {
    public static void main(String[] args) {
        /*
         *
         * Osztály létrehozása
         *
         */
        class Gyerek {
            private String gyerekNev = "";
            private int gyerekKor = 10;
            private double gyerekMagassag = 160.0;
            private int gyerekIQ = 100;
            private boolean gyerekOkos = false;

            void kiiras() {
                System.out.printf("Név: %s, Kor: %d, Magasság: %.2f, IQ: %d, Okos-e: %s%n",
                        this.gyerekNev, this. gyerekKor, this.gyerekMagassag, this.gyerekIQ, (this.gyerekOkos ? "Igen" : "Nem"));
            }

            void szamolas() {
                if(this.gyerekIQ > 150) this.gyerekOkos = true;
            }
        }

        /*
         *
         * Beolvasás konzolról
         *
         */

        Scanner sc = new Scanner(System.in);
        Gyerek[] t = new Gyerek[3];
        int gyerek = 0;

        while(gyerek < t.length) {
            t[gyerek] = new Gyerek();
            System.out.printf("Add meg a(z) %d. gyerek nevét: ", (gyerek + 1));
            t[gyerek].gyerekNev = sc.next();

            sc.nextLine();
            try {
                System.out.printf("Add meg a(z) %d. gyerek korát: ", (gyerek + 1));
                t[gyerek].gyerekKor = sc.nextInt();

                sc.nextLine();

                System.out.printf("Add meg a(z) %d. gyerek magasságát: ", (gyerek + 1));
                t[gyerek].gyerekMagassag = sc.nextDouble();

                sc.nextLine();

                System.out.printf("Add meg a(z) %d. gyerek IQ-ját: ", (gyerek + 1));
                t[gyerek].gyerekIQ = sc.nextInt();

                t[gyerek].szamolas();
                t[gyerek].kiiras();

                gyerek++;
            } catch(NumberFormatException nfe) {}
            catch(InputMismatchException ime) {
                System.err.println("Hibás bemenet: " + ime);
            }
        }

        /*
         *
         * Átlag életkor számítása
         *
         */

        int osszegKor = 0;
        double atlagKor = 0.0;

        for(int i = 0; i < t.length; i++) {
            osszegKor += t[i].gyerekKor;
        }
        atlagKor = (double)osszegKor/t.length;
        System.out.printf("Az átlag életkor %.2f év.", atlagKor);

        /*
        *
        * Okos gyerekek megszámlálása
        *
         */

        int darabOkos = 0;

        for(int i = 0; i < t.length; i++) {
            if(t[i].gyerekOkos) darabOkos++;
        }
        System.out.printf("Összesen %d db okos gyerek van.", darabOkos);
    }
}
