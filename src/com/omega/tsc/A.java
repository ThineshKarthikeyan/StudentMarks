package com.omega.tsc;

public class A {
	
	public A() {
		this("JAVA");
		System.out.println("Default const...");
	}
	public A(String name) {
		this(12);
		System.out.println(name);
	}

	public A(float sal) {
		System.out.println(sal);
	}

	public static void main(String[] args) {
		A a = new A();
	
	}
	

}
