package com.test.carRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.carRental.model.Car;


public interface CarRepository extends JpaRepository<Car, Integer>{
	Car findByCarId(Integer carId);	
}
