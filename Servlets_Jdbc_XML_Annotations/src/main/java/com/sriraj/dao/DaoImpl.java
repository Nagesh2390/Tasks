package com.sriraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sriraj.model.Student;
import com.sriraj.queries.Query_Constants;
import com.sriraj.util.ConnectionUtil;

public class DaoImpl implements IDao {

	
	@Override
	public int insert(Student student) {
		int result=0;
		try(Connection con=ConnectionUtil.getConnection();
		PreparedStatement pstmt=con.prepareStatement(Query_Constants.INSERT)){
			pstmt.setInt(1, student.getPinnumber());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getGender());
			pstmt.setInt(4, student.getTelugu());
			pstmt.setInt(5,student.getEnglish());
			pstmt.setInt(6, student.getMaths());
			pstmt.setInt(7, student.getPhysics());
			pstmt.setInt(8, student.getChemistry());
			result=pstmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(Student student) {
		int result=0;
	
		try(Connection con=ConnectionUtil.getConnection();
				PreparedStatement pstmt=con.prepareStatement(Query_Constants.UPDATE);){
		pstmt.setString(1,student.getName());
		pstmt.setInt(2, student.getPinnumber());
		result=pstmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Student> select() {
		List<Student>list=new ArrayList<Student>();
		ResultSet rs=null;
		try(Connection con=ConnectionUtil.getConnection();
				PreparedStatement pstmt=con.prepareStatement(Query_Constants.SELECT);){
				rs=pstmt.executeQuery();
				while(rs.next()) {
					int pin=rs.getInt("pinnumber");
					String name=rs.getString("name");
					String gender=rs.getString("gender");
					int tel=rs.getInt("telugu");
					int eng=rs.getInt("english");
					int maths=rs.getInt("maths");
					int phy=rs.getInt("physics");
					int chem=rs.getInt("chemistry");
					
				Student student=new Student();
				
				student.setPinnumber(pin);
				student.setName(name);
				student.setGender(gender);
				student.setTelugu(tel);
				student.setEnglish(eng);
				student.setMaths(maths);
				student.setPhysics(phy);
				student.setChemistry(chem);
				list.add(student);
				}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Student selectbypin(int pinnumber) {
		ResultSet rs=null;
		Student student=new Student();
		try(Connection con=ConnectionUtil.getConnection();
		PreparedStatement pstmt=con.prepareStatement(Query_Constants.SELECT_ONE);){
			pstmt.setInt(1, pinnumber);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				student.setPinnumber(rs.getInt("pinnumber"));
				student.setName(rs.getString("name"));
				student.setGender(rs.getString("gender"));
				student.setTelugu(rs.getInt("telugu"));
				student.setEnglish(rs.getInt("english"));
				student.setMaths(rs.getInt("maths"));
				student.setPhysics(	rs.getInt("physics"));
				student.setChemistry(rs.getInt("chemistry"));
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return student;
	}

	@Override
	public boolean delete(int pinnumber) {
		boolean flag=false;
		int result=0;
		try(Connection con=ConnectionUtil.getConnection();PreparedStatement pstmt=con.prepareStatement(Query_Constants.DELETE);){
			pstmt.setInt(1, pinnumber);
			result=pstmt.executeUpdate();
			if(result>=0) 
				flag=true;
			else
				flag=false;
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return flag;
	}

}
