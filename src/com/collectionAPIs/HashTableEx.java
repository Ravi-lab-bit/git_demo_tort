package com.collectionAPIs;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> ht=	new Hashtable<String,String>();
		
		ht.put("cName", "Synechron");
		ht.put("location", "Bangalore");
		ht.put("Country", "India");
		
		/*
		 System.out.println(ht.get("Cname")); 
		 System.out.println(ht.get("location"));
		 System.out.println(ht.get("Country"));
		 */
		Enumeration<String> k= ht.keys();
		Enumeration<String> e= ht.elements();
		while(k.hasMoreElements()) {
			System.out.println(k.nextElement()+"*****"+e.nextElement());
		}
		
	}

}



// multiple comment select-- crtl+shift+/
// multiple uncomment select-- crtl+shift+ \