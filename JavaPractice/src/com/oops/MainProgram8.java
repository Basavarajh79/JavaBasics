package com.oops;

public class MainProgram8 {
	public static void main(String[] args) {
		Program8 ref=new Program8();
		System.out.println("a="+Program8.a);
		System.out.println("b="+ref.b);
		ref.test();
		Program8.disp();
		ref.b=45;
		System.out.println("b="+ref.b);
		Program8.a=123;
		System.out.println("a="+Program8.a);
		ref.b=50;
		System.out.println("b="+ref.b);
		Program8 ref1=new Program8();
		System.out.println("b="+ref.b);
	}

}
