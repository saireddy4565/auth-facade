package org.example.service;

import org.example.model.AuthorizationRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.HashMap;

@Service
public class AuthorizationService {

    private static final Map<String, Boolean> MOCK_DB = new HashMap<>();
    static {
        MOCK_DB.put("123:read:document-456", true);
    }

    public boolean isAuthorized(AuthorizationRequest request) {
        String key = request.getUserId() + ":" + request.getAction() + ":" + request.getResource();
        return MOCK_DB.getOrDefault(key, false); // Simulated downstream logic
    }
}
