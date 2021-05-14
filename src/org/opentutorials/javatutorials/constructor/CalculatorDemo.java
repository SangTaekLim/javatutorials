package org.opentutorials.javatutorials.constructor;
class Calculator{
	int left, right;
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
}
public class CalculatorDemo {

	
	
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator(10,20);
		c1.sum();	
	}

}
