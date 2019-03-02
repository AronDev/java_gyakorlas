import java.util.Calendar;

public class Gyakorlas4_2018_01_09 {
    public static void main(String[] args) {
        Calendar datum = Calendar.getInstance();
        int ora = datum.get(Calendar.HOUR_OF_DAY);
        // Feladat 1.
        int ev,honap,nap,het_napja;
        String honapok[] = {"Január","Február","Március","Április","Május","Július","Június","Augusztus","Szeptember","Október","November","December"};
        String napok[] = {"Vasárnap","Hétfő","Kedd","Szerda","Csütörtök","Péntek","Szombat"};
        ev = datum.get(Calendar.YEAR);
        honap = datum.get(Calendar.MONTH);
        nap = datum.get(Calendar.DAY_OF_MONTH);
        het_napja = datum.get(Calendar.DAY_OF_WEEK);
        // A
        System.out.println(ev + ".0" + (honap+1) + ".0" + nap + ".");
        // B
        System.out.println(ev + "." + honapok[honap] + ".0" + nap + ".");
        // C
        System.out.println("Ma " + napok[(het_napja-1)] + " van.");
        // Feladat 2.
        int perc,masodperc;
        perc = datum.get(Calendar.MINUTE);
        masodperc = datum.get(Calendar.SECOND);
        // A
        System.out.println(ora + ":" + perc);
        // B
        System.out.println(ora + ":" + perc + ":" + masodperc);
        // Feladat 3.
        String napszakok[] = {"Jó reggelt!","Jó napot!","Jó estét!","Jó éjszakát!"};
        int napszak_ = 0;
        if(ora > 4 && ora < 10) napszak_ = 0;
        else if(ora > 10 && ora < 16) napszak_ = 1;
        else if(ora > 17 && ora < 20) napszak_ = 2;
        else if(ora > 20 && ora < 4) napszak_ = 3;
        System.out.println(napszakok[napszak_]);
        // Feladat 4.
        int ev_nap = datum.get(Calendar.DAY_OF_YEAR);
        int xmas = 359;
        System.out.println("Még " + (xmas-ev_nap) + " nap van vissza Karácsonyig.");
    }
}
