package com.company.Enterfaces;

public class Person implements Info{
    String name;
    Person(String name){
        this.name=name;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }
    public void showInfo(){
        System.out.println("Name is "+this.name);
    }
}
