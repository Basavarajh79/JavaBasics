package com.exception;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		{
		
			try{
				Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s1=sc.next();
			char ch=s1.charAt(5);
			System.out.println(s1.charAt(5));
			System.out.println("enter the number");
			int a=sc.nextInt();
			sc.nextLine();
			int c=1/a;
			System.out.println(c);
		}
			catch(StringIndexOutOfBoundsException ref){
				System.out.println("entering airthmetic catch block");
			}

	}

}
}
