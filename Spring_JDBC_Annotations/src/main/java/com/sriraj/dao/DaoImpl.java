package com.sriraj.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sriraj.model.Student;
import com.sriraj.queries.Query_Constants;

@Repository
public class DaoImpl implements IDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
	return jdbcTemplate.update(Query_Constants.INSERT,student.getPinnumber(),student.getName(),student.getGender(),student.getTelugu(),student.getEnglish(),student.getMaths(),student.getPhysics(),student.getChemistry());	
	}

	@Override
	public int update(Student student) {
		return 0;}

	@Override
	public List<Student> select() {
		List<Student>list=new ArrayList<Student>();
		
		return list;
	}

	@Override
	public Student selectbypin(int pinnumber) {
		return null;
	}
		
	@Override
	public boolean delete(int pinnumber) {
		
	return true;}

}
