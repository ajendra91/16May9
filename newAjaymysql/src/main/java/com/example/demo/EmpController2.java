package com.example.demo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController2 {

	
	@Autowired
	public Emp2Dao ed;
	
	@PostConstruct
	public void init() {
		Emp2 emp =new Emp2(1,"java","11");
		ed.save(emp);
		Emp2 emp2 =new Emp2(2,"php","11");
		ed.save(emp2);
	}
	
	@RequestMapping("/")
	public String hello(){
		return "hello";
	}
	
	@RequestMapping("/emp2")
	public List<Emp2> findAl(){
		return ed.findAll();
	}
	
}
