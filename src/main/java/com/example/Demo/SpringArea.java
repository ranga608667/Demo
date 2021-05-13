package com.example.Demo;

import org.springframework.core.style.ToStringCreator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringArea {
    @PostMapping("/math/area")
    public String GetAreaOfCircle(@RequestParam String type,
                                  @RequestParam(required=false,defaultValue = "0") int radius,
                                  @RequestParam(required=false,defaultValue = "0") int width,
                                  @RequestParam(required=false,defaultValue = "0") int height){
      if (type.equals("circle") && radius !=0) {
          double areaOfCircle = 3.14159 * radius * radius;
          return String.format("Area of a circle with a radius of %d is %f", radius, areaOfCircle);
      } else if (type.equals("rectangle") && width!=0 && height!=0) {
          int areaOfRec = width * height;
          return String.format("Area of a %dx%d rectangle is %d", width, height, areaOfRec);
      } else {
                return "Invalid";
        }
    }
}
