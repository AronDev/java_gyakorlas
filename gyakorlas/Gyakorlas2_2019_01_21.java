import java.util.*;
public class Gyakorlas2_2019_01_21 {
    public static void main(String[] args) {
        String be = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a szöveget: ");
        
        be = sc.next();
        
        char t[] = {'a','á','e','é','i','í','o','ó','ö','ő','u','ú','ü','ű'};
        
        for(int i = 0; i < be.length(); i++) {
            for(int j = 0; j < t.length-1; j++) {
                if(be.charAt(i) == t[j]) {
                    System.out.println("Magánhangzó találat: '" + t[j] + "'");
                }
            }
        }
    }
}
