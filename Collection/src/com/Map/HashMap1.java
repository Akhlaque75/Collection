package com.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Mango");
		map.put(2, "Banana");
		map.put(3, "Grapes");
		map.put(1, "Apple");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		}
	}
