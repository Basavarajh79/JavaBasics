package com.library;

public class MainClass2 {
 
	public static void main(String[] args) {
		String s1="java";
		String s11="java";
		String s2="abc";
		String s9="abc";
		System.out.println(s1);
		System.out.println(s11);
		System.out.println(s9);
		String s3=s1+s2;
		String s4=new String("java");
		String s5=new String("java");
		String s6=s4+s5;
		String s7="javasql";
		String s8="java";
		System.out.println(s1==s8);
		System.out.println(s3==s7);
		System.out.println(s3.equals(s7));
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		System.out.println(s1.equals(s4));
	}
}
