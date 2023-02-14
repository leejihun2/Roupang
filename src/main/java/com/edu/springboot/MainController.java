package com.edu.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//ctrl + shift + o 한 번에 임폴트
@Controller
public class MainController {

	//컨텍스트 루트 경로에 대한 매핑
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
}
