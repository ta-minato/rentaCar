package com.test.carRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.carRental.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserName(String userName);	
}