package com.encpsulation;

public class HR {
	public static void main(String[] args) {
		Employee e1=new Employee(123,"abc",12345.6);
		System.out.println(+e1.getid());
		System.out.println(e1.getname());
	    System.out.println(e1.getsal());
	    e1.setid(456);
	    e1.setname("efg");
	    e1.setsal(1223456.9);
	    System.out.println(+e1.getid());
		System.out.println(e1.getname());
	    System.out.println(e1.getsal());
	}

}
