package java_gyakorlas.gyakorlas;

public class Gyakorlas2_2019_01_14 {
    public static void main(String[] args) {
        int t[] = new int[10];
        for(int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random()*5+1);
            System.out.print(i + "=>" + t[i] + "\t");
            for(int j = 0; j < i; j++) {
                if(t[j] == t[i]) {
                    System.out.print("Volt már");
                    break;
                }
            }
            System.out.println();
        }
    }
}
