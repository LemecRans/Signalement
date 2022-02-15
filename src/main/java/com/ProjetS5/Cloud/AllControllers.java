package com.ProjetS5.Cloud;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllControllers {
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/hello")
	public String listeSignalement(){
		return "hello bro";
	}
