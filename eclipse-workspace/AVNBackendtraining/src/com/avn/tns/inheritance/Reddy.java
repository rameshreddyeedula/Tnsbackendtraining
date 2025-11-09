package com.avn.tns.inheritance;

public class Reddy extends Ramesh {
	public String collegename;
	private int contact;
	protected String village;
	//default
	String study;
	void display()
	{
		System.out.println("college:"+collegename);
		System.out.println("phone:"+contact);
		System.out.println("city:"+village);
		System.out.println("class:"+study);
		
	}
	
}
