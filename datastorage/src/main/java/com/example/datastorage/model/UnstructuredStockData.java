package com.example.datastorage.model;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class UnstructuredStockData {

    @jakarta.persistence.Id
    @Id
    private String id;
    private String marketData;

    public UnstructuredStockData(String id, String marketData) {
        this.id = id;
        this.marketData = marketData;
    }

    public UnstructuredStockData() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarketData() {
        return marketData;
    }

    public void setMarketData(String marketData) {
        this.marketData = marketData;
    }

}