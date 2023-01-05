package com.swag.config.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@PostMapping("/swagger")
	public String homePage()
	{
		return "home page";
	}

}
