package Gyakorlas1_2019_11_29;

import java.util.ArrayList;

public class Datastores {
    static ArrayList <Uzemanyag> uzemanyagLista = new ArrayList<>();
}

class Uzemanyag {
    String valtozasDatum;
    int benzinAr;
    int dizelAr;

    public Uzemanyag(String valtozasDatum, int benzinAr, int dizelAr) {
        this.valtozasDatum = valtozasDatum;
        this.benzinAr = benzinAr;
        this.dizelAr = dizelAr;
        
        if(Main.DEBUG) System.out.println(String.format("uzemanyagLista => '%s', '%d', '%d'", valtozasDatum, benzinAr, dizelAr));
    }
}

