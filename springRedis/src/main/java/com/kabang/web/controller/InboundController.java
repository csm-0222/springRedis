package com.kabang.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InboundController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
