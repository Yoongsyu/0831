package com.yoong.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoong.web.dao.LoginDAO;
import com.yoong.web.dto.LoginDTO;

@Service
public class LoginService {

	@Autowired
	LoginDAO loginDAO;

	public LoginDTO login(LoginDTO dto) {
		return loginDAO.login(dto);
	}
	
	
}
