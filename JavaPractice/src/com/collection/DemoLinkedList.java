package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoLinkedList {
	public static void main(String[] args) {
		LinkedList lt=new LinkedList();
		Student s1=new Student(12,"ABC");
		Student s2=new Student(14,"DEF");
		Student s3=new Student(16,"GHI");
		Student s4=new Student(18,"JKL");
		Employee e1=new Employee(12,"dfg");
		Employee e2=new Employee(14,"qwe");
		lt.add(s1);
		lt.add(s2);
		lt.add(s3);
		lt.add(s4);
		lt.add(e1);
		lt.add(e2);
		for(Object ob:lt){
			System.out.println(ob);
		}
		ArrayList al=new ArrayList(lt);
		for(Object ob1:al){
			System.out.println(ob1);
		}
	}

}
