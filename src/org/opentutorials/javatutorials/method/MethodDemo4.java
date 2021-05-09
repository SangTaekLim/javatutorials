package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	public static String getMember1() {
		return "³­´Ù";
	}
	
	public static void numbering(int limit) {
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {

		System.out.println(getMember1());
	}

}
