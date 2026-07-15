package com.wmirek.aiqaagent.model.request;
import jakarta.validation.constraints.NotBlank;

public record PromptRequest(

        @NotBlank(message = "Prompt must not be blank") String prompt

) {
}
