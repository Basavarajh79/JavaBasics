package com.collection;

import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		Vector vl=new Vector();
		Student s1=new Student(12,"ABC");
		Student s2=new Student(14,"DEF");
		Student s3=new Student(16,"GHI");
		Student s4=new Student(18,"JKL");
		Employee e1=new Employee(12,"dfg");
		Employee e2=new Employee(14,"qwe");
		vl.add(s1);
		vl.add(s2);
		vl.add(s3);
		vl.add(s4);
		vl.add(e1);
		vl.add(e2);
		for(Object ob:vl){
			System.out.println(ob);
		}
	}

	}


