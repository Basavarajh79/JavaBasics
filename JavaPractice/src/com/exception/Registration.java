package com.exception;

public class Registration {
	public void register(String name,int age) throws AgeInvalidException{
		if(age>=18){
			System.out.println("procced to registration......");
			System.out.println("registration successful.....");
		}
		else{
			throw new AgeInvalidException();
		}
		
	}

}
