package com.Collection;

import java.util.LinkedList;

public class LinkedList3{
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("Maruti");
	ll.add("Scorpio");
	ll.add("Marcedes");
	ll.add("BMW");
	ll.add("MgHectre");
	ll.add("Bugati");
	ll.add("Ferari");
	ll.add("Lamborghini");
	ll.add("Hyundai");
	ll.add("Honda");
	System.out.println("initial list of element:"+ll);
	ll.remove("BMW");
	System.out.println("after invoking remove(object)method:"+ll);
	ll.remove(0);
	System.out.println("after invoking remove(index)method"+ll);
	LinkedList<String> ll2=new LinkedList<String>();
	ll2.add("Safari");
	ll2.add("Tata");
	ll.addAll(ll2);
	System.out.println("Updated list:"+ll);
	ll.removeAll(ll2);
	System.out.println("After invoking removeAll():"+ll);
}
}
