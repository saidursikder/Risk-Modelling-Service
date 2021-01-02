package com.questmarine.riskmodelling.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class FeatureDictionary {

    @Id
    private Long id;
    private String name;
    private String fieldName;
    private String description;
    private String unit;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Model model;

}
