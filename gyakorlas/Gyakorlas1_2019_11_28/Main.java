package Gyakorlas1_2019_11_28;

public class Main {   
    static final boolean debug = true;
    
    public static void main(String[] args) {
        Functions.readFile("files/London2012.txt");
        feladat2();
        feladat3();
    }

    private static void feladat2() {
        Functions.systemMsg(Functions.INFO_MSG, "=== [2. feladat] ===");
        
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
            
            Functions.systemMsg(Functions.INFO_MSG, "Döntős napok száma " + keresettSportag + " sportágban: " + db + " db");
        } else Functions.systemMsg(Functions.WARN_MSG, String.format("Nincs ilyen sportág! (%s)", keresettSportag));
    }

    private static void feladat3() {
        Functions.systemMsg(Functions.INFO_MSG, "=== [3. feladat] ===");
        int aranyermek = 0;
        final String keresettSportag = "Úszás";
        for(int i = 0; i < Datastores.sportagLista.size(); i++) {
            if(Datastores.sportagLista.get(i).nev.contentEquals(keresettSportag)) {
                for(int j = 0; j < Datastores.sportagLista.get(i).donto.length; j++) {
                    aranyermek += Datastores.sportagLista.get(i).donto[j];
                }
            }
        }
        Functions.systemMsg(Functions.INFO_MSG, "Aranyérmek száma " + keresettSportag + " sportágban: " + aranyermek + " db");
    }
}
