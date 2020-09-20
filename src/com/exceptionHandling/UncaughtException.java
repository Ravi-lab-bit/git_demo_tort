package com.exceptionHandling;

public class UncaughtException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		try {
		System.out.println("Try Block");	
		System.out.println(8/0);
		}catch(Throwable t) {
			System.out.println("The error is "+t.getMessage());
			System.out.println("Catch Block");
		}
		
		System.out.println("BB");
	}

}
