package com.example.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myApp")
public class MyFirstAPIController {

    @GetMapping()
    public String myFirstAPI(){
        return "Hello World";
    }


    @GetMapping("/QSexample")
    public String myFirstQueryStringAPI(@RequestParam String first,@RequestParam String last){
        return "Hello" + " " + first + " " + last;
    }

}
