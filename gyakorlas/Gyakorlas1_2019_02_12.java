public class Gyakorlas1_2019_02_12 {
    public static void main(String[] args) {
        int eletkor[] = new int[30];
        int max = 0;
        int osszeg = 0;
        int hatvanFelett = 0;
        boolean huszonot = false;
        for(int i = 0; i < eletkor.length; i++) {
            eletkor[i] = (int)(Math.random()*40+25);
            System.out.println(" > " + i + " -> " + eletkor[i]);            
            osszeg += eletkor[i];          
            if(eletkor[max] < eletkor[i]) max = i;     
            if(eletkor[i]  > 60) hatvanFelett++;
            if(eletkor[i] == 25 && !huszonot) huszonot = true;
        }
        System.out.println("Legnagyobb életkor -> " + eletkor[max] + "[" + max + "]");
        System.out.println("Átlag életkor -> " + (float)osszeg/eletkor.length);
        System.out.println("Hatvan feletti -> " + hatvanFelett);
        System.out.println("Van-e huszonöt éves tanár? -> " + (huszonot ? "Van" : "Nincs"));
    }
}
