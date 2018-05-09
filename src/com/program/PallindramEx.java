package com.program;

import java.util.Scanner;

public class PallindramEx {
	public static void main(String[] args) {
		int temp,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the checking number:");
		int no=sc.nextInt();
		temp=no;
		 while(no>0) {
			 rem=no%10;
			 sum=(sum*10)+rem;
			 no=no/10;
		 }
		 if(temp==sum) {
			 System.out.println(temp+" is pallendram number");
		 }else {
			 System.out.println(temp+" is not pallendram number");
		 }
	}

}
