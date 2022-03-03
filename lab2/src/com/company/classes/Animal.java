package com.company.classes;

public class Animal {
    private int age;
    private String name;


    // Custom constructors

    public Animal(){
        this.age = 0;
        this.name = null;
    }
    public Animal(int age){
//        setAge(age);
        this.age = age;
    }

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("This animal makes the sound: ham");
    }

    public void move(){
        System.out.println("This animal moves by: jumping");
    }

}
