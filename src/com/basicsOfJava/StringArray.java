package com.basicsOfJava;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String str[]= new String[4];

         str[0]="A"; 
         str[1]="B";
         str[2]="C";
         str[3]="D";
         //str[4]="E"; it will throw error
		 
		
		//String str[]={"a","b","c","d"};
		System.out.println(str.length);
		
		for(String x: str){
			System.out.println(x);
			}
	}

}
