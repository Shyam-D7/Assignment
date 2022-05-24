package com.shyam.data.calculator.app.operations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Operations {

    public double addition(double a, double b) {
        return a+b;
    }

    public double subtraction(double a, double b) {
        return a-b;
    }

    public double multiplicaiton(double a, double b) {
        return a*b;
    }

    public double division(double a, double b) {
        return a/b;
    }

    private final MyOperations myOperations;

    @Autowired
    public Operations(MyOperations myOperations) {
        this.myOperations = myOperations;
    }

    public String justAnotherMethod() {
        return myOperations.ownOperationsMethod() + "hierarchy";
    }
}
