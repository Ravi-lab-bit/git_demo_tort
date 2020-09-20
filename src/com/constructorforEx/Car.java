package com.constructorforEx;

public class Car {
	//Default Constructor
	public Car() {
		System.out.println("Car Constrctor");
	}
	//Parameterized constructor
	public Car(String m) {
		System.out.println("Model "+ m);
	}
	public Car(int p) {
		System.out.println("price "+ p);
	}
	
	public Car(String m,int p) {
		System.out.println("Model "+m+" price "+ p);
	}
	
	public Car(String x,String m,int p) {
		System.out.println(x+ " Model "+m+" price "+ p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Car();
		new Car("BMW");
		new Car(20000);
		new Car("BMW",20000);
		new Car("Testing","BMW",20000);
	}

}
