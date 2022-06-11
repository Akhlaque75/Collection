package com.Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
public static void main(String[] args) {
	LinkedList<String> lt=new LinkedList<String>();
	lt.add("Bmw");
	lt.add("Marcedes");
	lt.add("Hyundai");
	lt.add("MgHectre");
	Collections.sort(lt);
//	Iterator itr=lt.iterator();
//	while(itr.hasNext()) {
//	System.out.println(itr.next());
	
	lt.forEach(e->System.out.println(e));
}
}
