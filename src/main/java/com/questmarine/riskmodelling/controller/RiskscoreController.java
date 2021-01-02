package com.questmarine.riskmodelling.controller;

import com.questmarine.riskmodelling.dto.RiskscoreBenchmarkDTO;
import com.questmarine.riskmodelling.dto.RiskscoreFeatureDTO;
import com.questmarine.riskmodelling.entities.Model;
import com.questmarine.riskmodelling.entities.VesselModelScore;
import com.questmarine.riskmodelling.service.RiskscoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RiskscoreController {

    @Autowired
    RiskscoreServiceImpl riskscoreFeatureService;


    //    Get a model -- GET - risk-modelling/models/{modelId}
    @GetMapping(value = "/risk-modelling/models/{modelId}")
    public Optional<Model> getModel(@PathVariable String modelId) {
        return riskscoreFeatureService.getModel(modelId);
    }

    //    Get models -- GET - risk-modelling/models
    @GetMapping(value = "/risk-modelling/models")
    public List<Model> getModels() {
        return riskscoreFeatureService.getModels();
    }

//    Get risk score -- GET - risk-modelling/scores/vessels/{imo}
    @GetMapping(value = "/risk-modelling/scores/vessels/{imo}")
    public Optional<VesselModelScore> getScore(@PathVariable int imo) {
        return riskscoreFeatureService.getScore(imo);
    }

////    Get features -- GET - risk-modelling/scores/vessels/{imo}/features?limit={int}
    @GetMapping(value = "/risk-modelling/scores/vessels/{imo}/features")
    public List<RiskscoreFeatureDTO> getFeatures(@PathVariable int imo,
                                                      @RequestParam(value = "limit" ,required = false, defaultValue = "10") int limit) {
        return riskscoreFeatureService.getFeatures(imo, limit);
    }

//    Get feature benchmark -- GET - risk-modelling/scores/vessels/{vessel-id}/features/{feature}/benchmark
    @GetMapping(value = "risk-modelling/scores/vessels/{imo}/features/{feature}/benchmark")
    public List<RiskscoreBenchmarkDTO> getBenchmark(@PathVariable(value = "imo") int imo,
                                                    @PathVariable(value = "feature") String feature) {
        return riskscoreFeatureService.getBenchmark(imo, feature);
    }

}
