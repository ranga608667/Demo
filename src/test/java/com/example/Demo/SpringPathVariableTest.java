package com.example.Demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SpringPathVariable.class)

public class SpringPathVariableTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void TestPathVariables() throws Exception{
        int i=5;int j=6;int k=8;

        RequestBuilder request=get((String.format("/math/volume/%d/%d/%d", i,j,k)));

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("volume of rectangle 240" ));

    }
}
