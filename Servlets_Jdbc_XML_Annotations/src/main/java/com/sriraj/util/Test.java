package com.sriraj.util;

import java.sql.Connection;

public class Test {
public static void main(String[] args) {
	Connection con=ConnectionUtil.getConnection();
	System.out.println(con.hashCode());
}
}
