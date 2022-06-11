package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map3 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Mumbai");
		map.put(2,"Kolkata");
		map.put(3,"Lucknow");
		map.put(4, "Delhi");
		map.put(5, "Shimla");
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
