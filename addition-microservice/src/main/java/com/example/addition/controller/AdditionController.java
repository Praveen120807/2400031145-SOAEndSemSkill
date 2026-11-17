package com.example.addition.controller;

import com.example.addition.model.AdditionRequest;
import com.example.addition.model.AdditionResponse;
import com.example.addition.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AdditionController {

    @Autowired
    private AdditionService additionService;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody AdditionRequest request) {
        if (request == null || request.getA() == null || request.getB() == null) {
            return ResponseEntity.badRequest().body("Both 'a' and 'b' must be provided.");
        }
        AdditionResponse response = additionService.add(request);
        return ResponseEntity.ok(response);
    }
}
