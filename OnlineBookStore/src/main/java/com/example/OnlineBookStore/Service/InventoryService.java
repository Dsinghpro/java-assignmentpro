package com.example.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.OnlineBookStore.entity.Inventory;
import com.example.OnlineBookStore.repository.InventoryRepository;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;
    
    @Autowired
   	RestTemplate restTemplate;

    @Transactional
    public List<Inventory> getAllInventoryItems() {
        return inventoryRepository.findAll();
    }

    @Transactional
    public Inventory getInventoryItemById(int inventoryId) {
        return inventoryRepository.findById(inventoryId).orElse(null);
    }

    @Transactional
    public void updateInventoryItem(Inventory inventoryItem) {
        inventoryRepository.save(inventoryItem);
    }

    @Transactional
    public void incrementStockAvailable(int inventoryId, int quantity) {
        Inventory inventoryItem = inventoryRepository.findById(inventoryId).orElse(null);
        if (inventoryItem != null) {
            inventoryItem.setStockLevelAvailable(inventoryItem.getStockLevelAvailable() + quantity);
            inventoryRepository.save(inventoryItem);
        }
    }

    @Transactional
    public void decrementStockAvailable(int inventoryId, int quantity) {
        Inventory inventoryItem = inventoryRepository.findById(inventoryId).orElse(null);
        if (inventoryItem != null) {
            int currentStock = inventoryItem.getStockLevelAvailable();
            if (currentStock >= quantity) {
                inventoryItem.setStockLevelAvailable(currentStock - quantity);
                inventoryRepository.save(inventoryItem);
            }
        }
    }
}

