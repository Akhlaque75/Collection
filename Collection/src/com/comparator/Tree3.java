package com.comparator;

import java.util.List;

public class Tree3 {
	public static void main(String[] args) {
		List<Integer> list = List.of(12,34,75,32,14,5,9,3,7,23,7,42);
		
//		 int []a=new int[list.size()];
//		  for(int i=0;i<list.size();i++) {
//		   a[i]=list.get(i);
//		   }
//		  for(int j=a.length-1;j>=0;j--) {
//			  System.out.println(a[j]);
//		  }
		   Integer[]a= list.toArray(new Integer[1]);
		      for(int i=a.length-1;i>=0;i--) {
			   System.out.println(a[i]);
		}
	}
}
