package com.unibw;

public class Gleitzahl {
    public static void floater() {
        float f = 123;
        // f = 123.4; // Compiler Fehler
        f = 123.4f;
        double d = 123;
        d = 123.4;
        d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(d); // Standardausgabe: 0.9999999999999999
        d = 9/2;
        System.out.println(d); // Standardausgabe: 4.0
        d = 9.0/2;
        System.out.println(d); // Standardausgabe: 4.5
        d = 11.7;
        byte b = (byte)d;
        System.out.println(b); // Standardausgabe: 11
        d = 128;
        b = (byte)d;
        System.out.println(b); // Standardausgabe: -128
    }

}

