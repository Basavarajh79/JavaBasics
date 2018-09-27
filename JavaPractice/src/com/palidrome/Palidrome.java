package com.palidrome;

import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		System.out.println("Given String is="+s1);
		StringBuffer s2=new StringBuffer(s1);
		System.out.println(s2);
		StringBuffer s3=new StringBuffer(s2.reverse());
		String s4=new String(s3);
		System.out.println("the reversed string is="+s3);
		if(s1.equals(s4)){
			System.out.println("its palidrome");
		}else{
			System.out.println("its not palidrome");
		}
	}

}
