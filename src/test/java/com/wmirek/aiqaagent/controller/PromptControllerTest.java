package com.wmirek.aiqaagent.controller;

import com.wmirek.aiqaagent.model.response.PromptResponse;
import com.wmirek.aiqaagent.service.PromptService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@WebMvcTest(PromptController.class)
public class PromptControllerTest {

    @MockitoBean
    private PromptService promptService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldGeneratePromptResponse() throws Exception {
        when(promptService.generate("Generate login API tests"))
                .thenReturn(new PromptResponse("Mock response"));

        mockMvc.perform(post("/api/v1/prompts")
                        .contentType(APPLICATION_JSON)
                        .content("""
                                {
                                "prompt": "Generate login API tests"
                                }
                                """))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.response")
                        .value("Mock response"));
    }
}
