package com.microscope.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/helloView")
	public String helloView(){
		return "helloView";
	}
}