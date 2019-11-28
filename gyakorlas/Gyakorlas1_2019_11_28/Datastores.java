package Gyakorlas1_2019_11_28;

import java.util.ArrayList;

public class Datastores {
    static ArrayList <Sportag> sportagLista = new ArrayList<>();
}

class Sportag {
    String nev; // Sportág neve
    int [] donto = new int[16]; // Döntők eredménye (16 db)
    
    public Sportag(String nev) {
        this.nev = nev;
        Functions.systemMsg(Functions.DEBUG_MSG, String.format("sportagLista => '%s'", nev));
    }
}
