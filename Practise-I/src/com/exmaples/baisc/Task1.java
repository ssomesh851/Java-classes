package com.exmaples.baisc;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = new String[4];
		String[] b = new String[4];
		
		a[0] = "A";
		a[1] = "B";
		a[2] = "C";
		a[3] = "D";
		
		b[0] = "E";
		b[1] = "F";
		b[2] = "G";
		b[3] = "H";
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				System.out.print(a[i]+" "+b[j]);
				System.out.println();
			}
			
		}

	}

}
