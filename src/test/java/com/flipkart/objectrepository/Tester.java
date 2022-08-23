package com.flipkart.objectrepository;

public class Tester {

	public static void main(String[] args) {
       System.out.println("Testing");
       
       String S1 = "i am a automation tester";
       for (int i = 0; i < S1.length(); i++) {
		if (S1.charAt(i)==' ') {
			System.out.println();
			continue;	
		}
		System.out.print(S1.charAt(i));
	}
       
	}

}
