package com.example.Demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MathSpring.class)
public class MathSpringTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void mathAPITest() throws Exception{
       RequestBuilder Request1= get("/math/api");
        this.mvc.perform(Request1)
                .andExpect(status().isOk())
                .andExpect(content().string("3.141592653589793"));
    }

}
