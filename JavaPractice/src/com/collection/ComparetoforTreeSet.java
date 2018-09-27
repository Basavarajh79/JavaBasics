package com.collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class ComparetoforTreeSet {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		Student s1=new Student(12,"AB");
		Student s2=new Student(14,"CD");
		Student s3=new Student(16,"EF");
		Student s4=new Student(18,"GH");
        t1.add(s1);
        t1.add(s2);
        t1.add(s3);
        t1.add(s4);
        for (Object ob:t1) {
        	System.out.println(ob);
        }
        ArrayList al=new ArrayList();
        Student s11=new Student(12,"AB");
		Student s21=new Student(14,"CD");
		Student s31=new Student(16,"EF");
		Student s41=new Student(18,"GH");
		al.add(s11);
		al.add(s21);
		al.add(s31);
		al.add(s41);
		for(Object ob1:al) {
			System.out.println(ob1);
		}
	}

}
