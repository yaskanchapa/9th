package com.kr.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String home(Model model) {
		logger.info("Welcome home! The client locale is {}.");//현재 어디가 실행 되고 있는지 로그기록

		return "home";//jsp이름
	}
	@RequestMapping("/test") // /생략가능
	public String test() {
		return "test";
	}
}
