/*
 * Kovács Áron 11D
 * Feladat: Két szám legnagyobb közös osztójának kiszámítása.
 */

public class KovacsAron_11D_2020_04_24 {
    public static void main(String[] args) {
        int[] szamok = { 4, 16 };
        System.out.printf("%d és %d legnagyobb közös osztója = %d", szamok[0], szamok[1], LNKO(szamok[0], szamok[1]));
    }
    private static int LNKO(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return a;
        if (a > b) return LNKO(a - b, b);
        return LNKO(a, b - a);
    }
}
