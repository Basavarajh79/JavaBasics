package com.thread;

public class Program2 {
	public static void main(String[] args) {
		Thread ref=Thread.currentThread();
		System.out.println(ref.getId());
		System.out.println(ref.getName());
		System.out.println(ref.getPriority());
	    ref.setName("th");
		ref.setPriority(8);
	    System.out.println(ref.getName());
	    System.out.println(ref.getPriority());
	}
}
