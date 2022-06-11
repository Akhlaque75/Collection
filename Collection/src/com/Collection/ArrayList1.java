package com.Collection;

import java.util.ArrayList;

public class ArrayList1 {
	public static void min(String []args) {
		ArrayList<String> list=new ArrayList<String>();
	list.add("mango");
	list.add("apple");
	list.add("grapes");
	list.add("pineapple");
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
	}
}
