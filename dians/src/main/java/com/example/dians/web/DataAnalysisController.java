package com.example.dians.web;

import com.example.dians.model.AnalysisResult;
import com.example.dians.service.DataAnalysisService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/analysis")
public class DataAnalysisController {

    private final DataAnalysisService dataAnalysisService;

    public DataAnalysisController(DataAnalysisService dataAnalysisService) {
        this.dataAnalysisService = dataAnalysisService;
    }


    @GetMapping
    public List<AnalysisResult> getAnalysisResults() {
        return dataAnalysisService.getAllAnalysisResults();
    }


    @PostMapping("/analyze")
    public List<AnalysisResult> analyzeFile(@RequestParam("file") MultipartFile file) {
        try {

            return dataAnalysisService.analyzeFile(file);
        } catch (Exception e) {
            throw new RuntimeException("Грешка при обработката на датотеката", e);
        }
    }
}
