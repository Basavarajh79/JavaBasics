package com.thread;

public class Program12 extends Thread{
	public void run() {
		Thread ref=Thread.currentThread();
		System.out.println("id="+ref.getId());
		for (int i=0;i<5;i++) {
			System.out.println(ref.getName()+" "+i);
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
