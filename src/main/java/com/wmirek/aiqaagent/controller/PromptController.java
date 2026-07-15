package com.wmirek.aiqaagent.controller;

import com.wmirek.aiqaagent.model.request.PromptRequest;
import com.wmirek.aiqaagent.model.response.PromptResponse;
import com.wmirek.aiqaagent.service.PromptService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/prompts")
public class PromptController {

    private final PromptService promptService;

    public PromptController(PromptService promptService) {
        this.promptService = promptService;
    }

    @PostMapping
    public PromptResponse generateResponse(@Valid @RequestBody PromptRequest promptRequest) {
        return promptService.generate(promptRequest.prompt());
    }
}
