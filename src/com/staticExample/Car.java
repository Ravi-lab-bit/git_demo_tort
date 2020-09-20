package com.staticExample;

public class Car {

	    String m;
		int p;
		static int wheels=4;

		public void testFors(){
		System.out.println("Test for Static ");
		}

		public static void main(String[] args){
			System.out.println("wheels"+ wheels);
			Car c= new Car();
			c.testFors();
		}
	}


