package com.oops;

public class MainDereferencing {

	public static void main(String[] args) {
		Dereferencing d1=new Dereferencing();
		System.out.println("a="+d1.a);
		d1.a=456;
		System.out.println("a="+d1.a);
		d1.a=789;
		System.out.println("a="+d1.a);
		d1.a=12;
		System.out.println("a="+d1.a);
		d1=new Dereferencing();
		System.out.println("a="+d1.a);
		d1.a=14;
		System.out.println("a="+d1.a);
		d1=null;
		System.out.println("a="+d1.a);
		
		
	}

}
