import java.util.Scanner;
import java.util.InputMismatchException;
public class Gyakorlas2_2019_04_15 {
    public static void main(String[] args) {
        class Virag {
            // Változók
            String nev;
            double meret;
            String szin;
            int kor;
            boolean illatos;
            
            // Metódusok
            void novekedes() {
                System.out.printf("Virág növekedés (Méret: %.2f => %.2f | Kor: %d => %d)%n", this.meret, this.meret+20, this.kor, this.kor+1);
            }
            
            void kiiras() {
                System.out.println("|_____ Virág adatai: _____|");
                System.out.printf("Név: %s | ", this.nev);
                System.out.printf("Méret: %.2f | ", this.meret);
                System.out.printf("Szín: %s | ", this.szin);
                System.out.printf("Kor: %d | ", this.kor);
                System.out.printf("Illatos-e: %s%n", this.illatos ? "Igen" : "Nem");
            }
        }
        
        // Változók
        Virag v[] = new Virag[20];       
        Scanner sc = new Scanner(System.in);
        int darabVirag = 0;
        
        // Beolvasás
        try {
            System.out.print("Hány virágot szeretnél létrehozni? ");
            darabVirag = sc.nextInt();
            if(darabVirag > 20) {
                System.err.println("Legfeljebb 20 virágot hozhatsz létre!");
                System.exit(0);
            }
        } catch(InputMismatchException ime) {
            System.err.println("Hibás érték!");
        }
        
        for(int i = 0; i < darabVirag; i++) {
            v[i] = new Virag();
            System.out.printf("Add meg a(z) %d-s virág adatait:%n", i);
            
            try {
                System.out.print("Virág neve: ");
                v[i].nev = sc.next();

                System.out.print("Virág mérete: ");
                v[i].meret = sc.nextDouble();
                
                System.out.print("Virág színe: ");
                v[i].szin = sc.next();
                
                System.out.print("Virág életkora: ");
                v[i].kor = sc.nextInt();
                
                System.out.print("Virág illatos-e?(igen/nem): ");
                switch(sc.next()) {
                    case "igen": v[i].illatos = true; break;
                    case "nem": v[i].illatos = false; break;
                    default: System.err.println("Hibás érték!");
                }
            } catch(InputMismatchException ime) {
                System.err.println("Hibás érték!");
            }
        }
        
        // Keresések/műveletek
        
        // Kiültethető virágok
        System.out.println("\n|_____ Kiültethető virágok neve és színe: _____|");
        for(int i = 0; i < darabVirag; i++) {
            if(v[i].meret > 10) {
                System.out.printf("%d. %s, %s%n", i, v[i].nev, v[i].szin);
            }
        }
        
        // Piros virágok kora
        System.out.println("\n|_____ Piros virágok kora: _____|");
        for(int i = 0; i < darabVirag; i++) {
            if(v[i].szin.equals("Piros") || v[i].szin.equals("piros")) {
                System.out.print(v[i].kor + ", ");
            }
        }
        
        // Illatos virágok neve
        System.out.println("\n|_____ Illatos virágok neve: _____|");
        for(int i = 0; i < darabVirag; i++) {
            if(v[i].illatos) {
                System.out.print(v[i].nev.toUpperCase() + ", ");
            }
        }
        
        // Sárga színű illatos virágok darabja
        int sargaesillatos = 0;
        System.out.println("\n|_____ Sárga és illatos virágok: _____|");
        for(int i = 0; i < darabVirag; i++) {
            if((v[i].szin.equals("Sarga") || v[i].szin.equals("sarga")) && v[i].illatos) {
                sargaesillatos++;
            }
        }
        System.out.println(sargaesillatos + " db");
    }
}
