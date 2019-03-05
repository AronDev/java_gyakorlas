package java_gyakorlas.gyakorlas;
public class Gyakorlas1_2019_03_04 {
    public static void main(String[] args) {
        // Változók deklarálása
        int alap[] = new int[100];
        int dupla[] = new int[alap.length];
        int masodik[] = new int[alap.length];
        int masod[] = new int[alap.length/2];
        int kicsi[] = new int[alap.length];

        /*
         *
         * Az 'alap' nevű tömb feltöltése
         *
         * Leírás:
         *
         * A tömböt feltöltjük random számokkal 1 és 1000 között.
         *
         */
        System.out.println("> 'alap' tömb feltöltése..");
        for(int i = 0; i < alap.length; i++) {
            alap[i] = (int)(Math.random()*1000+1);
            System.out.printf("\talap[%d] = %d%n", i, alap[i]);
        }

        /*
         *
         * A 'dupla' nevű tömb feltöltése
         *
         * Leírás:
         *
         * A tömbe az 'alap' nevű tömb elemének a kétszereseit tároljuk azonos indexen.
         *
         */
        System.out.println("> 'dupla' tömb feltöltése..");
        for(int i = 0; i < alap.length; i++) {
            dupla[i] = alap[i]*2;
            System.out.printf("\tdupla[%d] = %d <alap[%d] * 2>%n", i, dupla[i], i);
        }

        /*
         *
         * A 'masodik' nevű tömb feltöltése
         *
         * Leírás:
         *
         * A tömbnek csak minden második elemébe rakunk értéket az 'alap' nevű tömbből az azonos indexről.
         *
         */
        System.out.println("> 'masodik' tömb feltöltése..");
        for(int i = 0; i < alap.length; i += 2) {
            masodik[i] = alap[i];
            System.out.printf("\tmasodik[%d] = %d <alap[%d]>%n", i, masodik[i], i);
        }

        /*
         *
         * A 'masod' nevű tömb feltöltése
         *
         * Leírás:
         *
         * A tömböt feltöltjük a 'masodik' nevű tömb elemeivel, annyi változással, hogy míg a 'masodik' tömbben minden
         * második indexen vannak értékek, addig a 'masod' tömbben kihagyás nélkül töltjük fel.
         *
         */
        System.out.println("> 'masod' tömb feltöltése..");
        for(int i = 0, j = 0; i < alap.length; i += 2, j++) {
            masod[j] = masodik[i];
            System.out.printf("\tmasod[%d] = %d <masodik[%d]>%n", j, masod[j], i);
        }

        /*
         *
         * A 'kicsi' nevű tömb feltöltése
         *
         * Leírás:
         *
         * A tömbben eltároljuk az 'alap' tömb 30-nál kisebb elemeit kihagyás nélkül.
         *
         */
        System.out.println("> 'kicsi' tömb feltöltése..");
        for(int i = 0, j = 0; i < alap.length; i++) {
            if(alap[i] < 30) {
                kicsi[j] = alap[i];
                System.out.printf("\tkicsi[%d] = %d <alap[%d]>%n", j, alap[i], i);
                j++;
            }
        }
    }
}
