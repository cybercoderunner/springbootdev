package com.sboot.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TimeController {

	@RequestMapping("/time")
	public String index() {

        java.util.Date date=new java.util.Date();  
     
		return "Current time: " + date;
	}

}