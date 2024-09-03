package org.yassoussou.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yassoussou.response.SuggestionResponseDTO;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/v1/suggestions")
public class SuggestionController {

    @GetMapping
    public ResponseEntity<SuggestionResponseDTO> getSuggestion() {
        return ResponseEntity.status(OK).body(new SuggestionResponseDTO());
    }
}
