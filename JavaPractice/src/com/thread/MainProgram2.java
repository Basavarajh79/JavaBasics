package com.thread;

public class MainProgram2 {

	public static void main(String[] args) {
		ThreadA t1=new ThreadA();
		t1.start();
		Program12 t2=new Program12();
		t2.start();

	}

}
