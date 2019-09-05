public class Gyakorlas2_2019_02_18 {
    public static void main(String[] args) {
        //Deklarálás
        int tomb[] = new int[100];
        int min = 0;
        System.out.println("Generált számok: \n");
        for(int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(Math.random()*1000+1);
            System.out.print(tomb[i] + ", ");
            if(tomb[min] > tomb[i]) min = i;
            if(i % 10 == 0 && i != 0) System.out.println();
        }
        System.out.println("\n\nLegkisebb szám: " + tomb[min]);
        //Összegzés
        int osszeg = 0;
        for(int i = 0; i < tomb.length; i++) {
            osszeg = (osszeg > 2000 ? osszeg : osszeg + tomb[i]);
        }
        System.out.println("\nSzámok összege: " + osszeg);
        
        //100-asok kiíratása
        String szamnevek[] = {"","Száz","Kétszáz","Háromszáz","Négyszáz","Ötszáz","Hatszáz","Hétszáz","Nyolcszáz","Kilencszáz"};
        int szam = 0;
        System.out.print("\nTalált szám(ok): ");
        for(int i = 0; i < tomb.length; i++) {
            switch(tomb[i]) {
                case 100: szam = 1; break;
                case 200: szam = 2; break;
                case 300: szam = 3; break;
                case 400: szam = 4; break;
                case 500: szam = 5; break;
                case 600: szam = 6; break;
                case 700: szam = 7; break;
                case 800: szam = 8; break;
                case 900: szam = 9; break;
                default: szam = 0;
            }
            System.out.print(szamnevek[szam] + "" + (szam != 0 ? ", " : ""));
        }
    }
}
