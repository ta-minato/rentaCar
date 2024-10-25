package com.test.carRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.carRental.model.Log;

public interface LogRepository extends JpaRepository<Log, Integer>{

}
