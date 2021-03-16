package com.exmaples.baisc;
import java.util.*;
public class Exm_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,n3=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int count = obj.nextInt();
		System.out.print(n1+" "+n2);
		
		for(int i = 0; i < count; i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;		
		}

	}

}
