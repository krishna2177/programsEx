package com.program;

public class LorgeNoEx {
	
	public static int largeNo(int[] arr,int total) {
		int temp=0;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		} 
		return arr[total-1];
		
	}
	public static void main(String[] args) {
		int arr[]= {2,3,4,4647,787,230,1,23};
		System.out.println(largeNo(arr,8));
	}

}
