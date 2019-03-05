package java_gyakorlas.gyakorlas;

import java.util.Scanner;

public class Gyakorlas2_2019_03_04 {
    public static void main(String[] args) {
        class Gyerek {
            private String gyerekNev = "";
            private int gyerekKor = 10;
            private double gyerekMagassag = 160.0;
            private int gyerekIQ = 100;
            private boolean okos = false;

            void kiiras() {
                System.out.printf("Név: %s, Kor: %d, Magasság: %f, IQ: %d, Okos-e: %s",
                        this.gyerekNev, this. gyerekKor, this.gyerekMagassag, this.gyerekIQ, (this.okos ? "Igen" : "Nem"));
            }

            void szamolas() {
                if(this.gyerekIQ > 150) this.okos = true;
            }
        }


    }
}
