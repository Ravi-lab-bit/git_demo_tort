package com.userdefinedFunction;

public class Add2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		System.out.println(a);
		int c= sum(a,b) + 30;
		System.out.println(c);
		System.out.println(b);
		System.out.println(a+b-c);
	}
	public static int sum(int x, int y) {
		//int z =x+y;
		//System.out.println(z);
		return x+y;
		//return z;
		
		
	}
}
