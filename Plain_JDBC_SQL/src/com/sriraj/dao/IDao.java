package com.sriraj.dao;

import java.util.List;

import com.sriraj.model.Student;

public interface IDao {
public int insert(Student student);
public int update(Student student);
public List<Student> select();
public Student selectbypin(int pinnumber);
public boolean delete(int pinnumber);
}
