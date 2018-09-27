package com.arrays;

public class MainStudent {
	public static void main(String[] args) {
		Student[] st=new Student[4];
		st[0]=new Student(12,"abc",65.7);
		st[1]=new Student(14,"def",72.7);
		st[2]=new Student(16,"ghi",9.9);
		st[3]=new Student(18,"jkl",9.99);
		for(Student at:st){
			System.out.println(at);
		}
	}

}
