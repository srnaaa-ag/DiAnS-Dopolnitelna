package com.example.dians.web;

import com.example.dians.model.AnalysisResult;
import com.example.dians.service.VisualizationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visualization")
public class VisualizationController {

    private final VisualizationService visualizationService;

    public VisualizationController(VisualizationService visualizationService) {
        this.visualizationService = visualizationService;
    }

    @GetMapping
    public List<AnalysisResult> getVisualizationData() {
        return visualizationService.getVisualizationData();
    }
}
