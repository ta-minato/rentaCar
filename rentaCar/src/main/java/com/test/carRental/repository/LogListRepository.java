package com.test.carRental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.carRental.model.LogList;

@Repository
public interface LogListRepository extends JpaRepository<LogList, Integer>{
	@Query(value = "SELECT logs.id, logs.user_id, cars.id AS car_id, cars.car_name, logs.departure_time,logs.return_time FROM logs LEFT JOIN cars ON cars.id=logs.car_id WHERE user_id=?", nativeQuery = true)
	List<LogList> findLogList(@Param("userId") Integer userId);

/*	@Query(value = "SELECT logs.id AS log_id, logs.car_id, logs.user_id, logs.departure_time, logs.return_time " +
            "FROM logs LEFT JOIN cars ON cars.id = logs.car_id WHERE user_id = ?1", nativeQuery = true)
	List<Log> findLogList(Integer userId);
*/
}