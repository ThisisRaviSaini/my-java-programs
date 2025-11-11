package org.logical.oops;

public interface MyInterface {

    public void display();

    default void tellMyName() {
        System.out.println("My name is Ravi Saini");
    }

    static void calculate() {
        int c = 10 + 20;
        System.out.println("this is the static method of interface");

    }

}

class MyImplementationClass implements MyInterface {

    public void display() {
        System.out.println("this is the implementation of display method of the interface");
    }

    public static void main(String[] args) {
        MyInterface myInterface= new MyImplementationClass();
        myInterface.display();
        myInterface.tellMyName();
        MyInterface.calculate();
    }

}
