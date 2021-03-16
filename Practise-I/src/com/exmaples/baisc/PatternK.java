package com.exmaples.baisc;
import java.util.*;
public class PatternK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = obj.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-2; j++) {
				if(i>=1 && i<=5 && j==0  || i == 3 && j==2 || i == 2 && j == 3 || i == 1 && j == 4 || i == 4 && j==3 || i == 5 && j==4 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
