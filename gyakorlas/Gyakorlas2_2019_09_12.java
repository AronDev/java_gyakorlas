import java.util.Scanner;
import java.util.InputMismatchException;

public class Gyakorlas2_2019_09_12 {
    public static void main(String[] args) {
        // Változók
        double C = 0.0;
        double K = 0.0;
        double F = 0.0;
        Scanner input = new Scanner(System.in);
        
        // Bekérés
        try {
            System.out.print("Adja meg a hőmérsékletet celsiusban: ");
            C = input.nextInt();
        } catch(InputMismatchException ime) {
            System.err.println("Hibás típus!");
        }
        if(C >= 0) {
            // Számítás
            F = C * 9/5 + 32;
            K = C + 273.15; 

            // Kiíratás
            System.out.printf("Fahrenheit: %.2f%n", F);
            System.out.printf("Kelvin: %.2f%n", K);
        } else System.err.println("Nem lehet minusz!");
    }
}
