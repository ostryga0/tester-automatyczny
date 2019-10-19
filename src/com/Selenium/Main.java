package com.Selenium;

public class Main {

    public static void main(String[] args) {
        Samochod samochod = FabrykaSamochodow.getSamochod(30)  ;
        System.out.println(samochod.getClass().toString());}
}

interface Samochod {
    int maxPredkosc();
}

class Mercedes implements Samochod {
    String kolor;
    int cena;
    public int maxPredkosc() {
        return 60;
    }
}

class BMW implements Samochod {
    String kolor;
    int cena;
    public int maxPredkosc() {
        return 90;
    }

}
class Audi implements Samochod {
    String kolor;
    int cena;
    public int maxPredkosc() {
        return 30;
    }
}

    class FabrykaSamochodow {


        public static Samochod getSamochod(int maxPredkosc) {
            Samochod samochod = null;

            switch (maxPredkosc) {
                case 60:
                    samochod = new Mercedes();
                    break;
                case 90:
                    samochod = new BMW();
                    break;
                case 30:
                    samochod = new Audi();

            }
            return samochod;
        }
    }
