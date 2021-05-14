package org.opentutorials.javatutorials.Inheritance.example1;

class MultiplicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}


public class CalculatorDeme2 {

	
	public static void main(String[] args) {
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
		
		c1.setOperands(10, 20);
		c1.sum();
		c1.multiplication();

	}

}
