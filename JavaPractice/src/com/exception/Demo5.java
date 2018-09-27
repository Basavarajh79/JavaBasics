package com.exception;

import java.io.IOException;

public class Demo5 {
	public void test2() throws IOException
	{
		Demo6 ref=new Demo6();
		ref.test3();
		System.out.println("executing test2 method");
	}

}
