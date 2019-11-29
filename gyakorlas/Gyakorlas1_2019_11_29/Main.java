package Gyakorlas1_2019_11_29;

public class Main {
    final static boolean DEBUG = true;
    
    public static void main(String [] args) {
        if(DEBUG) System.out.println("DEBUG bekapcsolva");
        
        Functions.readFile("files/uzemanyag.txt");
        
        feladat3();
    }

    private static void feladat3() {
        System.out.println("3. feladat: Változások száma: " + Datastores.uzemanyagLista.size());
    }
}
