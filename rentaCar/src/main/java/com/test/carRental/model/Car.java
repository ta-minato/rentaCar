package com.test.carRental.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Car implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer carId;
	
	@Column(name = "car_name", nullable = false)
	private String carName;
	
	@Column(name = "price", nullable = false)
	private Integer price;
	
	@Column(name = "color", nullable = false)
	private String color;
	
	@Column(name = "capacity", nullable = false)
	private Integer capacity;
	
	@Column(name = "cc", nullable = false)
	private Integer cc;
	
	@Column(name = "type", nullable = false)
	private String type;
	
	public Integer getCarId() {
		return carId;
	}
	
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	
	public String getCarName() {
		return carName;
	}
	
	public void setUCarName(String carName) {
		this.carName = carName;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Integer getCapacity() {
		return capacity;
	}
	
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	public Integer getCc() {
		return cc;
	}
	
	public void setCc(Integer cc) {
		this.cc = cc;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
