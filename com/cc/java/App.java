package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
    //    ausgabe("Ergebnis +: " + addieren(2, -1));
    //    ausgabe("Ergebnis -: " + subtrahieren(5, 4));
    //    ausgabe("Ergebnis *: " + multiplizieren(5, 4));
       
       ausgabe("Ergebnis /: " + dividieren(5, 2));
       ausgabe("Ergebnis /: " + dividieren(0, 5));
       ausgabe("Ergebnis /: " + dividieren(5, 0));

    }

    // Rechenart
    // +/-/*/:  ???

    // Division
    public static String dividieren(double a, double b) {
        
        if (b != 0) {
            return Double.toString(a/b) ; // double --> String
        }
       
        return "ERROR: Div. durch 0 nicht OK!";
       
    }

    // Addition OK!
    public static double addieren(double a, double b) {
        return a + b;
    }

    // Substraktion OK
    public static double subtrahieren(double a, double b) {
        return a - b;
    }

    // Multiplikation OK
    public static double multiplizieren(double a, double b) {
        return a * b;
    }

   
    // Ausgabe
    public static void ausgabe(String outputStr) {
        System.out.println(outputStr);
    }
    

}

