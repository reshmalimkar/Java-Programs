package com.jspider.imp;

class Super1 {
	int k = 200;

	public Super1(int a, int b) {
		System.out.println(" Super1.Param  Constructor...");
	}

	void m1() {
		System.out.println("m1 Super");
	}
}

class Child extends Super1 {
	int k = 10;

	public Child() {
		super(1, 2);
		System.out.println("Child");//
	}

	public void custom() {
		int k = 20;
		System.out.println(" k is local varible : " + k);
		System.out.println(" k  is global varible : " + this.k);
		System.out.println(" k is a super class varible  : " + super.k);
	}

	@Override
	void m1() {
		super.m1();
		System.out.println("m1 child");
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Child child = new Child();// Child
		// child.m1();
		child.custom();
	}

}