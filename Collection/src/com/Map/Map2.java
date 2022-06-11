package com.Map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Mumbai");
		map.put(3, "kolkata");
		map.put(6, "Delhi");
		map.put(7, "Lucknow");
		map.put(4,"Jaipur");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());		
		}	
	}

}
