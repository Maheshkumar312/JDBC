package com.prodian.SampleProject;

public class FirstClass {
	
	public String first() {
		System.out.println("first class running");
		SecondClass secondClass=new SecondClass();
		 String name =secondClass.second();
		 System.out.println(name);

		
		return "Returning from first class ";
		
		

	}


}
