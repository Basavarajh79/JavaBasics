package com.basic;

public class ArgumentClass {
	public static void test(int a)
	{
		System.out.println("a="+a);
		System.out.println("executing test method");
	}
	public static void main(String[] args) {
		test(123);
		test(456);
		test(789);
	}

}
