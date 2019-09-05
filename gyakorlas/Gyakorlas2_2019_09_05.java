import java.util.Scanner;
import java.util.InputMismatchException;

public class Gyakorlas2_2019_09_05 {
    public static void main(String[] args) {
        // Másodfokú megoldóképlet
        
        // Változók
        Scanner inputText = new Scanner(System.in);
        char chars[] = {'a', 'b', 'c'};
        double nums[] = new double[chars.length];
        double x[] = new double[2];
        double d;
        
        // Bekérés        
        for(int i = 0; i < chars.length; i++) {
            System.out.printf("Adja meg a(z) '%c' értékét: ", chars[i]);
            try {
                nums[i] = inputText.nextDouble();
            } catch(InputMismatchException ime) {
                System.err.println("Hibás típusú adat!");
            }
        }
        
        // Számolás
        d = Math.pow(nums[1], 2) - (4 * nums[0] * nums[2]);
        
        if(d > 0) {
            x[0] = (-nums[1] + d) / (2 * nums[0]);
            x[1] = (-nums[1] - d) / (2 * nums[0]);
            
            System.out.printf("x1 értéke = %.2f%n", x[0]);
            System.out.printf("x2 értéke = %.2f%n", x[1]);
        } else System.err.println("Nincs valós gyök!");
        
    }
}