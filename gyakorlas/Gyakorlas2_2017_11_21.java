package java_gyakorlas.gyakorlas;

public class Gyakorlas2_2017_11_21 {
   public static void main(String[] args) {
       int a[] = {9,-8,7,15,0,1,32,-20,10};
       int b[] = new int[15];
       for(int i = 0; i < b.length; i++) b[i] = (int)(35*Math.random()-12);
       int b_max = 0;
       int b_min = 0;
       int b_paros = 0;
       for(int i = 0; i < b.length; i++) {
           if(b[i] > b[b_max]) {
               b_max = i;
           }
           if(b[i] < b[b_min]) {
               b_min = i;
           }
           if(b[i] % 2 == 0) b_paros++;
       }
       int a_max = 0;
       int a_min = 0;
       for(int i = 0; i < a.length; i++) {
           if(a[i] > a[a_max]) {
               a_max = i;
           }
           if(a[i] < a[a_min]) {
               a_min = i;
           }
       }
       if(a_max > b_max) System.out.println("Az 'a' tömb maximum eleme(" + a[a_max] + ") nagyobb mint a 'b' tömbé(" + b[b_max] + ").");
       else if(a_max < b_max) System.out.println("A 'b' tömb maximum eleme(" + b[b_max] + ") nagyobb mint az 'a' tömbé(" + a[a_max] + ").");
       else if(a_max == b_max) System.out.println("Az 'a' és a 'b' tömb maximum eleme megegyezik.");
       System.out.println("Összesen " + b_paros + " db páros szám van a 'b' tömben.");
   } 
}
