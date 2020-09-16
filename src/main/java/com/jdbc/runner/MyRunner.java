package com.jdbc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	JdbcTemplate template;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		template.execute("drop table if exists student");
		template.execute("create table student(sid int primary key,sname varchar(15),marks int)");

	}

}
