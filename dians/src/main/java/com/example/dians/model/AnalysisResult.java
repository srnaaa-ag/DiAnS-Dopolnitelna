package com.example.dians.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AnalysisResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stockName;
    private Double averagePrice;


    public AnalysisResult(String stockName, Double averagePrice) {
        this.stockName = stockName;
        this.averagePrice = averagePrice;
    }
}
