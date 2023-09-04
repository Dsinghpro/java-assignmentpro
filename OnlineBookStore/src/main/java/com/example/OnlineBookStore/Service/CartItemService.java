package com.example.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.OnlineBookStore.entity.CartItem;
import com.example.OnlineBookStore.repository.CartItemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;
    
    @Autowired
   	RestTemplate restTemplate;

    @Transactional
    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    @Transactional
    public CartItem getCartItemById(int cartItemId) {
        return cartItemRepository.findById(cartItemId).orElse(null);
    }

    @Transactional
    public void addToCart(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }

    @Transactional
    public void updateCartItem(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }

    @Transactional
    public void removeCartItem(int cartItemId) {
        cartItemRepository.deleteById(cartItemId);
    }

    @Transactional
    public Optional<CartItem> getCartItemsByCustomerId(int customerId) {
        return cartItemRepository.findById(customerId);
    }
    
    @Transactional
    public void clearCartByCustomerId(int customerId) {
        cartItemRepository.deleteById(customerId);
    }
}
    
