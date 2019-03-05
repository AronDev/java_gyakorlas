package java_gyakorlas.gyakorlas;

public class Gyakorlas2_2018_10_08 {
    public static void main(String[] args) {
        double 
            a = 3,
            b = 2,
            c = -5,
        
            d,
                
            x1,
            x2;
        
        d = Math.pow(b,2) - 4*a*c; // b(2)-4ac
        
        if (d < 0) {
            System.err.println("A diszkrimináns értéke negatív!");
        } else {
            x1 = ((b*-1) + Math.sqrt(d)) / (2*a); // -b+gyök(d) / 2*a
            System.out.println("x1 = " + x1);
            
            x2 = ((b*-1) - Math.sqrt(d)) / (2*a); // -b-gyök(d) / 2*a
            System.out.println("x2 = " + x2);
        }   
    }
}
