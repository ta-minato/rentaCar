package com.test.carRental.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;

public class LogDto {
	@NotEmpty
	private Integer carId;
	
	@NotEmpty
	private Integer userId;
	
	@NotEmpty
	private LocalDateTime departureDateTime;
	
	@NotEmpty
	private LocalDateTime returnDateTime;
	
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
