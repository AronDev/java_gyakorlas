package java_gyakorlas.gyakorlas;

import java.util.Calendar;
public class Gyakorlas1_2018_01_30 {
   public static void main(String[] args) {
       Calendar datum = Calendar.getInstance();
       int ora = datum.get(Calendar.HOUR_OF_DAY);
       int perc = datum.get(Calendar.MINUTE);
       System.out.print(ora + ":");
       if(perc < 10) {
           System.out.print("0");
       }
       System.out.println(perc);
   } 
}
