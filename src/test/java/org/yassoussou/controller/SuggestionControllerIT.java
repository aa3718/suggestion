package org.yassoussou.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.yassoussou.response.SuggestionResponseDTO;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SuggestionControllerIT {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void given_when_then() {
        // Given


        // When
        final ResponseEntity<SuggestionResponseDTO> response = testRestTemplate.exchange(
                RequestEntity.get("/v1/suggestions").build(),
                new ParameterizedTypeReference<>() {});

        // Then

    }

}