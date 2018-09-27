package com.basic;

public class ArgumentClass1 {
	public static void disp()
	{
		System.out.println("executing zero arg method");
	}
	public static void start(char ch)
	{
		System.out.println("ch="+ch);
		System.out.println("executing char arg method");
	}
	public static void run(boolean res,int a,double b)
	{
		System.out.println("res="+res);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("executing 3 arg method");
	}
	public static void main(String[] args) {
		disp();
		start('a');
		run(true,12,1.2);
	}

}
