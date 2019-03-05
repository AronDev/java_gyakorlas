package java_gyakorlas.gyakorlas;

public class Gyakorlas1_2018_10_08 {
    public static void main(String[] args) {
        
        int
            x = 5,
            y = 10,
            z = 8;
            
        //[[Ternális operátor]]
        System.out.println(x > 5 ? "Nagy" : "Kicsi");
        
        //Átlagos elágazás
        if (x > 5) {
            System.out.println("Nagy");
        } else System.out.println("Kicsi");
        
        //
        
        
        if (x == 5 && y == 5) {
            System.out.println("OK!");
        } else System.out.println("Nem OK!");
        
        //
        
        z = x / y;
        System.out.println(z);
        
        //
        
        System.out.println(x / y == x/(y+0.0) ? "Egész" : "Nem egész");
        
        //
        
        
    }
}
