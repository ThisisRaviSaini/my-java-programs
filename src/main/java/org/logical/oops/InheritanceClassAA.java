package org.logical.oops;

public class InheritanceClassAA {

    int id;
    String name;

    InheritanceClassAA() {
        System.out.println("In the Parent Class Constructor");
    }
}

class InheritanceClassBB extends InheritanceClassAA {

    String company;

    InheritanceClassBB() {
        System.out.println("In the Child Class Constructor");
    }

    public static void main(String[] args) {
        InheritanceClassAA icaa = new InheritanceClassAA();
        icaa.id = 1;

        InheritanceClassBB icbb = new InheritanceClassBB();
        icbb.id = 2; // Parent Class Instance : We won't be able to do this if  we haven't extended the class or used the inheritance;
        icbb.name = "Ravi Saini";
        icbb.company = "American Express";

    }

}