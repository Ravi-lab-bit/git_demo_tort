package com.collectionAPIs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("B");
		ar.add("C");
		ar.add("H");
		ar.add("C");
		ar.add("B");
		
		/*int size =ar.size();
		System.out.println(size);
		String string = ar.get(2);
		
		*/
		//System.out.println(ar.size());
		//System.out.println(ar.get(2));
		/*for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		} */
		Iterator<String> it = ar.iterator();
		/*it.next();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next()); */
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
///hot key for to collect return datatype-----> Crtl+1+Enter