package com.yoong.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yoong.web.JBoard;
import com.yoong.web.repository.BoardRepository;

@Controller
public class BoardController {
	@Autowired
	private BoardRepository boardRepository;

	
	@GetMapping("/write")
	public String write() {
		return "write";
	}
	
	@PostMapping("/write")
	public String write(JBoard jBoard) {
		
		
		jBoard.setMname("네임");
		boardRepository.save(jBoard);
		
		
		return "redirect:/board";
	}
}
