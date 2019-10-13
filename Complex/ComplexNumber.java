package com.revature.complex;

public class ComplexNumber{
	private int real;
	private int complex;

	public ComplexNumber(int real, int complex){
		this.real = real;
		this.complex = complex;
	}

	public String printout(){
		return real + " + " + complex + "i";
	}

	public ComplexNumber plus(ComplexNumber a){
		int real_sum = real + a.real;
		int complex_sum = complex + a.complex;

		ComplexNumber answer = new ComplexNumber(real_sum, complex_sum);
		return answer;
	}

	public ComplexNumber minus(ComplexNumber a){
		int real_difference = real - a.real;
		int complex_difference = complex - a.complex;

		ComplexNumber answer = new ComplexNumber(real_difference, complex_difference);
		return answer;
	}
}