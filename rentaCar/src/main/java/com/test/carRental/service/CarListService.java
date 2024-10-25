package com.test.carRental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.carRental.dto.SearchDto;
import com.test.carRental.model.Car;
import com.test.carRental.repository.CarListRepository;


@Service
public class CarListService {
	@Autowired
	private CarListRepository carListRepository;
	
	public List<Car> searchList(SearchDto searchDto) {
		return carListRepository.findCarList(searchDto.getDepartureDateTime(), searchDto.getReturnDateTime());
	}
}