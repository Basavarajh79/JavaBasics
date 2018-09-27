package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class Demofile2 {

	public static void main(String[] args) throws IOException {
		Employee e1=new Employee(12,"ABC");
		File f1=new File("E:\\\\FileHandling\\\\java21.txt");
		try {
			FileOutputStream fout=new FileOutputStream(f1);
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(e1);
			System.out.println("Object written");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
