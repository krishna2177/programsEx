package com.program;

import java.util.Scanner;

public class ArmstrongEx {
	public static void main(String[] args) {
		int temp,rem,cub=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		temp=no;
		while(no>0) {
			rem=no%10;
			cub=cub+(rem*rem*rem);
			no=no/10;
		}
		if(temp==cub) {
			System.out.println(temp+" is Armstrong Number");
		}else {
			System.out.println(temp+" is not Armstrong Number");
		}
	}
}
