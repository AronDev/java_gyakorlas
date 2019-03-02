import java.util.*;
public class Gyakorlas1_2018_01_06 {
    public static void main(String args[]) {
        ArrayList<Integer> tomb  = new ArrayList();
        int rnd = 0;
        for(int i = 0; i < 60; i++) {
            rnd = (int)(10*Math.random());
            tomb.add(rnd);
            System.out.println(tomb.get(i));
        }
    }
}
