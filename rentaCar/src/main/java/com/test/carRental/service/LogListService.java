package com.test.carRental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.carRental.model.LogList;
import com.test.carRental.model.User;
import com.test.carRental.repository.LogListRepository;

@Service
public class LogListService {
	@Autowired
	private LogListRepository logListRepository;
	
	public List<LogList> searchList(User user) {
		return logListRepository.findLogList(user.getUserId());
	}
}
