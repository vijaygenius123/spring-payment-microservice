package com.vijaygenius123.learning.microservice.payment.services;

import com.vijaygenius123.learning.microservice.payment.models.Payment;
import com.vijaygenius123.learning.microservice.payment.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment makePayment(Payment payment){
        payment.setTransactionId(UUID.randomUUID().toString());
        return repository.save(payment);
    }
}
