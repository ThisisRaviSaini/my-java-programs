package org.logical.program;

public class SingletonClass {

    private static SingletonClass singletonObject;

    private SingletonClass() {
        System.out.println("Singleton Instance Created");
    }

    public static SingletonClass getSingletonObject() {

        if (singletonObject == null) {
            singletonObject = new SingletonClass();
        }
        return singletonObject;
    }

    public static void main(String[] args) {
        SingletonClass instance = SingletonClass.getSingletonObject();
        SingletonClass instance2 = SingletonClass.getSingletonObject();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}
