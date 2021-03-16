package com.exmaples.baisc;

import java.util.*;

public class Exm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Scanner obj = new Scanner(System.in);
		System.out.println("Enter the N number input: ");
		 int n = obj.nextInt();
		 
		 for(int i = 0; i < n; i ++) {
			 for(int j = 0; j <= n/2; j++) {
				 if( (j == 0 || j == n/2) && i != 0 || i == 0 && j != 0 && j != n/2 || i == n/2) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
				 
			 }
			 System.out.println();
		 }
		 */
		int num,p;
		p=3; num = 3;
		long a=1;
		int i = p;
		while(i!=0) {
			a *= num;
			--i;
		}
		System.out.println(num+"       "+a);
		
		
		char c = 'a';
		String str = Character.toString(c);
		System.out.println("String is: "+str);
		
		byte b = 2;
		short d = b;//widening casting
		short sht = (byte) b;//manual casting
		int c1 = sht;
		int c2 = (short) sht;
		double c3 = (int) c1;
		long c4 =(int) c1;
		
		System.out.println(c4);
		
	}

}
