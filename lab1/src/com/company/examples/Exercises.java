package com.company.examples;

import java.util.Scanner;

public class Exercises {
    /*
    1.	Scrieti un program care sa afișeze toate numerele pare din intervalul [0,n], unde n este un numar citit de la tastatura.
    2.	Scrieți un program care sa compare doua numere a și b citite de la tastatura si sa afiseze numarul mai mare.
    3.	Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.
    4.	Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n (inclusiv).
    5.	Cititi de la tastatura n numere. Elementele citite vor fi organizate in doi vectori diferiti, in functie de paritate (de ex: elementele pare in vectorul x, iar cele impare in vectorul y).
    6.	Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura, citirea notelor se opreste si programul afiseaza media acestora.
    */
    public static void main(String[] args) {
//  1.	Scrieti un program care sa afișeze toate numerele pare din intervalul [0,n], unde n este un numar citit de la tastatura.

        System.out.println("Exercise 1:\n");

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Type the value of n: ");

        n = sc.nextInt();


        System.out.println("All the numbers in [0, n]: ");
        for(int i = 0; i <= n; i++)
            System.out.print(i + " ");
        System.out.println("\n\n");

//  2.	Scrieți un program care sa compare doua numere a și b citite de la tastatura si sa afiseze numarul mai mare.

        System.out.println("Exercise 2:\n");
        int a, b;
        System.out.print("Type the value of a: "); a = sc.nextInt();
        System.out.print("Type the value of b: "); b = sc.nextInt();
        System.out.println("Max(a, b) == " + "Max(" + a + ", " + b + "):");
        if(a >= b)
            System.out.println(a);
        else
            System.out.println(b);
        System.out.println("\n\n");

//  3.	Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.

        System.out.println("Exercise 3:\n");
        System.out.println("Type the value of n: ");
        n = sc.nextInt();
        System.out.println("Factorial(" + n + "):");
        System.out.println(factorial(n));
        System.out.println("\n\n");


//  4.	Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n (inclusiv).

        System.out.println("Exercise 4:\n");
        System.out.println("Type the value of n: ");
        n = sc.nextInt();
        System.out.println("Sum of all multiples of 3 and 5 in the interval [1, " + n + "]: ");
        System.out.println(sum(n));
        System.out.println("\n\n");


//  5.	Cititi de la tastatura n numere. Elementele citite vor fi organizate in doi vectori diferiti, in functie de paritate (de ex: elementele pare in vectorul x, iar cele impare in vectorul y).
        System.out.println("Exercise 5:\n");
        System.out.println("Type the value of n: ");
        n = sc.nextInt();
//        int[] array = new int[n];
        int[] even = new int[n]; int evenIndex = 0;
        int[] odd = new int[n]; int oddIndex = 0;
        System.out.println("Type the n numbers: ");
        int x;
//        for(int i = 0; i < n; i++)
//            array[i] = sc.nextInt();
        for(int i = 0; i < n; i++) {
//            if(array[i] % 2 == 0)
            x = sc.nextInt();

            if (x % 2 == 0)
                even[evenIndex++] = x;
            else
                odd[oddIndex++] = x;
        }
        System.out.println("Even numbers: ");
        for(int i = 0; i < evenIndex; i++)
            System.out.print(even[i] + " ");
        System.out.println();
        System.out.println("Odd numbers: ");
        for(int i = 0; i < oddIndex; i++)
            System.out.print(odd[i] + " ");
        System.out.println("\n\n");

//  6.	Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura, citirea notelor se opreste si programul afiseaza media acestora.
        System.out.println("Exercise 6:\n");




        System.out.println("Type the grades: ");
        int grade = sc.nextInt();
        int sumGrades = 0;
        int totalGrades = 0;
        while(grade != -1) {
            sumGrades += grade;
            totalGrades++;
            grade = sc.nextInt();
        }

        System.out.println("Average Grade: ");


        System.out.println((float) sumGrades/totalGrades);





    }

//  3.	Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.
    public static int factorial(int n){
        if(n == 0)
            return 1;
        else return n * factorial(n-1);
    }
//  4.	Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n (inclusiv).
    public static int sum(int n){
        int s = 0;
        for(int i = 1; i <= n; i++)
            if(i%3 == 0 && i%5 == 0)
                s += i;
        return s;
    }

}
