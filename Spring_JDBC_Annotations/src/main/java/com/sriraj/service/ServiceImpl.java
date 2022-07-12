package com.sriraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriraj.dao.IDao;
import com.sriraj.model.Student;

@Service
public class ServiceImpl implements IService {

	@Autowired
	private IDao dao;

	@Override
	public int insert(Student student) {
		return dao.insert(student);
	}

	@Override
	public int update(Student student) {
		return dao.update(student);
	}

	@Override
	public List<Student> select() {
		List<Student> list = dao.select();
		return list;
	}

	@Override
	public Student selectbypin(int pinnumber) {
		Student student = dao.selectbypin(pinnumber);
		return student;
	}

	@Override
	public boolean delete(int pinnumber) {
		return dao.delete(pinnumber);
	}

}
