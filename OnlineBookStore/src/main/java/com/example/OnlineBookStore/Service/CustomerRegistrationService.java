package com.example.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.OnlineBookStore.entity.CustomerRegistration;
import com.example.OnlineBookStore.repository.CustomerRegistrationRepository;

@Service
public class CustomerRegistrationService {

    @Autowired
    private CustomerRegistrationRepository customerRegistrationRepository;
    
    @Autowired
   	RestTemplate restTemplate;

    @Transactional
    public void registerCustomer(CustomerRegistration customer) {
        customerRegistrationRepository.save(customer);
    }

    @Transactional
    public CustomerRegistration getCustomerById(int customerId) {
        return customerRegistrationRepository.findById(customerId).orElse(null);
    }

    @Transactional
    public CustomerRegistration getCustomerByUserId(String userId) {
        return customerRegistrationRepository.findByUserId(userId);
    }

    @Transactional
    public boolean validateCustomerLogin(String userId, String password) {
        CustomerRegistration customer = customerRegistrationRepository.findByUserId(userId);
        return customer != null && customer.getPassword().equals(password);
    }
}

