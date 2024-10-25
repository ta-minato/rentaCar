package com.test.carRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.carRental.dto.LogDto;
import com.test.carRental.dto.TotalDto;
import com.test.carRental.model.Car;
import com.test.carRental.service.LogService;

import jakarta.servlet.http.HttpSession;

@Controller
public class CompletionController {
	
	private HttpSession session;
	
	@Autowired
	public CompletionController(HttpSession session) {
		this.session = session;
    }
	
	@Autowired
	private LogService logService;
	
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String reserve(@ModelAttribute LogDto logDto, Model model, Car car, TotalDto totalDto) {
		logService.save(logDto);
		model.addAttribute("log", logDto);
		this.session.getAttribute("car");
		logService.dateFormat(logDto, car, totalDto);
		model.addAttribute("totaltime", totalDto.getTime());
		return "result";
	}
	
	@GetMapping("/logout")
	public String index() {
		session.invalidate();
		return "login";
	}
}
