package com.test.carRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.carRental.model.User;
import com.test.carRental.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	private HttpSession session;
	
	@Autowired
	public LoginController(HttpSession session) {
		this.session = session;
    }
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/index")
	public String login() {
		return "index";
	}
	
	@GetMapping("/")
	public String redirectToIndex() {
		// 現在のユーザーの認証情報を取得
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null && authentication.isAuthenticated()) {
			String userName = authentication.getName();
			User user = userService.findByUserName(userName);
			this.session.setAttribute("user", user);
			return "forward:/index";
		}
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String index() {
		return "login";
	}
}
