/*
Balázs, Jani, Lilla, Dani, Anita
19, 15, 9, 22, 12

Írasd ki a versenyzők neveinek kezdőbetüit!
Mennyi pontot szereztek összesen?
Ki szerezte a legtöbb pontot?
Van-e 20 pont feletti eredmény? Ki?
Hány darab 10 pont alatti eredmény született?


*/

public class Gyakorlas1_2019_03_11 {
    public static void main(String[] args) {
        String nevek[] = new String[5];
        int pontok[] = new int[nevek.length];
        //
        nevek[0] = "Balázs";
        nevek[1] = "Jani";
        nevek[2] = "Lilla";
        nevek[3] = "Dani";
        nevek[4] = "Anita";
        
        pontok[0] = 19;
        pontok[1] = 15;
        pontok[2] = 9;
        pontok[3] = 22;
        pontok[4] = 12;
        //
        System.out.println("Nevek kezdőbetűi:");
        for(int i = 0; i < nevek.length; i++) {
            System.out.println("\t> " + nevek[i].charAt(0));
        }
        //
        int pontokOsszeg = 0;
        for(int i = 0; i < pontok.length; i++) {
            pontokOsszeg += pontok[i];
        }
        System.out.println("Összesen " + pontokOsszeg + " pontot szereztek.");
        //
        int pontokMax = 0;
        for(int i = 1; i < pontok.length; i++) {
            if(pontok[i] > pontok[pontokMax])
                pontokMax = i;
        }
        System.out.println("Legnagyobb pontszámot " + nevek[pontokMax] + " érte el " + pontok[pontokMax] + " ponttal.");
        //
        boolean pontokNagyobbHusz = false;
        int j = 0;
        do {
            if(pontok[j] > 20)
                pontokNagyobbHusz = true;
            j++;
        } while(pontokNagyobbHusz == false);
        System.out.println((pontokNagyobbHusz ? "Van" : "Nincs") + " 20 pont feletti eredmény.");
        //
        int pontokTizAlattDb = 0;
        for(int i = 0; i < pontok.length; i++) {
            if(pontok[i] < 10)
                pontokTizAlattDb ++;
        }
        System.out.println("Összesen " + pontokTizAlattDb + " darab 10 pont alatti eredmény van.");
    }
}
