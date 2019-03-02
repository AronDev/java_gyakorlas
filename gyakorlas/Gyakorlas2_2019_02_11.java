public class Gyakorlas2_2019_02_11 {
    public static void main(String[] args) {
        int x[] = new int[5];
        x[0] = (int)(Math.random()*90+1);
        System.out.println("[debug] x[0] = " + x[0]);
        for(int i = 1; i < x.length; i++) {
            int _temp = 0;
            do {
                _temp = (int)(Math.random()*90+1);
                System.out.println("[debug] x[" + i + "] = _temp (" + _temp + ")");
            } while(_temp == x[1] || _temp == x[2] || _temp == x[3] || _temp == x[4]);
            x[i] = _temp;
        }
    }
}
