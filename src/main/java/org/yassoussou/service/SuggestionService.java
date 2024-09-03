package org.yassoussou.service;

import org.springframework.stereotype.Service;
import org.yassoussou.response.SuggestionResponseDTO;

@Service
public class SuggestionService {

    public SuggestionResponseDTO getSuggestionResponse() {
        return new SuggestionResponseDTO();
    }

}
