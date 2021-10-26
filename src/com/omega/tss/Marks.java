package com.omega.tss;

import java.util.Scanner;

public class Marks {
	
	public void studentName(String a) {
		System.out.println("Student name is " + a);

	}
	public void rollNumber(int b) {
		System.out.println("Roll number: " + b);

	}
	public void tamil(int c) {
		System.out.println("Tamil = " + c);

	}
	public void english(int d) {
		System.out.println("English = " + d);

	}
	public void maths(int e) {
		System.out.println("Maths = " + e);

	}
	public void science(int f) {
		System.out.println("Science = " + f);

	}
	public void social(int g) {
		System.out.println("Social = " + g);

	}
	
	public void total(int c, int d, int e, int f, int g) {
		int h = c + d + e + f + g;
		float i = h / 5;
		System.out.println("Total marks secured = " + h);
		System.out.println("Average marks got = " + i);

	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student name ");
		String a = s.next();
		System.out.println("Enter the student roll number ");
		int b = s.nextInt();
		System.out.println("Enter the Tamil marks ");
		int c = s.nextInt();
		System.out.println("Enter the English marks ");
		int d = s.nextInt();
		System.out.println("Enter the Maths marks ");
		int e = s.nextInt();
		System.out.println("Enter the Science marks ");
		int f = s.nextInt();
		System.out.println("Enter the Social marks ");
		int g = s.nextInt();
		
		Marks m = new Marks();
		m.studentName(a);
		m.rollNumber(b);
		m.tamil(c);
		m.english(d);
		m.maths(e);
		m.science(f);
		m.social(g);
		m.total(c, d, e, f, g);
		
	}

}
