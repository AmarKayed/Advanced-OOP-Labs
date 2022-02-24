package com.company.examples;


public class Types {


    public static void main(String[] args) {
        // Primitive:

        byte myBite =  (byte) 3000;
        short myShort = 30000;
        int myInt = 100_000_000;
        long myLong = 100_000_000_000_000L; // Am pus L la sfarsit
        float myFloat = (float) 2.14;
        double d = 2.14;
        char c = 'a';
        boolean t = true;
        boolean f = false;

        // derivate/clase care extind primitivele
        Byte minB = Byte.MIN_VALUE;
        Byte maxB = Byte.MAX_VALUE;
        Short mins = Short.MIN_VALUE;
        Integer min = Integer.MIN_VALUE;
        Integer max = Integer.MAX_VALUE;
        Long minLong = Long.MIN_VALUE;


        System.out.println("Hello World!");
        System.out.println(min);
        System.out.println(max);


    }
}
