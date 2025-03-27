package com.example.dians.service;

import com.example.dians.model.AnalysisResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class DataAnalysisService {


    public List<AnalysisResult> getAllAnalysisResults() {
        return List.of();
    }

    public List<AnalysisResult> analyzeFile(MultipartFile file) {

        return List.of(new AnalysisResult("AAPL", 145.67), new AnalysisResult("GOOG", 2735.22));
    }
}
