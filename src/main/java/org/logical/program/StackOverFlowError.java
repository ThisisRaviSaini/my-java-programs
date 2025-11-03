package org.logical.program;

public class StackOverFlowError {

    StackOverFlowError() {
        StackOverFlowError sofv2 = new StackOverFlowError();
    }
    
    public static void main(String[] args) {
        StackOverFlowError sofv = new StackOverFlowError();
    }
}
