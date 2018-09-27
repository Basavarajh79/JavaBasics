package com.collection;

import java.util.HashSet;

public class DemoHashSet1 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Student s1=new Student(12,"ABC");
		Student s2=new Student(14,"DEF");
		Student s3=new Student(16,"GHI");
		Student s4=new Student(18,"JKL");
		Employee e1=new Employee(12,"dfg");
		Employee e2=new Employee(14,"qwe");
		Student s5=new Student(12,"ABC");
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(e1);
		hs.add(e2);
		hs.add(s5);
		boolean b=s1.equals(s5);
		System.out.println(b);
		for(Object ob:hs){
			System.out.println(ob);
		}
	}

}
