package com.fgh.test;

public class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		
		Student st=new Student(1, "Raja");
		System.out.println(st.id+"-------"+st.name);
		System.out.println("hello in github");
		System.out.println("Adding new Line ...");
	}

}
