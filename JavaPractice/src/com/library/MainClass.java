package com.library;

public class MainClass {

	public static void main(String[] args) {
		String s1="java";
		String s2=new String();
		String s3=new String("sql");
		String s7=new String("sql");
		char ch[]={'a','b','c'};
		String s4=new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		String s5="AA";
		System.out.println(s5.hashCode());
		String s6="AA";
		System.out.println(s6.hashCode());
		System.out.println(s5.equals(s6));
		System.out.println(s7);
		s1="java";
		System.out.println(s1);
	}

}
