package com.Collection;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("mango");
		list.add("Apple");
		list.add("Grapes");
		list.add("banana");
		for(String fruits:list) {
			System.out.println(fruits);		
			}
		}
}
