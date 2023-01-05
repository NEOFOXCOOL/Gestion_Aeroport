package com.app.security.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @ResponseBody RegisterRequest reqest
    ){
        //
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(
            @ResponseBody AuthenticationRequest reqest
    ){
        //
    }


}
