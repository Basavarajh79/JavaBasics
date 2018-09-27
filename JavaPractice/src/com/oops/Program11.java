package com.oops;

public class Program11 {
	public int test()
	{
		System.out.println("executing test method");
		return 1234;
	}
	public Demo disp()
	{
		System.out.println("executing disp method");
		Demo d2=new Demo();
		System.out.println("d2="+d2);
		return d2;
		
	}

	public static void main(String[] args) {
		Program11 s1=new Program11();
		int res=s1.test();
		System.out.println("res="+res);
		Demo ref=s1.disp();
		System.out.println("ref="+ref);
	}
}
