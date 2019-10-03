import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gyakorlas1_2019_10_03 {
    public static void main(String[] args) {
        // Változók
        double [][] nums = new double[10][3];
        File input = new File("files/meresek.csv");
        Scanner sc = null;
        String line = ""; // Beolvasott sor tárolására
        String [] lineNums = new String[3]; // Beolvasott sorból a 3 érték tárolása
        String outputStr = ""; // Kimenet formázására

        //
        int [] max = new int[2];
        int [] min = new int[2];
        int laz = 0;
        int hoemelkedes = 0;
        boolean nagyobb40 = false;
        double atlag = 0.0;
        double legnagyobbDiff = 0.0;
        double osszeg = 0.0;
        //

        try {
            sc = new Scanner(input);

            int lineCount = 0;
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                for(int i = 0; i < 3; i++) {
                    lineNums = line.split("\t");
                    nums[lineCount][i] = Double.parseDouble(lineNums[i]);
                }
                lineCount++;
            }

            // Számítások
            for(int i = 0; i < nums.length; i++) {
                for(int j = 0; j < nums[i].length; j++) {
                    if(nums[i][j] >= 38.0) laz++;
                    else if(nums[i][j] >= 37.0) hoemelkedes++;

                    if(nums[i][j] > 40.0 && !nagyobb40) nagyobb40 = true;

                    if(nums[i][j] > nums[max[0]][max[1]]) {
                        max[0] = i;
                        max[1] = j;
                    }

                    if(nums[i][j] < nums[min[0]][min[1]]) {
                        min[0] = i;
                        min[1] = j;
                    }

                    osszeg += nums[i][j];
                }
            }

            atlag = osszeg / (nums.length * nums[0].length);
            legnagyobbDiff = nums[max[0]][max[1]] - nums[min[0]][min[1]];

            // Eredmény formázása
            outputStr += String.format("Beolvasott sorok száma: %d\n", lineCount);
            outputStr += String.format("(Napi %d mérés %d napon át. Összesen %d mérés.)\n\n", nums.length, nums[0].length, nums.length * nums[0].length);
            outputStr += String.format("%d alkalommal volt láza a betegnek, illetve %d alkalommal hőemelkedése.\n", laz, hoemelkedes);
            outputStr += String.format("Legnagyobb mért hőmérséklet %,.2f °C volt.\n", nums[ max[0] ][ max[1] ]);
            outputStr += String.format("%s olyan mérés ahol a betegnek nagyobb volt a láza mint 40.0 °C\n", nagyobb40 ? "Volt" : "Nem volt");
            outputStr += String.format("%d nap alatti átlaghőmérséklete %,.2f °C volt.\n", nums.length, atlag);
            outputStr += String.format("Legnagyobb hőingás két mérés között %,.2f °C volt.", legnagyobbDiff);

            // Eredmény kiíratása
            showMsg("Sikeres beolvasás!", outputStr, JOptionPane.INFORMATION_MESSAGE);
        } catch(FileNotFoundException fnfe) {
            showMsg("Hiba a megnyitáskor!", fnfe.getMessage(), JOptionPane.ERROR_MESSAGE);
        } finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
    private static void showMsg(String title, String msg, int type) {
        JOptionPane.showMessageDialog(null, msg, title, type);
    }
}
