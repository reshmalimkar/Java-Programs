package com.jspider.imp;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String ms) {
		super(ms);
	}
}

public class CustomException {
	public static void main(String[] args) {
		try {
			validate(10);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void validate(int age) throws InvalidAgeException {
		if(age<=18) {
			throw new InvalidAgeException("not eligible for voting");
		}else {
			System.out.println("eligible for vote");
		}
		
	}

}
