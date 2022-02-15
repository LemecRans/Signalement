package com.ProjetS5.Cloud;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AllControllers {
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/hello")
	public String listeSignalement(){
		return "hello bro";
	}
}