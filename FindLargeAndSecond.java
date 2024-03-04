package com.info.functionalInterface.mock;

import java.util.Scanner;

public class FindLargeAndSecond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("enter third number");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("largest number:" + a);
			if (b > c) {
				System.out.println("second highest :" + b);
			} else {
				System.out.println("second highest: " + c);
			}
		} else if (b > a && b > c) {
			System.out.println("largest number:" + b);
			if (a > b) {
				System.out.println("second highest :" + a);
			} else {
				System.out.println("second highest: " + c);
			}
		} else if (c > a && c > b) {
			System.out.println("largest number:" + c);
			if (a > c) {
				System.out.println("second highest :" + a);
			} else {
				System.out.println("second highest: " + b);
			}
		}
	}

}
