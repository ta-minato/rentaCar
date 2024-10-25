package com.test.carRental.dto;

import jakarta.validation.constraints.NotEmpty;

public class TotalDto {
	@NotEmpty
	private long time;
	
//	@NotEmpty
//	private Integer price;
	
	public long getTime() {
		return time;
	}
	
	public void setTime(long time) {
		this.time = time;
	}
	
/*	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}*/
}
