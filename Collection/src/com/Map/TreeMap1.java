package com.Map;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
	  TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	  map.put(100, "Akhlaque");
	  map.put(101, "Arqam");
	  map.put(102, "Azhan");
	  map.put(103, "Arsalan");
	  System.out.println("headmap:"+map.headMap(102));
	  System.out.println("tailmap:"+map.tailMap(102));
	  System.out.println("submap:"+map.subMap(101, 103));
	}
}
