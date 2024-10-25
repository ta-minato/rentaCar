package com.test.carRental.repository;

import java.time.LocalDateTime;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.carRental.model.Car;

@Repository
public interface CarListRepository extends JpaRepository<Car, Integer>{
	@Query(value = "SELECT * FROM cars WHERE id NOT IN (SELECT cars.id FROM cars LEFT JOIN logs ON cars.id = logs.car_id WHERE(return_time > ? AND departure_time < ?))",	nativeQuery = true)
	List<Car> findCarList(@Param("departureTime" + "returnTime") LocalDateTime departureTime, LocalDateTime returnTime);
}
