package org.logical.program;

public class FactorialUsingRecursion {


    static int findFactorial(int num) {

        if(num==0 ||num==1 ){
            return 1;
        }

        return num * findFactorial(num - 1);
    }

    public static void main(String[] args) {
        int fact = findFactorial(5);

        System.out.println("Factorial : " + fact);
        String str="Ravi";
    }
}
