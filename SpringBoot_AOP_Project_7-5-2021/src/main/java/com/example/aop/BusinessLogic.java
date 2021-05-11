package com.example.aop;

import org.springframework.stereotype.Component;

@Component
public class BusinessLogic {
 public void saveEmployee() {
	 System.out.println("Employee Save");
	 //Arthemetic Exception
	 //int num = 10 / 0;
 }
}
