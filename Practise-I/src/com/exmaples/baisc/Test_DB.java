package com.exmaples.baisc;

import java.sql.*;

public class Test_DB {

		// TODO Auto-generated method stub
       static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
       //static final String DB_URL = "jdbc:mysql://10.20.0.20/somesh/book_info";
       
       //database credentials
       static final String USER = "root";
       static final String PASSWORD = "root";
       
       public static void main(String[] args) throws SQLException, ClassNotFoundException {
    	   
    	   Connection con = null;
    	   Statement stmt = null;
    	   
    	   //Register a JDBC
    	   
    	   Class.forName("com.mysql.jdbc.Driver");
		   Connection con1 = DriverManager.getConnection("jdbc:mysql://10.20.0.20:3306/somesh", "root", "root");
    	   //open a connection
    	   System.out.println("Connecting to a selected database...");
    	   
    	   System.out.println("Inserting records into the table");
       stmt = con1.createStatement();
       
       /*stmt.executeUpdate("insert into book_info" + "values ('the book','ssss','2020-10-27')");
       */
       String sql = "INSERT INTO book_info(title,author,published_year)" + "VALUES(?,?,?)";
       PreparedStatement preparedStatement = con1.prepareStatement(sql);
       preparedStatement.setString(1,"the book");
       preparedStatement.setString(2,"ss");
       preparedStatement.setString(3,"2020-10-27");
       preparedStatement.executeUpdate();
       
       
	}

}
