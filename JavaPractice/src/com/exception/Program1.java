package com.exception;

public class Program1 {

	public static void main(String[] args) {
		try{
			int a=1/0;
		}
		catch(ArithmeticException ref){
		System.out.println("exception handled");
	     }
	}
}


