package java_gyakorlas.gyakorlas;

public class Gyakorlas1_2017_11_21 {
   public static void main(String[] args) {
       int x[] = {2,6,8,0,-3,15,8,11,-5};
       // Minimum keresése
       int min = 0;
       for(int i = 1; i < x.length; i++) {
          if(x[i] < x[min]) {
              min = i;
          } 
       }
       System.out.println("Legkisebb elem: " + x[min]);
       System.out.println("Legkisebb elem helye: " + min);
       
       // Maximum keresése
       int max = 0;
       for(int i = 1; i < x.length; i++) {
          if(x[i] > x[max]) {
              max = i;
          } 
       }
       System.out.println("Legnagyobb elem: " + x[max]);
       System.out.println("Legnagyobb elem helye: " + max);
   } 
}
