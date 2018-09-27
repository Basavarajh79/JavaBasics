package com.oops;

public class Student {
	public void Preparenote(Notebook nb1,Pen p1){
		nb1.openbook();
		p1.write();
		nb1.turnpage();
		p1.write();
		nb1.closebook();
	}

}
