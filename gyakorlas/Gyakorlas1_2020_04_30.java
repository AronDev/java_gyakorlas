import java.util.Scanner;

public class Gyakorlas1_2020_04_30 {
    public static void main(String[] args) {
        /*
        Olvassunk be számokat a képernyőről és számítsuk ki azok négyzetét!
        Ha 0-át írunk be, akkor a program futása fejeződjön be!
         */
        try (Scanner sc = new Scanner(System.in)) {
            int inputNum = sc.nextInt();
            if (inputNum == 0) return;
            System.out.println(Math.pow(inputNum, 2));
        }
    }
}
