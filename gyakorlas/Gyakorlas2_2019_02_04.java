public class Gyakorlas2_2019_02_04 {
    public static void main(String[] args) {
        int x[] = new int[10];
        int osszeg = 0;
        double atlag = 0;
        int paros = 0;
        int paratlan = 0;
        
        for(int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random()*10);
            System.out.println(i + " -> " + x[i]);
            
            osszeg += x[i];
            
            if(x[i] % 2 == 0) paros ++;
            else paratlan ++;
        }
        
        atlag = (double)osszeg/x.length;
        
        System.out.println("Összeg = " + osszeg);
        System.out.println("Átlag = " + atlag);
        System.out.println("Páros számok db = " + paros);
        System.out.println("Páratlan számok db = " + paratlan);
    }
}
