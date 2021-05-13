package com.example.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringMathCalculate {

    @GetMapping("/math/calculate")

    public String mathCal(@RequestParam(required = false, defaultValue = "add") String operation, @RequestParam int... n) {
        if (operation.equals("add")) {
            int x = 0;
            for (int s : n) {
                x = x + s;
            }
            return "Sum = " + x;
        } else if (operation.equals("multiply")) {
            int y = 1;
            for (int s : n) {
                y = y * s;
            }
            return "Multiply =  " + y;
        } else if (operation.equals("subtract")) {
            int z = n[0];
            for (int i = 1; i < n.length; i++) {
                z = z - n[i];
            }
            return "subtract = " + z;
        } else {
            int div = n[0];
            for (int i = 1; i < n.length; i++) {
                div = div / n[i];
            }
            return "Divide = " + div;
        }
    }
}

