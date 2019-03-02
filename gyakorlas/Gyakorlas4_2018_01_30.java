public class Gyakorlas4_2018_01_30 {
    public static void main(String[] args) {
        int tomb[] = new int[100];
        int osszeg = 0;
        int hetesek = 0;
        int parosok = 0;
        for(int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(10*Math.random()+1);
            osszeg += tomb[i];
            if(tomb[i] == 7) hetesek++;
            if(tomb[i] % 2 == 0) parosok++;
            System.out.print(tomb[i] + ", ");
            if((i+1) % 10 == 0) System.out.println();
        }
        double atlag = osszeg / tomb.length;
        System.out.println("Számok átlaga = " + atlag);
        System.out.println("Számok összege = " + osszeg);
        System.out.println("Páros számok darabja = " + parosok);
        System.out.println("Héttel egyenlő számok = " + hetesek);
    }
}
