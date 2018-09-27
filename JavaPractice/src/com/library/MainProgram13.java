package com.library;

public class MainProgram13 {

	public static void main(String[] args) {
		Program1 p1=new Program1();
		System.out.println("HASHCODE="+p1.hashCode());
		Program1 p2=new Program1();
		System.out.println("hashcode="+p2.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println("class="+p1.getClass());
		

	}

}
