package com.override;

import java.util.HashMap;
import java.util.Map;

class Employee {
	int id;

	public Employee(int id) {
		this.id = id;	
	}
	  public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}	
}

class Demo {
	public static void main(String[] args) {
		Employee d = new Employee(1);
		Employee d1 = new Employee(1);
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(d, "Nasa");
		map.put(d1, "kasa");
		System.out.println(map.size());
		
		Integer i=new Integer(1);
		Integer i2=new Integer(1);
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(i, "sah");
		m.put(i2, "shadg");
		System.out.println(m.size());
	}
}