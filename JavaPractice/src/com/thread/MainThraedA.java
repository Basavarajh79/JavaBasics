package com.thread;

public class MainThraedA {

	public static void main(String[] args) {
		ThreadA t1=new ThreadA();
		t1.start();
		ThreadA t2=new ThreadA();
		t2.start();
		

	}

}
