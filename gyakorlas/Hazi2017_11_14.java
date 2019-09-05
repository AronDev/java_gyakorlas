import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hazi2017_11_14 {
    public static void main(String[] args) {
        BufferedReader be = null;
        try {
            be = new BufferedReader(new InputStreamReader(System.in));
            char x;
            int fej = 0;
            int iras = 0;
            for(int i = 0; i < 20; i++) {
                System.out.print("Add meg a(z) " + i + ". karaktert (f vagy i): ");
                x = be.readLine().charAt(0);
                switch(x) {
                    case 'f': fej++;break;
                    case 'i': iras++;break;
                    default: System.err.print("Hibás karakter!");i--;break;
                }
            }
            System.out.println("Összesen " + fej + " fejet dobtál!");
            System.out.println("Összesen " + iras + " írást dobtál!");
            if(fej > iras) System.out.println("Több fejet dobtál mint írást!");
            else if(fej < iras) System.out.println("Több írást dobtál mint fejet!");
            else System.out.println("Ugyanannyi fejet és írást dobtál!");
        } catch(IOException e) {

        } finally {
            if(be != null) {
                try {
                    be.close();
                } catch(IOException e) {}
            }
        }
    }
}
