package com.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String[] args) {
	HashSet<String> hs=new HashSet<String>();
	hs.add("Mubashshir kela");
	hs.add("Akhlaque");
	hs.add("Umar");
	hs.add("Shahid");
	hs.add("Nahid");
	Iterator<String> i=hs.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
}
