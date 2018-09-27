package com.oops;

public class Program3 
{
	
	//Accessing non-static data members
	boolean res=false;
	public void disp()
	{
		System.out.println("executing disp non-static method");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		System.out.println("res="+new Program3().res);
		new Program3().disp();
		
	}

}
