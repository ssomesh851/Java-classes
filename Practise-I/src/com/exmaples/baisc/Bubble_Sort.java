package com.exmaples.baisc;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int i,j = 0;
		int flag = 0;
		int[] a = {36, 19, 29, 12, 5};
		
		for(i = 0; i<a.length; i++) {
			for(j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				flag = 1;
			}
			 

		}
		
		for(j=0;j<a.length;j++) {
		 System.out.print(a[j]+" ");

      	}

}
}