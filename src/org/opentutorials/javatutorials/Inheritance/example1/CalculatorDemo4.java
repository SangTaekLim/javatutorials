package org.opentutorials.javatutorials.Inheritance.example1;


class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
}

class SubtractionableCalculator extends Calculator {
	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo4 {

	public static void main(String[] args) {
		SubtractionableCalculator c1 = new SubtractionableCalculator();
		c1.setOperands(10,20);
		c1.sum();	
		c1.subtract();	

	}

}
