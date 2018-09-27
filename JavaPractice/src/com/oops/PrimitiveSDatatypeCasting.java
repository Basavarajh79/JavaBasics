package com.oops;

public class PrimitiveSDatatypeCasting {
	public static void main(String[] args) {
		int a=25;
		System.out.println("a="+a);
		double b=2.5;
		System.out.println("b="+b);
		//narrowing
		int c=(int)7.9;
		System.out.println("c="+c);
		//widening
		double d=(double)75;
		System.out.println("d="+d);
		char ch=65;
		System.out.println("ch="+ch);
		char c1='D';
		char c2=(char)(c1+32);
		System.out.println("c2="+c2);
		for(byte b1=1;;b1++)
		{
		if(b<3){
			System.out.println("b="+b1);
		}
		
	}}

}
