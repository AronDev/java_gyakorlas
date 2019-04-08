import java.util.Scanner;
public class Gyakorlas1_2019_04_08 {
    public static void main(String[] args) {
        // Deklarálás
        Scanner sc = new Scanner(System.in);
        int t[] = new int[50];
        String inputStr = null;
        
        // Tömb feltöltése
        for(int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random()*100+1);
        }
        
        // input(str) bekérése
        System.out.print("Paros/paratlan? ");
        inputStr = sc.next();
        switch(inputStr) {
            case "Paros": {} case "paros": {
                System.out.print("\nPáros számok: ");
                for(int i = 0; i < t.length; i++) {
                    if(t[i] % 2 == 0) System.out.print(t[i] + ", ");
                }
                break;
            } case "Paratlan": {} case "paratlan": {
                System.out.print("\nPáratlan számok: ");
                for(int i = 0; i < t.length; i++) {
                    if(t[i] % 2 != 0) System.out.print(t[i] + ", ");
                }
                break;
            } default: System.err.println("Ismeretlen típus!");
        }
    }
}
