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
        RequestBuilder request=get("/math/calculate?operation=add&x=4&y=6");
                //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
        .andExpect(content().string("4 + 6 = 10"));
    }

    @Test
    public void mathSub() throws Exception{
        RequestBuilder request=get("/math/calculate?operation=subtract&x=4&y=6");
        //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
                .andExpect(content().string("4 - 6 = -2"));
    }

    @Test
    public void mathMult() throws Exception{
        RequestBuilder request=get("/math/calculate?operation=multiply&x=4&y=6");
        //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
                .andExpect(content().string("4 * 6 = 24"));
    }

    @Test
    public void mathDiv() throws Exception{
        RequestBuilder request=get("/math/calculate?operation=divide&x=30&y=5");
        //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
                .andExpect(content().string("30 / 5 = 6"));
    }

    @Test
    public void mathSum() throws Exception{
        RequestBuilder request=get("/math/calculate?x=30&y=5");
        //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
                .andExpect(content().string("30 + 5 = 35"));
    }

    @Test
    public void mathSumNums() throws Exception{
        RequestBuilder request=get("/math/sum?n=30&n=5&n=10");
        //?operation=add&x=4&y=6"
        this.mvc.perform(request).andExpect(status().isOk())
                .andExpect(content().string("sum = 45"));
    }

}

