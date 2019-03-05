package java_gyakorlas.gyakorlas;

public class Gyakorlas1_2019_01_21 {
    public static void main(String[] args) {
        int t[] = new int[100];
        int x = 0;
        for(int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random()*1000+1);
            //System.out.println(i + "=>" + t[i]);
            if(t[i] > 900) x++;
            switch(t[i]) {
                case 100: System.out.println("Talált egy 100-ast.");
                case 200: System.out.println("Talált egy 200-ast.");
                case 300: System.out.println("Talált egy 300-ast.");
                case 400: System.out.println("Talált egy 400-ast.");
                case 500: System.out.println("Talált egy 500-ast.");
                case 600: System.out.println("Talált egy 600-ast.");
                case 700: System.out.println("Talált egy 700-ast.");
                case 800: System.out.println("Talált egy 800-ast.");
                case 900: System.out.println("Talált egy 900-ast.");
                case 1000: System.out.println("Talált egy 1000-ast.");
            }
            /*if(t[i] % 100 == 0) {
                System.out.println("Talált egy " + t[i] + "-ast.");
            }*/
        }
        System.out.println("Nagyobb mint 900: " + x + " db");
    }
}
