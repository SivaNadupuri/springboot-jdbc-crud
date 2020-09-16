package com.jdbc.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
	void addStudent(int sid,String sname,int marks);
	void searchStudent(int sid);
	void findAll();

}
