package java_gyakorlas.gyakorlas;

public class Gyakorlas1_2017_11_07 {
    public static void main(String args[]) {
        // 1. Feladat
        for(int i = 0; i <= 50; i++) {
            if(i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        // 2. Feladat
        for(int i = 0; i <= 100; i++) {
            System.out.print(i + ", ");
            if(i % 10 == 0) System.out.println();
        }
        // 3. Feladat
        for(int i = 0; i <= 15; i++) {
            System.out.println(i * i + ", ");
        }
        System.out.println();
        // 4. Feladat
        int tomb[] = new int[30];
        double osszeg = 0;
        for(int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(23*Math.random()+11);
            System.out.print(tomb[i] + ", ");
            osszeg += tomb[i];
        }
        System.out.print("\n3-mal oszthatóak = ");
        for(int i = 0; i < tomb.length; i++) {
            if(tomb[i] % 3 == 0) {
                System.out.print(tomb[i] + ", ");
            }
        }
        System.out.println("\nÁtlag = " + (osszeg/tomb.length));
        // 5. Feladat
    }
}
