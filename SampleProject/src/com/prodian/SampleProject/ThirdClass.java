package com.prodian.SampleProject;

public class ThirdClass {

	public String third() {
		System.out.println("third class running");
		FourthClass fourthClass=new FourthClass();
		String name=fourthClass.fourth();
		System.out.println(name);
		return"returning from third class";
		
		
	}
}
