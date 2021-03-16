package com.exmaples.baisc;
import java.sql.*;
import java.util.Scanner;
public class Test_DB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner s=new Scanner(System.in);
		         try {
		             System.out.println("Enter username:");
		             String username =s.next();
		             System.out.println("Enter password:");
		      String password =s.next();
		      System.out.println("Enter full name:");
		      String name =s.next();
		      System.out.println("Enter email:");
		      String email = s.next();
		      System.out.println("Enter country:");
		      String country = s.next();
		      System.out.println("Enter age:");
		      String age =s.next();
		      System.out.println("Enter sex:");
		      String sex =s.next();
		             Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://10.20.0.20:3306/somesh", "root", "root");
		   PreparedStatement pst = con.prepareStatement("insert into data(username,password,name,email,country,age,sex) values(?,?,?,?,?,?,?)");
		 

		  pst.setString(1,username);
		      pst.setString(2, password);
		       pst.setString(3, name);
		        pst.setString(4, email);
		        pst.setString(5, country);
		        pst.setString(6, age);
		        pst.setString(7, sex);
		      int i = pst.executeUpdate();
		      if(i!=0){
		        System.out.println("added");
		      }
		      else{
		        System.out.println("failed to add");
		      }
		    }
		    catch (Exception e){
		     System.out.println(e);
		    }
		  }
		}
	


