package com.prodian.SampleProject;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("main method calling first class");
	 FirstClass firstClass =new FirstClass();
	String name= firstClass. first();
	System.out.println(name);
	}

}
