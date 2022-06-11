package com.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Tree {
	public static void main(String[] args) {
		
	//Mycomparator my=new Mycomparator();
TreeSet<Integer> t=new TreeSet<Integer>(new Mycomparator());
   t.add(23);
   t.add(13);
   t.add(35);
   t.add(45);
   t.add(12);
   System.out.println(t);
}
}
 class Mycomparator implements Comparator{

	public int compare( Object obj1, Object obj2) {
		Integer i=(Integer) obj1;
		Integer i2=(Integer)obj2;
		if(i<i2)
			return 1;
		else if(i>i2)
		return -1;
		else
			return 0;
	}
	 
 }
