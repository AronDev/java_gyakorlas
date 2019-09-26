/*
 * Palindroma ellenőrzése
 */

import java.util.Scanner;

public class Gyakorlas2_2019_09_26 {
    public static void main(String[] args) {
        // Változók
        Scanner sc = new Scanner(System.in);
        String reversedStr = "";
        String inputStr = "";
        
        // Bekérés
        inputStr = sc.nextLine();
        
        // Bekért adat átalakítása
        inputStr = atalakitas(inputStr);
        
        // Műveletek
        for(int i = inputStr.length()-1; i >= 0; i--) {
            reversedStr += Character.toString(inputStr.charAt(i));
        }
        
        // Ellenőrzés
        System.out.printf("A szó %spalindroma!%n", reversedStr.equals(inputStr) ? "" : "nem ");
    }
    private static String atalakitas(String iStr) {
        String returnStr = iStr.trim();
        returnStr = returnStr.replaceAll("\\.", "");
        returnStr = returnStr.replaceAll(",", "");
        returnStr = returnStr.replaceAll("-", "");
        returnStr = returnStr.replaceAll("\\+", "");
        returnStr = returnStr.replaceAll("\\?", "");
        returnStr = returnStr.replaceAll("\\!", "");
        returnStr = returnStr.replaceAll("\\*", "");
        returnStr = returnStr.replaceAll("_", "");
        returnStr = returnStr.toLowerCase();
        return returnStr;
    }
}
