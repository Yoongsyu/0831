package com.yoong.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yoong.web.Member;
import com.yoong.web.repository.MemberRepository;

@Controller
public class MemberController {

	@Autowired
	private MemberRepository memberRepository;
	
	@GetMapping("/members")
	public String members(Model model) {
				List<Member> list = memberRepository.findTop5ByOrderByMnoDesc();
		
				model.addAttribute("list", list);
		return "members";
	}
}
