package com.collection;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("ABCD");
		//al.add(new Student(12, null));
		//al.add(new Employee(14,null));
		//al.add(12);
		//al.add(5.6);
		for(Object ob:al) {
			System.out.println(ob);
			System.out.println(ob.hashCode());
		}
		

	}

}
