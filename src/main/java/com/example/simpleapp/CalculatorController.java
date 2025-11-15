package com.example.simpleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public Map<String, Object> calculate(
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam(defaultValue = "+") String op) {

        Map<String, Object> resp = new HashMap<>();
        resp.put("a", a);
        resp.put("b", b);
        resp.put("op", op);
        try {
            double result;
            switch (op) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/":
                    if (b == 0) throw new IllegalArgumentException("Division by zero");
                    result = a / b; break;
                case "%":
                    if (b == 0) throw new IllegalArgumentException("Modulo by zero");
                    result = a % b; break;
                default:
                    throw new IllegalArgumentException("Unsupported operation: " + op);
            }
            resp.put("result", result);
        } catch (IllegalArgumentException e) {
            resp.put("error", e.getMessage());
        }
        return resp;
    }
}
