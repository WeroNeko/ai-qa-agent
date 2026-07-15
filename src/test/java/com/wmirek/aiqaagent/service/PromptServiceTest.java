package com.wmirek.aiqaagent.service;

import com.wmirek.aiqaagent.model.response.PromptResponse;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PromptServiceTest {

    private final PromptService promptService = new PromptService();

    @Test
    void shouldReturnGeneratedResponseForValidPrompt() {
        final PromptResponse response = promptService.generate("Generate login API tests");

        assertThat(response.response())
                .isEqualTo("Mock response");
    }
}
