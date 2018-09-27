package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demofile3 {

	public static void main(String[] args) {
		File f1=new File("E:\\FileHandling\\java21.txt");
		try {
			FileInputStream fin=new FileInputStream(f1);
			ObjectInputStream in=new ObjectInputStream(fin);
			Object ob=in.readObject();
			if(ob instanceof Employee) {
				Employee e2=(Employee)ob;
				System.out.println("id="+e2.id);
				System.out.println("name="+e2.name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
