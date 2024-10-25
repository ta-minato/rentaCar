package com.test.carRental.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;

public class SearchDto {
	@NotEmpty
	private LocalDateTime departureDateTime;
	
	@NotEmpty
	private LocalDateTime returnDateTime;
	
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
