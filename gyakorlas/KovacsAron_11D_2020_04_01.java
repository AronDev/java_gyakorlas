import java.util.Scanner;

public class KovacsAron_11D_2020_04_01 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random()*10+1);
        int userTries = 1;
        int inputNum = 0;
        int maxTries = 3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Van " + maxTries + " próbálkozásod kitalálni a random szám értékét!");

        while (userTries <= maxTries) {
            try {
                inputNum = sc.nextInt();

                if (inputNum > 10 || inputNum < 1) {
                    System.out.println("A számnak 1 és 10 között kell lennie!");
                    continue;
                }

                if (inputNum == randomNum) {
                    System.out.printf("Eltaláltad a számot %d próbálkozásból!\n", userTries);
                    break;
                } else {
                    if (maxTries - userTries > 0) {
                        System.out.println("Ez nem az a szám! Még van " + (maxTries - userTries) + " próbálkozásod!");
                    } else {
                        System.out.println("Nincs több próbálkozásod, majd legközelebb!");
                    }
                }
                userTries ++;
            } catch (Exception e) {
                System.out.println("Hiba történt!");
                break;
            }
        }
    }
}
