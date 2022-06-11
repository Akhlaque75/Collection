package com.comparator;

 class C {
	void add(Object a) {
		System.out.println("parent class");
	}
}
class B extends C{
	void add(String a) {
		System.out.println("child class");
	}
	public static void main(String[] args) {
		B c=new B();
		c.add(3);
	}
}
