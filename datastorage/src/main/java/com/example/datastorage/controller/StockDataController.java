package com.example.datastorage.controller;

import com.example.datastorage.model.StockData;
import com.example.datastorage.model.UnstructuredStockData;
import com.example.datastorage.service.StockDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stockdata")
public class StockDataController {

    private StockDataService stockDataService;

    public StockDataController(StockDataService stockDataService) {
        this.stockDataService = stockDataService;
    }

    @PostMapping("/structured")
    public ResponseEntity<String> storeStructuredData(@RequestBody StockData stockData) {
        stockDataService.storeStructuredData(stockData);
        return ResponseEntity.ok("Structured data stored successfully.");
    }

    @PostMapping("/unstructured")
    public ResponseEntity<String> storeUnstructuredData(@RequestBody UnstructuredStockData unstructuredStockData) {
        stockDataService.storeUnstructuredData(unstructuredStockData);
        return ResponseEntity.ok("Unstructured data stored successfully.");
    }

    @GetMapping("/structured/{id}")
    public ResponseEntity<StockData> getStructuredData(@PathVariable String id) {
        StockData stockData = stockDataService.getStructuredData(id);
        return stockData != null ? ResponseEntity.ok(stockData) : ResponseEntity.notFound().build();
    }

    @GetMapping("/unstructured/{id}")
    public ResponseEntity<UnstructuredStockData> getUnstructuredData(@PathVariable String id) {
        UnstructuredStockData unstructuredStockData = stockDataService.getUnstructuredData(id);
        return unstructuredStockData != null ? ResponseEntity.ok(unstructuredStockData) : ResponseEntity.notFound().build();
    }
}
