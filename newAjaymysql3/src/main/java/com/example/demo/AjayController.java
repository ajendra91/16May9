package com.example.demo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjayController {
	
	
	@Autowired
	public AjayDao ad;
	
	@PostConstruct
	public void init() {
		Ajay ajay =new Ajay(1,"java","11");
		ad.save(ajay);
		
		Ajay ajay2 =new Ajay(2,"ajay","11");
		ad.save(ajay2);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "hello ajay";
	}
	
	@RequestMapping("/ajay")
	public List<Ajay> getAll() {
		return ad.findAll();
	}
	

}
