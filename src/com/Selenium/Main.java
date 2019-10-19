package com.Selenium;

public class Main {

    public static void main(String[] args) {
        //System.out.println("cokolwiek");
        Zwierze zwierze = FabrykaZwierzat.getZwierze("miau");
        System.out.println(zwierze.getClass().toString());
    }
}

interface Zwierze {
    String dajGlos();
}

class Kot implements Zwierze {
    public String dajGlos() {
        return "miau";
    }
}

class Pies implements Zwierze {
    public String dajGlos() {
        return "hau";
    }

    }

    class FabrykaZwierzat {



        public static Zwierze getZwierze(String glos) {
            Zwierze zwierze=null;

            switch( glos){
                case "hau":
                    zwierze = new Pies();
                    break;
                case "miau":
                    zwierze = new Kot();
                    break;
            }
            return zwierze;
        }
    }