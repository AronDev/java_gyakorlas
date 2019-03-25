public class Kovacs_Aron1_2019_03_18 {
    public static void main(String[] args) {
        // Tömb feltöltése
        int tomb[] = new int[100];
        for(int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(Math.random()*1000+1);
            System.out.printf("> tomb[%d] = %d%n", i, tomb[i]);
        }
        
        // Maximum kiválasztás
        int tombMax = 0;
        for(int i = 0; i < tomb.length; i++) {
            if(tomb[tombMax] < tomb[i]) tombMax = i;
        }
        
        // Van-e 10-nél kisebb?
        boolean tombKisebbTiz = false;
        int j = 0;
        while(!tombKisebbTiz && j < tomb.length) {
            if(tomb[j] < 10) tombKisebbTiz = true;
            j++;
        }
        System.out.printf("A tömbben %s kisebb szám mint tíz.%n", (tombKisebbTiz ? "van" : "nincs"));
        
        // 900-nál nagyobb -> másik tömb
        int tomb2[] = new int[tomb.length];
        for(int i = 0, k = 0; i < tomb2.length; i++) {
            if(tomb[i] > 900) {
                tomb2[k] = tomb[i];
                System.out.printf("> tomb2[%d] = tomb[%d] (%d)%n", k, i, tomb[i]);
                k++;
            }
        }
    }
}
