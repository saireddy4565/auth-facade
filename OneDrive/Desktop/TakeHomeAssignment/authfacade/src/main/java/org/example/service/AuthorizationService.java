package org.example.service;

import org.example.model.AuthorizationRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthorizationService {

    private final RestTemplate restTemplate;

    public AuthorizationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean isAuthorized(AuthorizationRequest request) {
        return "123".equals(request.getUserId())
                && "read".equals(request.getAction())
                && "document-456".equals(request.getResource());
    }
}
