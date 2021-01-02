package com.questmarine.riskmodelling.service;

import com.questmarine.riskmodelling.dto.RiskscoreBenchmarkDTO;
import com.questmarine.riskmodelling.dto.RiskscoreFeatureDTO;
import com.questmarine.riskmodelling.entities.BenchmarkVesselFeatureScore;
import com.questmarine.riskmodelling.entities.Model;
import com.questmarine.riskmodelling.entities.VesselModelScore;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface RiskscoreService {
    Optional<Model> getModel(String modelId);
    List<Model> getModels();
    Optional<VesselModelScore> getScore(int imo);
    List<RiskscoreFeatureDTO> getFeatures(int imo, int limit);
    List<RiskscoreBenchmarkDTO> getBenchmark(int imo, String feature);

}
