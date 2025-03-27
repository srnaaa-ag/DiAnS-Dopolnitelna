package com.example.dians.service;

import com.example.dians.model.AnalysisResult;
import com.example.dians.repository.AnalysisResultRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VisualizationService {

    private final AnalysisResultRepository analysisResultRepository;

    public VisualizationService(AnalysisResultRepository analysisResultRepository) {
        this.analysisResultRepository = analysisResultRepository;
    }

    public List<AnalysisResult> getVisualizationData() {
        return analysisResultRepository.findAll();
    }
}
