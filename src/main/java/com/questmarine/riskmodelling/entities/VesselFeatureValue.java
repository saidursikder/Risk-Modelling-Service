package com.questmarine.riskmodelling.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class VesselFeatureValue {

    @Id
    @GeneratedValue
    private Long id;
    private int imo;
    private String vesselType;
    private String feature;
    private float featureValue;
    private float shapValue;
    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Model model;

}
