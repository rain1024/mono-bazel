package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class CalculatorController {

    @GetMapping("/")
    public String handle() {
        Random random = new Random();
        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;

        Calculator calculator = new Calculator();
        int result = calculator.add(num1, num2);

        return "Do you know " + num1 + " + " + num2 + " = " + result + "?";
    }
}