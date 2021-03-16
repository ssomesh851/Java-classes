package com.exmaples.baisc;

import java.util.*;
public class CheckLeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int year = obj.nextInt();
		boolean isLeap = false;
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0)
					isLeap = true;
				else
					isLeap = false;
			}
			else 
				isLeap = true;
		}
		else {
			isLeap = false;
		}
           
		if(isLeap==true)
			System.out.println(year + " is a Leap Year");
		else
		    System.out.println(year + " is not a Leap year");
		
	}

}
