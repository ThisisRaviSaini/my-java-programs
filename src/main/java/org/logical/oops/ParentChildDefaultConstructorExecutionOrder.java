package org.logical.oops;


class ParentClass {

    ParentClass() {
        System.out.println("Parent Constructor Executed");
    }
}

class ChildClass extends ParentClass {

    ChildClass() {
        System.out.println("Child Constructor Executed");
    }
}

public class ParentChildDefaultConstructorExecutionOrder {
    public static void main(String[] args) {
        ParentClass pc = new ParentClass(); // Only Parent Constructor will get called
        ChildClass cc = new ChildClass(); //  Parent & Child Constructor will get called
        ParentClass pcc = new ChildClass(); // Parent & Child Constructor will get called

    }

}
