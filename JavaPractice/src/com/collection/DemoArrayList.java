package com.collection;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("size="+al.size());
		al.add("abc");
		al.add("edf");
		al.add(123);
		al.add(456);
		System.out.println("size="+al.size());
		for(Object ob:al){
			System.out.println(ob);
		}
		
	}
}
