package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {
public static void main(String[] args) {
	ArrayList<String> Al=new ArrayList();
	Al.add("mango");
	Al.add("apple");
	Al.add("grapes");
	Al.add("banana");
	System.out.println("returning element:"+Al.get(1));
	Al.set(1,"papaya");
	Iterator itr=Al.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}
}
}
