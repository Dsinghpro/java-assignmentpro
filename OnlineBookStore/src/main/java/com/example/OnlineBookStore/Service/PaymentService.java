package com.example.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.OnlineBookStore.entity.Payment;
import com.example.OnlineBookStore.repository.PaymentRepository;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;
    
    @Autowired
   	RestTemplate restTemplate;

    @Transactional
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Transactional
    public Payment getPaymentById(int paymentId) {
        return paymentRepository.findById(paymentId).orElse(null);
    }

    @Transactional
    public void makePayment(Payment payment) {
        paymentRepository.save(payment);
    }

    @Transactional
    public void updatePayment(Payment payment) {
        paymentRepository.save(payment);
    }

    @Transactional
    public void deletePayment(int paymentId) {
        paymentRepository.deleteById(paymentId);
    }

    @Transactional
    public List<Payment> getPaymentsByCustomerId(int customerId) {
        return paymentRepository.findByCustomerRegistrationId(customerId);
    }
}

