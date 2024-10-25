package com.test.carRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.test.carRental.model.Car;
import com.test.carRental.service.CarService;

import jakarta.servlet.http.HttpSession;


@Controller
public class ReserveController {
private HttpSession session;
	
	@Autowired
	public ReserveController(HttpSession session) {
		this.session = session;
    }
	
	@Autowired
	private CarService carService;
	
	@GetMapping("/car/{carId}")
	  public String View(@PathVariable Integer carId) {
		Car car = carService.findByCarId(carId);
		this.session.setAttribute("car", car);
	    return "reserve";
	  }
}
