import java.util.Scanner;
import java.util.InputMismatchException;

public class Gyakorlas3_2019_09_05 {
    public static void main(String[] args) {
        // Elsőfokú kétismeretlenes egyenletrendszer

        // Változók
        Scanner inputText = new Scanner(System.in);
        char [] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        double [] nums = new double[chars.length];
        double D = 0.0;

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
        //      A           E           D          G
        D = (nums[0] * nums[4]) - (nums[3] * nums[1]);
        System.out.printf("D(%.2f) = (A(%.2f) * (E%.2f)) - (D(%.2f) * G(%.2f))%n", D, nums[0], nums[4], nums[3], nums[1]);

        if(D != 0) {
            //              C       D           B           E
            double Dx = (nums[2] * nums[4]) - (nums[1] * nums[5]);
            System.out.printf("Dx(%.2f) = (C(%.2f) * D(%.2f)) - (B(%.2f) * E(%.2f))%n", Dx, nums[2], nums[4], nums[1], nums[5]);
            //              A       F           D           C
            double Dy = (nums[0] * nums[5]) - (nums[3] * nums[2]);
            System.out.printf("Dy(%.2f) = (A(%.2f) * F(%.2f)) - (D(%.2f) * C(%.2f))%n", Dy, nums[0], nums[5], nums[3], nums[2]);

            double x = Dx / D;
            System.out.printf("x(%.2f) = Dx(%.2f) / D(%.2f)%n", x, Dx, D);
            double y = Dy / D;
            System.out.printf("y(%.2f) = Dy(%.2f) / D(%.2f)%n", y, Dy, D);

            // Eredmény
            System.out.printf("'x' értéke = %.2f%n", x);
            System.out.printf("'y' értéke = %.2f%n", y);
        } else System.err.println("A determináns nulla!");
    }
}
