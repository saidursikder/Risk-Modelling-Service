package com.questmarine.riskmodelling.dto;

public interface RiskscoreFeatureDTO {

    //Need to have property names begin with get
    public int getImo();
    public String getFeatureKey();
    public String getFieldName();
    public String getDescription();
    public String getUnit();
    public float getFeatureValue();
    public float getRiskValue();

}
