public class Gyakorlas1_2019_03_25 {
    public static void main(String[] args) {
        // Deklarálások
        int [] tomb = new int[1000]; // Tömb
        int k = 0; // Ciklusváltozó
        
        // Tömb feltöltése
        do {
            tomb[k] = (int)(Math.random()*100+1);
            System.out.printf("tomb[%d] = %d%n", k, tomb[k]);
        } while(tomb[k++] < 70 && k < tomb.length);
        
        // Van-e 10-nél kisebb?
        k = 0;
        boolean tombKisebb10 = false;
        do {
            if(tomb[k] < 10 && tomb[k] > 0) tombKisebb10 = true;
        } while(!tombKisebb10 && ++k < tomb.length);
        System.out.printf("A tömbben %s 10-nél kisebb szám.%n", (tombKisebb10 ? "van" : "nincs"));
        
        // Minimum megkeresése
        k = 0;
        int min = 0;
        while(k < tomb.length && tomb[k] != 0) {
            if(tomb[k] < tomb[min]) min = k;
            k++;
        }
        System.out.println("A tömb legkisebb eleme: " + tomb[min]);
        
        // Átlag
        k = 0;
        int tombOsszeg = 0;
        while(k < tomb.length && tomb[k] > 0) {
            tombOsszeg += tomb[k++];
        }
        double tombAtlag = (double)tombOsszeg/k;
        System.out.println("A tömb átlaga: " + tombAtlag);
    }
}
