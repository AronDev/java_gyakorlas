import java.util.Scanner;
import java.util.InputMismatchException;

public class Gyakorlas1_2019_09_12 {
    public static void main(String[] args) {
        System.out.println("Kiszámítom, mennyi az Ön testének energiája Einstein léplete szerint.");
        
        // Változók
        double m = 0.0;
        double E = 0.0;
        final double c = 299792458;
        Scanner input = new Scanner(System.in);
        
        
        // Bekérés
        try {
            System.out.print("Kérem az Ön tömegét (kg): ");
            m = input.nextDouble();   
        } catch(InputMismatchException ime) {
            System.err.println("Hibás típus!");
        }
        
        // Számítás      
        E = m * Math.pow(c, 2); // vagy (c*c)
        
        // Kiíratás       
        System.out.printf("Az Ön testében %,.0f TJoule energia lakozik.%n", E);
        System.out.printf(".. ami %,.0f KJoule,%n", E/1000);
        System.out.printf(".. ami %,.0f MJoule,%n", E/1000/1000);
        System.out.printf(".. ami %,.0f GJoule,%n", E/1000/1000/1000);
    }
}
