package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(201,"Mubashshir");
		map.put(340,"Akhlaque");
		map.put(311,"Mudassir");
		for(Map.Entry m : map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		
		}
	}

}
