package com.Map;

import java.util.LinkedHashMap;

public class LinkedHashMap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(100,"Apple");
		map.put(150,"Mango");
		map.put(200, "Strawberry");
		//System.out.println("Key:"+map.keySet());
		//System.out.println("Value"+map.values());
		//System.out.println("Key-Value pair:"+map.entrySet());
		System.out.println("Before invoking remove method:"+map);
		map.remove(100);
		System.out.println("After invoking remove method:"+map);	
	}
}
