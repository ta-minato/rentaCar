package com.test.carRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.carRental.model.LogList;
import com.test.carRental.model.User;
import com.test.carRental.service.LogListService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ConfirmController {
	@Autowired
	private LogListService logListService;
	

	private HttpSession session;
	
	@Autowired
	public ConfirmController(HttpSession session) {
		this.session = session;
    }
	
	@GetMapping("/confirm")
	public String main(Model model) {
		User user = (User) this.session.getAttribute("user");
		List<LogList> loglist = logListService.searchList(user);
		model.addAttribute("loglist", loglist);
		return "confirm";
	}
}