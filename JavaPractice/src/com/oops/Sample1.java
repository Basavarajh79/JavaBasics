package com.oops;

public class Sample1 {
	Sample1(){
		System.out.println("zero org Constructor");
	}
	Sample1(int a){
		System.out.println("int arg Constructor");
	}
	Sample1(double b){
		System.out.println("double arg Constructor");
	} 
	Sample1(int a,double b){
		System.out.println("int and double arg Constructor");
	}
	Sample1(double b,int a){
		System.out.println("double and int arg Constructor");
	}

}
