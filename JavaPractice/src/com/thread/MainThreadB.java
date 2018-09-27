package com.thread;

public class MainThreadB {

	public static void main(String[] args) {
		ThreadB t1=new ThreadB();
		Thread ref=new Thread(t1);
        ref.start();
	}

}
