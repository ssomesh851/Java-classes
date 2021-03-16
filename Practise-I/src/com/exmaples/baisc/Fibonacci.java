package com.exmaples.baisc;

public class Fibonacci {
	static int i=0,j=1,k,l;
	static void Fibonacci(int count) {
	  	
		if(count>0) {
			k = i+j;
			System.out.print(" "+k);
			i = j;
			j = k;
			Fibonacci(count-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,8,12
/*
		int i=0,j=1,k,l,count=10;
		System.out.print(i+" "+j);
		
		for(l=2;l<10;++l) {
			k=i+j;
			System.out.print(" "+k);
			i=j;
			j=k;
			*/
		int count = 10;
		System.out.print(i+" "+j);
		Fibonacci(count-2);
		
		}
	
	

	}


