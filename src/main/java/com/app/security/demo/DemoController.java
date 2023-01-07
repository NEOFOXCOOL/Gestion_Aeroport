package com.app.security.demo;

import com.app.security.auth.AuthenticationResponse;
import com.app.security.auth.AuthenticationService;
import com.app.security.auth.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/auth/demo-controller")
public class DemoController {
private final AuthenticationService authService;

    @PostMapping()
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest reqest
    ){
        return ResponseEntity.ok(authService.register(reqest));
    }

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("hello from secur aria");
    }
}
