package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Testsort1 {
	public static void main(String[] args) {
		ArrayList<Students1> al=new ArrayList<Students1>();
		al.add(new Students1(101,"Umar",55));
		al.add(new Students1(102,"Akhlaque",53));
		al.add(new Students1(103,"Mubashshir",58));
		Collections.sort(al);
		for(Students1 st : al) {
		System.out.println(st.rollno+" "+st.name+" "+st.age);		
	}
 }
}
