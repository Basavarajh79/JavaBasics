package com.wrapper;

public class Program2 {

	public static void main(String[] args) {
		Integer ref=new Integer(56);
		System.out.println("ref="+ref);
		System.out.println("refhashcode="+ref.hashCode());
		int a=ref;
		System.out.println("a="+a);
		//System.out.println(a.hashCode);

	}

}
