package com.library;

public class Program3 {

	public static void main(String[] args) {
		String s1="java";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		String s2="String";
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(2, 4));
		String s3="java is easy";
		String[] ar=s3.split(" ");
		for (int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
		System.out.println(s3.trim());
		
	}
}
