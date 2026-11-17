package com.example.addition.service;

import com.example.addition.model.AdditionRequest;
import com.example.addition.model.AdditionResponse;
import org.springframework.stereotype.Service;

@Service
public class AdditionService {

    public AdditionResponse add(AdditionRequest request) {
        int sum = request.getA() + request.getB();
        String message = "MSI 1.1 - Addition = " + sum;
        return new AdditionResponse(message, 200, "addition", sum);
    }
}
