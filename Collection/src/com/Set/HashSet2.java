package com.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
	public static void main(String[] args){
		HashSet<String> ht=new HashSet<String>();
		ht.add("Mango");
		ht.add("Grapes");
		ht.add("Apple");
		ht.add("Mango");
		Iterator<String> i=ht.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}	
	}

}
