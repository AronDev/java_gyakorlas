import javax.swing.JOptionPane;
public class Gyakorlas1_2019_09_19 {
    public static void main(String[] args) {
        // Változók
        int osszeg = 0;
        int [] cimletek = {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
        int [] cimletek_db = new int [cimletek.length];
        String outputStr = "";
        
        // Bekérés
        String inputBox = JOptionPane.showInputDialog(
                null,
                "Kérem az összeget!",
                "Összeg címletekké alakítása",
                3);
        
        // Bekért adat kezelése
        try {
            osszeg = Integer.valueOf(inputBox);
            
            if(osszeg >= 0) {                
                // Előkészítés
                osszeg = kerekit(osszeg);
                outputStr = String.format("%,d címletekké bontva:\n\n", osszeg);

                // Számolás
                for(int i = 0; i < cimletek.length; i++) {
                    cimletek_db[i] = osszeg / cimletek[i];
                    osszeg %= cimletek[i];
                }
                
                // Kiíratás előkészítése
                for(int i = 0; i < cimletek.length; i++) {
                    if(cimletek_db[i] > 0) {
                        outputStr += String.format("%d db %,d Ft\n", cimletek_db[i],  cimletek[i]);
                    }
                }

                // Kiíratás
                JOptionPane.showMessageDialog(
                        null,
                        outputStr,
                        "Eredmény",
                        1);
            } else {
                 JOptionPane.showMessageDialog(
                    null,
                    "A bevitt összeg nem lehet negatív!",
                    "Hiba történt!",
                    0);
            }
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                null,
                "Hibás típusú adat!",
                "Hiba történt!",
                0);
        }
    }

    private static int kerekit(int osszeg) {
        int maradek = osszeg % 5;
        switch(maradek) {
            case 0: return osszeg;
            case 1: return osszeg - 1;
            case 2: return osszeg - 2;
            case 3: return osszeg + 2;
            case 4: return osszeg + 1;
            default: return osszeg;
        }
    }
}
