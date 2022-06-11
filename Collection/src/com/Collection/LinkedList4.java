package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
	 LinkedList<String> ll=new LinkedList<String>();
	 ll.add("Everest");
	 ll.add("K2");
	 ll.add("Kunchanjunga");
	 Iterator i=ll.descendingIterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }
	}

}
