package com.example.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.OnlineBookStore.entity.Order;
import com.example.OnlineBookStore.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
   	RestTemplate restTemplate;


    @Transactional
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Transactional
    public Order getOrderById(int orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Transactional
    public void placeOrder(Order order) {
        orderRepository.save(order);
    }

    @Transactional
    public void updateOrder(Order order) {
        orderRepository.save(order);
    }

    @Transactional
    public void deleteOrder(int orderId) {
        orderRepository.deleteById(orderId);
    }
}
