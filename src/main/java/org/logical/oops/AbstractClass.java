package org.logical.oops;

public abstract class AbstractClass {

    AbstractClass() {
        System.out.println("This is Abstract class Constructor");
    }

    abstract void display();

    void concreteMethod() {
        System.out.println("this is concrete method of abstract class Show Method");
    }

    static void staticMethod() {
        System.out.println("this is static method");
    }

}

class MyClass extends AbstractClass {

    void display() {
        System.out.println("This is the Implementation of the Abstract method");
    }

    public static void main(String[] args) {

        AbstractClass abstractClassObj = new MyClass();
        abstractClassObj.display(); // abstract method defined in abstract class
        abstractClassObj.concreteMethod(); //concrete method defined in abstract class
        AbstractClass.staticMethod(); //static method of abstract class called using class name
    }

}