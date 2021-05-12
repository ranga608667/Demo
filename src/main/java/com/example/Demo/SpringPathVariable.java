package com.example.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringPathVariable {

    @GetMapping("/math/volume/{i}/{j}/{k}")
    public String declarePathVariables(@PathVariable int i,
                                       @PathVariable("j") int query,
                                       @PathVariable("k") int query1){
        return "volume of rectangle " + i*query*query1;
    }
}
