package com.basic;

public class OperatorsPostIncreament {
	public static void main(String[] args) {
		
		int a1=10;
		System.out.println(a1++);
		System.out.println(a1);
		
		int b1=5;
		int sum=(b1++)+(b1++);
		System.out.println(sum);
		System.out.println(b1);
		
		int a=4;
		int b=4;
		int c=4;
		a++;
		++b;
		c++;
		System.out.println(a);
		System.out.println(++b);
		System.out.println(c);
	}

}
