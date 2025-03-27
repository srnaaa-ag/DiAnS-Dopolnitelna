package com.example.datastorage.model;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class StockData {

    @jakarta.persistence.Id
    @Id
    private String id;
    private String stockSymbol;
    private double stockPrice;
    private String marketData;

    public StockData(String id, String stockSymbol, double stockPrice, String marketData) {
        this.id = id;
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        this.marketData = marketData;
    }

    public StockData() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getMarketData() {
        return marketData;
    }

    public void setMarketData(String marketData) {
        this.marketData = marketData;
    }

}