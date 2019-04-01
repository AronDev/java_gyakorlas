import java.util.Locale;
public class Gyakorlas1_2019_04_01 {
    public static void main(String[] args) {
        /* 1. FELADAT */
        int t[] = new int[50];
        System.out.println("1. FELADAT");
        System.out.print("Számok: ");
        for(int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random()*10+10);
            System.out.printf("%d, ", t[i]);
        }
        System.out.print("\nPárosok: ");
        for(int i = 0; i < t.length; i++) {
            if(t[i] % 2 == 0) {
                System.out.printf("%d, ", t[i]);
            }
        }
        /* 2. FELADAT */
        int izzosor[] = new int[20];
        String izzo[] = {"piros", "kék", "sárga", "zöld"};
        System.out.print("\n\n2. FELADAT\na) ");
        for(int i = 0; i < izzosor.length; i++) {
            izzosor[i] = (int)(Math.random()*4);
            System.out.printf("%s, ", izzo[izzosor[i]]);
        }
        for(int i = 0; i < izzosor.length; i++) {
            if(izzo[izzosor[i]].equals("kék")) {
                izzosor[i] = 2;
            }
        }
        System.out.print("\nb) ");
        for(int i = 0; i < izzosor.length; i++) {
            System.out.printf("%s, ", izzo[izzosor[i]]);
        }
        /* 3. FELADAT */
        System.out.println("\n\n3. FELADAT");
        int t2[] = new int[40];
        for(int i = 0; i < t2.length; i++) {
            t2[i] = (int)(Math.random()*80+10);
            System.out.printf("%d ", t2[i]);
        }
        for(int i = 0; i < t2.length; i++) {
            if(t2[i] > 20 && t2[i] < 60) {
                t2[i] = 0;
            }
        }
        System.out.println("");
        for(int i = 0; i < t2.length; i++) {
            System.out.printf("%d ", t2[i]);
        }
        /* 4. FELADAT */
        System.out.println("\n\n4. FELADAT");
        double t3[] = new double[7];
        for(int i = 0; i < t3.length; i++) {
            t3[i] = (double)(Math.random()*200-100);
            System.out.printf(Locale.US, "%.2f, ", t3[i]);
        }
        for(int i = 0; i < t3.length; i++) {
            if(t3[i] > 0) {
                t3[i] *= -1;
            }
        }
        System.out.println("");
        for(int i = 0; i < t3.length; i++) {
            System.out.printf(Locale.US, "%.2f, ", t3[i]);
        }
        /* 5. FELADAT */
        System.out.println("\n\n5. FELADAT");
        String kosar[] = new String[10];
        System.out.println("Kosár tartalma: ");
        for(int i = 0; i < kosar.length; i++) {
            switch((int)(Math.random()*3)) {
                case 0: kosar[i] = "narancs"; break;
                case 1: kosar[i] = "alma"; break;
                case 2: kosar[i] = "körte"; break;
                case 3: kosar[i] = "szilva"; break;
            }
            System.out.println("- " + kosar[i]);
        }
    }
}
