import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Gyakorlas1_2019_10_24 {
    // Változók és konstansok
    private static final int N = 20;
    private static final String [] users = {"Aladár", "Bendegúz"};
    private static int [] data0 = new int[N];
    private static int [] data1 = new int[N];
    
    public static void main(String[] args) {
        readData("files/aladar.txt", data0, 0);
        readData("files/bendeguz.txt", data1, 1);
        printData(data0);
        printData(data1);
        System.out.print(printData_biggerDropCount(data0, data1, 0, 1));
        System.out.print(printData_biggerDropCount(data1, data0, 1, 0));
        System.out.print(printData_number6DropCount(data0, 0));
        System.out.print(printData_number6DropCount(data1, 1));
        System.out.printf("%snak %svolt nyerő szériája %s ellen.\n", users[0], !getData_winningSeries(data0, data1) ? "nem" : "", users[1]);
    }
    private static void readData(String fileName, int[] targetArray, int user) {
        File file = new File(fileName);
        String lineStr = "";
        int j = 0;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                lineStr = sc.nextLine();
                targetArray[j++] = Integer.parseInt(lineStr);
            }
            System.out.printf("%s eredményei sikeresen beolvasva(%s)\n", users[user], fileName);
        } catch (FileNotFoundException fnfe) {
            showMsg(JOptionPane.ERROR_MESSAGE, "Nincs ilyen fájl!", fnfe.getMessage());
        }
    }
    private static void printData(int[] sourceArray) {
        for(int i = 0; i < N; i++) {
            System.out.printf("%d, ", sourceArray[i]);
        }
        System.out.println();
    }
    private static String printData_biggerDropCount(int[] sourceArray1, int[] sourceArray2, int user1, int user2) {
        String finalStr = "";
        int sA1_biggerDrops = 0; // sA1 hányszor dobott többet mint sA2
        for(int i = 0; i < N; i++) {
            if(sourceArray1[i] > sourceArray2[i]) sA1_biggerDrops ++;
        }
        finalStr += String.format("%s %d alkalommal dobott többet mint %s.\n", users[user1], sA1_biggerDrops, users[user2]);
        return finalStr;
    }
    private static String printData_number6DropCount(int[] sourceArray, int user) {
        String finalStr = "";
        int sA_number6Drops = 0;
        for(int i = 0; i < N; i++) {
            if(sourceArray[i] == 6) sA_number6Drops ++;
        }
        finalStr += String.format("%s %d alkalommal dobott hatost.\n", users[user], sA_number6Drops);
        return finalStr;
    }
    private static boolean getData_winningSeries(int[] sA1, int[] sA2) {
        int j = 0;
        while(j < N-2 && !(sA1[j] > sA2[j] && sA1[j+1] > sA2[j+1] && sA1[j+2] > sA2[j+2])) {
            return true;
        }
        return false;
    }
    private static void showMsg(int msgType, String msgTitle, String msgText) {
        JOptionPane.showMessageDialog(null, msgText, msgTitle, msgType);
    }
}
