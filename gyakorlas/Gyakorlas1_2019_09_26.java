/*
 * TAJ szám formai helyességének ellenőrzése
 */

import java.util.Scanner;

public class Gyakorlas1_2019_09_26 {
    public static void main(String[] args) {
        // Változók
        String TAJ = "";
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        
        // Bekérés
        while(TAJ.length() != 9) {
            System.out.print("Kérem adja meg a TAJ számot: ");
            TAJ = sc.nextLine();
        }
        
        // 'TAJ_paratlan', 'TAJ_paros' tömb feltöltése és számolás 'a', 'b' változóba
        for(int i = 0; i < TAJ.length()-1; i++) {
            if(i % 2 == 0) {
                a += 3 * Character.getNumericValue(TAJ.charAt(i));
            } else {
                b += 7 * Character.getNumericValue(TAJ.charAt(i));
            }
        }
        
        // Ellenőrzés, végeredmény
        if((a + b) % 10 == Character.getNumericValue(TAJ.charAt(8))) {
            System.out.println("A TAJ szám VALÓS!");
        } else System.out.println("A TAJ szám NEM VALÓS!");
    }
}
