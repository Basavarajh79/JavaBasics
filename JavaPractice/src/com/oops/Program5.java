package com.oops;

public class Program5 {

	static float a=3.5f;
	public static void run(){
		System.out.println("executing static method");
	}
	public static void main(String[] args) {
		System.out.println("a="+a);
		run();
		System.out.println("a="+a);
		run();
		
	}
}
