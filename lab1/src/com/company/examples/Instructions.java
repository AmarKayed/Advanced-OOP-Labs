package com.company.examples;

public class Instructions {
    public static void main(String[] args) {
        // decizionale

        if(2 == 2) {
            System.out.println("It's equal");
        } else{
            System.out.println("It's idk what");
        }

        System.out.println("-----------------");

        String color = "red";

        switch (color){
            case "red":
                System.out.println("It's red");
                break;
            case "green":
                System.out.println("It's green");
                break;
            case "blue":
                System.out.println("It's blue");
                break;
            default:
                System.out.println("It's idk what");
        }

        System.out.println("-----------------");


        // repetitive

        for (int i = 0; i < 10; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
            if (i==5) {
                break;
            }
        }

        System.out.println("-----------------");
        int age = 23;
        while(age > 20){
            System.out.println(age);
            age--;
        }

        System.out.println("-----------------");

    }
}
