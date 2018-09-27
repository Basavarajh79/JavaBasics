package com.exception;

import java.io.IOException;

public class Demo4 {
	public void test1()throws IOException{
		Demo5 ref=new Demo5();
		ref.test2();
		System.out.println("executing test1 method");
	}

}
