package com.comparable;

public  class Students1 implements Comparable<Students1>{
 int rollno;
 String name;
 int age;
	public Students1(int rollno, String name, int age){
	this.rollno = rollno;
	this.name = name;
	this.age = age;
}
	@Override
	public int compareTo(Students1 st) {
		if(age==st.age) {
			return 0;}
			else if(age>st.age) {
				return 1;}
				else {
					return -1;
        }
	}
}
