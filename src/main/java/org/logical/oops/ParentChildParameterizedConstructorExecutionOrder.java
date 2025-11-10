package org.logical.oops;

class ParentClassA {
    String name;
    int age;

    ParentClassA(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("In the Parent Class Constructor");
    }
}

class ChildClassB extends ParentClassA {
    String company;
    int exp;

    ChildClassB(String name, int age, String company, int exp) {
        super(name, age);
        this.company = company;
        this.exp = exp;
        System.out.println("In the Child Class Constructor");
    }
}

public class ParentChildParameterizedConstructorExecutionOrder {

    public static void main(String[] args) {
        // ParentClassA pc = new ParentClassA("Ravi", 31);
        ChildClassB ccb = new ChildClassB("Ravi", 31, "American Express", 2); // Parent Constructor should be called using
        // super or we need to create default no-arg constructor in parent class.
    }
}
