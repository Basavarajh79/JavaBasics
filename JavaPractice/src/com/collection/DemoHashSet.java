package com.collection;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("java");
		hs.add("java");
		hs.add("A");
		hs.add(null);
		hs.add(null);
		hs.add("B");
		System.out.println(hs.size());
		for(Object ib:hs){
			System.out.println(ib);
		}
	}

}
