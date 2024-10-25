package com.test.carRental.service;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.carRental.dto.LogDto;
import com.test.carRental.dto.TotalDto;
import com.test.carRental.model.Car;
import com.test.carRental.model.Log;
import com.test.carRental.repository.LogRepository;

@Service
public class LogService {

	@Autowired
	private LogRepository logRepository;
	
	@Transactional
	public void save(LogDto logDto) {
		Log log = new Log();
		log.setCarId(logDto.getCarId());
		log.setUserId(logDto.getUserId());
		log.setDepartureDateTime(logDto.getDepartureDateTime());
		log.setReturnDateTime(logDto.getReturnDateTime());
		logRepository.save(log);
	}
	
	public void dateFormat(LogDto logDto, Car car, TotalDto totalDto) {
		LocalDateTime localDateTim1e = logDto.getDepartureDateTime();
	    LocalDateTime localDateTime2 = logDto.getReturnDateTime();	    
        Duration duration = Duration.between(localDateTim1e, localDateTime2);
        long diff = (duration.toMillis() / 3600000);
        totalDto.setTime(diff);
	}
}
