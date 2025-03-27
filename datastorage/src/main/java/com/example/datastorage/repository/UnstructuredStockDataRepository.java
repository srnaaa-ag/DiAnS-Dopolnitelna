package com.example.datastorage.repository;

import com.example.datastorage.model.UnstructuredStockData;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UnstructuredStockDataRepository extends CassandraRepository<UnstructuredStockData, String> {
    // Можете да додадете специфични методи за пребарување ако е потребно
}
