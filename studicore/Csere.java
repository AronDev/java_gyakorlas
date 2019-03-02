package java_gyakorlas.studicore;

public class Csere {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int c = a;
        a = b;
        b = c;

        System.out.println("a="+a+"; b="+b);
    }
}