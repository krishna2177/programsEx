package com.program;

public class BaboolSortingEx {
	public static void sortLogic(int []arr) {
		int size=arr.length;
		int temp=0;
		for(int j=0;j<size;j++) {
			for(int i=1;i<(size-j);i++) {
				if(arr[i-1]>arr[i]) {
					temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {23,234,54,1,34,56,75,34,1213,111};
		System.out.println("Before Sorting Logic...");
		/*for(int x:arr) {
			System.out.println(x);
		}*/
		for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
    }  
		System.out.println();
		System.out.println("After Sorting Logic...");
		sortLogic(arr);
		/*for(int x:arr) {
			System.out.println(x);
		}*/
		for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
    }  
		
	}

}
