package com.sriraj.controller;

import com.sriraj.model.Student;
import com.sriraj.service.IService;
import com.sriraj.service.ServiceImpl;

public class Insert_Controller {
	
	private IService iService;
	
	public void setiService(IService iService) {
		this.iService = iService;
	}

	public int insert(Student student) {
		return iService.insert(student);
	}

}
