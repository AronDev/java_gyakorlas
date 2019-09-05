public class Kovacs_Aron_2019_01_14 {
    public static void main(String[] args) {
        int t[] = new int[100];
        int paros_Sum = 0;
        int paratlan_Sum = 0;
        
        for(int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random()*1000+1);
            System.out.print(i + "=>" + t[i]);
            
            if(t[i] % 2 == 0) {
                paros_Sum += t[i];
                System.out.println("\tPáros");
            } else {
                paratlan_Sum += t[i];
                System.out.println("\tPáratlan");
            }
        }
        System.out.println("Páros összeg = " + paros_Sum);
        System.out.println("Páratlan összeg = " + paratlan_Sum);
    }
}
