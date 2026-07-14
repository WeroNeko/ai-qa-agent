package com.wmirek.aiqaagent.service;

import com.wmirek.aiqaagent.model.response.PromptResponse;
import org.springframework.stereotype.Service;

@Service
public class PromptService {

    public PromptResponse generate(String prompt) {
        return new PromptResponse("Mock response");
    }
}
