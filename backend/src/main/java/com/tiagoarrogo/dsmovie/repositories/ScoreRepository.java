package com.tiagoarrogo.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoarrogo.dsmovie.entities.Score;
import com.tiagoarrogo.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
