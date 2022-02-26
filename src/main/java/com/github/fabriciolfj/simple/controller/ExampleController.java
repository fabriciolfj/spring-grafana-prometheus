package com.github.fabriciolfj.simple.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/example")
public class ExampleController {

    @GetMapping
    public ResponseEntity<ExampleDTO> get() {
        return ResponseEntity.ok(new ExampleDTO("Teste"));
    }
}
