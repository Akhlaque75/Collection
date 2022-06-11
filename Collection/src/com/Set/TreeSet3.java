package com.Set;

import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add(12);
		ts.add(20);
		ts.add(25);
		ts.add(8);
		ts.add(30);
		System.out.println("Highest Value:"+ts.pollFirst());
		System.out.println("Lowest Value:"+ts.pollLast());
	}

}
