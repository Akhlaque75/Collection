package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {
	public static void main(String[] args){
		Map map =new HashMap();
		map.put(1, "akhlaque");
		map.put(4, "mubashshir");
		map.put(5,"Izmir");
		map.put(8, "kerman");
	Set s =map.entrySet();
	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		Map.Entry entry=(Map.Entry)itr.next();
		System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
	}

}
