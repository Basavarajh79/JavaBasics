package com.exception;

public class Program2 {

	public static void main(String[] args) {
		try{ 
			System.out.println("entering try block");
			String s1="java";
			System.out.println(s1);
			s1.charAt(8);
			System.out.println("exiting try block");
		}
		catch(StringIndexOutOfBoundsException ref){
			System.out.println("entring catch block");
			System.out.println("exception handled");
			System.out.println("exiting catch block");
		}
		
		
	}

}
