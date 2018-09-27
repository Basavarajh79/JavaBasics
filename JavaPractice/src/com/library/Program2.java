package com.library;

public class Program2 {

	public static void main(String[] args) {
		String s1="java";
		int size=s1.length();
		System.out.println(size);
		char ch=s1.charAt(1);
		System.out.println(ch);
		char[] c1=s1.toCharArray();
		System.out.println(c1);
		for(int i=0;i<c1.length;i++){
			System.out.println(c1[i]);
		}
		StringBuilder sb=new StringBuilder("java");
		System.out.println(sb);
		sb=sb.append("j");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		StringBuilder sb1=new StringBuilder("AA");
		System.out.println(sb1.hashCode());
		String s2=new String("AA");
		System.out.println(s2.hashCode());
		
	}
}
