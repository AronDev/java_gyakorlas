package java_gyakorlas.gyakorlas;

import java.util.Calendar;
public class Gyakorlas2_2018_01_30 {
   public static void main(String[] args) {
       Calendar datum = Calendar.getInstance();
       int ora = datum.get(Calendar.HOUR_OF_DAY);
       if(ora >= 5 && ora <= 10) System.out.println("Jó reggelt!");
       else if(ora >= 11 && ora <= 17) System.out.println("Jó napot!");
       else if(ora >= 18 && ora <= 20) System.out.println("Jó estét");
       else if(ora >= 21 && ora <= 4) System.out.println("Jó éjsakát!");      
   } 
}
