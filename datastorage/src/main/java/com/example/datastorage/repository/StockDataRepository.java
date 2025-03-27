package com.example.datastorage.repository;

import com.example.datastorage.model.StockData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDataRepository extends JpaRepository<StockData, String> {
    // Можете да додадете специфични методи за пребарување ако е потребно
}
