package com.questmarine.riskmodelling.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class VesselTypeFeatureValue {

    @Id
    private Long id;
    private String feature;
    private String vesselType;
    private float avgValue;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Model model;

}
