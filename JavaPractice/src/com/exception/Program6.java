package com.exception;

public class Program6 {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		try{
			d1.test1();
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled in main method");
		}

	}

}
