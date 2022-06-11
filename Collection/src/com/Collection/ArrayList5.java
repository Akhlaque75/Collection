package com.Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("mango");
		list1.add("banana");
		list1.add("grapes");
		list1.add("orange");
		Collections.sort(list1);
		for( String fruits : list1) {
			System.out.println(fruits);	
		}
		List<Integer> list2=new ArrayList<Integer>();
	    list2.add(21);
	    list2.add(23);
	    list2.add(17);
	    list2.add(25);
	    Collections.sort(list2);
	    for(Integer n: list2) {
	    	System.out.println(n);
	    }
	}

}
