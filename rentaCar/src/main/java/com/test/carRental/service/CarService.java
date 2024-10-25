package com.test.carRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.carRental.model.Car;
import com.test.carRental.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;

	 public Car findByCarId(Integer carId) {
		    return carRepository.findByCarId(carId);
	 }
}
