/**
 * 
 */
package com.jdbc.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.dao.StudentDao;

/**
 * @author siva
 *
 */
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate template;

	@Override
	public void addStudent(int sid, String sname, int marks) {
		template.update("insert into student values(?,?,?)", sid, sname, marks);

	}

	@Override
	public void searchStudent(int sid) {
		// TODO Auto-generated method stub

		Map studentMap = template.queryForMap("select * from student where sid=?", sid);
		System.out.println(studentMap);

	}

	@Override
	public void findAll() {
		List studentList = template.queryForList("select * from student");
		
		studentList.forEach(student->System.out.println(student));

	}

}
