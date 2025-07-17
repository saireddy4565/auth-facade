package org.example.controller;

import org.example.model.AuthorizationRequest;
import org.example.model.AuthorizationResponse;
import org.example.service.AuthorizationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authorize")
public class AuthorizationController {

    private final AuthorizationService authorizationService;

    public AuthorizationController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @PostMapping
    public ResponseEntity<AuthorizationResponse> authorize(@RequestBody AuthorizationRequest request) {
        boolean result = authorizationService.isAuthorized(request);
        return ResponseEntity.ok(new AuthorizationResponse(result));
    }
}
