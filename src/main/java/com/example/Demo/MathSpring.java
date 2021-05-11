package com.example.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathSpring {

    @GetMapping("/math/api")
    public String mathSpringMethod(){
        return "3.141592653589793";
    }
}
