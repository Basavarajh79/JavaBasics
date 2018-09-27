package com.oops;

public class Sample2 {
	Sample2(){
		System.out.println("zero arg Constructor");
	}
	Sample2(int a){
		this();
		System.out.println("int arg Constructor");
		}
	Sample2(double b){
		this(1);
		System.out.println("double arg Constructor");
	}

}
