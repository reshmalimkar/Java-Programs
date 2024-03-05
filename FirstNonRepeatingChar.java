package com.jspider.practice.simple;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String inputStr = "abcdaf";
		for (char i : inputStr.toCharArray()) {
			if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: " + i);
				break;
			}
		}
	}

}
