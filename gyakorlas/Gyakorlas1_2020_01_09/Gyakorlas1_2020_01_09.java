package Gyakorlas1_2020_01_09;

public class Gyakorlas1_2020_01_09 {
    public static void main(String[] args) {        
        String[][] szavak = {
            {
            "Mélységes", "Pártatlan", "Magyar", "Keresztény", "Egyetemes",
            "Rendíthetetlen", "Ezeréves", "Erős", "Határozott", "Mérsékelt", "Visszafogott",
            "Tizenötmilliós", "Méltóságteljes", "Jó értelemben vett", "Konzervatív",
            "Jobbközép", "Polgári"
            },
            {
            "előjelű", "indíttatású", "határontúli", "nemzeti",
            "gyökerű", "eszmeiségű", "közszolgálati", "európaiságú", "lényegi",
            "pozitív", "többségi", "kormányzati", "lakitelki", "gerincű", "szentistváni",
            "trianoni", "középosztály-öntudatú"
            },
            {
            "igenlés", "felelősség", "felemelkedés", "elkötelezettség",
            "önépítés", "tragédia", "hagyomány", "elhivatottság", "Kárpát-medence",
            "nagytakarítás", "együttgondolkodás", "esélyek", "rendszerváltoztatás",
            "erkölcsiség", "egység", "magánosítás", "polgárság"
            }
        };
        
        int[] rnd = new int[3];
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < szavak.length; j++) {
                rnd[j] = (int)(Math.random()*szavak[j].length);
            }
            
            for(int j = 0; j < rnd.length; j++) {
                System.out.print(szavak[j][rnd[j]] + (j != 2 ? " " : "."));
            }
            System.out.println("");
        }
        
        
    }
}
