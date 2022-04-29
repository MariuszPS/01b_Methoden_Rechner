package com.cc.java;


public class App {
    
    public static void main(String[] args) {

        ausgabe("----------  Summe --------"); 
        ausgabe("Ergebnis +: " + addieren(4, 5));
        ausgabe("Ergebnis -: " + subtrahieren(4, 5));
ausgabe("---------  Differenz ----------");
        ausgabe(rechner(4,5,"+"));
        ausgabe(rechner(4,5,"-"));}
public static String rechner(double a, double b, String op) {
        switch (op) {
            case "+":
                return "Ergebnis: " + addieren(a,b);
            case "-":
                return "Ergebnis: " + subtrahieren(a,b);
 }
        return op;
    }
public static double subtrahieren(double a, double b) {
        return a - b;
    }

     public static double addieren(double a, double b) {
        return a + b;
    }
   
    public static void ausgabe(String outputStr) {
        System.out.println(outputStr);
    }
}

