package com.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
    TreeSet<String> ts=new TreeSet<String>();
     ts.add("Ozil");
     ts.add("Sifan");
     ts.add("Arqam");
     ts.add("Derqam");
     ts.add("Dariam");
     Iterator<String> i=ts.descendingIterator();
     while(i.hasNext()) {
    	 System.out.println(i.next());
    	 }
     }

}
