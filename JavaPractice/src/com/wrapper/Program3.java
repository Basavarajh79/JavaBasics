package com.wrapper;

import java.util.ArrayList;

public class Program3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(34);
		al.add(39.8);
		al.add('c');
		al.add(true);
		for(Object ob:al) {
			System.out.println(ob);
			System.out.println("HC="+ob.hashCode());
		}
	}

}
