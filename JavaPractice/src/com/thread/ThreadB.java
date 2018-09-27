package com.thread;

public class ThreadB implements Runnable {
	public void run() {
		System.out.println("inside runnable type object");
		for(int i=5;i>0;i--) {
			System.out.println("i="+i);
			try {
				Thread.sleep(1500);
			}
			catch(InterruptedException ref) {
				ref.printStackTrace();
			}
		}
	}

}
