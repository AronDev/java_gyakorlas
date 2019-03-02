package java_gyakorlas.gyakorlas;
public class Dolgozat_2017_09_29 {
    public static void main(String[] args) {
        // 1. feladat
        for(int i = 1; i <= 20; i++) {
            System.out.print(i + ", ");
        }
        // 2. feladat
        int tomb[] = new int[3];
        int x = 0;
        tomb[0] = 1;
        tomb[1] = 2;
        tomb[2] = 3;
        for(int i = 0; i < tomb.length; i++) {
            x += tomb[i];
        }
    }
    
}
