package com.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Apple");
		map.put(2, "Guava");
		map.put(3,"Papaya");
		map.remove(2);
	 for(Map.Entry m : map.entrySet())
	 {
		 System.out.println(m.getKey()+" "+m.getValue());
		 }
		 map.putIfAbsent(4,"Mango");
		 for(Map.Entry m: map.entrySet())
		 {
			 System.out.println(m.getKey()+" "+m.getValue());
		 } 
		 HashMap<Integer,String> map2=new HashMap<Integer,String>();
		 map2.put(5, "Orange");
		 map.putAll(map2);
		 for(Map.Entry m1: map2.entrySet()) {
			 System.out.println(m1.getKey()+" "+m1.getValue());
			 }
		 }
	}
	


