package com.vijaygenius123.learning.microservice.payment.controllers;

import com.vijaygenius123.learning.microservice.payment.models.Payment;
import com.vijaygenius123.learning.microservice.payment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/make")
    public Payment makePayment(@RequestBody Payment payment){

        return paymentService.makePayment(payment);
    }
}
