package com.oops;

public class MainProgram7 {
	public static void main(String[] args) {
		System.out.println("a="+new Program7().a);
		new Program7().run();
		new Program7().a=8.6f;
		System.out.println("a="+new Program7().a);
	}

}
