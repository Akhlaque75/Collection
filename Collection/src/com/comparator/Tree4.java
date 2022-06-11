
package com.comparator;
import java.util.TreeSet;

public class Tree4 {
	public static void main(String[] args) {
		TreeSet<Student> t=new TreeSet<Student>(); 
		t.add(new Student(100, "Akhlaque", "Kurla"));
		t.add(new Student(101,"Haris","Andheri"));
		t.add(new Student(102,"Umar","Sakinaka"));
		t.add(new Student(103,"Sahil","Ghatkoper"));
		System.out.println(t);
		for(Student s:t) {
			System.out.println(s.id+" "+s.name+" "+s.address);
	 }
   }
}
class Student implements Comparable<Student>{
	int id;
	String name;
	String address;
	Student(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	
	}
	public int compareTo(Student st) {
	return name.compareTo(st.name);
	}
}
