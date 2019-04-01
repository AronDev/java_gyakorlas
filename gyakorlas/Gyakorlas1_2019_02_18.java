public class Gyakorlas1_2019_02_18 {
    public static void main(String[] args) {
        // 1
        System.out.println("\n=== 1. feladatat ===========================");
        System.out.print("Kettővel osztható(ak): ");
        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        // 2
        System.out.println("\n=== 2. feladatat ===========================");
        for(int i = 1; i <= 100; i++) {
            System.out.print(i + ", ");
            if(i % 10 == 0) System.out.println();
        }
        // 3
        System.out.println("\n=== 3. feladatat ===========================");
        for(int i = 1; i <= 15; i++) {
            System.out.println(i + " a másodikon: " + (int)(Math.pow(i, 2)));
        }
        // 4
        System.out.println("=== 4. feladatat ===========================");
        int tomb[] = new int[30];
        int osszeg = 0;
        double atlag = 0;
        System.out.print("Generált számok: ");
        for(int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(Math.random()*11+22);
            System.out.print(tomb[i] + ", ");
            osszeg += tomb[i];
            if(i % 3 == 0) System.out.print(i + ", ");
        }
        atlag = (double)osszeg/tomb.length;
        System.out.print("\n3-mal osztható(ak): ");
        for(int i = 0; i < tomb.length; i++) if(i % 3 == 0) System.out.print(i + ", ");
        System.out.println("\nÖsszeg: " + osszeg + "\nÁtlag: " + atlag);
        // 5
        System.out.println("=== 5. feladatat ===========================");
        int x = 0;
        System.out.println("Szám\tHáromszorosa: ");
        do {
            x = (int)(Math.random()*20-10);
            System.out.println(x + "\t" + (x*3));
        } while(x != 0);
    }
}
