package com.exmaples.baisc;

public class Selection_Sort_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min, temp;
		int[] a = {38,52,9,18,6,62,13};
		for(int i = 0; i < a.length; i++) {
			min = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;			
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}