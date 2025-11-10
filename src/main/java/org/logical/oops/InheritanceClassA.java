package org.logical.oops;

public class InheritanceClassA {
    int age;
    String name;

    InheritanceClassA() {
        System.out.println("Default Constructor");
    }

    InheritanceClassA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }

}

class InheritanceClassB extends InheritanceClassA {

    InheritanceClassB() {
        System.out.println("In Child Default Constructor");
    }

    void print() {
        System.out.println("Chile Print Method");
    }

    public static void main(String[] args) {
        InheritanceClassA a = new InheritanceClassA("Ravi", 31);
        a.display();
        InheritanceClassA ab = new InheritanceClassB(); // Can Access Only Parent properties
        ab.display();

        InheritanceClassB b = new InheritanceClassB(); // Child Reference & Child Object can access both Parent and Child properties.
        b.display();
        b.print();


    }
}



