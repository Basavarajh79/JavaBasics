package com.basic;

public class AirthMeticOperator {
	public static void main(String[] args) {
		System.out.println(10+20);
		System.out.println(10+"20");
		System.out.println("10"+20);
		System.out.println(10+20+"30");
		System.out.println("10"+20+"30");
		int num1=5;
		int num2=2;
		System.out.println(num1/num2);
		double num3=5;
		int num4=2;
		System.out.println(num3/num4);
		
		//Relational Operators
		int num5=20;
		int num6=15;
		System.out.println(num5>num6);
		System.out.println(num5>=num6);
		System.out.println(num5<num6);
		System.out.println(num5<=num6);
		System.out.println(num5==num6);
		System.out.println(num5!=num6);
		
		//Logical Operator
		int num7=12;
		int num8=5;
		int num9=20;
		System.out.println("res="+(num7>num8&&num7>num9));
		System.out.println(num7>num8||num7>num9);
		boolean res1=false;
		boolean res2=true;
		System.out.println(!res1);
		System.out.println(!res2);
	}

}
