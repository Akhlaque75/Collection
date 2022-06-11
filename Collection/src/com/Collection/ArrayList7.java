package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList7 {
public static void main(String[] args) {
	ArrayList6 arr=new ArrayList6(151,"Akhlaque",20);
	ArrayList6 arr2=new ArrayList6(152,"Mubashshir",19);
	ArrayList6 arr3=new ArrayList6(153,"Mudassir",20);
	ArrayList<ArrayList6> al=new ArrayList<ArrayList6>();
	al.add(arr);
	al.add(arr2);
	al.add(arr3);
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
	ArrayList6 arr4=(ArrayList6)itr.next();
	System.out.println(arr4.Rollno+" "+arr4.name+" "+arr4.age);	
}
}
}
