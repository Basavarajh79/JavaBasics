package com.thread;

public class ThreadA extends Thread {
	

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("i="+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
