package com.tiagoarrogo.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoarrogo.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
