package com.exmaples.baisc;
import java.util.Scanner;
public class PalindromeExample {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		int r, sum=0, temp;
		int n = 454;
		temp = n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			}
		if(sum==temp)
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
		*/
		
		//prime
			
		int n1=0,n2=1,n3=0,count=10;
		System.out.print(n1+" "+n2);
		for(int i = 0; i<count; i++) {
			n3=n1+n2;  
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			}}		
	}	