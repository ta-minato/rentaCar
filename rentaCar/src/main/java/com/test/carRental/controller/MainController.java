package com.test.carRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.carRental.dto.SearchDto;
import com.test.carRental.model.Car;
import com.test.carRental.service.CarListService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@Autowired
	private CarListService carListService;
	

	private HttpSession session;
	
	@Autowired
	public MainController(HttpSession session) {
		this.session = session;
    }
	
	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public String main(@ModelAttribute SearchDto searchDto, Model model) {
		if (searchDto.getDepartureDateTime().isBefore (searchDto.getReturnDateTime())){
			this.session.setAttribute("time", searchDto);
			List<Car> carlist = carListService.searchList(searchDto);
			this.session.setAttribute("carlist", carlist);
			return "main";
		}else {
			String error = "Invalid Date and Time.";
			model.addAttribute("error", error);
			return "index";
		}
	}
	
	@GetMapping("/remain")
	public String remain() {
		this.session.getAttribute("carlist");
		return "main";
	}
}