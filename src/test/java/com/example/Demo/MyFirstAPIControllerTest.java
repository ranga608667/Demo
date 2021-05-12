package com.example.Demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MyFirstAPIController.class)

public class MyFirstAPIControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testMyFirstEndPoint() throws Exception {
        RequestBuilder Request1=get("/myApp");
        this.mvc.perform(Request1)
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
    }

    @Test
    public void testMyFirstQueryString() throws Exception {
        RequestBuilder Request1=get("/myApp/QSexample?first=Rangajan&last=Murugan");
        this.mvc.perform(Request1)
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Rangajan Murugan"));
    }

}
