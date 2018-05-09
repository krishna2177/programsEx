package com.program;

public class InsertSortingEx {
	public static void sortLogic(int []arr) {
		int size=arr.length;
		for(int i=1;i<size;i++) {
			int j=i-1;
			int key=arr[i];
			while(j>-1 && (arr[j]>key)) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	public static void main(String[] args) {
		int arr[]= {43,545,65,34,34,32,76,867,54,43,76,234};
		System.out.println("Before Sorting Logic...");
		for(int X : arr) {
			System.out.println(X+" ");
		}
		System.out.println();
		System.out.println("After Sorting Logic...");
		sortLogic(arr);
		for(int x : arr) {
			System.out.println(x+" ");
		}
	}

}
