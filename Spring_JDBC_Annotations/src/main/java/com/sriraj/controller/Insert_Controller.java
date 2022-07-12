package com.sriraj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sriraj.model.Student;
import com.sriraj.service.IService;

@Controller("controller")
public class Insert_Controller {
	
	@Autowired
	private IService iService;
	

	public int insert(Student student) {
		return iService.insert(student);
	}

}
