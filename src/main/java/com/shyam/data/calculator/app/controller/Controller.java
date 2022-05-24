package com.shyam.data.calculator.app.controller;

import com.shyam.data.calculator.app.operations.Operations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Operations operations;

    @Autowired
    public Controller(Operations operations) {
        this.operations = operations;
    }

    @GetMapping("/add")
    public double addition(@RequestParam double a, @RequestParam double b){
        return operations.addition(a,b);
    }
    @GetMapping("/sub")
    public double subtraction(@RequestParam double a, @RequestParam double b){
        return operations.subtraction(a,b);
    }
    @GetMapping("/multi")
    public double multiplication(@RequestParam double a, @RequestParam double b){
        return operations.multiplicaiton(a,b);
    }
    @GetMapping("/div")
    public double division(@RequestParam double a, @RequestParam double b){
        return operations.division(a,b);
    }

    @GetMapping("/oops")
    public String justChecking(){
        return operations.justAnotherMethod() +", it's working fine";
    }


}
