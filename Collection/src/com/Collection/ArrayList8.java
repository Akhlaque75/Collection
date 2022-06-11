package com.Collection;

import java.util.ArrayList;

public class ArrayList8 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
	   System.out.println("initial list of elements:"+al);
	   al.add("Akhlaque");
	   al.add("Umar");
	   al.add("Mubashshir");
	   System.out.println("After invoking add method(E)"+al);
	   al.add(1,"Kamlesh");
	   System.out.println("After invoking add()method:"+al);
	   ArrayList<String> al2=new ArrayList<String>();
	   al2.add("chinki");
	   al2.add("minki");
	   al.addAll(al2);
	   System.out.println("after invoking addAll()method:"+al);
	   ArrayList<String> al3= new ArrayList<String>();
	   al3.add("chotu");
	   al3.add("motu");
       al.addAll(al3);
       System.out.println("after invoking addAll()method:"+al);
	}

}
