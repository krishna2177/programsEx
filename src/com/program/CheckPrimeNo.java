package com.program;

import java.util.Scanner;

public class CheckPrimeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Checking Prime Number:");
		int no=sc.nextInt();
		int flag=0;
		for(int i=2;i<=no/2;i++) {
			if(no%i==0) {
				System.out.println(no+" is not Prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(no+" is prime number");
			}
	}
}
