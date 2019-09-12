import javax.swing.JOptionPane;

public class Gyakorlas3_2019_09_12 {
    public static void main(String[] args) {
        // Változók
        double C = 0.0;
        double K = 0.0;
        double F = 0.0;
        String outputStr = null;
        String inputBox = JOptionPane.showInputDialog(
                null,
                "Kérem a hőmérsékletet celsiusban!",
                "Hőmérsékleti érték átszámítása",
                3);
                
        // Bekért adat átalakítása        
        try {
            C = Double.valueOf(inputBox);
            
            if(C >= 0) {
                // Számítás
                F = C * 9/5 + 32;
                K = C + 273.15; 

                outputStr = String.format("Fahrenheit: %,.2f\nKelvin: %,.2f", F, K);
                
                // Kiíratás
                JOptionPane.showMessageDialog(
                    null,
                    outputStr,
                    "Átszámítás eredménye",
                    1);
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "A bevitt hőmérséklet nem lehet minusz!",
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
