package com.exception;

public class MainRegister {
	public static void main(String[] args) {
		Registration ref=new Registration();
		try{
			ref.register("abc", 20);
		} 
		catch(AgeInvalidException e){
			e.printStackTrace();
		}
	}

}
