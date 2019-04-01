import java.io.*;
public class Gyakorlas2_2019_03_04 {
    class Gyerek {
        String nev = "";
        int kor = 10;
        int iq = 0;
        boolean okos = false;
        double magassag = 0;
        
        void kiiras() {
            System.out.println("Gyerek adatai:");
            System.out.printf("Név: %s, Kor: %d, IQ: %d, Okos-e: %s, Magasság: %f%n",
                        this.nev, this.kor, this.iq, (this.okos ? "Igen" : "Nem"), this.magassag);
        }
        void szamolas() {
            if(this.iq > 150) this.okos = true;
            else this.okos = false;
        }
    }
    public static void main(String[] args) {
        Gyerek t[] = new Gyerek[3];
        
        //Scanner sc = new Scanner(System.in);
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        
        int j = 0;
        while(j < t.length) {
            try {
                System.out.println("Add meg a(z) " + j + ". gyerek adatait:");
                
                System.out.print("Név: ");
                //t[j].nev = sc.next();
                t[j].nev = be.readLine();
                
                //sc.nextLine();
                
                System.out.print("Kor: ");
                //t[j].kor = sc.nextInt();
                t[j].kor = Integer.parseInt(be.readLine());
                
                //sc.nextLine();
                
                System.out.print("IQ: ");
                //t[j].iq = sc.nextInt();
                t[j].iq = Integer.parseInt(be.readLine());
                
                //sc.nextLine();
                
                System.out.print("Magassag: ");
                //t[j].magassag = sc.nextDouble();
                t[j].magassag = Double.parseDouble(be.readLine());
                
                t[j].szamolas();
                t[j].kiiras();
                
                j++;
            } catch(IOException x) { 
                System.err.println("Hibás bemenet: " + x);
            } catch(IllegalArgumentException e) {
                System.err.println("Hibás bemenet: " + e);
            } catch(NullPointerException f) {
                System.err.println("Hibás bemenet: " + f);
            }
        }
        
        int maxKor = 0;
        double atlagKor = 0;
        int osszegKor = 0;
        
        double atlagIQ = 0;
        int osszegIQ = 0;
        
        int okosCount = 0;
        
        boolean idosebb19 = false;
        for(int i = 0; i < t.length; i++){
            osszegKor += t[i].kor;
            osszegIQ += t[i].iq;
            if(t[i].okos) okosCount++;
            if(t[i].kor > 19) idosebb19 = true;
            if(t[maxKor].kor < t[i].kor) maxKor = i;
            System.out.print(t[i].nev.toUpperCase() + ", ");
        }
        atlagKor = (double)osszegKor/t.length;
        atlagIQ = (double)osszegIQ/t.length;
    }
}
