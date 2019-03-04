public class Gyakorlas1_2019_03_04 {
    public static void main(String[] args) {
        // Változók deklarálása
        int alap[] = new int[100];
        int dupla[] = new int[alap.length];
        int masodik[] = new int[alap.length];
        int masod[] = new int[alap.length/2];
        int kicsi[] = new int[alap.length];
        
        // 'alap' tömb feltöltése
        System.out.println("> 'alap' tömb feltöltése..");
        for(int i = 0; i < alap.length; i++) {
            alap[i] = (int)(Math.random()*1000+1);
            System.out.printf("\talap[%d] = %d%n", i, alap[i]);
        }
        
        // 'dupla' tömb feltöltése ( alap * 2 )
        System.out.println("> 'dupla' tömb feltöltése..");
        for(int i = 0; i < alap.length; i++) {
            dupla[i] = alap[i]*2;
            System.out.printf("\tdupla[%d] = %d <alap[%d] * 2>%n", i, dupla[i], i);
        }
        
        // 'masodik' tömb feltöltése ( minden második elemet csak )
        System.out.println("> 'masodik' tömb feltöltése..");
        for(int i = 0; i < alap.length; i+=2) {
            masodik[i] = alap[i];
            System.out.printf("\tmasodik[%d] = %d <alap[%d]>%n", i, masodik[i], i);
        }
        
        // 'masod' tömb feltöltése ( rendezés 'masodik' tömbből kihagyás nélkül )
        System.out.println("> 'masod' tömb feltöltése..");
        for(int i = 0, j = 0; i < alap.length; i+=2, j++) {
            masod[j] = masodik[i];
            System.out.printf("\tmasod[%d] = %d <masodik[%d]>%n", j, masod[j], i);
        }
        
        // 'kicsi' tömb feltöltése ( kisebb mint 30 )
        System.out.println("> 'kicsi' tömb feltöltése..");
        for(int i = 0, j = 0; i < alap.length; i++) {
            if(alap[i] < 30) {
                kicsi[j] = alap[i];
                System.out.printf("\tkicsi[%d] = %d <alap[%d]>%n", j, alap[i], i);
                j++;
            }
        }
    }
}
