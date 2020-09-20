package com.basicsOfJava;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj[]= new Object[4];

		obj[0]="B";
		obj[1]=23;
		obj[2]=23.2;
		obj[3]=true;

		for (Object x:obj){
			System.out.println(x);
		}
	}

}
