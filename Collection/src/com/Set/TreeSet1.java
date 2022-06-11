package com.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add("Ersin");
		ts.add("kersin");
		ts.add("Murat");
		ts.add("Furkan");
		Iterator<Object> itr=ts.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
		} 
	}
}

