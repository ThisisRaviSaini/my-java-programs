package org.logical.oops;


class ParentClassAA {
    String name;
    int age;

    ParentClassAA(String name, int age) { //When explicit constructor
        // is defined in a class, then default constructor won't be executed. Automatically,
        // we need to explicitly define the no arc constructor along with parameters constructor.
        this.name = name;
        this.age = age;
    }

    ParentClassAA() { // We need to define the No=Arg Constructor in parent when using the Child Arg constructor and no super is defined in arg constructor of Child
        System.out.println("In the Parent No-Arg Constructor");
    }

}

class ChildClassBB extends ParentClassAA {
    String company;
    int exp;

    ChildClassBB(String company, int exp) {

        //super() automatically added by compiler
        this.company = company;
        this.exp = exp;
        System.out.println("In the child parametrised constructor");
    }
}

public class ParentChildNoArgParameterisedConstructorExecutionOrder {
    public static void main(String[] args) {
        ChildClassBB ccbb = new ChildClassBB("American Express", 2);
    }
}
