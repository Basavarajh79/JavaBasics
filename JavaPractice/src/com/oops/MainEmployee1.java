package com.oops;

public class MainEmployee1 {
	
public static void main(String[] args) {
	Employee1 e1=new Employee1(123,"ABC",1234.5);
	System.out.println("Empid="+e1.empid);
	System.out.println("name="+e1.name);
	System.out.println("Salary="+e1.Salary);
	Employee1 e2=new Employee1(456,"DEF",56789.1);
	System.out.println("Empid="+e2.empid);
	System.out.println("name="+e2.name);
	System.out.println("Salary="+e2.Salary);
}
	
}
