package com.example.OnlineBookStore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private int inventoryId;

    @ManyToOne
    @JoinColumn(name = "Book_id")
    private Books book;

    @Column(name = "stocklevel_avilable")
    private int stockLevelAvailable;

    @Column(name = "stockLevel_sold")
    private int stockLevelSold;

    public Inventory() {
        // Default constructor
    }

    // Getters and setters for all fields

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public int getStockLevelAvailable() {
        return stockLevelAvailable;
    }

    public void setStockLevelAvailable(int stockLevelAvailable) {
        this.stockLevelAvailable = stockLevelAvailable;
    }

    public int getStockLevelSold() {
        return stockLevelSold;
    }

    public void setStockLevelSold(int stockLevelSold) {
        this.stockLevelSold = stockLevelSold;
    }
}

