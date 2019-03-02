import java.io.*;
public class Gyakorlas1_2018_01_23 {
    public static void main(String[] args) {
        try {
            double tomb[][] = new double[7][3];
            BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
            String napok[] = {"Hétfő","Kedd","Szerda","Csütörtök","Péntek","Szombat","Vasárnap"};
            String napszakok[] = {"reggeli","déli","esti"};
            int n = 0;
            double curr = 0;
            for(int i = 0; i < 21; i++) {
                int nap = i/3;
                System.out.print("Add meg a(z) " + napok[nap] + " " + napszakok[n] + " testhőmérsékleted: ");
                curr = Double.parseDouble(be.readLine());
                if(curr > 34 && curr < 41) {
                    tomb[nap][n] = curr;
                    if(n == 2) n = 0;
                    else n++;
                }
                else {
                    System.out.println("34 és 41 közötti értékeket adhatsz csak meg!");
                    i--;
                    n--;
                }
            }
            for(int i = 0; i < tomb.length; i++) {
                for(int j = 0; j < tomb[i].length; j++) {
                    System.out.println(napok[i] + " napon " + napszakok[j].replace("i","") + "ben " + tomb[i][j] + " Celsius testhőmérséklet volt.");
                }
            }
        } catch(IOException e) {
            System.err.println("HIBA: " + e);
        }
    }
}
