package com.example.datastorage.service;

import com.example.datastorage.model.StockData;
import com.example.datastorage.model.UnstructuredStockData;
import com.example.datastorage.repository.StockDataRepository;
import com.example.datastorage.repository.UnstructuredStockDataRepository;
import org.springframework.stereotype.Service;

@Service
public class StockDataService {

    private StockDataRepository stockDataRepository;

    private UnstructuredStockDataRepository unstructuredStockDataRepository;

    public StockDataService(StockDataRepository stockDataRepository, UnstructuredStockDataRepository unstructuredStockDataRepository) {
        this.stockDataRepository = stockDataRepository;
        this.unstructuredStockDataRepository = unstructuredStockDataRepository;
    }

    public void storeStructuredData(StockData stockData) {
        stockDataRepository.save(stockData);
    }

    public void storeUnstructuredData(UnstructuredStockData unstructuredStockData) {
        unstructuredStockDataRepository.save(unstructuredStockData);
    }

    public StockData getStructuredData(String id) {
        return stockDataRepository.findById(id).orElse(null);
    }

    public UnstructuredStockData getUnstructuredData(String id) {
        return unstructuredStockDataRepository.findById(id).orElse(null);
    }
}
