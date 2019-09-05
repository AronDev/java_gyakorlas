import java.util.Scanner;
import java.util.InputMismatchException;

public class Gyakorlas1_2019_09_05 {

    public static void main(String[] args) {
        // Háromszög 3 oldalának bekérése
        // Leellenőrzés: lehetséges-e belőle háromszög?

        // Változók
        Scanner inputText = new Scanner(System.in);

        double [] triangle = new double[3];

        // Bekérés
        for (int i = 0; i < 3; i++) {
            System.out.printf("Háromszög %d. oldala: ", i);
            try {
                triangle[i] = inputText.nextDouble();

                if(triangle[i] > 0) {
                    // todo
                } else {
                    System.err.println("Az értéknek nagyobbnak kell lennie mint 0!");
                    i--;
                }
            } catch(InputMismatchException ime) {
                System.err.println("Hibás típusú adat!");
            }
        }

        // Ellenőrzés
        if((triangle[0] + triangle[1] > triangle[2]) && (triangle[0] + triangle[2] > triangle[1]) &&(triangle[1] + triangle[2] > triangle[0])) {
            System.out.println("A háromszög két befogója nagyobb mint az átfogója.");

            double k = triangle[0] + triangle[1] + triangle[2];
            double s = (triangle[0] + triangle[1] + triangle[2]) / 2;
            double t = Math.sqrt(s * (s - triangle[0]) * (s - triangle[1]) * (s - triangle[2]));

            System.out.printf("Hárömszög kerülete: %.2f%n", k);
            System.out.printf("Hárömszög területe: %.2f%n", t);

        } else {
            System.out.println("Hibás háromszög!");
        }
    }
}
