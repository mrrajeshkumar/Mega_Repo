package com.docker.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

    @WebMvcTest(CommonController.class)
    public class CommonControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        public void testGetValue() throws Exception {
            mockMvc.perform(get("/api/"))
                    .andExpect(status().isOk())
                    .andExpect(content().string("This is a string value!"));
        }
    }