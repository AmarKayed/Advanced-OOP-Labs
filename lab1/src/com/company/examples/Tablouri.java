package com.company.examples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tablouri {
    public static void main(String[] args) {
//        int[] myArray = {2, 3, 4, "cat"};
        int[] myArray = {2, 3, 4};

        int[] myArray2 = new int[3];    // Elementele vor avea valori random

        System.out.println(myArray2);
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray2));

        int[][] matrix = new int[3][3];

        int[][] matrix2 = {{1, 0, 3}, {0}};



    }
}
