package com.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	@RequestMapping(value ="/home")
	public String homePagecaller() {
		return "home";
	}
	

}
