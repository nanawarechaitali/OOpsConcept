package com.bridgelabz;

public class Animals {
    public void eat(){
        System.out.println("I can eat");
    }
    public void sleep(){
        System.out.println("I can sleep ");
    }

}
class Dog extends Animals{
    public void bark(){
        System.out.println("I can bark");
    }
}
