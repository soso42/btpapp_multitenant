package com.example.btpapp_multitenant.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<String> homepage() {
        return ResponseEntity.ok("Homepage works!!!");
    }

}
