package com.oops;

public class Program1 { 
	static int a=456;
	public static void test()
	{
		System.out.println("executing static method");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("a="+a);
		test();
		System.out.println("main method ended");
	}

}
