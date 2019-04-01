public class Gyakorlas3_2019_02_04 {
    public static void main(String[] args) {
        int x[] = new int[15];
        int y = 0;
        for(int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random()*30+60);
            System.out.println(i + " -> " + x[i]);
            if(x[i] > 85) y++;
        }
        System.out.println("85 feletti számok db = " + y);
    }
}
