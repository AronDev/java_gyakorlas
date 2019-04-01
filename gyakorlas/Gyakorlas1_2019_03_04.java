public class Gyakorlas1_2019_03_04 {
    public static void main(String[] args) {
        int tomb[] = new int[20];
        int osszeg = 0;
        double atlag = 0.0;
        boolean van25 = false;
        int kisebb30 = 0;
        int min = 0;
        int max = 0;
        for(int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(Math.random()*20+20);
            System.out.println("tomb[i] -> " + tomb[i]);
            
            osszeg += tomb[i];
            
            if(tomb[i] == 25) van25 = true;
            
            if(tomb[i] < 30) kisebb30++;            
            
            if(tomb[min] > tomb[i]) min = i;
            
            if(tomb[max] < tomb[i]) max = i;
        }
        atlag = (double)osszeg/tomb.length;
        System.out.println("Tömb elemeinek összege: " + osszeg);
        System.out.println("Tömb elemeinek átlaga: " + atlag);
        System.out.println("A tömb " + (van25 ? "" : "nem") + " tartalmaz 25 értékű elemet.");
        System.out.println("A tömbben összesen " + kisebb30 + " db 30 alatti elem van.");
        System.out.println("A tömb legkisebb eleme: " + tomb[min]);
        System.out.println("A tömb legnagyobb eleme: " + tomb[max]);
    }
}
