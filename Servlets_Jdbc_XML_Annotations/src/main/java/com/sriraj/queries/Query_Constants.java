package com.sriraj.queries;

public interface Query_Constants {
String INSERT="insert into studentmarks values(?,?,?,?,?,?,?,?)";
String UPDATE="update studentmarks SET name=? WHERE pinnumber=?";
String SELECT="select * from studentmarks";
String SELECT_ONE="select * from studentmarks where pinnumber=?";
String DELETE="delete from studentmarks where pinnumber=?";
}
