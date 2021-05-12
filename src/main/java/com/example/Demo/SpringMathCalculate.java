package com.example.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringMathCalculate {

    @GetMapping("/math/calculate")

        public String mathCal(@RequestParam (required = false, defaultValue = "add") String operation,@RequestParam int x, @RequestParam int y){
        if (operation.equals("add")){
            return x + " + "  + y + " = " + (x+y);
        } else if (operation.equals("multiply")) {
             return x + " * "  + y + " = " + x*y;
        } else if (operation.equals("subtract")) {
          //  int c=x-y;
            return x + " - "  + y + " = " + (x-y);
        } else {
          return x + " / "  + y + " = " + x/y;
        }
    }


    @GetMapping("/math/sum")
    public  String mathSum (@RequestParam int... n ){
      int x=0;
      int l=n.length;
        for (int s:n){
            x=x+s;
        }

             return "sum = " + x;
    }

}
