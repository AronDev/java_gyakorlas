import java.util.Scanner;
public class Palacsinta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mennyi ideig sült a palacsinta? ");
        int sutesiIdo = sc.nextInt();
        if(sutesiIdo >= 1 && sutesiIdo <= 2) {
            System.out.println("A palacsinta nyers.");
        } else if(sutesiIdo >= 3 && sutesiIdo <= 4) {
            System.out.println("A palacsinta jó.");
        } else if(sutesiIdo >= 5) {
            System.out.println("A palacsinta égett.");
        }
    }
}
