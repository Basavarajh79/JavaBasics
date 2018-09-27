package com.exception;

import java.io.IOException;

public class MainDemo6 {

	public static void main(String[] args) {
		Demo4 d1=new Demo4();
		
			try {
				d1.test1();
			} catch (IOException e) {
				System.out.println("exception handled in main method");
				e.printStackTrace();
				
			}
		
		
	}
}
