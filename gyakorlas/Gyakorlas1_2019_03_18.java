public class Gyakorlas1_2019_03_18 {
    public static void main(String[] args) {
        // Tömb feltöltése
        double tomb[] = new double[30];
        for(int i = 0; i < tomb.length; i++) {
            tomb[i] = Math.random()*35+5;
            System.out.printf("> tomb[%d] = %f%n",i,tomb[i]);
        }
        
        // Minimum megkeresése
        int min = 0;
        for(int i = 0; i < tomb.length; i++) {
            if(tomb[min] > tomb[i]) min = i;
        }
        System.out.printf("A tömb legkisebb eleme: tomb[%d] => %f%n", min, tomb[min]);
        
        // Összeg-, átlagszámítás
        double osszeg = 0, atlag = 0;
        for(int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
        atlag = osszeg/tomb.length;
        System.out.printf("A tömb elemeinek összege: %f%nA tömb elemeinek átlaga: %f%n", osszeg, atlag);
        
        // Van-e 30-nál nagyobb?
        boolean nagyobbHarminc = false;
        int j = 0;
        while(!nagyobbHarminc && j < tomb.length) {
            if(tomb[j] > 30) nagyobbHarminc = true;
            j++;
        }
        System.out.printf("A tömbben %s olyan szám ami nagyobb mint harminc.%n", (nagyobbHarminc ? "van" : "nincs"));
    }
}
