package com.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
class CollectionExample {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(46);
		list.add(47);
		list.add(58);
		list.add(55);
		Collections.sort(list);
		//System.out.println("Maximum element:"+Collections.max(list));
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}
  }
}
