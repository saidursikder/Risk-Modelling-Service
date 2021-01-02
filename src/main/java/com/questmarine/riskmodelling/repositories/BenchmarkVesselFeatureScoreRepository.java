package com.questmarine.riskmodelling.repositories;

import com.questmarine.riskmodelling.dto.RiskscoreBenchmarkDTO;
import com.questmarine.riskmodelling.entities.BenchmarkVesselFeatureScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BenchmarkVesselFeatureScoreRepository extends JpaRepository<BenchmarkVesselFeatureScore, Long> {

    @Query(nativeQuery = true, value = "select vfv.imo, vfv.feature, vfv.feature_value as featureValue, bs.score, bs.feature_value as benchmarkValue " +
            "from BENCHMARK_VESSEL_FEATURE_SCORE bs left join VESSEL_FEATURE_VALUE vfv on vfv.feature = bs.feature " +
            "group by vfv.imo, vfv.feature_value, bs.score")
    List<RiskscoreBenchmarkDTO> findByImo(int imo);
}
