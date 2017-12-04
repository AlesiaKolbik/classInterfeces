package com.company.Enterfaces;

public class Test {
    public static void main(String[] args){
        Animals animal=new Animals();
        Dog dog1=new Dog();
        Cat cat1=new Cat();

        test(animal);
        test(cat1);
        test(dog1);

        }
    static void test(Animals animal){
        animal.eat();
    }
}
