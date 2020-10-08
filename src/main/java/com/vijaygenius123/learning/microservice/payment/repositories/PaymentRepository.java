package com.vijaygenius123.learning.microservice.payment.repositories;

import com.vijaygenius123.learning.microservice.payment.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
