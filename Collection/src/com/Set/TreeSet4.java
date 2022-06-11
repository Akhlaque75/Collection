package com.Set;

import java.util.TreeSet;

public class TreeSet4 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(); 
			ts.add("A");
			ts.add("B");
			ts.add("C");
			ts.add("D");
			ts.add("E");
			System.out.println("Initial set:"+ts);
			System.out.println("Head set:"+ts.headSet("C"));
			System.out.println("Subset:"+ts.subSet("A","E"));
			System.out.println("tailset:"+ts.tailSet("C"));
			
		
	}
	}

