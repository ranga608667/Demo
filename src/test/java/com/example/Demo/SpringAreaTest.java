package com.example.Demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SpringArea.class)
public class SpringAreaTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void getAreaOfCircle() throws Exception{
        RequestBuilder Request = post("/math/area")
                .param("type","circle")
                .param("radius","4");
        this.mvc.perform(Request).andExpect(status().isOk())
          .andExpect(content().string("Area of a circle with a radius of 4 is 50.265440"));
    }

    @Test
    public void getAreaOfRectangle() throws Exception{
        RequestBuilder Request = post("/math/area")
                .param("type","rectangle")
                .param("width", "4")
                .param("height","6");
        this.mvc.perform(Request).andExpect(status().isOk());
              //  .andExpect(content().string("Area of a 4x6 rectangle is 24"));
    }
    @Test
    public void getInvalid() throws Exception{
        RequestBuilder Request = post("/math/area")
                .param("type","rectangle")
                .param("radius", "4");
        this.mvc.perform(Request).andExpect(status().isOk())
         .andExpect(content().string("Invalid"));
    }
}
