package com.Set;

import java.util.HashSet;

public class HashSet3 {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Arun");
		set.add("Varun");
		set.add("tarun");
		set.add("karun");
		System.out.println("initial list of elements:"+set);
		set.remove("Arun");
		System.out.println("after invoking remove()method:"+set);
		HashSet<String> set1=new HashSet<String>();
		set1.add("Ajay");
		set1.add("Vijay");
		set.addAll(set1);
		System.out.println("Updated List:"+set);
		set.removeAll(set1);
		System.out.println("after invoking removeAll()method:"+set);
		set.removeIf(str->str.contains("vijay"));
		System.out.println("after invoking removeIf()method:"+set);
		
	}

}
