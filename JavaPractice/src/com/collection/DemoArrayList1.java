package com.collection;

import java.util.ArrayList;

public class DemoArrayList1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("size="+al.size());
		Student s1=new Student(12,"ABC");
		Student s2=new Student(14,"DEF");
		Student s3=new Student(16,"GHI");
		Student s4=new Student(18,"JKL");
		Employee e1=new Employee(12,"dfg");
		Employee e2=new Employee(14,"qwe");
		al.add(new Student(12,"ABC"));
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(e1);
		al.add(e2);
		al.add("java");
		al.add("java");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		System.out.println("size="+al.size());
		for(Object ob:al){
			if(ob instanceof Student){
				Student st1=(Student)ob;
				System.out.println("id="+st1.id);
				System.out.println("name="+st1.name);
			}
			else if(ob instanceof Employee){
				Employee ref=(Employee)ob;
				System.out.println("id="+ref.id);
				System.out.println("name="+ref.name);
			}
			else{
				System.out.println(ob);
			}
		}
		
		
		
	}

}
