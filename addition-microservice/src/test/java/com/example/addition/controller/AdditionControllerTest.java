package com.example.addition.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AdditionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testAdd() throws Exception {
        mockMvc.perform(post("/api/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"a\": 5, \"b\": 10}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value(200))
                .andExpect(jsonPath("$.result").value(15))
                .andExpect(jsonPath("$.message").value("MSI 1.1 - Addition = 15"));
    }

    @Test
    void testInvalid() throws Exception {
        mockMvc.perform(post("/api/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"a\": 5}"))
                .andExpect(status().isBadRequest());
    }
}
