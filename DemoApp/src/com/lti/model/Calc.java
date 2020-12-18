package com.lti.model;

public class Calc {

	public void add(int num1, int num2) {
		System.out.println("Sum=" + (num1 + num2));
	}
	public void sub(int num1, int num2) {
		System.out.println("Difference=" + (num1 - num2));
	}
	public void mult(int num1, int num2) {
		System.out.println("Product=" + (num1 * num2));
	}
	public void div(int num1, int num2) {
		System.out.println("Quotient=" + (num1 / num2) + "\tRemainder=" + (num1 % num2));
	}
}
