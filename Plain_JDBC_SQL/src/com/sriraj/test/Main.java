package com.sriraj.test;

import java.util.Iterator;
import java.util.List;

import com.sriraj.dao.DaoImpl;
import com.sriraj.dao.IDao;
import com.sriraj.model.Student;

public class Main {

	//INSERT METHOD EXECUTION
	/*
		public static void main(String[] args) {
		Student student=new Student();
		student.setPinnumber(112);
		student.setName("Harish Pathivada");
		student.setGender("Male");
		student.setTelugu(8);
		student.setEnglish(8);
		student.setMaths(8);
		student.setPhysics(80);
		student.setChemistry(80);
		IDao iDao=new DaoImpl();
		int i=iDao.insert(student);
		if(i>0)
			System.out.println("Student Marks Inserted");
		else
			System.out.println("Data Not Inserted");}
			//INSERT METHOD EXECUTION
	*/		 
	
	//UPDATE METHOD EXECUTION
	/*
	public static void main(String[] args) {
		IDao iDao=new DaoImpl();
		Student student=new Student();
		student.setName("Harish Pathivada");
		student.setPinnumber(111);
		int i=iDao.update(student);
		if(i>0)
			System.out.println("Name Updated");
		else
			System.out.println("Update Failed");}
			//UPDATE METHOD END 
			 */
	
	//SELECT METHOD EXECUTION
	/*
	public static void main(String[] args) {
		IDao iDao=new DaoImpl();
		List<Student>list=iDao.select();
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			Student student=(Student)itr.next();
			System.out.println(st.getPinnumber()+" "+st.getName()+" "+st.getGender()+" "+st.getTelugu()+st.getEnglish()+" "+st.getMaths()+" "+st.getPhysics()+" "+st.getChemistry());
		}
		System.out.println("==========");
		
		list.forEach(Student-> System.out.println(st.getPinnumber()+" "+st.getName()+" "+st.getGender()+" "+st.getTelugu()+st.getEnglish()+" "+st.getMaths()+" "+st.getPhysics()+" "+st.getChemistry()));
		
		System.out.println("==========");
		for(Student st:list) {
			System.out.println(st.getPinnumber()+" "+st.getName()+" "+st.getGender()+" "+st.getTelugu()+st.getEnglish()+" "+st.getMaths()+" "+st.getPhysics()+" "+st.getChemistry());
		}		
	}
	*/
	//SELECT BY ID METHOD
	/*
	public static void main(String[] args) {
		IDao iDao=new DaoImpl();
		Student st=iDao.selectbypin(112);
		System.out.println(st.getPinnumber()+" "+st.getName()+" "+st.getGender()+" "+st.getTelugu()+st.getEnglish()+" "+st.getMaths()+" "+st.getPhysics()+" "+st.getChemistry());
	}
	*/
	//SELECT BY ID METHOD END
	
	//DELETE METHOD EXECUTION
	public static void main(String[] args) {
		IDao iDao=new DaoImpl();
		boolean flag=iDao.delete(112);
		if(flag) 
			System.out.println("Record Deleted");
		else
			System.out.println("Deletion Failed");
		
		
	}
	
}
