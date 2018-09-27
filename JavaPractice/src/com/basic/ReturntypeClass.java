package com.basic;

public class ReturntypeClass {
	public static boolean disp(int a,char ch)
	{
		System.out.println("a="+a);
		System.out.println("ch="+ch);
		boolean values=true;
		return values;
	}
	public static void main(String[] args) {
		boolean b=disp(1,'a');
		System.out.println("b="+b);
	}

}
