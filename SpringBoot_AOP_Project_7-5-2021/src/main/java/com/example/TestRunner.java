package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.aop.BusinessLogic;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private BusinessLogic logic;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logic.saveEmployee();
	}
	

}
