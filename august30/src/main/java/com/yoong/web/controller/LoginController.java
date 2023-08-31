package com.yoong.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yoong.web.dto.LoginDTO;
import com.yoong.web.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
public String login(LoginDTO dto, HttpSession session) {
		System.out.println(dto.toString());
		LoginDTO result = loginService.login(dto);
		
		if(result != null && result.getCount() == 1) {
			//세션만들기
			System.out.println(result);
			//System.out.println(dto.toString());
			
			session.setAttribute("mname", result.getM_name());
			session.setAttribute("mid", dto.getId());
			
			return "redirect:/board";
			
		} else {
			return "redirect:/login";
		}
		
		
	}
}
