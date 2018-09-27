package com.basic;

public class Login {
public static boolean validate(String name,int password){
	if(name=="ABC" && password==123)
	{
		return true;
	}
	else{
		return false;
	}
}
public static void main(String[] args) {
	boolean res=validate("ABC",123);
	if (res)
	{
		System.out.println("Login successfull");
	}
	else{
		System.out.println("Login unsuccessfull");
	}
}
}
