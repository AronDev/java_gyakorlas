package java_gyakorlas.gyakorlas;

public class Gyakorlas1_2019_02_11 {
    public static void main(String[] args) {
        //1
        int x = (int)(Math.random()*5+1);
        System.out.println("x = " + x);
        int y = 0;
        do {
            y = (int)(Math.random()*5+1);
        } while(y == x);
        System.out.println("y = " + y);

    }
}
