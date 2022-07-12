package com.sriraj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sriraj.controller.Insert_Controller;
import com.sriraj.model.Student;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/sriraj/cfg/applicationContext.xml");
	Insert_Controller c=ctx.getBean("controller", Insert_Controller.class);
	
	Student student=new Student();
	student.setPinnumber(121);
	student.setName("Harish");
	student.setGender("Male");
	student.setTelugu(99);
	student.setEnglish(99);
	student.setMaths(99);
	student.setPhysics(99);
	student.setChemistry(99);
	
	c.insert(student);
	
}
}
