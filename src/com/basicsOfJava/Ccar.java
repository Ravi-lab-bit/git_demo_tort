package com.basicsOfJava;

public class Ccar {
	 String model;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar a= new Ccar();
		Ccar b= new Ccar();
		Ccar c= new Ccar();
		
		a.model="Maruti";
		b.model="Skoda";
		c.model="BMW";
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
	}

}
