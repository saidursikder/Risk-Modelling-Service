package com.questmarine.riskmodelling.service;

import com.questmarine.riskmodelling.dto.RiskscoreBenchmarkDTO;
import com.questmarine.riskmodelling.dto.RiskscoreFeatureDTO;
import com.questmarine.riskmodelling.entities.BenchmarkVesselFeatureScore;
import com.questmarine.riskmodelling.entities.Model;
import com.questmarine.riskmodelling.entities.VesselModelScore;
import com.questmarine.riskmodelling.repositories.BenchmarkVesselFeatureScoreRepository;
import com.questmarine.riskmodelling.repositories.ModelRepository;
import com.questmarine.riskmodelling.repositories.VesselFeatureValueRepository;
import com.questmarine.riskmodelling.repositories.VesselModelScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RiskscoreServiceImpl implements RiskscoreService {

    @Autowired
    ModelRepository modelRepository;
    @Autowired
    VesselModelScoreRepository scoreRepository;
    @Autowired
    VesselFeatureValueRepository featureValueRepository;
    @Autowired
    BenchmarkVesselFeatureScoreRepository benchmarkRepository;



    @Override
    public Optional<Model> getModel(String modelId) {
        return modelRepository.findById(modelId);
    }

    @Override
    public List<Model> getModels() {
        return modelRepository.findAll();
    }

    @Override
    public Optional<VesselModelScore> getScore(int imo) {
        return scoreRepository.findByImo(imo);
    }

    @Override
    public List<RiskscoreFeatureDTO> getFeatures(int imo, int limit) {
        return featureValueRepository.findByImo(imo)
                .stream()
                .filter(x -> x.getImo() == imo)
                .limit(limit)
                .collect(Collectors.toList());

    }

    @Override
    public List<RiskscoreBenchmarkDTO> getBenchmark(int imo, String feature) {
        return benchmarkRepository.findByImo(imo)
                .stream()
                .filter(x -> x.getImo() == imo)
                .filter(x -> x.getFeature().equals(feature))
                .collect(Collectors.toList());

    }
}
