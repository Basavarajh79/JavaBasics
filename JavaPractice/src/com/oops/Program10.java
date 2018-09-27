package com.oops;

public class Program10 {
	public void test( int a){
		
		System.out.println("executing test method");
		System.out.println("a="+a);
	}
	public void disp(Demo d1){
		
		System.out.println("executing disp method");
		System.out.println("d1="+d1);
		System.out.println("b="+d1.b);
	}
	public static void main(String[] args) {
		Program10 p1=new Program10();
		p1.test(41);
		int d=23;
		p1.test(d);
		p1.disp(new Demo());
		Demo d2=new Demo();
		p1.disp(d2);
		
	}

}
