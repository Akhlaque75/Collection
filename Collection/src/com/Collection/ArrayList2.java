package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("mango");
	list.add("Apple");
	list.add("banana");
	list.add("grapes");
	Iterator itr=list.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	}
}		
