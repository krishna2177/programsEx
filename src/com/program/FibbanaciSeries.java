package com.program;

public class FibbanaciSeries {
	public static void main(String [] args) {
		int a=0,b=1,temp=0;
		System.out.println(a);
		System.out.println(b);
				for(int i=2;i<=10;i++) {
					temp=a+b;
					System.out.println(temp);
					a=b;
					b=temp;
				}
	}

}
