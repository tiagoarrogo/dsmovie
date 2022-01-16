package com.tiagoarrogo.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoarrogo.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
