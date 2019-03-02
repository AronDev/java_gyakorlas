public class Gyakorlas3_2018_01_30 {
    public static void main(String[] args) {
        // A B D
        int tomb[][] = new int[6][5];
        int osszeg = 0;
        int harmincnal_tobb = 0;
        for(int i = 0; i < tomb.length; i++) {
            if(i < 4) {
                for(int j = 0; j < tomb[i].length; j++) {
                    tomb[i][j] = (int)(11*Math.random()+26);
                    osszeg += tomb[i][j];
                    if(tomb[i][j] > 30) harmincnal_tobb++;
                }
            } else if(i == 4) {
                for(int j = 0; j < 3; j++) {
                    tomb[i][j] = (int)(11*Math.random()+26);
                    osszeg += tomb[i][j];
                    if(tomb[i][j] > 30) harmincnal_tobb++;
                }
            } else if(i == 5) {
                for(int j = 0; j < 2; j++) {
                    tomb[i][j] = (int)(11*Math.random()+26);
                    osszeg += tomb[i][j];
                    if(tomb[i][j] > 30) harmincnal_tobb++;
                }
            }
        }
        System.out.println(harmincnal_tobb + " osztályban van több mint 30 diák.");
        // C
        int evfolyam = 0;
        for(int i = 0; i < tomb.length; i++) {
            for(int j = 0; j < tomb[i].length; j++) {
                evfolyam += tomb[i][j];
            }
            System.out.println((i+9) + ". évfolyamban " + evfolyam + " diák van.");
            evfolyam = 0;
        }
    } 
}
