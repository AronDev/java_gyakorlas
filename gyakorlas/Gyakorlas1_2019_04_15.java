public class Gyakorlas1_2019_04_15 {
    public static void main(String[] args) {
        class allat {
            // Változók
            String nev;
            int kor;
            char neme;
            String szin;
            int allapot;
            
            String allapotok[] = {
                "alszik",
                "nyugodt",
                "normál",
                "élénk",
                "izgatott",
                "vidám",
                "mérges"
            };
            
            
            // Metódusok
            void kiiras() {
                System.out.printf("%s | %s | %c | %d%n", this.nev, this.szin, this.neme, this.kor);
            }
            
            void kiirasAllapot() {
                System.out.printf("%s%n", allapotok[this.allapot]);
            }
            
            void oregedes() {
                System.out.printf("Kor változás %d => %d", this.kor, this.kor+5);
                this.kor += 5;
            }
            
            void valtoztatAllapot(String a) {
                for(int i = 0; i < allapotok.length; i++) {
                    if(allapotok[i].equals(a)) {
                        System.out.printf("Állapot változás %s(%d) => %s(%d)%n", allapotok[this.allapot], this.allapot, allapotok[i], i);
                        this.allapot = i;
                        break;
                    }
                }
            }
            
            // Alosztályok
            class haziallat {
                // Változók
                boolean szobatisztaAllat;
                
                // Metódusok
                void kiirasTisztasag() {
                    System.out.printf("Tisztasági állapot: %s%n", this.szobatisztaAllat ? "Szobatiszta" : "Nem szobatiszta");
                }
                
                void valtoztatTisztasagAllapot(boolean a) {
                    System.out.printf("Tisztaság változás %b => %b%n", this.szobatisztaAllat, a);
                    this.szobatisztaAllat = a;
                }
                
                // Alosztályok
                class kutya {
                    // Változók
                    boolean orzoKutya;
                    boolean szobaKutya;
                    int tudasKutya;
                    
                    // Metódusok
                    void kiirasTudas() {
                        System.out.printf("A kutya tudása: %d%n", this.tudasKutya);
                    }
                    
                    void iskolazottsag() {
                        System.out.printf("Kutya tudás változás %d => %d%n", this.tudasKutya, this.tudasKutya+5);
                        this.tudasKutya += 5;
                    }
                }
                
                class macska {
                    // Változók
                    int egereszMacska;
                    
                    // Metódusok
                    void kiirasEgereszTudas() {
                        System.out.printf("A macska egerésző tudása: %d%n", this.egereszMacska);
                    }
                    
                    void gyakorlas() {
                        System.out.printf("Macska egerészés tudás változás %d => %d%n", this.egereszMacska, this.egereszMacska+5);
                        this.egereszMacska += 5;
                    }
                }
            }
        }
                
        // Teszt
        allat m = new allat();
        m.nev = "Józsi";
        m.szin = "Szürke";
        m.kor = 6;
        m.neme = 'H';
        m.kiiras();
        m.valtoztatAllapot("normál");
    }
}
