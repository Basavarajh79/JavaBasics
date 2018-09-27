package com.library;

public class Program1 {
	public String toString(){
		return "this is over-riden method";
	}
	public int hashCode(){
		return 123;
	}
	public boolean equals(Object ob){
		return this.hashCode()==ob.hashCode();
	}

}
