package com.collection;

public class Student implements Comparable {
	int id;
	String name;
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return this.id+"  "+this.name;
	}
	public int compareTo(Object ob) {
		Student st=(Student)ob;
		System.out.println(this.name+"_"+st.name);
		String st1=this.name;
		String st2=st.name;
		return -1*st1.compareTo(st2);
	}

}
