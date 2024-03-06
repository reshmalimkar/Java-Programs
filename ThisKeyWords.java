package com.jspider.imp;


class Happy {
	int a = 10;// global varible

	public Happy() {
		// this(100, 200);
//		this.display();
		System.out.println("default Constructor..");
	}

	public Happy(int a, int b) {
		// System.out.println("Hii");
		this();
		System.out.println(" a : " + a + " b : " + b);
	}

	// use 1
	void display() {
		int a = 20;// local varible
		System.out.println(this.a);// 20

	}

}

public class ThisKeyWords {
	public static void main(String[] args) {
		Happy happy = new Happy(12, 30);
		 happy.display();
	}
}
