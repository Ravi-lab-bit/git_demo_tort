package com.collectionAPIs;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s=new HashSet<String>();// dynamic array
		s.add("B");
		s.add("C");
		s.add("H");
		s.add("P");
		s.add("C");
		s.add("C");
		s.add("33");
		
		System.out.println(s.size());
		/*for(String x: s) {
			System.out.println(x);
		}*/
		
		Iterator<String> it= s.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
	}

}
/// uniquely stores values