package org.opentutorials.javatutorials.method;

public class ReturnDemo {
	
	public static String[] getMembers() {
		String[] members = {"ÁøÇõ","°íÀ×"};
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();
		System.out.println(members[0]);
	}

}
