package com.comparator;

import java.util.Comparator;
import java.util.TreeSet;
	
public class Tree2 {
public static void main(String[] args) {
	
		Mycompare my=new Mycompare();
	TreeSet<Integer> t=new TreeSet<Integer>(my);
	   t.add(23);
	   t.add(13);
	   t.add(35);
	   t.add(45);
	   t.add(12);
	   System.out.println(t);
	}
	}
class Mycompare implements Comparator{

		public int compare( Object obj1, Object obj2) {
			Integer i=(Integer) obj1;
			Integer i2=(Integer)obj2;
		//return i.compareTo(i2);		
			return i.compareTo(i2);
		} 
	 }


