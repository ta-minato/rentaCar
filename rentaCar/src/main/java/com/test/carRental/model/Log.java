package com.test.carRental.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "logs")
public class Log {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer logId;
	
	@Column(name = "car_id", nullable = false)
	private Integer carId;
	
	@Column(name = "user_id", nullable = false)
	private Integer userId;
		
	@Column(name = "departure_time", nullable = false)
	private LocalDateTime departureDateTime;
	
	@Column(name = "return_time", nullable = false)
	private LocalDateTime returnDateTime;
	
	public Integer getLogId() {
		return logId;
	}
	
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	
	public Integer getCarId() {
		return carId;
	}
	
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}
	
	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	
	public LocalDateTime getReturnDateTime() {
		return returnDateTime;
	}
	
	public void setReturnDateTime(LocalDateTime returnDateTime) {
		this.returnDateTime = returnDateTime;
	}
}
