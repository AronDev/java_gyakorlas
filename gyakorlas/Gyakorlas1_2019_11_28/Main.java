package Gyakorlas1_2019_11_28;


public class Main {   
    static final boolean DEBUG = true;
    
    public static void main(String[] args) {
        if(DEBUG) System.out.println("DEBUG bekapcsolva");
        
        Functions.readFile("files/London2012.txt");
        
        feladat2();
        feladat3();
        feladat4();
        feladat5();
        feladat6();
    }

    private static void feladat2() {
        System.out.println("=== [2. feladat] ===");
        
        final String keresettSportag = "Atlétika";
        
        int sorszam = 0;
        while(sorszam < Datastores.sportagLista.size() && !Datastores.sportagLista.get(sorszam).nev.contentEquals(keresettSportag)) {
            sorszam++;
        }
        
        if(sorszam < Datastores.sportagLista.size()) {
            int db = 0;
            for(int i = 0; i < Datastores.sportagLista.get(sorszam).donto.length; i++) {
                if(Datastores.sportagLista.get(sorszam).donto[i] > 0) db ++;
            }
            
            System.out.println(String.format("Döntős napok száma %s sportágban: %d db", keresettSportag.toLowerCase(), db));
        } else System.out.println(String.format("Nincs ilyen sportág! (%s)", keresettSportag));
    }

    private static void feladat3() {
        System.out.println("=== [3. feladat] ===");
        
        int aranyermekSzama = 0;
        final String keresettSportag = "Úszás";
        for(int i = 0; i < Datastores.sportagLista.size(); i++) {
            if(Datastores.sportagLista.get(i).nev.contentEquals(keresettSportag)) {
                for(int j = 0; j < Datastores.sportagLista.get(i).donto.length; j++) {
                    aranyermekSzama += Datastores.sportagLista.get(i).donto[j];
                }
            }
        }
        System.out.println(String.format("Aranyérmek száma %s sportágban: %d db", keresettSportag.toLowerCase(), aranyermekSzama));
    }

    private static void feladat4() {
        System.out.println("=== [4. feladat] ===");
        
        int [] dontokSzama = new int[Datastores.sportagLista.get(Datastores.sportagLista.size()-1).donto.length];
        for(int i = 0; i < Datastores.sportagLista.size(); i++) {
            for(int j = 0; j < dontokSzama.length; j++) {
                if(Datastores.sportagLista.get(i).donto[j] > 0) dontokSzama[j] += Datastores.sportagLista.get(i).donto[j];
            }
        }
        
        int max = 0;
        for(int i = 0; i < dontokSzama.length; i++) {
            if(dontokSzama[i] > dontokSzama[max]) max = i;
        }
        
        System.out.println(String.format("A legtöbb döntő (%s db) %d-án/én volt", dontokSzama[max], max));
    }

    private static void feladat5() {
        System.out.println("=== [5. feladat] ===");
        
        int aranyermekSzama = 0;
        for(int i = 0; i < Datastores.sportagLista.size(); i++) {
            for(int j = 0; j < Datastores.sportagLista.get(Datastores.sportagLista.size()-1).donto.length; j++) {
                if(Datastores.sportagLista.get(i).donto[j] > 0) aranyermekSzama += Datastores.sportagLista.get(i).donto[j];
            }
        }
        
        System.out.println(String.format("%d db aranyérmet osztottak ki az olimpián", aranyermekSzama));
    }

    private static void feladat6() {
        System.out.println("=== [6. feladat] ===");
        
        final int datum = 1; // júl 27-től aug 12-ig
        int dontokSzama = 0;
        try {
            for(int i = 0; i < Datastores.sportagLista.size(); i++) {
                if(Datastores.sportagLista.get(i).donto[datum] > 0) dontokSzama += Datastores.sportagLista.get(i).donto[datum];
            }
            System.out.println(String.format("Olimpia %d. napján %d db döntő volt", datum, dontokSzama));
        } catch(IndexOutOfBoundsException iooe) {
            System.err.println(iooe.getMessage());
        }
    }
}
