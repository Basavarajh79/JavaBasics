package com.filehandling;

import java.io.File;
import java.io.IOException;

public class DemoFile1 {
	public static void main(String[] args) throws IOException {
		String path="E:\\FileHandling\\java2.txt";
		File f1=new File(path);
		
			boolean res=f1.createNewFile();
		
	}
	

}
