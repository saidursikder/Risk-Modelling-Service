package com.questmarine.riskmodelling.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Model {

    @Id
    private String id;
    private String name;
    @Column(name = "product_line")
    private String productLine;

    @OneToOne(mappedBy = "model")
    //    @JsonIgnore -- uncomment this if you DO NOT want to see riskscore associated with imo & model
    private VesselModelScore vesselModelScore;

    @OneToMany(mappedBy = "model")
    @JsonIgnore
    private List<VesselFeatureValue> vesselFeatureValues;

    @OneToMany(mappedBy = "model")
    @JsonIgnore
    private List<FeatureDictionary> featureDictionaries;

    @OneToMany(mappedBy = "model")
    @JsonIgnore
    private List<VesselTypeFeatureValue> vesselTypeFeatureValues;

    @OneToMany(mappedBy = "model")
    @JsonIgnore
    private List<BenchmarkVesselFeatureScore> benchmarkVesselFeatureScores;


}
