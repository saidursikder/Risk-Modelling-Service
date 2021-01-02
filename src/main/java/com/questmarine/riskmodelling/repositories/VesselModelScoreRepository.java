package com.questmarine.riskmodelling.repositories;

import com.questmarine.riskmodelling.entities.VesselModelScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VesselModelScoreRepository extends JpaRepository<VesselModelScore, Integer> {

    Optional<VesselModelScore> findByImo(int imo);
}
