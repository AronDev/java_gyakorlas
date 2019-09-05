import java.io.*;

public class Gyakorlas3_2017_10_24 {
    public static void main(String args[]) {
        BufferedReader be = null;
        PrintWriter ki = null;
        try {
            be = new BufferedReader(new FileReader("szavak.txt"));
            ki = new PrintWriter(new FileWriter("v03.txt"));
            String a = "";
            int t = 0;
            int j = 0;
            while(be.ready()) {
                a = be.readLine();
                if(a.charAt(0) == 't') t++;
                if(a.length() == 4) ki.println(a);
                else if(a.length() >= 6) System.out.println(a);
                j++;
            }
            System.out.println("Összesen " + t + " db T betűvel kezdő szó van.");
            System.out.println("Összesen " + j + " db szó van.");
        } catch(IOException  e) {
            System.err.println("Hiba történt!\n" + e);
        } finally {
            if(be != null) {
                try {
                    be.close();
                    ki.close();
                } catch(IOException e) {}
            }
        }
    }
}