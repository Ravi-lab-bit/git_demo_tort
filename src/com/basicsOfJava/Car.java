package com.basicsOfJava;

public class Car {

	String model;
	int price;
	int wheels;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		
		a.model="BMW";
		a.price=202020;
		b.price=202020;

		System.out.println("Price"+ a.model);
		System.out.println("price"+ a.price);

	}

}
