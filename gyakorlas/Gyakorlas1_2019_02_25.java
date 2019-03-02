public class Gyakorlas1_2019_02_25 {
    public static void main(String[] args) {
        int t[] = new int[100];
        boolean van990 = false;
        int nagyobb700[] = new int[t.length];
        for(int i = 0,j = 0; i < t.length; i++) {
            t[i] = (int)(Math.random()*1000+1);
            // Van-e 990-nél kisebb?
            if(t[i] < 990) van990 = true;
            // 700-nál nagyobb
            if(t[i] > 700) {
                nagyobb700[j] = t[i];
                j++;
            }
        }
        System.out.printf("%s 990-nél kisebb.%n",(van990 ? "Van" : "Nincs"));
        int j = 0;
        int min = 0;
        do {
            if(nagyobb700[min] > nagyobb700[j]) min = j;
            j++;
        } while(nagyobb700[j] > 0);
        System.out.printf("A legkisebb szám a 'nagyobb700' tömbből a(z) %d%n",nagyobb700[min]);
    }     
}
