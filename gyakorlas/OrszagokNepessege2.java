/* Gyakorlas1_2019_11_14 */
package Gyakorlas1_2019_11_14;

class Orszag {
    /* == Változók == */
    int id;
    char foldreszkod;
    String orszagnev;
    int fuggoseg;
    long nepesseg;
    /* == /////// == */

    public Orszag(int id, char foldreszkod, String orszagnev, int fuggoseg, long nepesseg) {
        this.id = id;
        this.foldreszkod = foldreszkod;
        this.orszagnev = orszagnev;
        this.fuggoseg = fuggoseg;
        this.nepesseg = nepesseg;
    }
    
    public String kiiras() {
        String outputStr = "";
        String foldresz;
        switch(this.foldreszkod) {
            case 'E': foldresz = "Európa"; break;
            case 'Z': foldresz = "Ázsia"; break;
            case 'F': foldresz = "Afrika"; break;
            case 'M': foldresz = "Észak-Amerika"; break;
            case 'D': foldresz = "Dél-Amerika"; break;
            case 'O': foldresz = "Ausztriália és Óceánia"; break;
            default: foldresz = "N/A;";
        }
        outputStr += String.format("#%d [%s] %s (%d) => %,d", this.id, foldresz, this.orszagnev, this.fuggoseg, this.nepesseg);
        return outputStr;
    }
}