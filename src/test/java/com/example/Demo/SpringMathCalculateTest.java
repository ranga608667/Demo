package com.example.Demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest (SpringMathCalculate.class)

public class SpringMathCalculateTest {
    @Autowired
    private MockMvc mvc;


    @Test
    public void mathAdd() throws Exception{
        RequestBuilder request=get("/math/calculate?operation=add&n=30&n=5&n=10");
                //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
        .andExpect(content().string("Sum = 45"));
    }

    @Test
    public void mathSub() throws Exception{
        RequestBuilder request=get("/math/calculate?operation=subtract&n=30&n=5&n=10");
        //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
                .andExpect(content().string("subtract = 15"));
    }

    @Test
    public void mathMult() throws Exception{
        RequestBuilder request=get("/math/calculate?operation=multiply&n=30&n=5&n=10");
        //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
                .andExpect(content().string("Multiply =  1500"));
    }

    @Test
    public void mathDiv() throws Exception{
        RequestBuilder request=get("/math/calculate?operation=divide&n=100&n=2&n=10");
        //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
                .andExpect(content().string("Divide = 5"));
    }

    @Test
    public void mathSum() throws Exception{
        RequestBuilder request=get("/math/calculate?&n=30&n=5");
        //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
                .andExpect(content().string("Sum = 35"));
    }
//
//    @Test
//    public void mathSumNums() throws Exception{
//        RequestBuilder request=get("/math/sum?n=30&n=5&n=10");
//        //?operation=add&x=4&y=6"
//        this.mvc.perform(request).andExpect(status().isOk())
//                .andExpect(content().string("sum = 45"));
//    }

}

