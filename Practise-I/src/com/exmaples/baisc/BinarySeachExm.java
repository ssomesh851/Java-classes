package com.exmaples.baisc;

public class BinarySeachExm {
	
	int binarySearch(int arr[], int l, int r, int x) {
		if(r>=l) {
			int mid = l+(r-l)/2;
			
			//if the element is present at the
			//middle itself
			
			if(arr[mid] == x)
				return mid;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
