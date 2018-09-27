package com.exception;

public class Program4 {

	public static void main(String[] args) {
		try{
			int a=1/0;
		}

		catch(Exception ref)
		{
			System.out.println("entering catch block");
		}
		finally{
			System.out.println("entering finally block");
			try{
				int a=1/0;
			}
			catch(ArithmeticException e){
				System.out.println("inside the finally block");
			}
		}
	}

}
