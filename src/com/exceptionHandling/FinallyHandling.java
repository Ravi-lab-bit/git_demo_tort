package com.exceptionHandling;

public class FinallyHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connect DB");
		
		try {
			System.out.println(8/0);
			System.out.println("Execute Query");
		}catch(Throwable t) {
			System.out.println(4/2);
		}finally {
			System.out.println("Close Database");
		}
	}

}
