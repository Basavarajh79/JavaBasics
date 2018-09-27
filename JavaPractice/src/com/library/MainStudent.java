package com.library;

public class MainStudent {
	public static void main(String[] args) {
		Student s1=new Student(123,"ABC");
		Student s2=new Student(123,"ABC");
		System.out.println("id="+s1.hashCode());
		System.out.println("id="+s2.hashCode());
		System.out.println(s1.equals(s2));
	}

}


