package com.Collection;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList<String> lt=new LinkedList();
		lt.add("ravi");
		lt.add("vijay");
		lt.add("Ajay");
		System.out.println("after invoking add()method:"+lt);
		lt.add(1,"sonu");
		System.out.println("after invoking add(index,element)method:"+lt);
		LinkedList<String> lt1=new LinkedList<String>();
		lt1.add("karim");
		lt1.add("Nasim");
		lt.addAll(lt1);
		System.out.println("after invoking add()method:"+lt1);
		LinkedList<String> lt2=new LinkedList<String>();
		lt2.add("wasim");
		lt2.add("Ersin");
		lt.addAll(lt2);
		System.out.println("after invoking addAll()method:"+lt);
		lt.addFirst("suhail");
		System.out.println("after invoking addFirst()method:"+lt);
		lt.addLast("Tufail");
		System.out.println("after invoking addLast()method:"+lt);
	}

}
