package com.basic;

public class OperaterPreDecrement {
	public static void main(String[] args) {
		
		int a=10;
		int sum=(a++)+(++a)+(--a)+(a--);
		System.out.println(sum);
		System.out.println(a);
		
		
	}

}
