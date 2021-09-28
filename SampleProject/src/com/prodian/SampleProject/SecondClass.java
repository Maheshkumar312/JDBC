package com.prodian.SampleProject;

public class SecondClass {
	
	public String second() {
	System.out.println("second class running");
	
	ThirdClass thirdClass=new ThirdClass();
	String name=thirdClass.third();
	 System.out.println(name);
	 return "Returning from second class";
	
}
}
