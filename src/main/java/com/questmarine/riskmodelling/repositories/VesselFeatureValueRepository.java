package com.questmarine.riskmodelling.repositories;

import com.questmarine.riskmodelling.dto.RiskscoreFeatureDTO;
import com.questmarine.riskmodelling.entities.VesselFeatureValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VesselFeatureValueRepository extends JpaRepository<VesselFeatureValue, Long> {

    @Query(nativeQuery = true, value = "select vfv.imo, vfv.feature as featureKey, fd.field_name as fieldName, fd.description, fd.unit, vfv.feature_value as featureValue, vfv.shap_value as riskValue " +
            "from VESSEL_FEATURE_VALUE vfv left join FEATURE_DICTIONARY fd on fd.name = vfv.feature " +
            "group by vfv.imo, vfv.feature, vfv.shap_value " +
            "order by (abs(shap_value)) desc")
    List<RiskscoreFeatureDTO> findByImo(int imo);
}
