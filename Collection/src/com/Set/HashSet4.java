package com.Set;

import java.util.HashSet;

 class HashSet4{
	 
	 public static void main(String[] args) {
			
			HashSet<BookExample> set=new HashSet<BookExample>();
			BookExample h1=new BookExample(101,"Let Us C","Yasvent katekar",50);
			BookExample h2=new BookExample(102,"Super Earth","Akhaque",65);
			set.add(h1);
			set.add(h2);
			for(BookExample h : set) {
				System.out.println(h.id+" "+h.name+" "+h.author+ " "+h.quantity);
			}
	
	}
 }
 class BookExample{
		int id;
		String name,author;
		int quantity;
		BookExample(int id,String name,String author,int quantity){
			this.id=id;
			this.name=name;
			this.author=author;
			this.quantity=quantity;
			}
}
 
