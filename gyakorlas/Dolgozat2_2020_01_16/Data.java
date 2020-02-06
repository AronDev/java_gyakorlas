package Dolgozat2_2020_01_16;

class Tunnel {
    String Name;
    int Length;
    String YearOfDelivery;
    String Province;

    public Tunnel(String Name, int Length, String YearOfDelivery, String Province) {
        this.Name = Name;
        this.Length = Length;
        this.YearOfDelivery = YearOfDelivery; // UC - Under Construction, PRJ - Under Planning
        this.Province = Province;
    }  
}