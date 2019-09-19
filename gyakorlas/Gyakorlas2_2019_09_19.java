import javax.swing.JOptionPane;
public class Gyakorlas2_2019_09_19 {
    public static void main(String[] args) {
        // Változók
        int year = 0;
        String outputStr = "";
        
        // Bekérés
        String inputBox = JOptionPane.showInputDialog(
                null,
                "Kérem az évet!",
                "Szökőév ellenőrzése",
                3);
        
        // Bekért adat kezelése
        try {
            year = Integer.valueOf(inputBox);
            
            if(year >= 0) {
                outputStr = year + ": ";
                
                // Számolás
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    outputStr += "szökőév";
                } else outputStr += "nem szökőév";

                // Kiíratás
                JOptionPane.showMessageDialog(
                        null,
                        outputStr,
                        "Eredmény",
                        1);
            } else {
                 JOptionPane.showMessageDialog(
                    null,
                    "A bevitt év nem lehet negatív!",
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
}
