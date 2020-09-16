package com.jdbc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.jdbc.dao.StudentDao;

@Component
@Order(2)

public class MyRunner2 implements CommandLineRunner {
	
	@Autowired
	StudentDao studentDao;

	@Override
	public void run(String... args) throws Exception {
		studentDao.addStudent(101, "SIva", 500);
		studentDao.addStudent(102, "Java", 500);
     	studentDao.addStudent(103, "ABC", 500);
		System.out.println("=============================================");
		
		
		studentDao.searchStudent(101); 
		
		System.out.println("=============================================");
		 
		 studentDao.findAll();
		 
		
		
		
		
   
	}

}
