package com.questmarine.riskmodelling.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class VesselModelScore {

    @Id
    private int imo;
    private int score;
    private int frequencyScore;
    private int severityScore;

    @OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.MERGE, CascadeType.PERSIST })
    @JsonIgnore
    private Model model;

}
