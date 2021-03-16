package com.exmaples.baisc;
//package com.exmaples.baisc;
import java.util.Scanner;
public class SquareExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("Enter the n values: ");
		Scanner obj = new  Scanner(System.in);
		int n1 = obj.nextInt();
		int row , col;
		row = 2;
		*/
		/*
		for(i = 0; i < n; i++) {
			//System.out.print(i);
			for(j = 0; j < n/2; j++) {
				//System.out.print(j);
				if( ((j == 0 || j == 4) && i != 0) || ((i == 0 || i == 3) && (j > 0 && j < 4)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


		//Pattern
		for(row=0; row< 7; row++) {
			//stem.out.print(row);
			for(col = 0; col < 5; col++) {
				//stem.out.print(col);
				if(((row == 0 || row == 3 || row == 6) && (col >= 1 && col < 4)) || (col == 0 && (row >0 && row < 3)) ||(col == 4 && (row > 3 && row < 6)))       

					System.out.print("*");

				else
					System.out.print(" ");
			}

		System.out.println();
	}

		//H-Pattern

		for(row=0;row<7;row++) {
			for(col=0;col<5;col++) {
		if((col== 0||col==4)||(row== 3))
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		//A Pattern

		for(row=0;row<n1;row++){
			for(col=0;col<n1-2;col++) {
				if(row == 0 && col == 2 || row == 1 & col == 0 || row == 1 && col == 4 || row == 2 && col == 0 || row == 2 && col == 4 || row == 3 && col <=4 || row ==4 && col == 0 || row ==5 && col ==0 || row == 4 && col ==4 || row == 5 && col==4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();	
		}	
		 
		boolean isPrime = true;

		while(row<=n1/2) {
			if(n1%row == 0) {
				
				isPrime = false;
				break;
			}
			row++;	
	}
		if(isPrime) 
			System.out.println(n1 + " is a prime number");
		else
			System.out.println(n1 + " is not a prime number");
		
		
		//palindrome
		
		String original, reverse = "";
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter string/number to check if it is a palindrome");
	    original = in.nextLine();
	    int length = original.length();
	    for(int i = length-1; i>=0; i--) 
	    	reverse = reverse+original.charAt(i);
	    	//System.out.println(reverse);
	    if(original.equals(reverse))
	    	System.out.println("it is a palindrome");
	    else
	    	System.out.println("it is not a palindrome");
	    */
		//Factoiral
		
		int i, fact = 1;
		int len = 10;
		for(i = 1; i <= 10; i++)
			fact = fact*i;
		System.out.println("Factorial of: "+len+" is "+ fact);
	}
}
	