package com.company.catalog;

import com.company.catalog.models.*;

public class Main {

    // this is a comment

    /*
    this is a
    multiline comment
     */

    public static void main(String[] args) {
//        Student student2 = new Student();
//        Student student = new Student();
//        Teacher teacher = new Teacher();

        // Tipuri de Date:

        // numerice
        // de la cel mai mic la cel mai mare

        byte myBite =  (byte) 3000;

        Byte minB = Byte.MIN_VALUE;
        Byte maxB = Byte.MAX_VALUE;

        short myShort = 30000;
        Short mins = Short.MIN_VALUE;


        // Nu ar fi bine sa memoram valoarea 1 intr-un int
        int myInt = 100_000_000;
        Integer min = Integer.MIN_VALUE;
        Integer max = Integer.MAX_VALUE;

        long myLong = 100_000_000_000_000L; // Am pus L la sfarsit
        Long minLong = Long.MIN_VALUE;


        float myFloat = (float) 2.14;
        double d = 2.14;

        // alfanumerice

        char c = 'a';

        // other
        boolean t = true;
        boolean f = false;

        System.out.println("Hello World!");
        System.out.println(min);
        System.out.println(max);


    }
}
