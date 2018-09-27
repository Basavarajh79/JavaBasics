package com.thread;

public class Program1 extends Thread{
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("i="+i);
		}
	
	}
	

}
