package com.questmarine.riskmodelling.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BenchmarkVesselFeatureScore {

    @Id
    @GeneratedValue
    private Long id;
    private String feature;
    private int score;
    private float featureValue;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Model model;


}
