import java.util.Scanner;
import java.util.InputMismatchException;
public class Gyakorlas2_2019_04_08 {
    public static void main(String[] args) {
        // Deklarálás
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int finalNum = 1;
        
        // input(int)
        try {
            System.out.print("> ");
            inputNum = sc.nextInt();
        } catch(InputMismatchException ime) {
            System.err.println("Csak szám lehet!");
        }
        
        // Számolás
        for(int i = inputNum; i > 0; i--) {
            finalNum *= i;
        }
        
        // Kiíratás
        System.out.printf("%d! = %d%n", inputNum, finalNum);
    }
}
