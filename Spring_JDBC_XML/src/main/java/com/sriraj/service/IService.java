package com.sriraj.service;

import java.util.List;

import com.sriraj.model.Student;

public interface IService {
public int insert(Student student);
public int update(Student student);
public List<Student> select();
public Student selectbypin(int pinnumber);
public boolean delete(int pinnumber);
}
